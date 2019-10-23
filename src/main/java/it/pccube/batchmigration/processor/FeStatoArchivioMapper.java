package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatAStatoArchivio;
import it.pccube.batchmigration.source.model.FeStatoArchivio;

public class FeStatoArchivioMapper implements ItemProcessor<FeStatoArchivio, FatAStatoArchivio>{

	@Override
	public FatAStatoArchivio process(FeStatoArchivio source) throws Exception {
		FatAStatoArchivio destination = new FatAStatoArchivio();
		destination.setDtDataOra(source.getDataOra());
		destination.setIdArchivio(source.getIdArchivio());
		destination.setIdDizStatoArchivio(source.getStato());
		destination.setIdMonitoraggioInvioSdi(source.getIdMonitoraggioInvioSdi());
		destination.setIdStatoArchivio(source.getIdStatoArchivio());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		return destination;
	}

}
