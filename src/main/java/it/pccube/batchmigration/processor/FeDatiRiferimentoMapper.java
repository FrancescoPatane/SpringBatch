package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTDatiRiferimento;
import it.pccube.batchmigration.source.model.FeDatiRiferimento;

public class FeDatiRiferimentoMapper implements ItemProcessor<FeDatiRiferimento, FatTDatiRiferimento>{

	@Override
	public FatTDatiRiferimento process(FeDatiRiferimento source) throws Exception {
		FatTDatiRiferimento destination = new FatTDatiRiferimento();
		
		destination.setIdDatiRiferimento(source.getIdDatiRiferimento());
		destination.setCdCodiceCig(source.getCodiceCig());
		destination.setCdCodiceCommessaConvenzione(source.getCodiceCommessaConvenzione());
		destination.setCdCodiceCup(source.getCodiceCup());
		destination.setCdDocumento(source.getIdDocumento());
		destination.setCdNumItem(source.getNumItem());
		destination.setDtData(source.getData());
		destination.setFlEproc(source.getFlagEproc());
		destination.setIdIdt(source.getIdt());
		destination.setIdOrdineAcquisto(source.getIdOrdineAcquisto());
		destination.setIdTrattativa(source.getIdTrattativa());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		destination.setIdDizTipoIniziativa(source.getTipoIniziativa());
		destination.setIdFattura(source.getIdFattura());
		destination.setIdFatturaCollegata(source.getIdFatturaCollegata());
		destination.setIdDizTipoDatiRiferimento(source.getTipoDatiRiferimento());
		
		return destination;
	}

}
