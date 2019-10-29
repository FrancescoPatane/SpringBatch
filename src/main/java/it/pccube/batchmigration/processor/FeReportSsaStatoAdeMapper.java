package it.pccube.batchmigration.processor;

import java.util.Base64;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

import it.pccube.batchmigration.client.doc.DocumentaleService;
import it.pccube.batchmigration.client.doc.OutputDocumentale;
import it.pccube.batchmigration.destination.model.FatTReportSsaStatoAde;
import it.pccube.batchmigration.source.model.FeReportSsaStatoAde;

public class FeReportSsaStatoAdeMapper implements ItemProcessor<FeReportSsaStatoAde, FatTReportSsaStatoAde>{

	public static final Logger logger = LoggerFactory.getLogger(FeReportSsaInviiSdiMapper.class);


	@Autowired
	private DocumentaleService docService;


	@Override
	public FatTReportSsaStatoAde process(FeReportSsaStatoAde source) throws Exception {
		FatTReportSsaStatoAde destination = new FatTReportSsaStatoAde();
		
		destination.setIdReportSsaStatoAde(source.getIdReportSsaStatoAde());

		destination.setCdPartitaIvaForn(source.getPartitaIvaForn());

		destination.setDtDataAdesioneA(source.getDataAdesioneA());

		destination.setDtDataAdesioneDa(source.getDataAdesioneDa());

		destination.setDtDataModificaAdesioneA(source.getDataModificaAdesioneA());

		destination.setDtDataModificaAdesioneDa(source.getDataModificaAdesioneDa());

		destination.setDtDataRichiesta(source.getDataRichiesta());

		destination.setNmCognomeForn(source.getCognomeForn());

		destination.setNmDenominazioneForn(source.getDenominazioneForn());

		destination.setNmNomeForn(source.getNomeForn());

		destination.setNmUtenteInserimento(source.getUseridInserimento());

		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());

		if (source.getReport() != null){
			String base64String = Base64.getEncoder().encodeToString(source.getReport());
			logger.info("Tentativo chiamata documentale per salvataggio documento Report tabella FeReportSsaStatoAde con id: " + source.getIdReportSsaStatoAde());
			OutputDocumentale doc = docService.uploadDocumento(base64String, "ReportSsaStatoAde");
			destination.setIdReport(doc.getId());
		}
		destination.setTsInserimento(source.getTmstInserimento());

		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());

		destination.setIdDizStatoAdesione(source.getStatoAdesione());

		destination.setIdDizStatoRichiesta(source.getStatoRichiesta());
		
		return destination;
	}
	
	
	

}
