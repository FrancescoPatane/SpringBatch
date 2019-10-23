package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTArticoloStor;
import it.pccube.batchmigration.source.model.FeArticoloStorico;

public class FeArticoloStoricoMapper implements ItemProcessor<FeArticoloStorico, FatTArticoloStor>{

	@Override
	public FatTArticoloStor process(FeArticoloStorico source) throws Exception {
		FatTArticoloStor destination = new FatTArticoloStor();
		destination.setCdCodiceTipo(source.getCodiceTipo());
		destination.setCdCodiceValore(source.getCodiceValore());
		destination.setIdArticolo(source.getIdArticolo());
		destination.setIdDettaglioLinea(source.getIdDettaglioLinea());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		destination.setIdArticoloStor(source.getIdArticoloStorico());
		destination.setIdDettaglioLineaStor(source.getIdDettaglioLineaStorico());
		return destination;
	}

}
