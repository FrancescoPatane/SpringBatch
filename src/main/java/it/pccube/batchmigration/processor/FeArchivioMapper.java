package it.pccube.batchmigration.processor;

import java.util.Base64;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

import it.pccube.batchmigration.client.doc.DocumentaleService;
import it.pccube.batchmigration.client.doc.OutputDocumentale;
import it.pccube.batchmigration.destination.model.FatTArchivio;
import it.pccube.batchmigration.source.model.FeArchivio;

public class FeArchivioMapper implements ItemProcessor<FeArchivio, FatTArchivio>{

	public static final Logger logger = LoggerFactory.getLogger(FeArchivioMapper.class);


	@Autowired
	private DocumentaleService docService;


	@Override
	public FatTArchivio process(FeArchivio source) throws Exception {
		FatTArchivio destination = new FatTArchivio();
		if(source.getIdentificativoSdiArchivio()!=null)
			destination.setCdIdentificativoSdiArchivio(source.getIdentificativoSdiArchivio().toString());
		destination.setDtDataOraCreazione(source.getDataOraCreazione());
		destination.setDtDataOraInvioSdi(source.getDataOraInvioSdi());
		destination.setDtDataOraRicezione(source.getDataOraRicezione());
		destination.setIdArchivio(source.getIdArchivio());
		destination.setIdDizStatoArchivio(source.getStato());
		destination.setIdEsitoInvio(source.getEsitoInvio());
		if (source.getFileArchivio() != null){
			String base64String = Base64.getEncoder().encodeToString(source.getFileArchivio());
			logger.info("Tentativo chiamata documentale per salvataggion documento fileArchivio tabella FatTArchivio con id: " + source.getIdArchivio());
			OutputDocumentale doc = docService.uploadDocumento(base64String, source.getNomeFile());
			destination.setIdFileArchivio(doc.getId());
		}
		//TODO		destination.setIdSediaCreatore(idSediaCreatore);
		destination.setNmNomeFile(source.getNomeFile());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		return destination;
	}




}
