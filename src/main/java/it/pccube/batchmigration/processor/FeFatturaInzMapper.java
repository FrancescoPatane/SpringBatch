package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatAFatturaInz;
import it.pccube.batchmigration.source.model.FeFatturaInz;

public class FeFatturaInzMapper implements ItemProcessor<FeFatturaInz, FatAFatturaInz>{

	@Override
	public FatAFatturaInz process(FeFatturaInz source) throws Exception {
		FatAFatturaInz destination = new FatAFatturaInz();
		
		destination.setIdDizTipoIniziativa(source.getTipoIniziativa());
		destination.setIdFattura(source.getIdFattura());
		destination.setIdIdt(source.getIdt());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		
		return destination;
	}

}
