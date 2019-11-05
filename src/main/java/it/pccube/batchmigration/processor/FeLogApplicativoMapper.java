package it.pccube.batchmigration.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

import it.pccube.batchmigration.client.AutorizzazioneService;
import it.pccube.batchmigration.destination.model.FatTApplicativoLog;
import it.pccube.batchmigration.source.model.FeLogApplicativo;

public class FeLogApplicativoMapper implements ItemProcessor<FeLogApplicativo, FatTApplicativoLog>{

	public static final Logger logger = LoggerFactory.getLogger(FeLogApplicativoMapper.class);

	@Autowired
	private AutorizzazioneService autorizzazioneService;

	@Override
	public FatTApplicativoLog process(FeLogApplicativo source) throws Exception {
		FatTApplicativoLog destination = new FatTApplicativoLog();


		destination.setIdLogApplicativo(source.getIdLogApplicativo());

		destination.setCdIndirizzoIp(source.getIndirizzoIp());

		destination.setDtDataOperazione(source.getDataOperazione());

		destination.setIdAdesione(source.getIdAdesione());

		destination.setIdArchivio(source.getIdArchivio());

		destination.setIdDettaglioLinea(source.getIdDettaglioLinea());

		destination.setIdExcelFattura(source.getIdExcelFattura());

		destination.setIdFattura(source.getIdFattura());

		destination.setIdLotto(source.getIdLotto());

		destination.setIdNotifica(source.getIdNotifica());

		destination.setIdReportSsaInviiSdi(source.getIdReportSsaInviiSdi());

		destination.setIdReportSsaStatoAde(source.getIdReportSsaStatoAde());

		destination.setIdRicEstrazioneUfficiale(source.getIdRicEstrazioneUfficiale());

		destination.setIdRicImprontaArchivio(source.getIdRicImprontaArchivio());

		if (source.getIdUtenteAzienda() != null) {
			logger.info("Tentativo chiamata autorizzazione per recupero di sedia da IdUtenteAzienda " + source.getIdUtenteAzienda() + "dell'entity FeLogApplicativo con id: " + source.getIdLogApplicativo());
			String idSedia = this.autorizzazioneService.getIdSediaFromIdUtenteAzienda(source.getIdUtenteAzienda().toString());
			destination.setIdSedia(Long.valueOf(idSedia));
		}

		destination.setIdSupporto(source.getIdSupporto());

		destination.setIdUtenteAmministrazione(source.getIdUtenteAmministrazione());

		destination.setPgVersioneLotto(source.getVersioneLotto());

		destination.setNmUtenteInserimento(source.getUseridInserimento());

		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());

		destination.setTsInserimento(source.getTmstInserimento());

		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());

		destination.setIdOperazione(source.getIdOperazione());

		return destination;
	}

}
