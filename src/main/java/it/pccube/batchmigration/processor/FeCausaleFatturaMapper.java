package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTCausaleFattura;
import it.pccube.batchmigration.source.model.FeCausaleFattura;

public class FeCausaleFatturaMapper implements ItemProcessor<FeCausaleFattura, FatTCausaleFattura >{


	@Override
	public FatTCausaleFattura process(FeCausaleFattura source) throws Exception {
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
