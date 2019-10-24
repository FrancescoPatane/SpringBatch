package it.pccube.batchmigration.processor;

import java.math.BigDecimal;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTDatiCassaPrevidenz;
import it.pccube.batchmigration.source.model.FeDatiCassaPrevidenziale;

public class FeDatiCassaPrevidenzialeMapper implements ItemProcessor<FeDatiCassaPrevidenziale, FatTDatiCassaPrevidenz>{

	@Override
	public FatTDatiCassaPrevidenz process(FeDatiCassaPrevidenziale source) throws Exception {
		FatTDatiCassaPrevidenz destination = new FatTDatiCassaPrevidenz();
		
		destination.setIdDatiCassaPrevidenziale(source.getIdDatiCassaPrevidenziale());

		destination.setCdRiferimentoAmministrazione(source.getRiferimentoAmministrazione());

		destination.setImArrotondamento(source.getArrotondamento());

		destination.setImImponibileCassa(source.getImponibileCassa());

		destination.setImImportoContributoCassa(source.getImportoContributoCassa());
		if(source.getNumeroSezione()!=null)
			destination.setNmNumeroSezione(BigDecimal.valueOf(source.getNumeroSezione()));

		destination.setNmUtenteInserimento(source.getUseridInserimento());

		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());

		destination.setPcAlCassa(source.getAlCassa());

		destination.setPcAliquotaIva(source.getAliquotaIva());

		destination.setTsInserimento(source.getTmstInserimento());

		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());

		destination.setIdDizTipoCassa(source.getTipoCassa());

		destination.setIdDizNatura(source.getNatura());

		destination.setIdDizRitenuta(source.getRitenuta());

		destination.setIdDizEsigibilitaIva(source.getEsigibilitaIva());

		destination.setIdFattura(source.getIdFattura());
		
		return destination;
	}

}
