package it.pccube.batchmigration.configuration;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.database.builder.JdbcCursorItemReaderBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import it.pccube.batchmigration.destination.WriterFactory;
import it.pccube.batchmigration.destination.model.FatTLotto;
import it.pccube.batchmigration.listener.WriterListener;
import it.pccube.batchmigration.processor.ProcessorFactory;
import it.pccube.batchmigration.source.model.FeFattura;
import it.pccube.batchmigration.source.model.FeLotto;

@Configuration
public class JobConfiguration {
	
	@Autowired
	@Qualifier("dbSource")
	private  DataSource dataSource;
	
	@Autowired
	private  JobBuilderFactory jobBuilderFactory;
	
	@Autowired
	private  StepBuilderFactory stepBuilderFactory;
	
	@Autowired
	private  ProcessorFactory processorFactory;
	
	@Autowired
	private  WriterFactory writerFactory;

	
    @Bean
    public Job migration() {
        return jobBuilderFactory.get("migration")
        		.start(migrateFeFattura())
//                .start(this.migrateFeLotto())
//                .next(migrateFeLottoStep2)
//                .next(migrateFeLottoStep3)
                .build();
    }
    
    public <T> JdbcCursorItemReader<T> tableReader(Class<T> modelClass, String tableName) {
        return new JdbcCursorItemReaderBuilder<T>()
                .name("tableReader")
                .dataSource(this.dataSource)
                .sql("SELECT * FROM " + tableName)
                .rowMapper(new  BeanPropertyRowMapper<T>(modelClass))
                .build();
    }
    
    
    public Step migrateFeLotto() {
    	return stepBuilderFactory.get("migrateFeLotto").<FeLotto, FatTLotto>chunk(4)
				.reader(this.tableReader(FeLotto.class, FeLotto.TABLE_NAME))
				.processor(this.processorFactory.getProcessor())
				.writer(this.writerFactory.getWriter(FatTLotto.class))
				.listener(new WriterListener())
				.build();
    }
    
    
    public Step migrateFeFattura() {
    	return stepBuilderFactory.get("migrateFeFattura").<FeFattura, FeFattura>chunk(4)
				.reader(this.tableReader(FeFattura.class, FeFattura.TABLE_NAME))
//				.processor(this.processorFactory.getProcessor())
//				.writer(this.writerFactory.getWriter(FatTLotto.class))
				.writer(items -> {
					for (FeFattura item : items) {
						System.out.println(">> " + item.getIdFattura());
					}
				})
//				.listener(new WriterListener())
				.build();
    }    


}
