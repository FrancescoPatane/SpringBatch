package it.pccube.batchmigration.source;

import javax.sql.DataSource;

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

import it.pccube.batchmigration.source.model.FeLotto;

//@Configuration
public class SourceStepConfiguration {
	
//	migrateFeLottoStep1
	
//	@Autowired
//	private StepBuilderFactory stepBuilderFactory;
	
	@Autowired
	@Qualifier("dbSource")
	private  DataSource dataSource;

	
	
//    @Bean
    public <T> JdbcCursorItemReader<T> tableReader(Class<T> modelClass, String tableName) {
        return new JdbcCursorItemReaderBuilder<T>()
                .name("tableReader")
                .dataSource(dataSource)
//                .sql("SELECT * FROM " + tableName)
//                .rowMapper(new  BeanPropertyRowMapper<T>(modelClass))
                .build();
    }
    
    
//    @Bean
//    public Step fetchDataStep() {
//    	return stepBuilderFactory.get("readTableStep").<FeLotto, FeLotto>chunk(4)
//				.reader(this.tableReader(FeLotto.class, FeLotto.TABLE_NAME))
//				.writer(items -> {
//					for (FeLotto item : items) {
//						System.out.println(">> " + item.getIdLotto());
//					}
//				}).build();
//    }

}
