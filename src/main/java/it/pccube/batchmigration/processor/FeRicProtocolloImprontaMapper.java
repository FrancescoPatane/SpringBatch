package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTRicProtocolImpronta;
import it.pccube.batchmigration.source.model.FeRicProtocolloImpronta;

public class FeRicProtocolloImprontaMapper implements ItemProcessor<FeRicProtocolloImpronta, FatTRicProtocolImpronta>{

	@Override
	public FatTRicProtocolImpronta process(FeRicProtocolloImpronta source) throws Exception {
		FatTRicProtocolImpronta destination = new FatTRicProtocolImpronta();
		
		destination.setIdRicProtocolloImpronta(source.getIdRicProtocolloImpronta());
		destination.setCdCodErrRichiestaNcs(source.getCodErrRichiestaNcs());
		destination.setDsDescrErrRichiestaNcs(source.getDescrErrRichiestaNcs());
		destination.setDtDataOraInvioProtocolNcs(source.getDataOraInvioProtocolloNcs());
		destination.setDtDataProtocolloComunic(source.getDataProtocolloComunic());
		destination.setFlAttuale(source.getFlagAttuale());
		destination.setFlEsitoRichiestaNcs(source.getEsitoRichiestaNcs());
//		TODO id sedia
//		destination.setIdSediaRichiesta(source.get);
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setNrNumeroProtocolloComunic(source.getNumeroProtocolloComunic());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		destination.setIdRicImprontaArchivio(source.getIdRicImprontaArchivio());
		
		return destination;
	}

}
