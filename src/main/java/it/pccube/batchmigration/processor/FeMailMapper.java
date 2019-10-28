package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTMail;
import it.pccube.batchmigration.source.model.FeMail;

public class FeMailMapper implements ItemProcessor<FeMail, FatTMail>{
	
	

	

	@Override
	public FatTMail process(FeMail source) throws Exception {
		FatTMail destination = new FatTMail();
		
		destination.setIdMail(source.getIdMail());

		destination.setDtDataDecadenza(source.getDataDecadenza());

		destination.setDtDataOraInvio(source.getDataOraInvio());

		destination.setDtDataSospensione(source.getDataSospensione());
//TODO id sedia
//		destination.setIdSediaDest(source.get);

		destination.setNmIndirizzoDestinatario(source.getIndirizzoDestinatario());

		destination.setNrGiorniMancantiDecadenza(source.getGiorniMancantiDecadenza());

		destination.setNrGiorniMancantiSospensione(source.getGiorniMancantiSospensione());

		destination.setNrUtenteInvio(source.getUtenteInvio());

		destination.setOjTesto(source.getTesto());
		
		destination.setPgVersioneLotto(source.getVersioneLotto());

		destination.setNmUtenteInserimento(source.getUseridInserimento());

		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());

		destination.setTsInserimento(source.getTmstInserimento());

		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());

		destination.setIdAdesione(source.getIdAdesione());

		destination.setIdFattura(source.getIdFattura());

		destination.setIdLotto(source.getIdLotto());

		destination.setIdDizTipologiaEmail(source.getTipologia());

		destination.setIdDizTipologiaUtenteInvio(source.getTipologiaUtenteInvio());

		destination.setIdMailPrincipale(source.getIdMailPrincipale());
		
		return destination;
	}

}
