package it.pccube.batchmigration.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

import it.pccube.batchmigration.client.AutorizzazioneService;
import it.pccube.batchmigration.destination.model.FatTRicProtocolImpronta;
import it.pccube.batchmigration.source.model.FeRicProtocolloImpronta;

public class FeRicProtocolloImprontaMapper implements ItemProcessor<FeRicProtocolloImpronta, FatTRicProtocolImpronta>{

	public static final Logger logger = LoggerFactory.getLogger(FeRicProtocolloImprontaMapper.class);
	
	@Autowired
	private AutorizzazioneService autorizzazioneService;
	
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
		
		if (source.getIdUtenteAziendaRichiesta() != null) {
			logger.info("Tentativo chiamata autorizzazione per recupero di sedia da IdUtenteAziendaRichiesta " + source.getIdUtenteAziendaRichiesta() + "dell'entity FeRicProtocolloImpronta con id: " + source.getIdRicProtocolloImpronta());
			String idSedia = this.autorizzazioneService.getIdSediaFromIdUtenteAzienda(source.getIdUtenteAziendaRichiesta().toString());
			destination.setIdSediaRichiesta(Long.valueOf(idSedia));
		}
		
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setNrNumeroProtocolloComunic(source.getNumeroProtocolloComunic());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		destination.setIdRicImprontaArchivio(source.getIdRicImprontaArchivio());
		
		return destination;
	}

}
