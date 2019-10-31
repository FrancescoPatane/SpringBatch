package it.pccube.batchmigration.configuration;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.pccube.batchmigration.destination.WriterFactory;
import it.pccube.batchmigration.destination.model.FatAFatturaInz;
import it.pccube.batchmigration.destination.model.FatAFatturaInzStor;
import it.pccube.batchmigration.destination.model.FatALottoSupportoFtp;
import it.pccube.batchmigration.destination.model.FatANotificaSupportoFtp;
import it.pccube.batchmigration.destination.model.FatARifLineaStor;
import it.pccube.batchmigration.destination.model.FatARiferimentoLinea;
import it.pccube.batchmigration.destination.model.FatAStatoAdesione;
import it.pccube.batchmigration.destination.model.FatAStatoArchivio;
import it.pccube.batchmigration.destination.model.FatAStatoEsitoFtp;
import it.pccube.batchmigration.destination.model.FatAStatoExcelFattura;
import it.pccube.batchmigration.destination.model.FatAStatoLottoFattura;
import it.pccube.batchmigration.destination.model.FatAStatoSupportoFtp;
import it.pccube.batchmigration.destination.model.FatTAdesione;
import it.pccube.batchmigration.destination.model.FatTAdesioneNotifica;
import it.pccube.batchmigration.destination.model.FatTAllegato;
import it.pccube.batchmigration.destination.model.FatTAllegatoStor;
import it.pccube.batchmigration.destination.model.FatTAltroDatoGestStor;
import it.pccube.batchmigration.destination.model.FatTAltroDatoGestionale;
import it.pccube.batchmigration.destination.model.FatTApplicativoLog;
import it.pccube.batchmigration.destination.model.FatTArchivio;
import it.pccube.batchmigration.destination.model.FatTArticolo;
import it.pccube.batchmigration.destination.model.FatTArticoloStor;
import it.pccube.batchmigration.destination.model.FatTAssegnazione;
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
import it.pccube.batchmigration.destination.model.FatTErroreBatchLog;
import it.pccube.batchmigration.destination.model.FatTErroreNotifica;
import it.pccube.batchmigration.destination.model.FatTEsecuzioneBatchLog;
import it.pccube.batchmigration.destination.model.FatTEsitoFtp;
import it.pccube.batchmigration.destination.model.FatTEsitoVerifFirmaCfg;
import it.pccube.batchmigration.destination.model.FatTExcelFailValidaz;
import it.pccube.batchmigration.destination.model.FatTExcelFattura;
import it.pccube.batchmigration.destination.model.FatTFattura;
import it.pccube.batchmigration.destination.model.FatTFatturaStor;
import it.pccube.batchmigration.destination.model.FatTFoglioStileCfg;
import it.pccube.batchmigration.destination.model.FatTGeneraleCfg;
import it.pccube.batchmigration.destination.model.FatTImpreseCollegAssoc;
import it.pccube.batchmigration.destination.model.FatTIpa;
import it.pccube.batchmigration.destination.model.FatTLotto;
import it.pccube.batchmigration.destination.model.FatTLottoArchivio;
import it.pccube.batchmigration.destination.model.FatTLottoRicEstrUff;
import it.pccube.batchmigration.destination.model.FatTLottoStor;
import it.pccube.batchmigration.destination.model.FatTMacrosezAppCfg;
import it.pccube.batchmigration.destination.model.FatTMail;
import it.pccube.batchmigration.destination.model.FatTMonitorInvioSdi;
import it.pccube.batchmigration.destination.model.FatTNotifica;
import it.pccube.batchmigration.destination.model.FatTReportSdi;
import it.pccube.batchmigration.destination.model.FatTReportSsaInviiSdi;
import it.pccube.batchmigration.destination.model.FatTReportSsaStatoAde;
import it.pccube.batchmigration.destination.model.FatTRicImprontaArchivio;
import it.pccube.batchmigration.destination.model.FatTRicProtocolImpronta;
import it.pccube.batchmigration.destination.model.FatTScontoMagStor;
import it.pccube.batchmigration.destination.model.FatTScontoMaggiorazione;
import it.pccube.batchmigration.destination.model.FatTSupportoFtp;
import it.pccube.batchmigration.destination.model.FatTVerFirmServEsiFtp;
import it.pccube.batchmigration.destination.model.FatTVerFirmServSupFtp;
import it.pccube.batchmigration.destination.model.FatTVerifFirmServLotto;
import it.pccube.batchmigration.destination.model.FatTVerifFirmServNotif;
import it.pccube.batchmigration.destination.model.FatTVerifFirmaAde;
import it.pccube.batchmigration.destination.model.FatTVerifFirmaEsitoFtp;
import it.pccube.batchmigration.destination.model.FatTVerifFirmaLotto;
import it.pccube.batchmigration.destination.model.FatTVerifFirmaNotifica;
import it.pccube.batchmigration.destination.model.FatTVerifFirmaServAde;
import it.pccube.batchmigration.destination.model.FatTVerifFirmaSuppFtp;
import it.pccube.batchmigration.destination.model.FatTXsdCampoCfg;
import it.pccube.batchmigration.destination.model.FatTXsdSezioneCfg;
import it.pccube.batchmigration.listener.ExecutionListener;
import it.pccube.batchmigration.listener.ProcessListener;
import it.pccube.batchmigration.listener.WriterListener;
import it.pccube.batchmigration.processor.ProcessorFactory;
import it.pccube.batchmigration.source.ReaderFactory;
import it.pccube.batchmigration.source.model.FeAdesione;
import it.pccube.batchmigration.source.model.FeAdesioneNotifica;
import it.pccube.batchmigration.source.model.FeAllegato;
import it.pccube.batchmigration.source.model.FeAllegatoStorico;
import it.pccube.batchmigration.source.model.FeAltroDatoGestStorico;
import it.pccube.batchmigration.source.model.FeAltroDatoGestionale;
import it.pccube.batchmigration.source.model.FeArchivio;
import it.pccube.batchmigration.source.model.FeArticolo;
import it.pccube.batchmigration.source.model.FeArticoloStorico;
import it.pccube.batchmigration.source.model.FeAssegnazione;
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
import it.pccube.batchmigration.source.model.FeExcelFailValidazione;
import it.pccube.batchmigration.source.model.FeExcelFattura;
import it.pccube.batchmigration.source.model.FeFattura;
import it.pccube.batchmigration.source.model.FeFatturaInz;
import it.pccube.batchmigration.source.model.FeFatturaInzStorico;
import it.pccube.batchmigration.source.model.FeFatturaStorico;
import it.pccube.batchmigration.source.model.FeImpreseCollegAssoc;
import it.pccube.batchmigration.source.model.FeIpa;
import it.pccube.batchmigration.source.model.FeLogApplicativo;
import it.pccube.batchmigration.source.model.FeLogErroreBatchDb;
import it.pccube.batchmigration.source.model.FeLogEsecuzioneBatchDb;
import it.pccube.batchmigration.source.model.FeLotto;
import it.pccube.batchmigration.source.model.FeLottoArchivio;
import it.pccube.batchmigration.source.model.FeLottoRichiestaEstrUff;
import it.pccube.batchmigration.source.model.FeLottoStorico;
import it.pccube.batchmigration.source.model.FeLottoSupportoFtp;
import it.pccube.batchmigration.source.model.FeMail;
import it.pccube.batchmigration.source.model.FeMonitoraggioInvioSdi;
import it.pccube.batchmigration.source.model.FeNotifica;
import it.pccube.batchmigration.source.model.FeNotificaSupportoFtp;
import it.pccube.batchmigration.source.model.FeReportSdi;
import it.pccube.batchmigration.source.model.FeReportSsaInviiSdi;
import it.pccube.batchmigration.source.model.FeReportSsaStatoAde;
import it.pccube.batchmigration.source.model.FeRicImprontaArchivio;
import it.pccube.batchmigration.source.model.FeRicProtocolloImpronta;
import it.pccube.batchmigration.source.model.FeRiferimentoLinea;
import it.pccube.batchmigration.source.model.FeRiferimentoLineaStorico;
import it.pccube.batchmigration.source.model.FeScontoMagStorico;
import it.pccube.batchmigration.source.model.FeScontoMaggiorazione;
import it.pccube.batchmigration.source.model.FeStatoAdesione;
import it.pccube.batchmigration.source.model.FeStatoArchivio;
import it.pccube.batchmigration.source.model.FeStatoEsitoFtp;
import it.pccube.batchmigration.source.model.FeStatoExcelFattura;
import it.pccube.batchmigration.source.model.FeStatoLottoFattura;
import it.pccube.batchmigration.source.model.FeStatoSupportoFtp;
import it.pccube.batchmigration.source.model.FeSupportoFtp;
import it.pccube.batchmigration.source.model.FeVerifFirmaAde;
import it.pccube.batchmigration.source.model.FeVerifFirmaEsitoFtp;
import it.pccube.batchmigration.source.model.FeVerifFirmaLotto;
import it.pccube.batchmigration.source.model.FeVerifFirmaNotifica;
import it.pccube.batchmigration.source.model.FeVerifFirmaServiceAde;
import it.pccube.batchmigration.source.model.FeVerifFirmaServiceEsiFtp;
import it.pccube.batchmigration.source.model.FeVerifFirmaServiceLotto;
import it.pccube.batchmigration.source.model.FeVerifFirmaServiceNotif;
import it.pccube.batchmigration.source.model.FeVerifFirmaServiceSupFtp;
import it.pccube.batchmigration.source.model.FeVerifFirmaSupportoFtp;

