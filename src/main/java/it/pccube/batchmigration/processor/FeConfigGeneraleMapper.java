package it.pccube.batchmigration.processor;

import java.util.Base64;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

import it.pccube.batchmigration.client.doc.DocumentaleService;
import it.pccube.batchmigration.client.doc.OutputDocumentale;
import it.pccube.batchmigration.costant.Constants;
import it.pccube.batchmigration.destination.model.FatTGeneraleCfg;
import it.pccube.batchmigration.source.model.FeConfigGenerale;

public class FeConfigGeneraleMapper implements ItemProcessor<FeConfigGenerale, FatTGeneraleCfg>{

public static final Logger logger = LoggerFactory.getLogger(FeConfigGeneraleMapper.class);

	
	@Autowired
	private DocumentaleService docService;


	@Override
	public FatTGeneraleCfg process(FeConfigGenerale source) throws Exception {
		FatTGeneraleCfg destination = new FatTGeneraleCfg();
		
		destination.setCdCodice(source.getCodice());
		destination.setDsDescrizione(source.getDescrizione());
		destination.setDsValore(source.getValore());
		destination.setIdConfigGenerale(source.getIdConfigGenerale());
		if(source.getValoreBlob()!=null) {
			String base64String = Base64.getEncoder().encodeToString(source.getValoreBlob());
			logger.info("Tentativo chiamata documentale per salvataggio documento valoreBlog tabella FatTGeneraleCfg con id: " + source.getIdConfigGenerale());
			OutputDocumentale doc = docService.uploadDocumento(base64String, source.getValore());
			destination.setIdValoreBlob(doc.getId());
		}
		destination.setNmUtenteInserimento(Constants.BATCH_USER);
		destination.setNmUtenteUltimaModifica(Constants.BATCH_USER);
		destination.setTsInserimento(new Date());
		destination.setTsUltimaModifica(new Date());
		
		
		return destination;
	}
}
