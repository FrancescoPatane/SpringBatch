package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTAltroDatoGestionale;
import it.pccube.batchmigration.destination.model.FatTCausaleFattura;
import it.pccube.batchmigration.source.model.FeAltroDatoGestionale;
import it.pccube.batchmigration.source.model.FeCausaleFattura;

public class FeAltroDatoGestionaleMapper implements ItemProcessor<FeAltroDatoGestionale, FatTAltroDatoGestionale>{

	@Override
	public FatTAltroDatoGestionale process(FeAltroDatoGestionale source) throws Exception {
		FatTAltroDatoGestionale destination = new FatTAltroDatoGestionale();
		destination.setCdRiferimentoTesto(source.getRiferimentoTesto());
		destination.setDtDataRiferimentoData(source.getRiferimentoData());
		destination.setIdAltroDatoGestionale(source.getIdAltroDatoGestionale());
		destination.setIdDettaglioLinea(source.getDettaglioLinea());
		destination.setNmTipoDato(source.getTipoDato());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setNrRiferimentoNumero(source.getRiferimentoNumero());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		return destination;
	}

}