@Component
public class StepFactory {
	
	
	@Autowired
	private  StepBuilderFactory stepBuilderFactory;
	
	@Autowired
	private  ProcessorFactory processorFactory;
	
	@Autowired
	private  WriterFactory writerFactory;
	
	@Autowired
	private ReaderFactory readerFactory;
	
	
	
    @SuppressWarnings("unchecked")
	public Step migrateFeLotto() {
    	return stepBuilderFactory.get("migrateFeLotto")
    			.listener(new ExecutionListener())
    			.<FeLotto, FatTLotto>chunk(50)
				.reader(this.readerFactory.tableReader(FeLotto.class, FeLotto.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeLottoStorico.class, FeLottoStorico.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeFattura.class, FeFattura.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeFatturaStorico.class, FeFatturaStorico.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeCausaleFattura.class, FeCausaleFattura.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeCausaleFatturaStorico.class, FeCausaleFatturaStorico.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeAdesione.class, FeAdesione.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeAdesioneNotifica.class, FeAdesioneNotifica.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeAllegato.class, FeAllegato.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeAllegatoStorico.class, FeAllegatoStorico.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeAltroDatoGestionale.class, FeAltroDatoGestionale.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeAltroDatoGestStorico.class, FeAltroDatoGestStorico.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeArchivio.class, FeArchivio.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeArticolo.class, FeArticolo.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeArticoloStorico.class, FeArticoloStorico.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeStatoAdesione.class, FeStatoAdesione.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeStatoArchivio.class, FeStatoArchivio.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeCompilazioneSezione.class, FeCompilazioneSezione.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeCompSezioneStorico.class, FeCompSezioneStorico.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeConfigEsitoVerifFirma.class, FeConfigEsitoVerifFirma.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeConfigFoglioStile.class, FeConfigFoglioStile.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeConfigGenerale.class, FeConfigGenerale.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeConfigMacrosezApp.class, FeConfigMacrosezApp.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeConfigXsdCampo.class, FeConfigXsdCampo.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeConfigXsdSezione.class, FeConfigXsdSezione.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeConservazAutoreLotto.class, FeConservazAutoreLotto.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeDatiCassaPrevidenziale.class, FeDatiCassaPrevidenziale.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeDatiCassaPrevStorico.class, FeDatiCassaPrevStorico.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeDatiDdtStorico.class, FeDatiDdtStorico.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeDatiDdt.class, FeDatiDdt.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeDatiPagamento.class, FeDatiPagamento.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeDatiPagamentoStorico.class, FeDatiPagamentoStorico.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeDatiRiepilogo.class, FeDatiRiepilogo.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeDatiRiepilogoStorico.class, FeDatiRiepilogoStorico.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeDatiRiferimentoStorico.class, FeDatiRiferimentoStorico.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeDatiRiferimento.class, FeDatiRiferimento.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeDatiSal.class, FeDatiSal.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeDatiSalStorico.class, FeDatiSalStorico.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeDettaglioLinea.class, FeDettaglioLinea.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeDettaglioLineaStorico.class, FeDettaglioLineaStorico.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeDettaglioPagStorico.class, FeDettaglioPagStorico.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeDettaglioPagamento.class, FeDettaglioPagamento.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeErroreNotifica.class, FeErroreNotifica.TABLE_NAME))
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
				.reader(this.readerFactory.tableReader(FeEsitoFtp.class, FeEsitoFtp.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeEsitoFtp.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTEsitoFtp.class))
				.listener(new WriterListener())
				.build();
    }
    
