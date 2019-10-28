package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTLottoRicEstrUff;
import it.pccube.batchmigration.source.model.FeLottoRichiestaEstrUff;

public class FeLottoRichiestaEstrUffMapper implements ItemProcessor<FeLottoRichiestaEstrUff, FatTLottoRicEstrUff>{

	@Override
	public FatTLottoRicEstrUff process(FeLottoRichiestaEstrUff source) throws Exception {
		FatTLottoRicEstrUff destination = new FatTLottoRicEstrUff();
		
		if(source.getStato() != null)
			destination.setCdStato(source.getStato().toString());
		destination.setIdLotto(source.getIdLotto());
		destination.setIdLottoRichiestaEstrUff(source.getIdLottoRichiestaEstrUff());
		destination.setIdRicEstrazioneUfficiale(source.getIdRicEstrazioneUfficiale());
		//TODO id sedia
//		destination.setIdSediaRic(source.get);
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setPgVersioneLotto(source.getVersioneLotto());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		
		return destination;
	}

}
