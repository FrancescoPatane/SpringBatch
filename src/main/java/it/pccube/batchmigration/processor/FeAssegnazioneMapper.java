package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTAssegnazione;
import it.pccube.batchmigration.source.model.FeAssegnazione;

public class FeAssegnazioneMapper implements ItemProcessor<FeAssegnazione, FatTAssegnazione>{

	@Override
	public FatTAssegnazione process(FeAssegnazione source) throws Exception {
		FatTAssegnazione destination = new FatTAssegnazione();
		
		destination.setDsMotivoAssegnazione(source.getMotivoAssegnazione());
		destination.setDtDataAssegnazione(source.getDataAssegnazione());
		destination.setIdAssegnazione(source.getIdAssegnazione());
		destination.setIdDizTipoAssegnazione(source.getTipoAssegnazione());
		destination.setIdLotto(source.getIdLotto());
//		TODO id sedia
//		destination.setIdSediaDest(source.getid);
//		destination.setIdSediaMittente(idSediaMittente);
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setPgVersioneLotto(source.getVersioneLotto());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		
		return destination;
	}

}
