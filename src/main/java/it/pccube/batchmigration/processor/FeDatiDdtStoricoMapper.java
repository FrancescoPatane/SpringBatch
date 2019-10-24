package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTDatiDdtStor;
import it.pccube.batchmigration.source.model.FeDatiDdtStorico;

public class FeDatiDdtStoricoMapper implements ItemProcessor<FeDatiDdtStorico, FatTDatiDdtStor>{

	@Override
	public FatTDatiDdtStor process(FeDatiDdtStorico source) throws Exception {
		FatTDatiDdtStor destination = new FatTDatiDdtStor();
		
		destination.setIdDatiDdt(source.getIdDatiDdt());
		destination.setCdNumeroDdt(source.getNumeroDdt());
		destination.setDtDataDdt(source.getDataDdt());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setIdFattura(source.getIdFattura());
		destination.setIdFatturaStor(source.getIdFatturaStorico());
		destination.setIdDatiDdtStor(source.getIdDatiDdtStorico());
		
		return destination;
	}

}
