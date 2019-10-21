package it.pccube.batchmigration.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTCausaleFattura;
import it.pccube.batchmigration.source.model.FeCausaleFattura;

public class FeCausaleFatturaMapper implements ItemProcessor<FeCausaleFattura, FatTCausaleFattura >{

	private static final Logger logger = LoggerFactory.getLogger(FeCausaleFatturaMapper.class);

	@Override
	public FatTCausaleFattura process(FeCausaleFattura source) throws Exception {
		logger.info("Mapping FeCausaleFattura with PK: " + source.getIdCausaleFattura());
		FatTCausaleFattura destination = new FatTCausaleFattura();
		destination.setDsCausale(source.getCausale());
		destination.setIdCausaleFattura(source.getIdCausaleFattura());
		destination.setIdFattura(source.getIdFattura());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		return destination;
	}

}
