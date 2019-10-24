package it.pccube.batchmigration.processor;

import java.math.BigDecimal;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTDatiCassaPrevStor;
import it.pccube.batchmigration.source.model.FeDatiCassaPrevStorico;

public class FeDatiCassaPrevStoricoMapper implements ItemProcessor<FeDatiCassaPrevStorico, FatTDatiCassaPrevStor>{

	@Override
	public FatTDatiCassaPrevStor process(FeDatiCassaPrevStorico source) throws Exception {
		FatTDatiCassaPrevStor destination = new FatTDatiCassaPrevStor();
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
		
		destination.setIdFatturaStor(source.getIdFatturaStorico());
		
		destination.setIdDatiCassaPrevStor(source.getIdDatiCassaPrevStorico());
		
		return destination;
	}

}