    @SuppressWarnings("unchecked")
	public Step migrateFeExcelFattura() {
    	return stepBuilderFactory.get("migrateFeExcelFattura")
    			.listener(new ExecutionListener())
    			.<FeExcelFattura, FatTExcelFattura>chunk(50)
				.reader(this.readerFactory.tableReader(FeExcelFattura.class, FeExcelFattura.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeExcelFattura.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTExcelFattura.class))
				.listener(new WriterListener())
				.build();
    }
    
    @SuppressWarnings("unchecked")
	public Step migrateFeExcelFailValidazione() {
    	return stepBuilderFactory.get("migrateFeExcelFailValidazione")
    			.listener(new ExecutionListener())
    			.<FeExcelFailValidazione, FatTExcelFailValidaz>chunk(50)
				.reader(this.readerFactory.tableReader(FeExcelFailValidazione.class, FeExcelFailValidazione.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeExcelFailValidazione.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTExcelFailValidaz.class))
				.listener(new WriterListener())
				.build();
    }
    
    @SuppressWarnings("unchecked")
	public Step migrateFeImpreseCollegAssoc() {
    	return stepBuilderFactory.get("migrateFeImpreseCollegAssoc")
    			.listener(new ExecutionListener())
    			.<FeImpreseCollegAssoc, FatTImpreseCollegAssoc>chunk(50)
				.reader(this.readerFactory.tableReader(FeImpreseCollegAssoc.class, FeImpreseCollegAssoc.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeImpreseCollegAssoc.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTImpreseCollegAssoc.class))
				.listener(new WriterListener())
				.build();
    }
    
    
    @SuppressWarnings("unchecked")
	public Step migrateFeIpa() {
    	return stepBuilderFactory.get("migrateFeIpa")
    			.listener(new ExecutionListener())
    			.<FeIpa, FatTIpa>chunk(50)
				.reader(this.readerFactory.tableReader(FeIpa.class, FeIpa.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeIpa.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTIpa.class))
				.listener(new WriterListener())
				.build();
    }
    
