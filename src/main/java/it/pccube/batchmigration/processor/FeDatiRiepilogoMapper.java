package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTDatiRiepilogo;
import it.pccube.batchmigration.source.model.FeDatiRiepilogo;

public class FeDatiRiepilogoMapper implements ItemProcessor<FeDatiRiepilogo, FatTDatiRiepilogo>{

	@Override
	public FatTDatiRiepilogo process(FeDatiRiepilogo source) throws Exception {
		FatTDatiRiepilogo destination = new FatTDatiRiepilogo(); 
		
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
		
		return destination;
	}

}
