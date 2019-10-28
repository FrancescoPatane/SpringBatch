package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTErroreBatchLog;
import it.pccube.batchmigration.source.model.FeLogErroreBatchDb;

public class FeLogErroreBatchDbMapper  implements ItemProcessor<FeLogErroreBatchDb, FatTErroreBatchLog>{

	@Override
	public FatTErroreBatchLog process(FeLogErroreBatchDb source) throws Exception {
		FatTErroreBatchLog destination = new FatTErroreBatchLog();
		
		destination.setIdLogErroreBatchDb(source.getIdLogErroreBatchDb());
		destination.setNmCodiceErrore(source.getCodiceErrore());
		destination.setNmPackage(source.getPackage_());
		destination.setNmProcedura(source.getProcedura());
		destination.setTsData(source.getData());
		destination.setTxDescrizioneErrore(source.getDescrizioneErrore());
		destination.setTxNote(source.getNote());
		
		return destination;
	}

}
