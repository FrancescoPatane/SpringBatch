package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTCausaleFatturaStor;
import it.pccube.batchmigration.source.model.FeCausaleFatturaStorico;

public class FeCausaleFatturaStoricoMapper implements ItemProcessor<FeCausaleFatturaStorico, FatTCausaleFatturaStor>{


	@Override
	public FatTCausaleFatturaStor process(FeCausaleFatturaStorico source) throws Exception {
		FatTCausaleFatturaStor destination = new FatTCausaleFatturaStor();
		destination.setDsCausale(source.getCausale());
		destination.setIdCausaleFattura(source.getIdCausaleFattura());
		destination.setIdFattura(source.getIdFattura());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		destination.setIdCausaleFatturaStor(source.getIdCausaleFatturaStorico());
		destination.setIdFatturaStor(source.getIdFatturaStorico());
		return destination;
	}
}
