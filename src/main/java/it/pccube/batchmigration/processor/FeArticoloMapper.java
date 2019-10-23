package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTArticolo;
import it.pccube.batchmigration.source.model.FeArticolo;

public class FeArticoloMapper implements ItemProcessor<FeArticolo, FatTArticolo>{

	@Override
	public FatTArticolo process(FeArticolo source) throws Exception {
		FatTArticolo destination = new FatTArticolo();
		destination.setCdCodiceTipo(source.getCodiceTipo());
		destination.setCdCodiceValore(source.getCodiceValore());
		destination.setIdArticolo(source.getIdArticolo());
		destination.setIdDettaglioLinea(source.getIdDettaglioLinea());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		return destination;
	}
	
	

}