    @SuppressWarnings("unchecked")
	public Step migrateFeLogApplicativo() {
    	return stepBuilderFactory.get("migrateFeLogApplicativo")
    			.listener(new ExecutionListener())
    			.<FeLogApplicativo, FatTApplicativoLog>chunk(50)
				.reader(this.readerFactory.tableReader(FeLogApplicativo.class, FeLogApplicativo.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeLogApplicativo.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTApplicativoLog.class))
				.listener(new WriterListener())
				.build();
    }
    
    
    @SuppressWarnings("unchecked")
	public Step migrateFeLogErroreBatchDb() {
    	return stepBuilderFactory.get("migrateFeLogErroreBatchDb")
    			.listener(new ExecutionListener())
    			.<FeLogErroreBatchDb, FatTErroreBatchLog>chunk(50)
				.reader(this.readerFactory.getFeLogErroreBatchDbReader())
				.processor(this.processorFactory.getProcessor(FeLogErroreBatchDb.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTErroreBatchLog.class))
				.listener(new WriterListener())
				.build();
    }
    
    
    @SuppressWarnings("unchecked")
	public Step migrateFeLogEsecuzioneBatchDb() {
    	return stepBuilderFactory.get("migrateFeLogEsecuzioneBatchDb")
    			.listener(new ExecutionListener())
    			.<FeLogEsecuzioneBatchDb, FatTEsecuzioneBatchLog>chunk(50)
				.reader(this.readerFactory.getFeLogEsecuzioneBatchDbReader())
				.processor(this.processorFactory.getProcessor(FeLogEsecuzioneBatchDb.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTEsecuzioneBatchLog.class))
				.listener(new WriterListener())
				.build();
    }
    
    
    @SuppressWarnings("unchecked")
	public Step migrateFeLottoRichiestaEstrUff() {
    	return stepBuilderFactory.get("migrateFeLottoRichiestaEstrUff")
    			.listener(new ExecutionListener())
    			.<FeLottoRichiestaEstrUff, FatTLottoRicEstrUff>chunk(50)
				.reader(this.readerFactory.tableReader(FeLottoRichiestaEstrUff.class, FeLottoRichiestaEstrUff.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeLottoRichiestaEstrUff.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTLottoRicEstrUff.class))
				.listener(new WriterListener())
				.build();
    }
    
