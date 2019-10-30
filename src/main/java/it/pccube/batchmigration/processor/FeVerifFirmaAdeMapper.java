package it.pccube.batchmigration.processor;

import java.util.Base64;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

import it.pccube.batchmigration.client.doc.DocumentaleService;
import it.pccube.batchmigration.client.doc.OutputDocumentale;
import it.pccube.batchmigration.destination.model.FatTVerifFirmaAde;
import it.pccube.batchmigration.source.model.FeVerifFirmaAde;

public class FeVerifFirmaAdeMapper implements ItemProcessor<FeVerifFirmaAde, FatTVerifFirmaAde>{
	
public static final Logger logger = LoggerFactory.getLogger(FeVerifFirmaAdeMapper.class);

	
	@Autowired
	private DocumentaleService docService;


	@Override
	public FatTVerifFirmaAde process(FeVerifFirmaAde source) throws Exception {
		FatTVerifFirmaAde destination = new FatTVerifFirmaAde();
		
		destination.setIdVerifFirmaAde(source.getIdVerifFirmaAde());
		destination.setDtDataVerifica(source.getDataVerifica());
		destination.setFlCheckHashDocumento(source.getCheckHashDocumento());
		
		if (source.getPdfEsito() != null){
			logger.info("Tentativo chiamata documentale per salvataggion documento PdfEsito tabella FeSupportoFtp con id: " + source.getIdVerifFirmaAde());
			String base64String = Base64.getEncoder().encodeToString(source.getPdfEsito());
			OutputDocumentale doc = docService.uploadDocumento(base64String, "Pdf_Esito_Verifica_Firma_Ade");
			destination.setIdPdfEsito(doc.getId());
		}
		
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		destination.setIdDizRispostaCodFiscale(source.getIdDizRispostaCodFiscale());
		destination.setIdDizRispostaWsFirma(source.getIdDizRispostaWsFirma());
		destination.setIdAdesione(source.getIdAdesione());
		
		return destination;
	}
	
	
	
	

}
