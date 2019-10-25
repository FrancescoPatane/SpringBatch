package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTDatiRiferimentoStor;
import it.pccube.batchmigration.source.model.FeDatiRiferimentoStorico;

public class FeDatiRiferimentoStoricoMapper implements ItemProcessor<FeDatiRiferimentoStorico, FatTDatiRiferimentoStor>{

	@Override
	public FatTDatiRiferimentoStor process(FeDatiRiferimentoStorico source) throws Exception {
		FatTDatiRiferimentoStor destination = new FatTDatiRiferimentoStor();
		
		destination.setIdDatiRiferimentoStor(source.getIdDatiRiferimentoStorico());
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
		destination.setIdFatturaStor(source.getIdFatturaStorico());
		destination.setIdFatturaCollegata(source.getIdFatturaCollegata());
		destination.setIdDizTipoDatiRiferimento(source.getTipoDatiRiferimento());
		
		return destination;
	}

}
