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
import it.pccube.batchmigration.destination.model.FatTConservAutoreLotto;
import it.pccube.batchmigration.destination.model.FatTDatiCassaPrevStor;
import it.pccube.batchmigration.destination.model.FatTDatiCassaPrevidenz;
import it.pccube.batchmigration.destination.model.FatTDatiDdt;
import it.pccube.batchmigration.destination.model.FatTDatiDdtStor;
import it.pccube.batchmigration.destination.model.FatTDatiPagamento;
import it.pccube.batchmigration.destination.model.FatTDatiPagamentoStor;
import it.pccube.batchmigration.destination.model.FatTDatiRiepilogo;
import it.pccube.batchmigration.destination.model.FatTDatiRiepilogoStor;
import it.pccube.batchmigration.destination.model.FatTDatiRiferimento;
import it.pccube.batchmigration.destination.model.FatTDatiRiferimentoStor;
import it.pccube.batchmigration.destination.model.FatTDatiSal;
import it.pccube.batchmigration.destination.model.FatTDatiSalStor;
import it.pccube.batchmigration.destination.model.FatTDettaglioLinea;
import it.pccube.batchmigration.destination.model.FatTDettaglioLineaStor;
import it.pccube.batchmigration.destination.model.FatTDettaglioPagStor;
import it.pccube.batchmigration.destination.model.FatTDettaglioPagamento;
import it.pccube.batchmigration.destination.model.FatTErroreNotifica;
import it.pccube.batchmigration.destination.model.FatTEsitoFtp;
import it.pccube.batchmigration.destination.model.FatTEsitoVerifFirmaCfg;
import it.pccube.batchmigration.destination.model.FatTFattura;
import it.pccube.batchmigration.destination.model.FatTFatturaStor;
import it.pccube.batchmigration.destination.model.FatTFoglioStileCfg;
import it.pccube.batchmigration.destination.model.FatTGeneraleCfg;
import it.pccube.batchmigration.destination.model.FatTLotto;
import it.pccube.batchmigration.destination.model.FatTLottoStor;
import it.pccube.batchmigration.destination.model.FatTMacrosezAppCfg;
import it.pccube.batchmigration.destination.model.FatTXsdCampoCfg;
import it.pccube.batchmigration.destination.model.FatTXsdSezioneCfg;
import it.pccube.batchmigration.listener.ExecutionListener;
import it.pccube.batchmigration.listener.ProcessListener;
import it.pccube.batchmigration.listener.WriterListener;
import it.pccube.batchmigration.processor.ProcessorFactory;
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
import it.pccube.batchmigration.source.model.FeCausaleFatturaStorico;
import it.pccube.batchmigration.source.model.FeCompSezioneStorico;
import it.pccube.batchmigration.source.model.FeCompilazioneSezione;
import it.pccube.batchmigration.source.model.FeConfigEsitoVerifFirma;
import it.pccube.batchmigration.source.model.FeConfigFoglioStile;
import it.pccube.batchmigration.source.model.FeConfigGenerale;
import it.pccube.batchmigration.source.model.FeConfigMacrosezApp;
import it.pccube.batchmigration.source.model.FeConfigXsdCampo;
import it.pccube.batchmigration.source.model.FeConfigXsdSezione;
import it.pccube.batchmigration.source.model.FeConservazAutoreLotto;
import it.pccube.batchmigration.source.model.FeDatiCassaPrevStorico;
import it.pccube.batchmigration.source.model.FeDatiCassaPrevidenziale;
import it.pccube.batchmigration.source.model.FeDatiDdt;
import it.pccube.batchmigration.source.model.FeDatiDdtStorico;
import it.pccube.batchmigration.source.model.FeDatiPagamento;
import it.pccube.batchmigration.source.model.FeDatiPagamentoStorico;
import it.pccube.batchmigration.source.model.FeDatiRiepilogo;
import it.pccube.batchmigration.source.model.FeDatiRiepilogoStorico;
import it.pccube.batchmigration.source.model.FeDatiRiferimento;
import it.pccube.batchmigration.source.model.FeDatiRiferimentoStorico;
import it.pccube.batchmigration.source.model.FeDatiSal;
import it.pccube.batchmigration.source.model.FeDatiSalStorico;
import it.pccube.batchmigration.source.model.FeDettaglioLinea;
import it.pccube.batchmigration.source.model.FeDettaglioLineaStorico;
import it.pccube.batchmigration.source.model.FeDettaglioPagStorico;
import it.pccube.batchmigration.source.model.FeDettaglioPagamento;
import it.pccube.batchmigration.source.model.FeErroreNotifica;
import it.pccube.batchmigration.source.model.FeEsitoFtp;
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
    
    @SuppressWarnings("unchecked")
	public Step migrateFeConfigGenerale() {
    	return stepBuilderFactory.get("migrateFeConfigGenerale")
    			.listener(new ExecutionListener())
    			.<FeConfigGenerale, FatTGeneraleCfg>chunk(50)
				.reader(this.tableReader(FeConfigGenerale.class, FeConfigGenerale.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeConfigGenerale.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTGeneraleCfg.class))
				.listener(new WriterListener())
				.build();
    } 
    
    
    @SuppressWarnings("unchecked")
	public Step migrateFeConfigMacrosezApp() {
    	return stepBuilderFactory.get("migrateFeConfigMacrosezApp")
    			.listener(new ExecutionListener())
    			.<FeConfigMacrosezApp, FatTMacrosezAppCfg>chunk(50)
				.reader(this.tableReader(FeConfigMacrosezApp.class, FeConfigMacrosezApp.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeConfigMacrosezApp.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTMacrosezAppCfg.class))
				.listener(new WriterListener())
				.build();
    } 
    
    
    @SuppressWarnings("unchecked")
	public Step migrateFeConfigXsdCampo() {
    	return stepBuilderFactory.get("migrateFeConfigXsdCampo")
    			.listener(new ExecutionListener())
    			.<FeConfigXsdCampo, FatTMacrosezAppCfg>chunk(50)
				.reader(this.tableReader(FeConfigXsdCampo.class, FeConfigXsdCampo.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeConfigXsdCampo.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTXsdCampoCfg.class))
				.listener(new WriterListener())
				.build();
    } 
    
    @SuppressWarnings("unchecked")
	public Step migrateFeConfigXsdSezione() {
    	return stepBuilderFactory.get("migrateFeConfigXsdSezione")
    			.listener(new ExecutionListener())
    			.<FeConfigXsdSezione, FatTMacrosezAppCfg>chunk(50)
				.reader(this.tableReader(FeConfigXsdSezione.class, FeConfigXsdSezione.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeConfigXsdSezione.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTXsdSezioneCfg.class))
				.listener(new WriterListener())
				.build();
    } 
    
    
    
    
    @SuppressWarnings("unchecked")
	public Step migrateFeConservazAutoreLotto() {
    	return stepBuilderFactory.get("migrateFeConservazAutoreLotto")
    			.listener(new ExecutionListener())
    			.<FeConservazAutoreLotto, FatTConservAutoreLotto>chunk(50)
				.reader(this.tableReader(FeConservazAutoreLotto.class, FeConservazAutoreLotto.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeConservazAutoreLotto.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTConservAutoreLotto.class))
				.listener(new WriterListener())
				.build();
    } 
    
    @SuppressWarnings("unchecked")
	public Step migrateFeDatiCassaPrevidenziale() {
    	return stepBuilderFactory.get("migrateFeDatiCassaPrevidenziale")
    			.listener(new ExecutionListener())
    			.<FeDatiCassaPrevidenziale, FatTDatiCassaPrevidenz>chunk(50)
				.reader(this.tableReader(FeDatiCassaPrevidenziale.class, FeDatiCassaPrevidenziale.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeDatiCassaPrevidenziale.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTDatiCassaPrevidenz.class))
				.listener(new WriterListener())
				.build();
    } 
    
    @SuppressWarnings("unchecked")
	public Step migrateFeDatiCassaPrevStorico() {
    	return stepBuilderFactory.get("migrateFeDatiCassaPrevStorico")
    			.listener(new ExecutionListener())
    			.<FeDatiCassaPrevStorico, FatTDatiCassaPrevStor>chunk(50)
				.reader(this.tableReader(FeDatiCassaPrevStorico.class, FeDatiCassaPrevStorico.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeDatiCassaPrevStorico.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTDatiCassaPrevStor.class))
				.listener(new WriterListener())
				.build();
    } 
    
    @SuppressWarnings("unchecked")
	public Step migrateFeDatiDdtStorico() {
    	return stepBuilderFactory.get("migrateFeDatiDdtStorico")
    			.listener(new ExecutionListener())
    			.<FeDatiDdtStorico, FatTDatiDdtStor>chunk(50)
				.reader(this.tableReader(FeDatiDdtStorico.class, FeDatiDdtStorico.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeDatiDdtStorico.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTDatiDdtStor.class))
				.listener(new WriterListener())
				.build();
    } 
    
    @SuppressWarnings("unchecked")
	public Step migrateFeDatiDdt() {
    	return stepBuilderFactory.get("migrateFeDatiDdt")
    			.listener(new ExecutionListener())
    			.<FeDatiDdt, FatTDatiDdt>chunk(50)
				.reader(this.tableReader(FeDatiDdt.class, FeDatiDdt.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeDatiDdt.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTDatiDdt.class))
				.listener(new WriterListener())
				.build();
    } 
    
    
    @SuppressWarnings("unchecked")
	public Step migrateFeDatiPagamento() {
    	return stepBuilderFactory.get("migrateFeDatiPagamento")
    			.listener(new ExecutionListener())
    			.<FeDatiPagamento, FatTDatiPagamento>chunk(50)
				.reader(this.tableReader(FeDatiPagamento.class, FeDatiPagamento.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeDatiPagamento.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTDatiPagamento.class))
				.listener(new WriterListener())
				.build();
    } 
    
    @SuppressWarnings("unchecked")
	public Step migrateFeDatiPagamentoStorico() {
    	return stepBuilderFactory.get("migrateFeDatiPagamentoStorico")
    			.listener(new ExecutionListener())
    			.<FeDatiPagamentoStorico, FatTDatiPagamentoStor>chunk(50)
				.reader(this.tableReader(FeDatiPagamentoStorico.class, FeDatiPagamentoStorico.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeDatiPagamentoStorico.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTDatiPagamentoStor.class))
				.listener(new WriterListener())
				.build();
    } 
    
    
    @SuppressWarnings("unchecked")
	public Step migrateFeDatiRiepilogo() {
    	return stepBuilderFactory.get("migrateFeDatiRiepilogo")
    			.listener(new ExecutionListener())
    			.<FeDatiRiepilogo, FatTDatiRiepilogo>chunk(50)
				.reader(this.tableReader(FeDatiRiepilogo.class, FeDatiRiepilogo.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeDatiRiepilogo.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTDatiRiepilogo.class))
				.listener(new WriterListener())
				.build();
    } 
    
    @SuppressWarnings("unchecked")
	public Step migrateFeDatiRiepilogoStorico() {
    	return stepBuilderFactory.get("migrateFeDatiRiepilogoStorico")
    			.listener(new ExecutionListener())
    			.<FeDatiRiepilogoStorico, FatTDatiRiepilogoStor>chunk(50)
				.reader(this.tableReader(FeDatiRiepilogoStorico.class, FeDatiRiepilogoStorico.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeDatiRiepilogoStorico.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTDatiRiepilogoStor.class))
				.listener(new WriterListener())
				.build();
    } 
    
    @SuppressWarnings("unchecked")
	public Step migrateFeDatiRiferimentoStorico() {
    	return stepBuilderFactory.get("migrateFeDatiRiferimentoStorico")
    			.listener(new ExecutionListener())
    			.<FeDatiRiferimentoStorico, FatTDatiRiferimentoStor>chunk(50)
				.reader(this.tableReader(FeDatiRiferimentoStorico.class, FeDatiRiferimentoStorico.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeDatiRiferimentoStorico.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTDatiRiferimentoStor.class))
				.listener(new WriterListener())
				.build();
    } 
    
    @SuppressWarnings("unchecked")
	public Step migrateFeDatiRiferimento() {
    	return stepBuilderFactory.get("migrateFeDatiRiferimento")
    			.listener(new ExecutionListener())
    			.<FeDatiRiferimento, FatTDatiRiferimento>chunk(50)
				.reader(this.tableReader(FeDatiRiferimento.class, FeDatiRiferimento.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeDatiRiferimento.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTDatiRiferimento.class))
				.listener(new WriterListener())
				.build();
    } 
    
    @SuppressWarnings("unchecked")
	public Step migrateFeDatiSal() {
    	return stepBuilderFactory.get("migrateFeDatiSal")
    			.listener(new ExecutionListener())
    			.<FeDatiSal, FatTDatiSal>chunk(50)
				.reader(this.tableReader(FeDatiSal.class, FeDatiSal.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeDatiSal.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTDatiSal.class))
				.listener(new WriterListener())
				.build();
    } 
    
    @SuppressWarnings("unchecked")
	public Step migrateFeDatiSalStorico() {
    	return stepBuilderFactory.get("migrateFeDatiSalStorico")
    			.listener(new ExecutionListener())
    			.<FeDatiSalStorico, FatTDatiSalStor>chunk(50)
				.reader(this.tableReader(FeDatiSalStorico.class, FeDatiSalStorico.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeDatiSalStorico.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTDatiSalStor.class))
				.listener(new WriterListener())
				.build();
    } 
    
    @SuppressWarnings("unchecked")
	public Step migrateFeDettaglioLinea() {
    	return stepBuilderFactory.get("migrateFeDettaglioLinea")
    			.listener(new ExecutionListener())
    			.<FeDettaglioLinea, FatTDettaglioLinea>chunk(50)
				.reader(this.tableReader(FeDettaglioLinea.class, FeDettaglioLinea.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeDettaglioLinea.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTDettaglioLinea.class))
				.listener(new WriterListener())
				.build();
    } 

    
    @SuppressWarnings("unchecked")
	public Step migrateFeDettaglioLineaStorico() {
    	return stepBuilderFactory.get("migrateFeDettaglioLineaStorico")
    			.listener(new ExecutionListener())
    			.<FeDettaglioLineaStorico, FatTDettaglioLineaStor>chunk(50)
				.reader(this.tableReader(FeDettaglioLineaStorico.class, FeDettaglioLineaStorico.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeDettaglioLineaStorico.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTDettaglioLineaStor.class))
				.listener(new WriterListener())
				.build();
    } 
    
    
    @SuppressWarnings("unchecked")
	public Step migrateFeDettaglioPagStorico() {
    	return stepBuilderFactory.get("migrateFeDettaglioPagStorico")
    			.listener(new ExecutionListener())
    			.<FeDettaglioPagStorico, FatTDettaglioPagStor>chunk(50)
				.reader(this.tableReader(FeDettaglioPagStorico.class, FeDettaglioPagStorico.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeDettaglioPagStorico.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTDettaglioPagStor.class))
				.listener(new WriterListener())
				.build();
    } 

    
    @SuppressWarnings("unchecked")
	public Step migrateFeDettaglioPagamento() {
    	return stepBuilderFactory.get("migrateFeDettaglioPagamento")
    			.listener(new ExecutionListener())
    			.<FeDettaglioPagamento, FatTDettaglioPagamento>chunk(50)
				.reader(this.tableReader(FeDettaglioPagamento.class, FeDettaglioPagamento.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeDettaglioPagamento.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTDettaglioPagamento.class))
				.listener(new WriterListener())
				.build();
    }
    
    @SuppressWarnings("unchecked")
	public Step migrateFeErroreNotifica() {
    	return stepBuilderFactory.get("migrateFeErroreNotifica")
    			.listener(new ExecutionListener())
    			.<FeErroreNotifica, FatTErroreNotifica>chunk(50)
				.reader(this.tableReader(FeErroreNotifica.class, FeErroreNotifica.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeErroreNotifica.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTErroreNotifica.class))
				.listener(new WriterListener())
				.build();
    }
    
    @SuppressWarnings("unchecked")
	public Step migrateFeEsitoFtp() {
    	return stepBuilderFactory.get("migrateFeEsitoFtp")
    			.listener(new ExecutionListener())
    			.<FeEsitoFtp, FatTEsitoFtp>chunk(50)
				.reader(this.tableReader(FeEsitoFtp.class, FeEsitoFtp.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeEsitoFtp.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTEsitoFtp.class))
				.listener(new WriterListener())
				.build();
    }


}
