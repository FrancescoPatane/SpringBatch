package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTMacrosezAppCfg;
import it.pccube.batchmigration.source.model.FeConfigMacrosezApp;

public class FeConfigMacrosezAppMapper implements ItemProcessor<FeConfigMacrosezApp, FatTMacrosezAppCfg>{

	@Override
	public FatTMacrosezAppCfg process(FeConfigMacrosezApp source) throws Exception {
		FatTMacrosezAppCfg destination = new FatTMacrosezAppCfg();
		destination.setDsDescrizione(source.getDescrizione());
		destination.setFlObbligatorio(source.getFlagObbligatorio());
		destination.setIdConfigMacrosezApp(source.getIdConfigMacrosezApp());
		destination.setNmContesto(source.getContesto());
		return destination;
	}

}
