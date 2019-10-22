package it.pccube.batchmigration.processor;

import java.util.Base64;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

import it.pccube.batchmigration.client.doc.DocumentaleService;
import it.pccube.batchmigration.client.doc.OutputDocumentale;
import it.pccube.batchmigration.destination.model.FatTAllegato;
import it.pccube.batchmigration.destination.model.FatTCausaleFattura;
import it.pccube.batchmigration.listener.ProcessListener;
import it.pccube.batchmigration.source.model.FeAllegato;

public class FeAllegatoMapper implements ItemProcessor<FeAllegato, FatTAllegato>{
	
	public static final Logger logger = LoggerFactory.getLogger(FeAllegatoMapper.class);


	@Autowired
	private DocumentaleService docService;
	
	@Override
	public FatTAllegato process(FeAllegato source) throws Exception {
		FatTAllegato destination = new FatTAllegato();
		
		destination.setDsDescrizioneAttachment(source.getDescrizioneAttachment());
		destination.setIdAllegato(source.getIdAllegato());
//		if (source.getAttachment() != null){
//			logger.info("Tentativo chiamata documentale per salvataggion documento Attachment tabella FeAllegato con id: " + source.getIdAllegato());
//			String base64String = Base64.getEncoder().encodeToString(source.getAttachment());
//			OutputDocumentale doc = docService.uploadDocumento(base64String, source.getNomeAttachment());
//			destination.setIdAttachment(doc.getId());
//		}
		destination.setIdFattura(source.getIdFattura());
		destination.setNmAlgoritmoCompressione(source.getAlgoritmoCompressione());
		destination.setNmFormatoAttachment(source.getFormatoAttachment());
		destination.setNmNomeAttachment(source.getNomeAttachment());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		
		
		return destination;
	}

}
