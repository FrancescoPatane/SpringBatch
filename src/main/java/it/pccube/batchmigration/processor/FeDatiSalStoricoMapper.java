package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTDatiSalStor;
import it.pccube.batchmigration.source.model.FeDatiSalStorico;

public class FeDatiSalStoricoMapper implements ItemProcessor<FeDatiSalStorico, FatTDatiSalStor>{

	@Override
	public FatTDatiSalStor process(FeDatiSalStorico source) throws Exception {
		FatTDatiSalStor destination = new FatTDatiSalStor();
		if(source.getRiferimentoFase()!=null)
			destination.setCdRiferimentoFase(source.getRiferimentoFase().toString());
		destination.setIdDatiSal(source.getIdDatiSal());
		destination.setIdFattura(source.getIdFattura());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		destination.setIdDatiSalStor(source.getIdDatiSalStorico());
		destination.setIdFatturaStor(source.getIdFatturaStorico());
		return destination;
	}

}
