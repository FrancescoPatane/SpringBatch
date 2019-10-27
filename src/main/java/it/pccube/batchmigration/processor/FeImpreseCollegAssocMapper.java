package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTImpreseCollegAssoc;
import it.pccube.batchmigration.source.model.FeImpreseCollegAssoc;

public class FeImpreseCollegAssocMapper implements ItemProcessor<FeImpreseCollegAssoc, FatTImpreseCollegAssoc>{

	@Override
	public FatTImpreseCollegAssoc process(FeImpreseCollegAssoc source) throws Exception {
		FatTImpreseCollegAssoc destination = new FatTImpreseCollegAssoc();
		
		destination.setCdCodiceFiscale(source.getCodiceFiscale());
		destination.setCdNumeroRea(source.getNumeroRea());
		destination.setCdPartitaIva(source.getPartitaIva());
		destination.setIdAdesione(source.getIdAdesione());
		destination.setIdDizTipologia(source.getTipologia());
		destination.setIdImpreseCollegAssoc(source.getIdImpreseCollegAssoc());
		destination.setNmDenominazione(source.getDenominazione());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		
		return destination;
	}

}
