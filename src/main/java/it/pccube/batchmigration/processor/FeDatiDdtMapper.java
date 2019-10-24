package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTDatiDdt;
import it.pccube.batchmigration.source.model.FeDatiDdt;

public class FeDatiDdtMapper implements ItemProcessor<FeDatiDdt, FatTDatiDdt>{

	@Override
	public FatTDatiDdt process(FeDatiDdt source) throws Exception {
		FatTDatiDdt destination = new FatTDatiDdt();
		destination.setIdDatiDdt(source.getIdDatiDdt());
		destination.setCdNumeroDdt(source.getNumeroDdt());
		destination.setDtDataDdt(source.getDataDdt());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setIdFattura(source.getIdFattura());
		return destination;
	}

}
