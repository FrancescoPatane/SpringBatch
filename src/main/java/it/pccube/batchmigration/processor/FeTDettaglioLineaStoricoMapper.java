package it.pccube.batchmigration.processor;

import java.math.BigDecimal;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTDettaglioLineaStor;
import it.pccube.batchmigration.source.model.FeDettaglioLineaStorico;

public class FeTDettaglioLineaStoricoMapper implements ItemProcessor<FeDettaglioLineaStorico, FatTDettaglioLineaStor>{

	@Override
	public FatTDettaglioLineaStor process(FeDettaglioLineaStorico source) throws Exception {
		FatTDettaglioLineaStor destination = new FatTDettaglioLineaStor();

		destination.setIdDettaglioLineaStor(source.getIdDettaglioLineaStorico());

		destination.setIdDettaglioLinea(source.getIdDettaglioLinea());

		destination.setCdRiferimentoAmministrazione(source.getRiferimentoAmministrazione());

		destination.setCdUnitaMisura(source.getUnitaMisura());

		destination.setDtDataFinePeriodo(source.getDataFinePeriodo());

		destination.setDtDataInizioPeriodo(source.getDataInizioPeriodo());

		destination.setIdArticolo(source.getIdArticolo());

		destination.setImArrotondamento(source.getArrotondamento());

		destination.setImPrezzoTotale(source.getPrezzoTotale());

		destination.setImPrezzoUnitario(source.getPrezzoUnitario());

		destination.setNmUtenteInserimento(source.getUseridInserimento());

		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());

		destination.setPcAliquotaIva(source.getAliquotaIva());
		if(source.getNumeroLinea()!=null)
			destination.setPgNumeroLinea(BigDecimal.valueOf(source.getNumeroLinea()));

		destination.setQtQuantita(source.getQuantita());

		destination.setTsInserimento(source.getTmstInserimento());

		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());

		destination.setTxDescrizione(source.getDescrizione());

		destination.setIdDizTipoCessionePrest(source.getTipoCessionePrestazione());

		destination.setIdFattura(source.getIdFattura());
		
		destination.setIdFatturaStor(source.getIdFatturaStorico());

		destination.setIdDizEsigibilitaIva(source.getEsigibilitaIva());

		destination.setIdDizNatura(source.getNatura());

		destination.setIdDizRitenuta(source.getRitenuta());


		return destination;
	}

}
