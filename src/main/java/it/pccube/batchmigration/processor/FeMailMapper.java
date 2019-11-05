package it.pccube.batchmigration.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

import it.pccube.batchmigration.client.AutorizzazioneService;
import it.pccube.batchmigration.destination.model.FatTMail;
import it.pccube.batchmigration.source.model.FeMail;

public class FeMailMapper implements ItemProcessor<FeMail, FatTMail>{
	
	
	public static final Logger logger = LoggerFactory.getLogger(FeMailMapper.class);

	@Autowired
	private AutorizzazioneService autorizzazioneService;
	

	@Override
	public FatTMail process(FeMail source) throws Exception {
		FatTMail destination = new FatTMail();
		
		destination.setIdMail(source.getIdMail());

		destination.setDtDataDecadenza(source.getDataDecadenza());

		destination.setDtDataOraInvio(source.getDataOraInvio());

		destination.setDtDataSospensione(source.getDataSospensione());
		
		if (source.getIdUtenteAziendaDest() != null) {
			logger.info("Tentativo chiamata autorizzazione per recupero di sedia da IdUtenteAziendaDest " + source.getIdUtenteAziendaDest() + "dell'entity FeMail con id: " + source.getIdMail());
			String idSedia = this.autorizzazioneService.getIdSediaFromIdUtenteAzienda(source.getIdUtenteAziendaDest().toString());
			destination.setIdSediaDest(Long.valueOf(idSedia));
		}

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
