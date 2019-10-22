package it.pccube.batchmigration.processor;

import java.util.Date;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.costant.Constants;
import it.pccube.batchmigration.destination.model.FatTAdesioneNotifica;
import it.pccube.batchmigration.source.model.FeAdesioneNotifica;

public class FeAdesioneNotificaMapper implements ItemProcessor<FeAdesioneNotifica, FatTAdesioneNotifica>{

	@Override
	public FatTAdesioneNotifica process(FeAdesioneNotifica source) throws Exception {
		FatTAdesioneNotifica destination = new FatTAdesioneNotifica();
		destination.setDtDataNotifica(source.getData());
		destination.setIdAdesione(source.getIdAdesione());
		destination.setIdDizStatoAdesioneNotifica(source.getStato());
		destination.setNmUtenteInserimento(Constants.BATCH_USER);
		destination.setNmUtenteUltimaModifica(Constants.BATCH_USER);
		destination.setTsInserimento(new Date());
		destination.setTsUltimaModifica(new Date());
		return destination;
	}

}
