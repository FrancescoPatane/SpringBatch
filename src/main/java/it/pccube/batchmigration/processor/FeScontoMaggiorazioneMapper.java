package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTScontoMaggiorazione;
import it.pccube.batchmigration.source.model.FeScontoMaggiorazione;

public class FeScontoMaggiorazioneMapper implements ItemProcessor<FeScontoMaggiorazione, FatTScontoMaggiorazione>{

	@Override
	public FatTScontoMaggiorazione process(FeScontoMaggiorazione source) throws Exception {
		FatTScontoMaggiorazione destination = new FatTScontoMaggiorazione();
		
		destination.setIdScontoMaggiorazione(source.getIdScontoMaggiorazione());
		destination.setImImporto(source.getImporto());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setPcPercentuale(source.getPercentuale());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		destination.setIdDizTipoScontoMagg(source.getTipo());
		destination.setIdDettaglioLinea(source.getIdDettaglioLinea());
		destination.setIdFattura(source.getIdFattura());
		
		return destination;
	}

}