    @SuppressWarnings("unchecked")
	public Step migrateFeLottoSupportoFtp() {
    	return stepBuilderFactory.get("migrateFeLottoSupportoFtp")
    			.listener(new ExecutionListener())
    			.<FeLottoSupportoFtp, FatALottoSupportoFtp>chunk(50)
				.reader(this.readerFactory.tableReader(FeLottoSupportoFtp.class, FeLottoSupportoFtp.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeLottoSupportoFtp.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatALottoSupportoFtp.class))
				.listener(new WriterListener())
				.build();
    }
    
    
    @SuppressWarnings("unchecked")
	public Step migrateFeMail() {
    	return stepBuilderFactory.get("migrateFeMail")
    			.listener(new ExecutionListener())
    			.<FeMail, FatTMail>chunk(50)
				.reader(this.readerFactory.tableReader(FeMail.class, FeMail.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeMail.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTMail.class))
				.listener(new WriterListener())
				.build();
    }
    
    
    @SuppressWarnings("unchecked")
	public Step migrateFeMonitoraggioInvioSdi() {
    	return stepBuilderFactory.get("migrateFeMonitoraggioInvioSdi")
    			.listener(new ExecutionListener())
    			.<FeMonitoraggioInvioSdi, FatTMonitorInvioSdi>chunk(50)
				.reader(this.readerFactory.tableReader(FeMonitoraggioInvioSdi.class, FeMonitoraggioInvioSdi.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeMonitoraggioInvioSdi.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTMonitorInvioSdi.class))
				.listener(new WriterListener())
				.build();
    }
    
    
    @SuppressWarnings("unchecked")
	public Step migrateFeNotifica() {
    	return stepBuilderFactory.get("migrateFeNotifica")
    			.listener(new ExecutionListener())
    			.<FeNotifica, FatTNotifica>chunk(50)
				.reader(this.readerFactory.tableReader(FeNotifica.class, FeNotifica.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeNotifica.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTNotifica.class))
				.listener(new WriterListener())
				.build();
    }
    
    @SuppressWarnings("unchecked")
	public Step migrateFeNotificaSupportoFtp() {
    	return stepBuilderFactory.get("migrateFeNotificaSupportoFtp")
    			.listener(new ExecutionListener())
    			.<FeNotificaSupportoFtp, FatANotificaSupportoFtp>chunk(50)
				.reader(this.readerFactory.tableReader(FeNotificaSupportoFtp.class, FeNotificaSupportoFtp.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeNotificaSupportoFtp.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatANotificaSupportoFtp.class))
				.listener(new WriterListener())
				.build();
    }
    
    @SuppressWarnings("unchecked")
	public Step migrateFeReportSdi() {
    	return stepBuilderFactory.get("migrateFeReportSdi")
    			.listener(new ExecutionListener())
    			.<FeReportSdi, FatTReportSdi>chunk(50)
				.reader(this.readerFactory.tableReader(FeReportSdi.class, FeReportSdi.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeReportSdi.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTReportSdi.class))
				.listener(new WriterListener())
				.build();
    }
    
    @SuppressWarnings("unchecked")
	public Step migrateFeReportSsaInviiSdi() {
    	return stepBuilderFactory.get("migrateFeReportSsaInviiSdi")
    			.listener(new ExecutionListener())
    			.<FeReportSsaInviiSdi, FatTReportSsaInviiSdi>chunk(50)
				.reader(this.readerFactory.tableReader(FeReportSsaInviiSdi.class, FeReportSsaInviiSdi.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeReportSsaInviiSdi.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTReportSsaInviiSdi.class))
				.listener(new WriterListener())
				.build();
    }
    
    @SuppressWarnings("unchecked")
	public Step migrateFeReportSsaStatoAde() {
    	return stepBuilderFactory.get("migrateFeReportSsaStatoAde")
    			.listener(new ExecutionListener())
    			.<FeReportSsaStatoAde, FatTReportSsaStatoAde>chunk(50)
				.reader(this.readerFactory.tableReader(FeReportSsaStatoAde.class, FeReportSsaStatoAde.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeReportSsaStatoAde.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTReportSsaStatoAde.class))
				.listener(new WriterListener())
				.build();
    }
    
