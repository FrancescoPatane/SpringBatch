package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTDettaglioLinea;
import it.pccube.batchmigration.source.model.FeDettaglioLinea;

public class FeDettaglioLineaMapper implements ItemProcessor<FeDettaglioLinea, FatTDettaglioLinea>{

	@Override
	public FatTDettaglioLinea process(FeDettaglioLinea source) throws Exception {
		FatTDettaglioLinea destination = new FatTDettaglioLinea();


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

		destination.setPgNumeroLinea(source.getNumeroLinea());

		destination.setQtQuantita(source.getQuantita());

		destination.setTsInserimento(source.getTmstInserimento());

		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());

		destination.setTxDescrizione(source.getDescrizione());

		destination.setIdDizTipoCessionePrest(source.getTipoCessionePrestazione());

		destination.setIdFattura(source.getIdFattura());

		destination.setIdDizEsigibilitaIva(source.getEsigibilitaIva());

		destination.setIdDizNatura(source.getNatura());

		destination.setIdDizRitenuta(source.getRitenuta());


		return destination;
	}

}
