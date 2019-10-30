package it.pccube.batchmigration.processor;

import java.math.BigDecimal;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatAStatoLottoFattura;
import it.pccube.batchmigration.source.model.FeStatoLottoFattura;

public class FeStatoLottoFatturaMapper  implements ItemProcessor<FeStatoLottoFattura, FatAStatoLottoFattura>{

	@Override
	public FatAStatoLottoFattura process(FeStatoLottoFattura source) throws Exception {
		FatAStatoLottoFattura destination = new FatAStatoLottoFattura();
		
		destination.setDtDataOra(source.getDataOra());
		destination.setIdDizStatoLottoFattura(source.getStato());
		destination.setIdFattura(source.getIdFattura());
		destination.setIdLotto(source.getIdLotto());
		destination.setIdMonitoraggioInvioSdi(source.getIdMonitoraggioInvioSdi());
		destination.setIdNotifica(source.getIdNotifica());
		destination.setIdStatoLottoFattura(source.getIdStatoLottoFattura());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		if(source.getVersioneLotto()!= null)
			destination.setPgVersioneLotto(BigDecimal.valueOf(source.getVersioneLotto()));
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		
		return destination;
	}

}
