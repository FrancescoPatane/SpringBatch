package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTScontoMagStor;
import it.pccube.batchmigration.source.model.FeScontoMagStorico;

public class FeScontoMagStoricoMapper implements ItemProcessor<FeScontoMagStorico, FatTScontoMagStor>{

	@Override
	public FatTScontoMagStor process(FeScontoMagStorico source) throws Exception {
		FatTScontoMagStor destination = new FatTScontoMagStor();
		
		destination.setIdScontoMagStor(source.getIdScontoMaggiorazione());
		destination.setIdDettaglioLinea(source.getIdDettaglioLinea());
		destination.setIdFattura(source.getIdFattura());
		destination.setIdScontoMaggiorazione(source.getIdScontoMaggiorazione());
		destination.setImImporto(source.getImporto());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setPcPercentuale(source.getPercentuale());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		destination.setIdDizTipoScontoMagg(source.getTipo());
		destination.setIdDettaglioLineaStor(source.getIdDettaglioLineaStorico());
		destination.setIdFatturaStor(source.getIdFatturaStorico());
		
		return destination;
	}

}
