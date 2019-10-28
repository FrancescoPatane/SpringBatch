package it.pccube.batchmigration.processor;

import java.math.BigDecimal;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatALottoSupportoFtp;
import it.pccube.batchmigration.source.model.FeLottoSupportoFtp;

public class FeLottoSupportoFtpMapper implements ItemProcessor<FeLottoSupportoFtp, FatALottoSupportoFtp>{

	@Override
	public FatALottoSupportoFtp process(FeLottoSupportoFtp source) throws Exception {
		FatALottoSupportoFtp destination = new FatALottoSupportoFtp();
		
		destination.setIdLotto(source.getIdLotto());
		destination.setIdSupportoFtp(source.getIdSupportoFtp());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		if (source.getVersioneLotto() != null)
			destination.setPgVersioneLotto(BigDecimal.valueOf(source.getVersioneLotto()));
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		
		return destination;
	}
	
	

}
