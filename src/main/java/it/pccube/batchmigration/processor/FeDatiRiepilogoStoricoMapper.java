package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTDatiRiepilogoStor;
import it.pccube.batchmigration.source.model.FeDatiRiepilogoStorico;

public class FeDatiRiepilogoStoricoMapper implements ItemProcessor<FeDatiRiepilogoStorico, FatTDatiRiepilogoStor>{

	@Override
	public FatTDatiRiepilogoStor process(FeDatiRiepilogoStorico source) throws Exception {
		FatTDatiRiepilogoStor destination = new FatTDatiRiepilogoStor(); 
		destination.setIdDatiRiepilogoStor(source.getIdDatiRiepilogoStorico());
		destination.setIdDatiRiepilogo(source.getIdDatiRiepilogo());
		destination.setDsRiferimentoNormativo(source.getRiferimentoNormativo());
		destination.setImArrotondamento(source.getArrotondamento());
		destination.setImImponibileImporto(source.getImponibileImporto());
		destination.setImSpeseAccessorie(source.getSpeseAccessorie());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setPcAliquotaIva(source.getAliquotaIva());
		destination.setPcImposta(source.getImposta());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		destination.setIdDizEsigibilitaIva(source.getEsigibilitaIva());
		destination.setIdDizNatura(source.getNatura());
		destination.setIdFattura(source.getIdFattura());
		destination.setIdFatturaStor(source.getIdFatturaStorico());
		return destination;
	}
}
