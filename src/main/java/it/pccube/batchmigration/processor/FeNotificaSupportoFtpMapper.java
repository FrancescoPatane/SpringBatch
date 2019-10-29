package it.pccube.batchmigration.processor;

import java.util.Base64;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

import it.pccube.batchmigration.client.doc.DocumentaleService;
import it.pccube.batchmigration.client.doc.OutputDocumentale;
import it.pccube.batchmigration.destination.model.FatANotificaSupportoFtp;
import it.pccube.batchmigration.source.model.FeNotificaSupportoFtp;

public class FeNotificaSupportoFtpMapper implements ItemProcessor<FeNotificaSupportoFtp, FatANotificaSupportoFtp>{
	
	public static final Logger logger = LoggerFactory.getLogger(FeNotificaSupportoFtpMapper.class);


	@Autowired
	private DocumentaleService docService;

	@Override
	public FatANotificaSupportoFtp process(FeNotificaSupportoFtp source) throws Exception {
		FatANotificaSupportoFtp destination = new FatANotificaSupportoFtp();
		
		destination.setIdNotificaSupportoFtp(source.getIdNotificaSupportoFtp());
		destination.setFlLavorato(source.getFlagLavorato());
		destination.setNmNomeFileNotifica(source.getNomeFileNotifica());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		destination.setIdNotifica(source.getIdNotifica());
		destination.setIdSupportoFtp(source.getIdSupportoFtp());
		destination.setIdDizTipoNotifica(source.getTipoNotifica());
		
		if (source.getFileNotifica() != null){
			String base64String = Base64.getEncoder().encodeToString(source.getFileNotifica());
			logger.info("Tentativo chiamata documentale per salvataggio documento FileNotifica tabella FatANotificaSupportoFtp con id: " + source.getIdNotificaSupportoFtp());
			OutputDocumentale doc = docService.uploadDocumento(base64String, source.getNomeFileNotifica());
			destination.setIdFileNotifica(doc.getId());
		}
		
		return destination;
	}
	
	

}
