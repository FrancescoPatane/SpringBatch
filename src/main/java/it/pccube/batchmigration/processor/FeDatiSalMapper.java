package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTDatiSal;
import it.pccube.batchmigration.source.model.FeDatiSal;

public class FeDatiSalMapper implements ItemProcessor<FeDatiSal, FatTDatiSal>{

	@Override
	public FatTDatiSal process(FeDatiSal source) throws Exception {
		FatTDatiSal destination = new FatTDatiSal();
		if(source.getRiferimentoFase()!=null)
			destination.setCdRiferimentoFase(source.getRiferimentoFase().toString());
		destination.setIdDatiSal(source.getIdDatiSal());
		destination.setIdFattura(source.getIdFattura());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		
		return destination;
	}
	
	

}
