package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTAltroDatoGestStor;
import it.pccube.batchmigration.source.model.FeAltroDatoGestStorico;

public class FeAltroDatoGestionaleStoricoMapper implements ItemProcessor<FeAltroDatoGestStorico, FatTAltroDatoGestStor>{

	@Override
	public FatTAltroDatoGestStor process(FeAltroDatoGestStorico source) throws Exception {
		FatTAltroDatoGestStor destination = new FatTAltroDatoGestStor();
		destination.setCdRiferimentoTesto(source.getRiferimentoTesto());
		destination.setDtDataRiferimentoData(source.getRiferimentoData());
		destination.setIdAltroDatoGestionale(source.getIdAltroDatoGestionale());
		destination.setIdDettaglioLinea(source.getIdDettaglioLinea());
		destination.setNmTipoDato(source.getTipoDato());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setNrRiferimentoNumero(source.getRiferimentoNumero());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		destination.setIdAltroDatoGestStor(source.getIdAltroDatoGestStorico());
		destination.setIdDettaglioLineaStor(source.getIdDettaglioLineaStorico());
		return destination;
	}
}
