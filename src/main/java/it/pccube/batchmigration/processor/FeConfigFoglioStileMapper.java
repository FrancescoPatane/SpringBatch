package it.pccube.batchmigration.processor;

import java.util.Base64;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

import it.pccube.batchmigration.client.doc.DocumentaleService;
import it.pccube.batchmigration.client.doc.OutputDocumentale;
import it.pccube.batchmigration.destination.model.FatTFoglioStileCfg;
import it.pccube.batchmigration.source.model.FeConfigFoglioStile;

public class FeConfigFoglioStileMapper implements ItemProcessor<FeConfigFoglioStile, FatTFoglioStileCfg>{

public static final Logger logger = LoggerFactory.getLogger(FeConfigFoglioStileMapper.class);

	
	@Autowired
	private DocumentaleService docService;

	
	@Override
	public FatTFoglioStileCfg process(FeConfigFoglioStile source) throws Exception {
		FatTFoglioStileCfg destination = new FatTFoglioStileCfg();
		destination.setCdVersioneFoglioStile(source.getVersioneFoglioStile());
		destination.setIdFoglioStile(source.getIdFoglioStile());
		destination.setNmNomeFoglioStile(source.getNomeFoglioStile());
		if(source.getFoglioStile()!=null) {
			String base64String = Base64.getEncoder().encodeToString(source.getFoglioStile());
			logger.info("Tentativo chiamata documentale per salvataggion documento foglioStile tabella FeConfigFoglioStile con id: " + source.getIdFoglioStile());
			OutputDocumentale doc = docService.uploadDocumento(base64String, source.getNomeFoglioStile());
			destination.setIdOjFoglioStile(doc.getId());
		}
		return destination;
	}

}
