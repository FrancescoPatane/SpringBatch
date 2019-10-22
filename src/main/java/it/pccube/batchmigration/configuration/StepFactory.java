package it.pccube.batchmigration.configuration;

import javax.sql.DataSource;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.database.builder.JdbcCursorItemReaderBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Component;

import it.pccube.batchmigration.destination.WriterFactory;
import it.pccube.batchmigration.destination.model.FatTCausaleFattura;
import it.pccube.batchmigration.destination.model.FatTCausaleFatturaStor;
import it.pccube.batchmigration.destination.model.FatTFattura;
import it.pccube.batchmigration.destination.model.FatTFatturaStor;
import it.pccube.batchmigration.destination.model.FatTLotto;
import it.pccube.batchmigration.listener.ExecutionListener;
import it.pccube.batchmigration.listener.ProcessListener;
import it.pccube.batchmigration.listener.WriterListener;
import it.pccube.batchmigration.processor.ProcessorFactory;
import it.pccube.batchmigration.source.model.FeCausaleFatturaStorico;
import it.pccube.batchmigration.source.model.FeCausaleFattura;
import it.pccube.batchmigration.source.model.FeFattura;
import it.pccube.batchmigration.source.model.FeFatturaStorico;
import it.pccube.batchmigration.source.model.FeLotto;

@Component
public class StepFactory {
	
	
	@Autowired
	@Qualifier("dbSource")
	private  DataSource dataSource;
	
	@Autowired
	private  StepBuilderFactory stepBuilderFactory;
	
	@Autowired
	private  ProcessorFactory processorFactory;
	
	@Autowired
	private  WriterFactory writerFactory;
	
	
    public <T> JdbcCursorItemReader<T> tableReader(Class<T> modelClass, String tableName) {
        return new JdbcCursorItemReaderBuilder<T>()
                .name("tableReader")
                .dataSource(this.dataSource)
                .sql("SELECT * FROM " + tableName)
                .rowMapper(new  BeanPropertyRowMapper<T>(modelClass))
                .build();
    }
	
    @SuppressWarnings("unchecked")
	public Step migrateFeLotto() {
    	return stepBuilderFactory.get("migrateFeLotto")
    			.listener(new ExecutionListener())
    			.<FeLotto, FatTLotto>chunk(50)
				.reader(this.tableReader(FeLotto.class, FeLotto.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeLotto.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTLotto.class))
				.listener(new WriterListener())
				.build();
    }
    
    
    @SuppressWarnings("unchecked")
	public Step migrateFeFattura() {
    	return stepBuilderFactory.get("migrateFeFattura")
    			.listener(new ExecutionListener())
    			.<FeFattura, FatTFattura>chunk(50)
				.reader(this.tableReader(FeFattura.class, FeFattura.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeFattura.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTFattura.class))
				.listener(new WriterListener())
				.build();
    } 
    
    @SuppressWarnings("unchecked")
	public Step migrateFeFatturaStorico() {
    	return stepBuilderFactory.get("migrateFeFatturaStorico")
    			.listener(new ExecutionListener())
    			.<FeFatturaStorico, FatTFatturaStor>chunk(50)
				.reader(this.tableReader(FeFatturaStorico.class, FeFatturaStorico.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeFatturaStorico.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTFatturaStor.class))
				.listener(new WriterListener())
				.build();
    } 
    
    @SuppressWarnings("unchecked")
	public Step migrateFeCausaleFattura() {
    	return stepBuilderFactory.get("migrateFeCausaleFattura")
    			.listener(new ExecutionListener())
    			.<FeCausaleFattura, FatTCausaleFattura>chunk(50)
				.reader(this.tableReader(FeCausaleFattura.class, FeCausaleFattura.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeCausaleFattura.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTCausaleFattura.class))
				.listener(new WriterListener())
				.build();
    } 
    
    @SuppressWarnings("unchecked")
	public Step migrateFeCausaleFatturaStorico() {
    	return stepBuilderFactory.get("migrateFeCausaleFatturaStorico")
    			.listener(new ExecutionListener())
    			.<FeCausaleFatturaStorico, FatTCausaleFatturaStor>chunk(50)
				.reader(this.tableReader(FeCausaleFatturaStorico.class, FeCausaleFatturaStorico.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeCausaleFatturaStorico.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTCausaleFatturaStor.class))
				.listener(new WriterListener())
				.build();
    } 

}
