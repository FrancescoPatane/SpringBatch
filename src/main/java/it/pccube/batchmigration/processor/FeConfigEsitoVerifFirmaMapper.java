package it.pccube.batchmigration.processor;

import java.util.Date;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.costant.Constants;
import it.pccube.batchmigration.destination.model.FatTEsitoVerifFirmaCfg;
import it.pccube.batchmigration.source.model.FeConfigEsitoVerifFirma;

public class FeConfigEsitoVerifFirmaMapper implements ItemProcessor<FeConfigEsitoVerifFirma, FatTEsitoVerifFirmaCfg>{

	@Override
	public FatTEsitoVerifFirmaCfg process(FeConfigEsitoVerifFirma source) throws Exception {
		FatTEsitoVerifFirmaCfg destination = new FatTEsitoVerifFirmaCfg();
		
		if(source.getRitornoServiceVerifica()!=null)
			destination.setCdRitornoServiceVerifica(source.getRitornoServiceVerifica().toString());
		if(source.getStato()!=null)
		destination.setCdStato(source.getStato().toString());
		destination.setDsDescrizione(source.getDescrizione());
		destination.setFlFirmatari(source.getFirmatari());
		destination.setFlModelloConforme(source.getModelloConforme());
		destination.setFlRaggiungibile(source.getRaggiungibile());
		destination.setFlRiconosciuto(source.getRiconosciuto());
		destination.setFlVerifica(source.getVerifica());
		destination.setIdConfigEsitoVerifFirma(source.getIdConfigEsitoVerifFirma());
		destination.setNmUtenteInserimento(Constants.BATCH_USER);
		destination.setNmUtenteUltimaModifica(Constants.BATCH_USER);
		destination.setTsInserimento(new Date());
		destination.setTsUltimaModifica(new Date());
		
		
		return destination;
	}

}