    @SuppressWarnings("unchecked")
	public Step migrateFeRicImprontaArchivio() {
    	return stepBuilderFactory.get("migrateFeRicImprontaArchivio")
    			.listener(new ExecutionListener())
    			.<FeRicImprontaArchivio, FatTRicImprontaArchivio>chunk(50)
				.reader(this.readerFactory.tableReader(FeRicImprontaArchivio.class, FeRicImprontaArchivio.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeRicImprontaArchivio.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTRicImprontaArchivio.class))
				.listener(new WriterListener())
				.build();
    }
    
    
    @SuppressWarnings("unchecked")
	public Step migrateFeRicProtocolloImpronta() {
    	return stepBuilderFactory.get("migrateFeRicProtocolloImpronta")
    			.listener(new ExecutionListener())
    			.<FeRicProtocolloImpronta, FatTRicProtocolImpronta>chunk(50)
				.reader(this.readerFactory.tableReader(FeRicProtocolloImpronta.class, FeRicProtocolloImpronta.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeRicProtocolloImpronta.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTRicProtocolImpronta.class))
				.listener(new WriterListener())
				.build();
    }
    
    
    @SuppressWarnings("unchecked")
	public Step migrateFeRiferimentoLineaStorico() {
    	return stepBuilderFactory.get("migrateFeRiferimentoLineaStorico")
    			.listener(new ExecutionListener())
    			.<FeRiferimentoLineaStorico, FatARifLineaStor>chunk(50)
				.reader(this.readerFactory.tableReader(FeRiferimentoLineaStorico.class, FeRiferimentoLineaStorico.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeRiferimentoLineaStorico.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatARifLineaStor.class))
				.listener(new WriterListener())
				.build();
    }
    
    
    @SuppressWarnings("unchecked")
	public Step migrateFeRiferimentoLinea() {
    	return stepBuilderFactory.get("migrateFeRiferimentoLinea")
    			.listener(new ExecutionListener())
    			.<FeRiferimentoLinea, FatARiferimentoLinea>chunk(50)
				.reader(this.readerFactory.tableReader(FeRiferimentoLinea.class, FeRiferimentoLinea.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeRiferimentoLinea.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatARiferimentoLinea.class))
				.listener(new WriterListener())
				.build();
    }
    
    @SuppressWarnings("unchecked")
	public Step migrateFeScontoMagStorico() {
    	return stepBuilderFactory.get("migrateFeScontoMagStorico")
    			.listener(new ExecutionListener())
    			.<FeScontoMagStorico, FatTScontoMagStor>chunk(50)
				.reader(this.readerFactory.tableReader(FeScontoMagStorico.class, FeScontoMagStorico.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeScontoMagStorico.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTScontoMagStor.class))
				.listener(new WriterListener())
				.build();
    }
    
    
    @SuppressWarnings("unchecked")
	public Step migrateFeScontoMaggiorazione() {
    	return stepBuilderFactory.get("migrateFeScontoMaggiorazione")
    			.listener(new ExecutionListener())
    			.<FeScontoMaggiorazione, FatTScontoMaggiorazione>chunk(50)
				.reader(this.readerFactory.tableReader(FeScontoMaggiorazione.class, FeScontoMaggiorazione.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeScontoMaggiorazione.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTScontoMaggiorazione.class))
				.listener(new WriterListener())
				.build();
    }
    
    
    @SuppressWarnings("unchecked")
	public Step migrateFeFatturaInz() {
    	return stepBuilderFactory.get("migrateFeFatturaInz")
    			.listener(new ExecutionListener())
    			.<FeFatturaInz, FatAFatturaInz>chunk(50)
				.reader(this.readerFactory.tableReader(FeFatturaInz.class, FeFatturaInz.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeFatturaInz.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatAFatturaInz.class))
				.listener(new WriterListener())
				.build();
    }
    
    
    @SuppressWarnings("unchecked")
	public Step migrateFeFatturaInzStorico() {
    	return stepBuilderFactory.get("migrateFeFatturaInzStorico")
    			.listener(new ExecutionListener())
    			.<FeFatturaInzStorico, FatAFatturaInzStor>chunk(50)
				.reader(this.readerFactory.tableReader(FeFatturaInzStorico.class, FeFatturaInzStorico.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeFatturaInzStorico.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatAFatturaInzStor.class))
				.listener(new WriterListener())
				.build();
    }
    
    @SuppressWarnings("unchecked")
	public Step migrateFeStatoEsitoFtp() {
    	return stepBuilderFactory.get("migrateFeStatoEsitoFtp")
    			.listener(new ExecutionListener())
    			.<FeStatoEsitoFtp, FatAStatoEsitoFtp>chunk(50)
				.reader(this.readerFactory.tableReader(FeStatoEsitoFtp.class, FeStatoEsitoFtp.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeStatoEsitoFtp.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatAStatoEsitoFtp.class))
				.listener(new WriterListener())
				.build();
    }
    
    @SuppressWarnings("unchecked")
	public Step migrateFeStatoExcelFattura() {
    	return stepBuilderFactory.get("migrateFeStatoExcelFattura")
    			.listener(new ExecutionListener())
    			.<FeStatoExcelFattura, FatAStatoExcelFattura>chunk(50)
				.reader(this.readerFactory.tableReader(FeStatoExcelFattura.class, FeStatoExcelFattura.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeStatoExcelFattura.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatAStatoExcelFattura.class))
				.listener(new WriterListener())
				.build();
    }
    
