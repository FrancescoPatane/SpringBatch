package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTXsdSezioneCfg;
import it.pccube.batchmigration.source.model.FeConfigXsdSezione;

public class FeConfigXsdSezioneMapper implements ItemProcessor<FeConfigXsdSezione, FatTXsdSezioneCfg>{

	@Override
	public FatTXsdSezioneCfg process(FeConfigXsdSezione source) throws Exception {
		FatTXsdSezioneCfg destination = new FatTXsdSezioneCfg();
		destination.setFlObbligatorio(source.getFlagObbligatorio());
		destination.setIdConfigMacrosezApp(source.getIdConfigMacrosezApp());
		destination.setIdConfigXsdSezione(source.getIdConfigXsdSezione());
		destination.setIdConfigXsdSezionePadre(source.getIdConfigXsdSezionePadre());
		destination.setNmNomeSezione(source.getNomeSezione());
		return destination;
	}

}
