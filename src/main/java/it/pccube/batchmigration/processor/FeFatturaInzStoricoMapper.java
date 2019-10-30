package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatAFatturaInzStor;
import it.pccube.batchmigration.source.model.FeFatturaInzStorico;

public class FeFatturaInzStoricoMapper implements ItemProcessor<FeFatturaInzStorico, FatAFatturaInzStor>{

	@Override
	public FatAFatturaInzStor process(FeFatturaInzStorico source) throws Exception {
		FatAFatturaInzStor destination = new FatAFatturaInzStor();
		
		destination.setIdDizTipoIniziativa(source.getTipoIniziativa());
		destination.setIdFattura(source.getIdFattura());
		destination.setIdFatturaStor(source.getIdFatturaStorico());
		destination.setIdIdt(source.getIdt());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		
		return destination;
	}
	
	

}
