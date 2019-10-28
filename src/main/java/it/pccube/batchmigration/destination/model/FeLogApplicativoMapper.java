package it.pccube.batchmigration.destination.model;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.source.model.FeLogApplicativo;

public class FeLogApplicativoMapper implements ItemProcessor<FeLogApplicativo, FatTApplicativoLog>{

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
//TODO ID SEDIA
//		destination.setIdSedia(source.gets);

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
