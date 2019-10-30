package it.pccube.batchmigration.processor;

import java.math.BigDecimal;
import java.util.Base64;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

import it.pccube.batchmigration.client.doc.DocumentaleService;
import it.pccube.batchmigration.client.doc.OutputDocumentale;
import it.pccube.batchmigration.destination.model.FatTAllegato;
import it.pccube.batchmigration.destination.model.FatTAllegatoStor;
import it.pccube.batchmigration.source.model.FeAllegato;
import it.pccube.batchmigration.source.model.FeAllegatoStorico;

public class FeAllegatoStoricoMapper implements ItemProcessor<FeAllegatoStorico, FatTAllegatoStor>{

	public static final Logger logger = LoggerFactory.getLogger(FeAllegatoStoricoMapper.class);


	@Autowired
	private DocumentaleService docService;

	@Override
	public FatTAllegatoStor process(FeAllegatoStorico source) throws Exception {
		FatTAllegatoStor destination = new FatTAllegatoStor();
		destination.setDsDescrizioneAttachment(source.getDescrizioneAttachment());
		destination.setIdAllegato(source.getIdAllegato());
		destination.setIdAllegatoStor(source.getIdAllegatoStorico());
		if (source.getAttachment() != null){
			logger.info("Tentativo chiamata documentale per salvataggion documento Attachment tabella FeAllegatoStorico con id: " + source.getIdAllegatoStorico());
			String base64String = Base64.getEncoder().encodeToString(source.getAttachment());
			OutputDocumentale doc = docService.uploadDocumento(base64String, source.getNomeAttachment());
			destination.setIdAttachment(doc.getId());
		}
		if(source.getIdFattura()!=null)
			destination.setIdFattura(BigDecimal.valueOf(source.getIdFattura()));
		destination.setIdFatturaStor(source.getIdFatturaStorico());
		destination.setNmAlgoritmoCompressione(source.getAlgoritmoCompressione());
		destination.setNmFormatoAttachment(source.getFormatoAttachment());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmNomeAttachment(source.getNomeAttachment());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		return destination;
	}

}
