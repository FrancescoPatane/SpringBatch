package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTErroreNotifica;
import it.pccube.batchmigration.source.model.FeErroreNotifica;

public class FeErroreNotificaMapper implements ItemProcessor<FeErroreNotifica, FatTErroreNotifica>{

	@Override
	public FatTErroreNotifica process(FeErroreNotifica source) throws Exception {
		FatTErroreNotifica destination = new FatTErroreNotifica();
		destination.setCdCodice(source.getCodice());
		destination.setDsDescrizione(source.getDescrizione());
		destination.setIdErroreNotifica(source.getIdErroreNotifica());
		destination.setIdNotifica(source.getIdNotifica());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		
		return destination;
	}

}
