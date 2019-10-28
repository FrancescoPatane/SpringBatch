package it.pccube.batchmigration.processor;

import java.math.BigDecimal;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTMonitorInvioSdi;
import it.pccube.batchmigration.source.model.FeMonitoraggioInvioSdi;

public class FeMonitoraggioInvioSdiMapper implements ItemProcessor<FeMonitoraggioInvioSdi, FatTMonitorInvioSdi>{

	@Override
	public FatTMonitorInvioSdi process(FeMonitoraggioInvioSdi source) throws Exception {
		FatTMonitorInvioSdi destination = new FatTMonitorInvioSdi();
		
		destination.setIdMonitoraggioInvioSdi(source.getIdMonitoraggioInvioSdi());

		if (source.getIdentificativoSdiArchivio() != null)
			destination.setCdIdentificativoSdiArchivio(source.getIdentificativoSdiArchivio().toString());
		
		if (source.getIdentificativoSdiLotto() != null)
		destination.setCdIdentificativoSdiLotto(source.getIdentificativoSdiLotto().toString());

		destination.setDtDataOraInvio(source.getDataOraInvio());

		destination.setDtDataOraRicezione(source.getDataOraRicezione());

		destination.setNmUtenteInserimento(source.getUseridInserimento());

		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());

		destination.setOjLog(source.getLog());

		if (source.getVersioneLotto() != null)
			destination.setPgVersioneLotto(BigDecimal.valueOf(source.getVersioneLotto()));

		destination.setTsInserimento(source.getTmstInserimento());

		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());

		destination.setIdEsitoInvio(source.getEsitoInvio());

		destination.setIdDizTipElementoInviato(source.getTipologiaElementoInviato());

		destination.setIdArchivio(source.getIdArchivio());

		destination.setIdLotto(source.getIdLotto());
		
		return destination;
	}

}
