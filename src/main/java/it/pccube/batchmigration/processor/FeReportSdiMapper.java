package it.pccube.batchmigration.processor;

import java.util.Base64;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

import it.pccube.batchmigration.client.doc.DocumentaleService;
import it.pccube.batchmigration.client.doc.OutputDocumentale;
import it.pccube.batchmigration.destination.model.FatTReportSdi;
import it.pccube.batchmigration.source.model.FeReportSdi;

public class FeReportSdiMapper implements ItemProcessor<FeReportSdi, FatTReportSdi>{

	public static final Logger logger = LoggerFactory.getLogger(FeReportSdiMapper.class);


	@Autowired
	private DocumentaleService docService;


	@Override
	public FatTReportSdi process(FeReportSdi source) throws Exception {
		FatTReportSdi destination = new FatTReportSdi();
		
		destination.setCdCfPivaUtente(source.getCfPivaUtente());
		destination.setCdTipo(source.getTipo());
		destination.setDtDataOraPrelievo(source.getDataOraPrelievo());
		
		
		if (source.getFileReport() != null){
			String base64String = Base64.getEncoder().encodeToString(source.getFileReport());
			logger.info("Tentativo chiamata documentale per salvataggion documento FileReport tabella FeReportSdi con id: " + source.getIdReport());
			OutputDocumentale doc = docService.uploadDocumento(base64String, source.getNomeFile());
			destination.setIdFileReport(doc.getId());
		}
		
		destination.setIdReport(source.getIdReport());
		destination.setNmIdentificativoNodo(source.getIdentificativoNodo());
		destination.setNmNomeFile(source.getNomeFile());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		
		return destination;
	}
	
	

}
