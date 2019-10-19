package it.pccube.batchmigration.processor;

import org.springframework.batch.core.Job;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import it.pccube.batchmigration.destination.model.FatTLotto;
import it.pccube.batchmigration.source.model.FeLotto;

@Component
public class ProcessorFactory {
	
	
	public  ItemProcessor<FeLotto, FatTLotto> getProcessor() {
		return new FeLottoMapper();
	}

}
