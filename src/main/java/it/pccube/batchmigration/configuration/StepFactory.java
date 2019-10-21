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
    	return stepBuilderFactory.get("migrateFeLotto").<FeLotto, FatTLotto>chunk(200)
				.reader(this.tableReader(FeLotto.class, FeLotto.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeLotto.class))
				.writer(this.writerFactory.getWriter(FatTLotto.class))
				.listener(new WriterListener())
				.build();
    }
    
    
    @SuppressWarnings("unchecked")
	public Step migrateFeFattura() {
    	return stepBuilderFactory.get("migrateFeFattura").<FeFattura, FatTFattura>chunk(200)
				.reader(this.tableReader(FeFattura.class, FeFattura.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeFattura.class))
				.writer(this.writerFactory.getWriter(FatTFattura.class))
				.listener(new WriterListener())
				.build();
    } 
    
    @SuppressWarnings("unchecked")
	public Step migrateFeFatturaStorico() {
    	return stepBuilderFactory.get("migrateFeFatturaStorico").<FeFatturaStorico, FatTFatturaStor>chunk(200)
				.reader(this.tableReader(FeFatturaStorico.class, FeFatturaStorico.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeFatturaStorico.class))
				.writer(this.writerFactory.getWriter(FatTFatturaStor.class))
				.listener(new WriterListener())
				.build();
    } 
    
    @SuppressWarnings("unchecked")
	public Step migrateFeCausaleFattura() {
    	return stepBuilderFactory.get("migrateFeCausaleFattura").<FeCausaleFattura, FatTCausaleFattura>chunk(200)
				.reader(this.tableReader(FeCausaleFattura.class, FeCausaleFattura.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeCausaleFattura.class))
				.writer(this.writerFactory.getWriter(FatTCausaleFattura.class))
				.listener(new WriterListener())
				.build();
    } 
    
    @SuppressWarnings("unchecked")
	public Step migrateFeCausaleFatturaStorico() {
    	return stepBuilderFactory.get("migrateFeCausaleFatturaStorico").<FeCausaleFatturaStorico, FatTCausaleFatturaStor>chunk(200)
				.reader(this.tableReader(FeCausaleFatturaStorico.class, FeCausaleFatturaStorico.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeCausaleFatturaStorico.class))
				.writer(this.writerFactory.getWriter(FatTCausaleFatturaStor.class))
				.listener(new WriterListener())
				.build();
    } 

}
