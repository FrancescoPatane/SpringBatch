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
import it.pccube.batchmigration.destination.model.FatAStatoAdesione;
import it.pccube.batchmigration.destination.model.FatAStatoArchivio;
import it.pccube.batchmigration.destination.model.FatTAdesione;
import it.pccube.batchmigration.destination.model.FatTAdesioneNotifica;
import it.pccube.batchmigration.destination.model.FatTAllegato;
import it.pccube.batchmigration.destination.model.FatTAllegatoStor;
import it.pccube.batchmigration.destination.model.FatTAltroDatoGestStor;
import it.pccube.batchmigration.destination.model.FatTAltroDatoGestionale;
import it.pccube.batchmigration.destination.model.FatTArchivio;
import it.pccube.batchmigration.destination.model.FatTArticolo;
import it.pccube.batchmigration.destination.model.FatTArticoloStor;
import it.pccube.batchmigration.destination.model.FatTCausaleFattura;
import it.pccube.batchmigration.destination.model.FatTCausaleFatturaStor;
import it.pccube.batchmigration.destination.model.FatTCompSezioneStor;
import it.pccube.batchmigration.destination.model.FatTCompilazioneSezione;
import it.pccube.batchmigration.destination.model.FatTEsitoVerifFirmaCfg;
import it.pccube.batchmigration.destination.model.FatTFattura;
import it.pccube.batchmigration.destination.model.FatTFatturaStor;
import it.pccube.batchmigration.destination.model.FatTFoglioStileCfg;
import it.pccube.batchmigration.destination.model.FatTLotto;
import it.pccube.batchmigration.destination.model.FatTLottoStor;
import it.pccube.batchmigration.listener.ExecutionListener;
import it.pccube.batchmigration.listener.ProcessListener;
import it.pccube.batchmigration.listener.WriterListener;
import it.pccube.batchmigration.processor.ProcessorFactory;
import it.pccube.batchmigration.source.model.FeCausaleFatturaStorico;
import it.pccube.batchmigration.source.model.FeCompSezioneStorico;
import it.pccube.batchmigration.source.model.FeCompilazioneSezione;
import it.pccube.batchmigration.source.model.FeConfigEsitoVerifFirma;
import it.pccube.batchmigration.source.model.FeConfigFoglioStile;
import it.pccube.batchmigration.source.model.FeAdesione;
import it.pccube.batchmigration.source.model.FeAdesioneNotifica;
import it.pccube.batchmigration.source.model.FeAllegato;
import it.pccube.batchmigration.source.model.FeAllegatoStorico;
import it.pccube.batchmigration.source.model.FeAltroDatoGestStorico;
import it.pccube.batchmigration.source.model.FeAltroDatoGestionale;
import it.pccube.batchmigration.source.model.FeArchivio;
import it.pccube.batchmigration.source.model.FeArticolo;
import it.pccube.batchmigration.source.model.FeArticoloStorico;
import it.pccube.batchmigration.source.model.FeCausaleFattura;
import it.pccube.batchmigration.source.model.FeFattura;
import it.pccube.batchmigration.source.model.FeFatturaStorico;
import it.pccube.batchmigration.source.model.FeLotto;
import it.pccube.batchmigration.source.model.FeLottoStorico;
import it.pccube.batchmigration.source.model.FeStatoAdesione;
import it.pccube.batchmigration.source.model.FeStatoArchivio;

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
	public Step migrateFeLottoStorico() {
    	return stepBuilderFactory.get("migrateFeLottoStorico")
    			.listener(new ExecutionListener())
    			.<FeLottoStorico, FatTLottoStor>chunk(50)
				.reader(this.tableReader(FeLottoStorico.class, FeLottoStorico.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeLottoStorico.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTLottoStor.class))
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
    
    @SuppressWarnings("unchecked")
	public Step migrateFeAdesione() {
    	return stepBuilderFactory.get("migrateFeAdesione")
    			.listener(new ExecutionListener())
    			.<FeAdesione, FatTAdesione>chunk(50)
				.reader(this.tableReader(FeAdesione.class, FeAdesione.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeAdesione.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTAdesione.class))
				.listener(new WriterListener())
				.build();
    } 
    
    @SuppressWarnings("unchecked")
	public Step migrateFeAdesioneNotifica() {
    	return stepBuilderFactory.get("migrateFeAdesioneNotifica")
    			.listener(new ExecutionListener())
    			.<FeAdesioneNotifica, FatTAdesioneNotifica>chunk(50)
				.reader(this.tableReader(FeAdesioneNotifica.class, FeAdesioneNotifica.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeAdesioneNotifica.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTAdesioneNotifica.class))
				.listener(new WriterListener())
				.build();
    } 
    
    @SuppressWarnings("unchecked")
	public Step migrateFeAllegato() {
    	return stepBuilderFactory.get("migrateFeAllegato")
    			.listener(new ExecutionListener())
    			.<FeAllegato, FatTAllegato>chunk(50)
				.reader(this.tableReader(FeAllegato.class, FeAllegato.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeAllegato.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTAllegato.class))
				.listener(new WriterListener())
				.build();
    } 
    
    @SuppressWarnings("unchecked")
	public Step migrateFeAllegatoStorico() {
    	return stepBuilderFactory.get("migrateFeAllegatoStorico")
    			.listener(new ExecutionListener())
    			.<FeAllegatoStorico, FatTAllegatoStor>chunk(50)
				.reader(this.tableReader(FeAllegatoStorico.class, FeAllegatoStorico.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeAllegatoStorico.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTAllegatoStor.class))
				.listener(new WriterListener())
				.build();
    } 
    
    @SuppressWarnings("unchecked")
	public Step migrateFeAltroDatoGestionale() {
    	return stepBuilderFactory.get("migrateFeAltroDatoGestionale")
    			.listener(new ExecutionListener())
    			.<FeAltroDatoGestionale, FatTAltroDatoGestionale>chunk(50)
				.reader(this.tableReader(FeAltroDatoGestionale.class, FeAltroDatoGestionale.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeAltroDatoGestionale.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTAltroDatoGestionale.class))
				.listener(new WriterListener())
				.build();
    } 
    
    @SuppressWarnings("unchecked")
	public Step migrateFeAltroDatoGestStorico() {
    	return stepBuilderFactory.get("migrateFeAltroDatoGestStorico")
    			.listener(new ExecutionListener())
    			.<FeAltroDatoGestStorico, FatTAltroDatoGestionale>chunk(50)
				.reader(this.tableReader(FeAltroDatoGestStorico.class, FeAltroDatoGestStorico.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeAltroDatoGestStorico.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTAltroDatoGestStor.class))
				.listener(new WriterListener())
				.build();
    } 
    
    @SuppressWarnings("unchecked")
	public Step migrateFeArchivio() {
    	return stepBuilderFactory.get("migrateFeArchivio")
    			.listener(new ExecutionListener())
    			.<FeArchivio, FatTArchivio>chunk(50)
				.reader(this.tableReader(FeArchivio.class, FeArchivio.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeArchivio.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTArchivio.class))
				.listener(new WriterListener())
				.build();
    } 
    
    @SuppressWarnings("unchecked")
	public Step migrateFeArticolo() {
    	return stepBuilderFactory.get("migrateFeArticolo")
    			.listener(new ExecutionListener())
    			.<FeArticolo, FatTArticolo>chunk(50)
				.reader(this.tableReader(FeArticolo.class, FeArticolo.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeArticolo.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTArticolo.class))
				.listener(new WriterListener())
				.build();
    } 
    
    @SuppressWarnings("unchecked")
	public Step migrateFeArticoloStorico() {
    	return stepBuilderFactory.get("migrateFeArticoloStorico")
    			.listener(new ExecutionListener())
    			.<FeArticoloStorico, FatTArticoloStor>chunk(50)
				.reader(this.tableReader(FeArticoloStorico.class, FeArticoloStorico.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeArticoloStorico.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTArticoloStor.class))
				.listener(new WriterListener())
				.build();
    } 
    
    @SuppressWarnings("unchecked")
	public Step migrateFeStatoAdesione() {
    	return stepBuilderFactory.get("migrateFeStatoAdesione")
    			.listener(new ExecutionListener())
    			.<FeStatoAdesione, FatAStatoAdesione>chunk(50)
				.reader(this.tableReader(FeStatoAdesione.class, FeStatoAdesione.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeStatoAdesione.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatAStatoAdesione.class))
				.listener(new WriterListener())
				.build();
    } 
    
    
    @SuppressWarnings("unchecked")
	public Step migrateFeStatoArchivio() {
    	return stepBuilderFactory.get("migrateFeStatoArchivio")
    			.listener(new ExecutionListener())
    			.<FeStatoArchivio, FatAStatoArchivio>chunk(50)
				.reader(this.tableReader(FeStatoArchivio.class, FeStatoArchivio.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeStatoArchivio.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatAStatoArchivio.class))
				.listener(new WriterListener())
				.build();
    } 
    
    
    @SuppressWarnings("unchecked")
	public Step migrateFeCompilazioneSezione() {
    	return stepBuilderFactory.get("migrateFeCompilazioneSezione")
    			.listener(new ExecutionListener())
    			.<FeCompilazioneSezione, FatTCompilazioneSezione>chunk(50)
				.reader(this.tableReader(FeCompilazioneSezione.class, FeCompilazioneSezione.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeCompilazioneSezione.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTCompilazioneSezione.class))
				.listener(new WriterListener())
				.build();
    } 
    
    @SuppressWarnings("unchecked")
	public Step migrateFeCompilazioneSezioneStorico() {
    	return stepBuilderFactory.get("migrateFeCompilazioneSezioneStorico")
    			.listener(new ExecutionListener())
    			.<FeCompSezioneStorico, FatTCompSezioneStor>chunk(50)
				.reader(this.tableReader(FeCompSezioneStorico.class, FeCompSezioneStorico.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeCompSezioneStorico.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTCompSezioneStor.class))
				.listener(new WriterListener())
				.build();
    } 
    
    
    @SuppressWarnings("unchecked")
	public Step migrateFeConfigEsitoVerifFirma() {
    	return stepBuilderFactory.get("FeConfigEsitoVerifFirma")
    			.listener(new ExecutionListener())
    			.<FeConfigEsitoVerifFirma, FatTEsitoVerifFirmaCfg>chunk(50)
				.reader(this.tableReader(FeConfigEsitoVerifFirma.class, FeConfigEsitoVerifFirma.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeConfigEsitoVerifFirma.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTEsitoVerifFirmaCfg.class))
				.listener(new WriterListener())
				.build();
    } 
    
    @SuppressWarnings("unchecked")
	public Step migrateFeConfigFoglioStile() {
    	return stepBuilderFactory.get("migrateFeConfigFoglioStile")
    			.listener(new ExecutionListener())
    			.<FeConfigFoglioStile, FatTFoglioStileCfg>chunk(50)
				.reader(this.tableReader(FeConfigFoglioStile.class, FeConfigFoglioStile.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeConfigFoglioStile.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTFoglioStileCfg.class))
				.listener(new WriterListener())
				.build();
    } 

}
