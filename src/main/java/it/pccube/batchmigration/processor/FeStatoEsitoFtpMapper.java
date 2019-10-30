package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatAStatoEsitoFtp;
import it.pccube.batchmigration.source.model.FeStatoEsitoFtp;

public class FeStatoEsitoFtpMapper implements ItemProcessor<FeStatoEsitoFtp, FatAStatoEsitoFtp>{

	@Override
	public FatAStatoEsitoFtp process(FeStatoEsitoFtp source) throws Exception {
		FatAStatoEsitoFtp destination = new FatAStatoEsitoFtp();
		
		destination.setDtDataFine(source.getDataFine());
		destination.setDtDataInizio(source.getDataInizio());
		destination.setFlAttuale(source.getFlagAttuale());
		destination.setFlErroreControlliFile(source.getFlagErroreControlliFile());
		destination.setIdDizStatoEsitoFtp(source.getStato());
		destination.setIdEsitoFtp(source.getIdEsitoFtp());
		destination.setIdStatoEsitoFtp(source.getIdStatoEsitoFtp());
		destination.setIdStatoEsitoFtpPrec(source.getIdStatoEsitoFtpPrec());
		destination.setNmLogErroreControlliFile(source.getLogErroreControlliFile());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		return destination;
	}
	
	

}
