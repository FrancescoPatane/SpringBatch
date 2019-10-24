package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTDatiPagamentoStor;
import it.pccube.batchmigration.source.model.FeDatiPagamentoStorico;

public class FeDatiPagamentoStoricoMapper implements ItemProcessor<FeDatiPagamentoStorico, FatTDatiPagamentoStor>{

	@Override
	public FatTDatiPagamentoStor process(FeDatiPagamentoStorico source) throws Exception {
		FatTDatiPagamentoStor destination = new FatTDatiPagamentoStor();
		
		destination.setIdDatiPagamento(source.getIdDatiPagamento());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		destination.setIdFattura(source.getIdFattura());
		destination.setIdDizCondizioniPagam(source.getCondizioniPagamento());
		destination.setIdFatturaStor(source.getIdFatturaStorico());
		destination.setIdDatiPagamentoStor(source.getIdDatiPagamentoStorico());
		
		return destination;
	}

}
