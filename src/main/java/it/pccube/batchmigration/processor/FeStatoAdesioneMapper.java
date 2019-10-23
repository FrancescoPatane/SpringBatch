package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatAStatoAdesione;
import it.pccube.batchmigration.source.model.FeStatoAdesione;

public class FeStatoAdesioneMapper implements ItemProcessor<FeStatoAdesione, FatAStatoAdesione>{

	@Override
	public FatAStatoAdesione process(FeStatoAdesione source) throws Exception {
		FatAStatoAdesione destination = new FatAStatoAdesione();
		destination.setDtDataFine(source.getDataFine());
		destination.setDtDataInizio(source.getDataInizio());
		destination.setFlAttuale(source.getFlagAttuale());
		destination.setIdAdesione(source.getIdAdesione());
		destination.setIdDizStatoAdesione(source.getIdStato());
		destination.setIdStatoAdesione(source.getIdStatoAdesione());
		destination.setIdStatoAdesionePrec(source.getIdStatoAdesionePrec());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		return destination;
	}

}
