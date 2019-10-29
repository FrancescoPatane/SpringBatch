package it.pccube.batchmigration.processor;

import java.math.BigDecimal;
import java.util.Base64;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

import it.pccube.batchmigration.client.doc.DocumentaleService;
import it.pccube.batchmigration.client.doc.OutputDocumentale;
import it.pccube.batchmigration.destination.model.FatTReportSsaInviiSdi;
import it.pccube.batchmigration.source.model.FeReportSsaInviiSdi;

public class FeReportSsaInviiSdiMapper implements ItemProcessor<FeReportSsaInviiSdi, FatTReportSsaInviiSdi>{

	public static final Logger logger = LoggerFactory.getLogger(FeReportSsaInviiSdiMapper.class);


	@Autowired
	private DocumentaleService docService;


	@Override
	public FatTReportSsaInviiSdi process(FeReportSsaInviiSdi source) throws Exception {
		FatTReportSsaInviiSdi destination = new FatTReportSsaInviiSdi();
		
		destination.setIdReportSsaInviiSdi(source.getIdReportSsaInviiSdi());
		destination.setCdPartitaIvaForn(source.getPartitaIvaForn());
		destination.setDtDataInvioA(source.getDataInvioA());
		destination.setDtDataInvioDa(source.getDataInvioDa());
		destination.setDtDataRichiesta(source.getDataRichiesta());
		destination.setIdArchivio(source.getIdArchivio());
		destination.setIdLotto(source.getIdLotto());
		destination.setNmCognomeForn(source.getCognomeForn());
		destination.setNmDenominazioneForn(source.getDenominazioneForn());
		destination.setNmNomeForn(source.getNomeForn());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		
		if (source.getReport() != null){
			String base64String = Base64.getEncoder().encodeToString(source.getReport());
			logger.info("Tentativo chiamata documentale per salvataggio documento Report tabella FeReportSsaInviiSdiMapper con id: " + source.getIdReportSsaInviiSdi());
			OutputDocumentale doc = docService.uploadDocumento(base64String, "ReportSSAInviiSdi");
			destination.setIdReport(doc.getId());
		}
		
		if(source.getVersioneLotto() != null)
			destination.setPgVersioneLotto(BigDecimal.valueOf(source.getVersioneLotto()));
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		destination.setIdEsitoInvio(source.getEsitoInvio());
		destination.setIdDizStatoRichiesta(source.getStatoRichiesta());
		
		return destination;
	}

}
