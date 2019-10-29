package it.pccube.batchmigration.destination;

import javax.sql.DataSource;

import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import it.pccube.batchmigration.destination.model.FatALottoSupportoFtp;
import it.pccube.batchmigration.destination.model.FatANotificaSupportoFtp;
import it.pccube.batchmigration.destination.model.FatARifLineaStor;
import it.pccube.batchmigration.destination.model.FatARiferimentoLinea;
import it.pccube.batchmigration.destination.model.FatAStatoAdesione;
import it.pccube.batchmigration.destination.model.FatAStatoArchivio;
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
import it.pccube.batchmigration.destination.model.FatTXsdCampoCfg;
import it.pccube.batchmigration.destination.model.FatTXsdSezioneCfg;
import it.pccube.batchmigration.exception.NoWriterFoundException;
import it.pccube.batchmigration.source.model.FeScontoMaggiorazione;

@Component
public class WriterFactory {

	@Autowired
	@Qualifier("dbDestination")
	private  DataSource dbDestination;

	public <T> JdbcBatchItemWriter<T> getWriter(Class<T> clazz){
		JdbcBatchItemWriter<T> writer = new JdbcBatchItemWriter<>();
		writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<T>());
		writer.setSql(this.getQuery(clazz));
		writer.setDataSource(this.dbDestination);
		writer.afterPropertiesSet();
		return writer;
	}


	private <T> String getQuery(Class<T> clazz) {
		String query = null;
		String modelClassName = clazz.getSimpleName();
		switch(modelClassName) {
		case "FatTAdesione":
			query = FatTAdesione.INSERT_QUERY;
			break;
		case "FatTAdesioneNotifica":
			query = FatTAdesioneNotifica.INSERT_QUERY;
			break;
		case "FatTAllegato":
			query = FatTAllegato.INSERT_QUERY;
			break;
		case "FatTAllegatoStor":
			query = FatTAllegatoStor.INSERT_QUERY;
			break;
		case "FatTAltroDatoGestionale":
			query = FatTAltroDatoGestionale.INSERT_QUERY;
			break;
		case "FatTAltroDatoGestStor":
			query = FatTAltroDatoGestStor.INSERT_QUERY;
			break;
		case "FatTLotto":
			query = FatTLotto.INSERT_QUERY;
			break;
		case "FatTLottoStor":
			query = FatTLottoStor.INSERT_QUERY;
			break;
		case "FatTFattura":
			query = FatTFattura.INSERT_QUERY;
			break;
		case "FatTFatturaStor":
			query = FatTFatturaStor.INSERT_QUERY;
			break;	
		case "FatTCausaleFattura":
			query = FatTCausaleFattura.INSERT_QUERY;
			break;
		case "FatTCausaleFatturaStor":
			query = FatTCausaleFatturaStor.INSERT_QUERY;
			break;
		case "FatTArchivio":
			query = FatTArchivio.INSERT_QUERY;
			break;
		case "FatTArticolo":
			query = FatTArticolo.INSERT_QUERY;
			break;
		case "FatTArticoloStor":
			query = FatTArticoloStor.INSERT_QUERY;
			break;
		case "FatAStatoAdesione":
			query = FatAStatoAdesione.INSERT_QUERY;
			break;
		case "FatAStatoArchivio":
			query = FatAStatoArchivio.INSERT_QUERY;
			break;
		case "FatTCompilazioneSezione":
			query = FatTCompilazioneSezione.INSERT_QUERY;
			break;
		case "FatTCompSezioneStor":
			query = FatTCompSezioneStor.INSERT_QUERY;
			break;
		case "FatTEsitoVerifFirmaCfg":
			query = FatTEsitoVerifFirmaCfg.INSERT_QUERY;
			break;
		case "FatTFoglioStileCfg":
			query = FatTFoglioStileCfg.INSERT_QUERY;
			break;
		case "FatTGeneraleCfg":
			query = FatTGeneraleCfg.INSERT_QUERY;
			break;
		case "FatTMacrosezAppCfg":
			query = FatTMacrosezAppCfg.INSERT_QUERY;
			break;
		case "FatTXsdSezioneCfg":
			query = FatTXsdSezioneCfg.INSERT_QUERY;
			break;
		case "FatTXsdCampoCfg":
			query = FatTXsdCampoCfg.INSERT_QUERY;
			break;
		case "FatTConservAutoreLotto":
			query = FatTConservAutoreLotto.INSERT_QUERY;
			break;
		case "FatTDatiCassaPrevidenz":
			query = FatTDatiCassaPrevidenz.INSERT_QUERY;
			break;
		case "FatTDatiCassaPrevStor":
			query = FatTDatiCassaPrevStor.INSERT_QUERY;
			break;
		case "FatTDatiDdt":
			query = FatTDatiDdt.INSERT_QUERY;
			break;
		case "FatTDatiDdtStor":
			query = FatTDatiDdtStor.INSERT_QUERY;
			break;	
		case "FatTDatiPagamento":
			query = FatTDatiPagamento.INSERT_QUERY;
			break;	
		case "FatTDatiPagamentoStor":
			query = FatTDatiPagamentoStor.INSERT_QUERY;
			break;	
		case "FatTDatiRiepilogo":
			query = FatTDatiRiepilogo.INSERT_QUERY;
			break;	
		case "FatTDatiRiepilogoStor":
			query = FatTDatiRiepilogoStor.INSERT_QUERY;
			break;	
		case "FatTDatiRiferimento":
			query = FatTDatiRiferimento.INSERT_QUERY;
			break;	
		case "FatTDatiRiferimentoStor":
			query = FatTDatiRiferimentoStor.INSERT_QUERY;
			break;	
		case "FatTDatiSal":
			query = FatTDatiSal.INSERT_QUERY;
			break;	
		case "FatTDatiSalStor":
			query = FatTDatiSalStor.INSERT_QUERY;
			break;	
		case "FatTDettaglioLinea":
			query = FatTDettaglioLinea.INSERT_QUERY;
			break;
		case "FatTDettaglioLineaStor":
			query = FatTDettaglioLineaStor.INSERT_QUERY;
			break;
		case "FatTDettaglioPagamento":
			query = FatTDettaglioPagamento.INSERT_QUERY;
			break;
		case "FatTDettaglioPagStor":
			query = FatTDettaglioPagStor.INSERT_QUERY;
			break;
		case "FatTErroreNotifica":
			query = FatTErroreNotifica.INSERT_QUERY;
			break;
		case "FatTEsitoFtp":
			query = FatTEsitoFtp.INSERT_QUERY;
			break;
		case "FatTExcelFattura":
			query = FatTExcelFattura.INSERT_QUERY;
			break;
		case "FatTExcelFailValidaz":
			query = FatTExcelFailValidaz.INSERT_QUERY;
			break;
		case "FatTImpreseCollegAssoc":
			query = FatTImpreseCollegAssoc.INSERT_QUERY;
			break;
		case "FatTIpa":
			query = FatTIpa.INSERT_QUERY;
			break;
		case "FatTApplicativoLog":
			query = FatTApplicativoLog.INSERT_QUERY;
			break;
		case "FatTErroreBatchLog":
			query = FatTErroreBatchLog.INSERT_QUERY;
			break;	
		case "FatTEsecuzioneBatchLog":
			query = FatTEsecuzioneBatchLog.INSERT_QUERY;
			break;	
		case "FatTLottoRicEstrUff":
			query = FatTLottoRicEstrUff.INSERT_QUERY;
			break;	
		case "FatALottoSupportoFtp":
			query = FatALottoSupportoFtp.INSERT_QUERY;
			break;		
		case "FatTMail":
			query = FatTMail.INSERT_QUERY;
			break;	
		case "FatTMonitorInvioSdi":
			query = FatTMonitorInvioSdi.INSERT_QUERY;
			break;
		case "FatTNotifica":
			query = FatTNotifica.INSERT_QUERY;
			break;
		case "FatANotificaSupportoFtp":
			query = FatANotificaSupportoFtp.INSERT_QUERY;
			break;	
		case "FatTReportSdi":
			query = FatTReportSdi.INSERT_QUERY;
			break;		
		case "FatTReportSsaInviiSdi":
			query = FatTReportSsaInviiSdi.INSERT_QUERY;
			break;	
		case "FatTReportSsaStatoAde":
			query = FatTReportSsaStatoAde.INSERT_QUERY;
			break;	
		case "FatTRicImprontaArchivio":
			query = FatTRicImprontaArchivio.INSERT_QUERY;
			break;
		case "FatTRicProtocolImpronta":
			query = FatTRicProtocolImpronta.INSERT_QUERY;
			break;
		case "FatARiferimentoLinea":
			query = FatARiferimentoLinea.INSERT_QUERY;
			break;
		case "FatARifLineaStor":
			query = FatARifLineaStor.INSERT_QUERY;
			break;
		case "FatTScontoMaggiorazione":
			query = FatTScontoMaggiorazione.INSERT_QUERY;
			break;
		case "FatTScontoMagStor":
			query = FatTScontoMagStor.INSERT_QUERY;
			break;
		default:
			throw new NoWriterFoundException("No writer found for entity " + modelClassName);
		}
		return query;
	}
}


