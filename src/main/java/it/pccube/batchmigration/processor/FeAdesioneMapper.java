package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTAdesione;
import it.pccube.batchmigration.source.model.FeAdesione;

public class FeAdesioneMapper implements ItemProcessor<FeAdesione, FatTAdesione>{
	

	@Override
	public FatTAdesione process(FeAdesione source) throws Exception {
		FatTAdesione destination = new FatTAdesione();
		
		destination.setCdCapSede(source.getCapSede());
		destination.setCdCapStabile(source.getCapStabile());
		destination.setCdCodice(source.getIdCodice());
		destination.setCdCodiceFiscale(source.getCodiceFiscale());
		destination.setCdFaxSede(source.getFaxSede());
		destination.setCdFaxStabile(source.getFaxStabile());
		destination.setCdNumeroCivicoSede(source.getNumeroCivicoSede());
		destination.setCdNumeroCivicoStabile(source.getNumeroCivicoStabile());
		destination.setCdNumeroIscrizioneAlbo(source.getNumeroIscrizioneAlbo());
		destination.setCdNumeroRea(source.getNumeroRea());
		destination.setCdTelefonoSede(source.getTelefonoSede());
		destination.setCdTelefonoStabile(source.getTelefonoStabile());
//		destination.setDsTipologiaSocietaria(source.getTipologiaSocietaria());
		//TODO pesca dati da ADE.TIPOLOGIA_FORMA_SOCIETARIA
		destination.setDtDataDecadenzaAde(source.getDataDecadenzaAde());
		destination.setDtDataFineValidita(source.getDataFineValidita());
		destination.setDtDataInizioValidita(source.getDataInizioValidita());
		destination.setDtDataIscrizioneAlbo(source.getDataIscrizioneAlbo());
		destination.setDtDataSospensioneAde(source.getDataSospensioneAde());
		destination.setFlAttuale(source.getFlagAttuale());
		destination.setFlPmiDipendenti(source.getFlagPmiDipendenti());
		destination.setFlPmiRaccomandazione(source.getFlagPmiRaccomandazione());
		destination.setFlPmiTotaleBilancio(source.getFlagPmiTotaleBilancio());
		destination.setFlPmiUltimoBilancio(source.getFlagPmiUltimoBilancio());
		destination.setFlVerificaFirma(source.getFlagVerificaFirma());
		destination.setIdAdesione(source.getIdAdesione());
		destination.setIdAdesionePrec(source.getAdesionePrec());
		destination.setIdComuneSede(source.getComuneSede());
		destination.setIdComuneStabile(source.getIdComuneStabile());
		destination.setIdDizSocioUnico(source.getSocioUnico());
		destination.setIdDizStatoAdesione(source.getStato());
		destination.setIdDizStatoLiquidazione(source.getStatoLiquidazione());
		destination.setIdNazioneStabile(source.getNazioneStabile());
		destination.setIdPaese(source.getIdPaese());
		destination.setIdProvinciaAlbo(source.getProvinciaAlbo());
		destination.setIdProvinciaSede(source.getProvinciaSede());
		destination.setIdProvinciaStabile(source.getProvinciaStabile());
		destination.setIdRegimeFiscale(source.getRegimeFiscale());
		destination.setIdRegioneAlbo(source.getRegioneAlbo());
		destination.setIdRegioneRea(source.getRegioneRea());
		destination.setIdRegioneSede(source.getRegioneSede());
		destination.setIdRegioneStabile(source.getRegioneStabile());
		//TODO get sedia
//		destination.setIdSedia();
		destination.setIdUfficioRea(source.getUfficioRea());
		destination.setImCapitaleSociale(source.getCapitaleSociale());
		destination.setNmAlboProfessionale(source.getAlboProfessionale());
		destination.setNmComuneSedeEst(source.getComuneSedeEst());
		destination.setNmComuneStabileEst(source.getComuneStabileEst());
		destination.setNmEmail(source.getEmail());
		destination.setNmIndirizzoSede(source.getIndirizzoSede());
		destination.setNmIndirizzoStabile(source.getIndirizzoStabile());
		destination.setNmRagioneSociale(source.getRagioneSociale());
		destination.setNmRegioneSedeEst(source.getRegioneSedeEst());
		destination.setNmRiferimentoAmministrazione(source.getRiferimentoAmministrazione());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setNrNumGiorniCatalogDisat(source.getNumGiorniCatalogoDisattivato());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		return destination;
	}


}