    @SuppressWarnings("unchecked")
	public Step migrateFeStatoSupportoFtp() {
    	return stepBuilderFactory.get("migrateFeStatoSupportoFtp")
    			.listener(new ExecutionListener())
    			.<FeStatoSupportoFtp, FatAStatoSupportoFtp>chunk(50)
				.reader(this.readerFactory.tableReader(FeStatoSupportoFtp.class, FeStatoSupportoFtp.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeStatoSupportoFtp.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatAStatoSupportoFtp.class))
				.listener(new WriterListener())
				.build();
    }
    
    @SuppressWarnings("unchecked")
	public Step migrateFeStatoLottoFattura() {
    	return stepBuilderFactory.get("migrateFeStatoLottoFattura")
    			.listener(new ExecutionListener())
    			.<FeStatoLottoFattura, FatAStatoLottoFattura>chunk(50)
				.reader(this.readerFactory.tableReader(FeStatoLottoFattura.class, FeStatoLottoFattura.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeStatoLottoFattura.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatAStatoLottoFattura.class))
				.listener(new WriterListener())
				.build();
    }
    
    @SuppressWarnings("unchecked")
	public Step migrateFeSupportoFtp() {
    	return stepBuilderFactory.get("migrateFeSupportoFtp")
    			.listener(new ExecutionListener())
    			.<FeSupportoFtp, FatTSupportoFtp>chunk(50)
				.reader(this.readerFactory.tableReader(FeSupportoFtp.class, FeSupportoFtp.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeSupportoFtp.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTSupportoFtp.class))
				.listener(new WriterListener())
				.build();
    }
    
    @SuppressWarnings("unchecked")
	public Step migrateFeVerifFirmaAde() {
    	return stepBuilderFactory.get("migrateFeVerifFirmaAde")
    			.listener(new ExecutionListener())
    			.<FeVerifFirmaAde, FatTVerifFirmaAde>chunk(50)
				.reader(this.readerFactory.tableReader(FeVerifFirmaAde.class, FeVerifFirmaAde.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeVerifFirmaAde.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTVerifFirmaAde.class))
				.listener(new WriterListener())
				.build();
    }
    
    @SuppressWarnings("unchecked")
	public Step migrateFeVerifFirmaEsitoFtp() {
    	return stepBuilderFactory.get("migrateFeVerifFirmaEsitoFtp")
    			.listener(new ExecutionListener())
    			.<FeVerifFirmaEsitoFtp, FatTVerifFirmaEsitoFtp>chunk(50)
				.reader(this.readerFactory.tableReader(FeVerifFirmaEsitoFtp.class, FeVerifFirmaEsitoFtp.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeVerifFirmaEsitoFtp.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTVerifFirmaEsitoFtp.class))
				.listener(new WriterListener())
				.build();
    }
    
    @SuppressWarnings("unchecked")
	public Step migrateFeVerifFirmaLotto() {
    	return stepBuilderFactory.get("migrateFeVerifFirmaLotto")
    			.listener(new ExecutionListener())
    			.<FeVerifFirmaLotto, FatTVerifFirmaLotto>chunk(50)
				.reader(this.readerFactory.tableReader(FeVerifFirmaLotto.class, FeVerifFirmaLotto.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeVerifFirmaLotto.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTVerifFirmaLotto.class))
				.listener(new WriterListener())
				.build();
    }
    
    @SuppressWarnings("unchecked")
	public Step migrateFeVerifFirmaNotifica() {
    	return stepBuilderFactory.get("migrateFeVerifFirmaNotifica")
    			.listener(new ExecutionListener())
    			.<FeVerifFirmaNotifica, FatTVerifFirmaNotifica>chunk(50)
				.reader(this.readerFactory.tableReader(FeVerifFirmaNotifica.class, FeVerifFirmaNotifica.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeVerifFirmaNotifica.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTVerifFirmaNotifica.class))
				.listener(new WriterListener())
				.build();
    }
    
    @SuppressWarnings("unchecked")
	public Step migrateFeVerifFirmaServiceAde() {
    	return stepBuilderFactory.get("migrateFeVerifFirmaServiceAde")
    			.listener(new ExecutionListener())
    			.<FeVerifFirmaServiceAde, FatTVerifFirmaServAde>chunk(50)
				.reader(this.readerFactory.tableReader(FeVerifFirmaServiceAde.class, FeVerifFirmaServiceAde.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeVerifFirmaServiceAde.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTVerifFirmaServAde.class))
				.listener(new WriterListener())
				.build();
    }
    
