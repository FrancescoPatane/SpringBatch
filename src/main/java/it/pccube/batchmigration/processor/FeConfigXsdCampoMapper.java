package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTXsdCampoCfg;
import it.pccube.batchmigration.source.model.FeConfigXsdCampo;

public class FeConfigXsdCampoMapper implements ItemProcessor<FeConfigXsdCampo, FatTXsdCampoCfg>{

	@Override
	public FatTXsdCampoCfg process(FeConfigXsdCampo source) throws Exception {
		FatTXsdCampoCfg destination = new FatTXsdCampoCfg();
		destination.setFlObbligatorio(source.getFlagObbligatorio());
		destination.setIdConfigXsdCampo(source.getIdConfigXsdCampo());
		destination.setIdXsdSezioneCfg(source.getIdConfigXsdSezione());
		destination.setNmNomeCampo(source.getNomeCampo());
		destination.setNmNomeCampoMapping(source.getNomeCampoMapping());
		destination.setNmNomeTabellaMapping(source.getNomeTabellaMapping());
		return destination;
	}

}
