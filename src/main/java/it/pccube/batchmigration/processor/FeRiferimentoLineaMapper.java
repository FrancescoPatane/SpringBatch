package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatARiferimentoLinea;
import it.pccube.batchmigration.source.model.FeRiferimentoLinea;

public class FeRiferimentoLineaMapper implements ItemProcessor<FeRiferimentoLinea, FatARiferimentoLinea>{

	@Override
	public FatARiferimentoLinea process(FeRiferimentoLinea source) throws Exception {
		FatARiferimentoLinea destination = new FatARiferimentoLinea();
		
		destination.setIdDatiDdt(source.getIdDatiDdt());
		destination.setIdDatiRiferimento(source.getIdDatiRiferimento());
		destination.setIdDettaglioLinea(source.getIdDettaglioLinea());
		destination.setIdRiferimentoLinea(source.getIdRiferimentoLinea());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		
		return destination;
	}


}
