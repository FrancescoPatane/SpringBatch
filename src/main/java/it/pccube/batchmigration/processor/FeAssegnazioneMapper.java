package it.pccube.batchmigration.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

import it.pccube.batchmigration.client.AutorizzazioneService;
import it.pccube.batchmigration.destination.model.FatTAssegnazione;
import it.pccube.batchmigration.source.model.FeAssegnazione;

public class FeAssegnazioneMapper implements ItemProcessor<FeAssegnazione, FatTAssegnazione>{

	public static final Logger logger = LoggerFactory.getLogger(FeAssegnazioneMapper.class);


	@Autowired
	private AutorizzazioneService autorizzazioneService;

	@Override
	public FatTAssegnazione process(FeAssegnazione source) throws Exception {
		FatTAssegnazione destination = new FatTAssegnazione();

		destination.setDsMotivoAssegnazione(source.getMotivoAssegnazione());
		destination.setDtDataAssegnazione(source.getDataAssegnazione());
		destination.setIdAssegnazione(source.getIdAssegnazione());
		destination.setIdDizTipoAssegnazione(source.getTipoAssegnazione());
		destination.setIdLotto(source.getIdLotto());

		if (source.getIdUtenteAziendaDest() != null) {
			logger.info("Tentativo chiamata autorizzazione per recupero di sedia da IdUtenteAziendaDest " + source.getIdUtenteAziendaDest() + "dell'entity FeAssegnazione con id: " + source.getIdAssegnazione());
			String idSedia = this.autorizzazioneService.getIdSediaFromIdUtenteAzienda(source.getIdUtenteAziendaDest().toString());
			destination.setIdSediaDest(Long.valueOf(idSedia));
		}

		if (source.getIdUtenteAziendaMittente() != null) {
			logger.info("Tentativo chiamata autorizzazione per recupero di sedia da IdUtenteAziendaMittente " + source.getIdUtenteAziendaMittente() + "dell'entity FeAssegnazione con id: " + source.getIdAssegnazione());
			String idSedia = this.autorizzazioneService.getIdSediaFromIdUtenteAzienda(source.getIdUtenteAziendaMittente().toString());
			destination.setIdSediaMittente(Long.valueOf(idSedia));
		}
		
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setPgVersioneLotto(source.getVersioneLotto());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());

		return destination;
	}

}
