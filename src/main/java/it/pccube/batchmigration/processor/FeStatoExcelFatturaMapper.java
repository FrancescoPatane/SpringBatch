package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatAStatoEsitoFtp;
import it.pccube.batchmigration.destination.model.FatAStatoExcelFattura;
import it.pccube.batchmigration.source.model.FeStatoEsitoFtp;
import it.pccube.batchmigration.source.model.FeStatoExcelFattura;

public class FeStatoExcelFatturaMapper implements ItemProcessor<FeStatoExcelFattura, FatAStatoExcelFattura>{

	@Override
	public FatAStatoExcelFattura process(FeStatoExcelFattura source) throws Exception {
		FatAStatoExcelFattura destination = new FatAStatoExcelFattura();
		
		destination.setDtDataFine(source.getDataFine());
		destination.setDtDataInizio(source.getDataInizio());
		destination.setFlAttuale(source.getFlagAttuale());
		destination.setIdDizStatoExcelFattura(source.getStato());
		destination.setIdExcelFattura(source.getIdExcelFattura());
		destination.setIdStatoExcelFattura(source.getIdStatoExcelFattura());
		destination.setiDstatoExcelFatturaPrec(source.getIdStatoExcelFatturaPrec());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		
		return destination;
	}

}
