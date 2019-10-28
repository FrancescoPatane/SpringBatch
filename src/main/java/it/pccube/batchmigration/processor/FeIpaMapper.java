package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTIpa;
import it.pccube.batchmigration.source.model.FeIpa;

public class FeIpaMapper implements ItemProcessor<FeIpa, FatTIpa>{

	@Override
	public FatTIpa process(FeIpa source) throws Exception {
		FatTIpa destination = new FatTIpa();
		
		destination.setIdIpa(source.getIdIpa());
		destination.setCdCap(source.getCap());
		destination.setCdCodiceFiscaleFe(source.getCodiceFiscaleFe());
		destination.setCdCodiceIpa(source.getCodiceIpa());
		destination.setDtDataAvvioFe(source.getDataAvvioFe());
		destination.setDtDataVerificaCfFe(source.getDataVerificaCfFe());
		destination.setFlUfficioCentraleFe(source.getFlagUfficioCentraleFe());
		destination.setNmComune(source.getComune());
		destination.setNmIndirizzo(source.getIndirizzo());
		destination.setNmProvincia(source.getProvincia());
		destination.setNmRegione(source.getRegione());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		destination.setTxDescrizione(source.getDescrizione());
		destination.setTxDescrizioneCompleta(source.getDescrizioneCompleta());
		destination.setIdDizTipoElementoIpa(source.getIdDizTipoElementoIpa());
		destination.setIdIpaPadre(source.getIdIpaPadre());
		
		return destination;
	}

}