    @SuppressWarnings("unchecked")
	public Step migrateFeVerifFirmaServiceEsiFtp() {
    	return stepBuilderFactory.get("migrateFeVerifFirmaServiceEsiFtp")
    			.listener(new ExecutionListener())
    			.<FeVerifFirmaServiceEsiFtp, FatTVerFirmServEsiFtp>chunk(50)
				.reader(this.readerFactory.tableReader(FeVerifFirmaServiceEsiFtp.class, FeVerifFirmaServiceEsiFtp.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeVerifFirmaServiceEsiFtp.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTVerFirmServEsiFtp.class))
				.listener(new WriterListener())
				.build();
    }
    
    @SuppressWarnings("unchecked")
	public Step migrateFeVerifFirmaServiceLotto() {
    	return stepBuilderFactory.get("migrateFeVerifFirmaServiceLotto")
    			.listener(new ExecutionListener())
    			.<FeVerifFirmaServiceLotto, FatTVerifFirmServLotto>chunk(50)
				.reader(this.readerFactory.tableReader(FeVerifFirmaServiceLotto.class, FeVerifFirmaServiceLotto.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeVerifFirmaServiceLotto.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTVerifFirmServLotto.class))
				.listener(new WriterListener())
				.build();
    }
    
    @SuppressWarnings("unchecked")
	public Step migrateFeVerifFirmaServiceNotif() {
    	return stepBuilderFactory.get("migrateFeVerifFirmaServiceNotif")
    			.listener(new ExecutionListener())
    			.<FeVerifFirmaServiceNotif, FatTVerifFirmServNotif>chunk(50)
				.reader(this.readerFactory.tableReader(FeVerifFirmaServiceNotif.class, FeVerifFirmaServiceNotif.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeVerifFirmaServiceNotif.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTVerifFirmServNotif.class))
				.listener(new WriterListener())
				.build();
    }
    
    @SuppressWarnings("unchecked")
	public Step migrateFeVerifFirmaServiceSupFtp() {
    	return stepBuilderFactory.get("migrateFeVerifFirmaServiceSupFtp")
    			.listener(new ExecutionListener())
    			.<FeVerifFirmaServiceSupFtp, FatTVerFirmServSupFtp>chunk(50)
				.reader(this.readerFactory.tableReader(FeVerifFirmaServiceSupFtp.class, FeVerifFirmaServiceSupFtp.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeVerifFirmaServiceSupFtp.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTVerFirmServSupFtp.class))
				.listener(new WriterListener())
				.build();
    }
    
    @SuppressWarnings("unchecked")
	public Step migrateFeVerifFirmaSupportoFtp() {
    	return stepBuilderFactory.get("migrateFeVerifFirmaSupportoFtp")
    			.listener(new ExecutionListener())
    			.<FeVerifFirmaSupportoFtp, FatTVerifFirmaSuppFtp>chunk(50)
				.reader(this.readerFactory.tableReader(FeVerifFirmaSupportoFtp.class, FeVerifFirmaSupportoFtp.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeVerifFirmaSupportoFtp.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTVerifFirmaSuppFtp.class))
				.listener(new WriterListener())
				.build();
    }
    
    @SuppressWarnings("unchecked")
	public Step migrateFeLottoArchivio() {
    	return stepBuilderFactory.get("migrateFeLottoArchivio")
    			.listener(new ExecutionListener())
    			.<FeLottoArchivio, FatTLottoArchivio>chunk(50)
				.reader(this.readerFactory.tableReader(FeLottoArchivio.class, FeLottoArchivio.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeLottoArchivio.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTLottoArchivio.class))
				.listener(new WriterListener())
				.build();
    }
    
    @SuppressWarnings("unchecked")
	public Step migrateFeAssegnazione() {
    	return stepBuilderFactory.get("migrateFeAssegnazione")
    			.listener(new ExecutionListener())
    			.<FeAssegnazione, FatTAssegnazione>chunk(50)
				.reader(this.readerFactory.tableReader(FeAssegnazione.class, FeAssegnazione.TABLE_NAME))
				.processor(this.processorFactory.getProcessor(FeAssegnazione.class))
				.listener(new ProcessListener())
				.writer(this.writerFactory.getWriter(FatTAssegnazione.class))
				.listener(new WriterListener())
				.build();
    }

}
