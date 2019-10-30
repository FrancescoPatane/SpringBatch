package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatAStatoSupportoFtp;
import it.pccube.batchmigration.source.model.FeStatoSupportoFtp;

public class FeStatoSupportoFtpMapper implements ItemProcessor<FeStatoSupportoFtp, FatAStatoSupportoFtp>{

	@Override
	public FatAStatoSupportoFtp process(FeStatoSupportoFtp source) throws Exception {
		FatAStatoSupportoFtp destination = new FatAStatoSupportoFtp();
		
		destination.setDtDataFine(source.getDataFine());
		destination.setDtDataInizio(source.getDataInizio());
		destination.setFlAttuale(source.getFlagAttuale());
		destination.setFlErroreControlliFile(source.getFlagErroreControlliFile());
		destination.setIdDizStatoSupportoFtp(source.getStato());
		destination.setIdStatoSupportoFtp(source.getIdStatoSupportoFtp());
		destination.setIdStatoSupportoFtpPrec(source.getIdStatoSupportoFtpPrec());
		destination.setIdSupportoFtp(source.getIdSupportoFtp());
		destination.setNmLogErroreControlliFile(source.getLogErroreControlliFile());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		
		
		return destination;
	}

}
