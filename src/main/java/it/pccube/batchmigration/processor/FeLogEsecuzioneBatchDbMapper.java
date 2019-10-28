package it.pccube.batchmigration.processor;

import java.math.BigDecimal;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTEsecuzioneBatchLog;
import it.pccube.batchmigration.source.model.FeLogEsecuzioneBatchDb;

public class FeLogEsecuzioneBatchDbMapper implements ItemProcessor<FeLogEsecuzioneBatchDb, FatTEsecuzioneBatchLog>{

	@Override
	public FatTEsecuzioneBatchLog process(FeLogEsecuzioneBatchDb source) throws Exception {
		FatTEsecuzioneBatchLog destination = new FatTEsecuzioneBatchLog();
		
		if(source.getNumElementiComplessivi() != null)
			destination.setCnNumElementiComplessivi(BigDecimal.valueOf(source.getNumElementiComplessivi()));
		if(source.getNumElementiElaborati() != null)
		destination.setCnNumElementiElaborati(BigDecimal.valueOf(source.getNumElementiElaborati()));
		destination.setDtDataFineEsecuzione(source.getDataFineEsecuzione());
		destination.setDtDataInizioEsecuzione(source.getDataInizioEsecuzione());
		destination.setFgErroreEsecuzione(source.getErroreEsecuzione());
		destination.setIdLogEsecuzioneBatchDb(source.getIdLogEsecuzioneBatchDb());
		destination.setNmPackage(source.getPackage_());
		destination.setNmProcedura(source.getProcedura());
		
		return destination;
	}

}
