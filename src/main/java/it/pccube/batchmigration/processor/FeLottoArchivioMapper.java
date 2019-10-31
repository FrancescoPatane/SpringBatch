package it.pccube.batchmigration.processor;

import java.math.BigDecimal;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTLottoArchivio;
import it.pccube.batchmigration.source.model.FeLottoArchivio;

public class FeLottoArchivioMapper implements ItemProcessor<FeLottoArchivio, FatTLottoArchivio>{

	@Override
	public FatTLottoArchivio process(FeLottoArchivio source) throws Exception {
		FatTLottoArchivio destination = new FatTLottoArchivio();
		
		destination.setIdArchivio(source.getIdArchivio());
		destination.setIdLotto(source.getIdLotto());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		if(source.getVersioneLotto() != null)
			destination.setPgVersioneLotto(BigDecimal.valueOf(source.getVersioneLotto()));
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		
		return destination;
	}
}
