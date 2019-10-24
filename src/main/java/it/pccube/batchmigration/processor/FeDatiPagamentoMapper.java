package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTDatiPagamento;
import it.pccube.batchmigration.source.model.FeDatiPagamento;

public class FeDatiPagamentoMapper implements ItemProcessor<FeDatiPagamento, FatTDatiPagamento>{

	@Override
	public FatTDatiPagamento process(FeDatiPagamento source) throws Exception {
		FatTDatiPagamento destination = new FatTDatiPagamento();
		destination.setIdDatiPagamento(source.getIdDatiPagamento());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		destination.setIdFattura(source.getIdFattura());
		destination.setIdDizCondizioniPagam(source.getCondizioniPagamento());
		return destination;
	}

}
