package it.pccube.batchmigration.processor;

import java.math.BigDecimal;
import java.util.Base64;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

import it.pccube.batchmigration.client.doc.DocumentaleService;
import it.pccube.batchmigration.client.doc.OutputDocumentale;
import it.pccube.batchmigration.destination.model.FatTVerifFirmaLotto;
import it.pccube.batchmigration.source.model.FeVerifFirmaLotto;

public class FeVerifFirmaLottoMapper implements ItemProcessor<FeVerifFirmaLotto, FatTVerifFirmaLotto>{
	
public static final Logger logger = LoggerFactory.getLogger(FeVerifFirmaLottoMapper.class);

	
	@Autowired
	private DocumentaleService docService;

	@Override
	public FatTVerifFirmaLotto process(FeVerifFirmaLotto source) throws Exception {
		FatTVerifFirmaLotto destination = new FatTVerifFirmaLotto();
		
		destination.setDtDataVerifica(source.getDataVerifica());
		if(source.getCheckHashDocumento() != null)
			destination.setFlCheckHashDocumento(BigDecimal.valueOf(source.getCheckHashDocumento()));
		destination.setIdDizRispostaCodFiscale(source.getIdDizRispostaCodFiscale());
		destination.setIdDizRispostaWsFirma(source.getIdDizRispostaWsFirma());
		destination.setIdLotto(source.getIdLotto());
		
		if (source.getPdfEsito() != null){
			String base64String = Base64.getEncoder().encodeToString(source.getPdfEsito());
			logger.info("Tentativo chiamata documentale per salvataggion documento PdfEsito tabella FeVerifFirmaLotto con id: " + source.getIdVerifFirmaLotto().toString());
			OutputDocumentale doc = docService.uploadDocumento(base64String, "Pdf_Esito_Verifica_Firma_Lotto");
			destination.setIdPdfEsito(doc.getId());
		}
		
		destination.setIdVerifFirmaLotto(source.getIdVerifFirmaLotto());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		if(source.getVersioneLotto() != null)
			destination.setPgVersioneLotto(BigDecimal.valueOf(source.getVersioneLotto()));
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		
		return destination;
	}

}
