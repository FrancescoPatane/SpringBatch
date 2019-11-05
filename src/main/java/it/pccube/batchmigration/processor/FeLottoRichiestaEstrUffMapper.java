package it.pccube.batchmigration.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

import it.pccube.batchmigration.client.AutorizzazioneService;
import it.pccube.batchmigration.destination.model.FatTLottoRicEstrUff;
import it.pccube.batchmigration.source.model.FeLottoRichiestaEstrUff;

public class FeLottoRichiestaEstrUffMapper implements ItemProcessor<FeLottoRichiestaEstrUff, FatTLottoRicEstrUff>{

	public static final Logger logger = LoggerFactory.getLogger(FeLottoRichiestaEstrUffMapper.class);

	@Autowired
	private AutorizzazioneService autorizzazioneService;
	
	@Override
	public FatTLottoRicEstrUff process(FeLottoRichiestaEstrUff source) throws Exception {
		FatTLottoRicEstrUff destination = new FatTLottoRicEstrUff();
		
		if(source.getStato() != null)
			destination.setCdStato(source.getStato().toString());
		destination.setIdLotto(source.getIdLotto());
		destination.setIdLottoRichiestaEstrUff(source.getIdLottoRichiestaEstrUff());
		destination.setIdRicEstrazioneUfficiale(source.getIdRicEstrazioneUfficiale());
		
		if (source.getIdUtenteAziendaRic() != null) {
			logger.info("Tentativo chiamata autorizzazione per recupero di sedia da IdUtenteAziendaRic " + source.getIdUtenteAziendaRic() + "dell'entity FeLotto con id: " + source.getIdLottoRichiestaEstrUff());
			String idSedia = this.autorizzazioneService.getIdSediaFromIdUtenteAzienda(source.getIdUtenteAziendaRic().toString());
			destination.setIdSediaRic(Long.valueOf(idSedia));
		}
		
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setPgVersioneLotto(source.getVersioneLotto());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		
		return destination;
	}

}
