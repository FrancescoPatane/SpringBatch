package it.pccube.batchmigration.processor;

import java.math.BigDecimal;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTDettaglioPagamento;
import it.pccube.batchmigration.source.model.FeDettaglioPagamento;

public class FeDettaglioPagamentoMapper implements ItemProcessor<FeDettaglioPagamento, FatTDettaglioPagamento>{

	@Override
	public FatTDettaglioPagamento process(FeDettaglioPagamento source) throws Exception {
		FatTDettaglioPagamento destination = new FatTDettaglioPagamento();
		
		destination.setIdDettaglioPagamento(source.getIdDettaglioPagamento());

		destination.setCdAbi(source.getAbi());

		destination.setCdBic(source.getBic());

		destination.setCdCab(source.getCab());

		destination.setCdCfQuietanzante(source.getCfQuietanzante());

		destination.setCdCodUfficioPostale(source.getCodUfficioPostale());

		destination.setCdCodicePagamento(source.getCodicePagamento());

		destination.setCdIban(source.getIban());

		destination.setDtDataDecorrenzaPenale(source.getDataDecorrenzaPenale());

		destination.setDtDataLimitePagamentoAnt(source.getDataLimitePagamentoAnt());

		destination.setDtDataRifTerminiPagamento(source.getDataRifTerminiPagamento());

		destination.setDtDataScadenzaPagamento(source.getDataScadenzaPagamento());

		destination.setImImportoPagamento(source.getImportoPagamento());

		destination.setImPenalitaPagamentiRit(source.getPenalitaPagamentiRitardati());

		destination.setImScontoPagamentoAnticipato(source.getScontoPagamentoAnticipato());

		destination.setNmBeneficiario(source.getBeneficiario());

		destination.setNmCognomeQuietanzante(source.getCognomeQuietanzante());

		destination.setNmIstitutoFinanziario(source.getIstitutoFinanziario());

		destination.setNmNomeQuietanzante(source.getNomeQuietanzante());

		destination.setNmTitoloQuietanzante(source.getTitoloQuietanzante());

		destination.setNmUtenteInserimento(source.getUseridInserimento());

		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());

		if(source.getGiorniTerminiPagamento()!=null)
			destination.setNrGiorniTerminiPagamento(BigDecimal.valueOf(source.getGiorniTerminiPagamento()));

		destination.setTsInserimento(source.getTmstInserimento());

		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());

		destination.setIdDatiPagamento(source.getIdDatiPagamento());

		destination.setIdDizModalitaPagamento(source.getModalitaPagamento());
		
		return destination;
	}

}
