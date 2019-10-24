package it.pccube.batchmigration.processor;

import java.math.BigDecimal;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTConservAutoreLotto;
import it.pccube.batchmigration.source.model.FeConservazAutoreLotto;

public class FeConservazAutoreLottoMapper implements ItemProcessor<FeConservazAutoreLotto, FatTConservAutoreLotto>{

	@Override
	public FatTConservAutoreLotto process(FeConservazAutoreLotto source) throws Exception {
		FatTConservAutoreLotto destination = new FatTConservAutoreLotto();
		destination.setCdCodiceFiscale(source.getCodiceFiscale());
		destination.setIdConservazAutoreLotto(source.getIdConservazAutoreLotto());
		destination.setIdLotto(source.getIdLotto());
		destination.setIdUtenteAutore(source.getIdUtenteAutore());
		destination.setNmCognome(source.getCognome());
		destination.setNmNome(source.getNome());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		if(source.getVersioneLotto()!=null)
			destination.setPgVersioneLotto(BigDecimal.valueOf(source.getVersioneLotto()));
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		return destination;
	}

}
