package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatARifLineaStor;
import it.pccube.batchmigration.source.model.FeRiferimentoLineaStorico;

public class FeRiferimentoLineaStoricoMapper implements ItemProcessor<FeRiferimentoLineaStorico, FatARifLineaStor>{

	@Override
	public FatARifLineaStor process(FeRiferimentoLineaStorico source) throws Exception {
		
		FatARifLineaStor destination = new FatARifLineaStor();
		
		destination.setIdDatiDdt(source.getIdDatiDdt());
		destination.setIdDatiRiferimento(source.getIdDatiRiferimento());
		destination.setIdDettaglioLinea(source.getIdDettaglioLinea());
		destination.setIdRiferimentoLinea(source.getIdRiferimentoLinea());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		destination.setIdDatiDdtStor(source.getIdDatiDdtStorico());
		destination.setIdDatiRiferimentoStor(source.getIdDatiRiferimentoStorico());
		destination.setIdDettaglioLineaStor(source.getIdDettaglioLineaStorico());
		destination.setIdRiferimentoLineaStor(source.getIdRiferimentoLineaStorico());
		
		return destination;
	}

}
