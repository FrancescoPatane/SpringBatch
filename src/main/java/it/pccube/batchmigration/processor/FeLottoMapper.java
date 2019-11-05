package it.pccube.batchmigration.processor;

import java.math.BigDecimal;
import java.util.Base64;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

import it.pccube.batchmigration.client.AutorizzazioneService;
import it.pccube.batchmigration.client.doc.DocumentaleService;
import it.pccube.batchmigration.client.doc.OutputDocumentale;
import it.pccube.batchmigration.destination.model.FatTLotto;
import it.pccube.batchmigration.source.model.FeLotto;

public class FeLottoMapper implements ItemProcessor<FeLotto, FatTLotto>{
	
	public static final Logger logger = LoggerFactory.getLogger(FeLottoMapper.class);

	@Autowired
	private AutorizzazioneService autorizzazioneService;
	
	@Autowired
	private DocumentaleService docService;

	@Override
	public FatTLotto process(FeLotto source) throws Exception {
		FatTLotto destination = new FatTLotto();
		destination.setIdAdesione(source.getIdAdesione());
		destination.setCdCapSedeCedente(source.getCapSedeCedente());
		destination.setCdCapSedeCessionario(source.getCapSedeCessionario());
		destination.setCdCapStabileCedente(source.getCapStabileCedente());
		destination.setCdCapStabileCessionario(source.getCapStabileCessionario());
		destination.setCdCfCedente(source.getCodiceFiscaleCedente());
		destination.setCdCivicoStabileCessionario(source.getIndirizzoStabileCessionario());
		destination.setCdCodEoriCedente(source.getCodEoriCedente());
		destination.setCdCodEoriCessionario(source.getCodEoriCessionario());
		destination.setCdCodEoriRapFiscale(source.getCodiceFiscaleRapFiscale());
		destination.setCdCodEoriTerzoInt(source.getCodEoriTerzoInt());
		destination.setCdCodiceCedente(source.getIdCodiceCedente());
		destination.setCdCodiceCessionario(source.getIdCodiceCessionario());
		destination.setCdCodiceDestinatario(source.getCodiceDestinatario());
		destination.setCdCodiceFiscaleCessionario(source.getCodiceFiscaleCessionario());
		destination.setCdCodiceFiscaleRapFiscale(source.getCodiceFiscaleRapFiscale());
		destination.setCdCodiceFiscaleTerzoInt(source.getCodiceFiscaleTerzoInt());
		destination.setCdCodiceRapFiscale(source.getIdCodiceRapFiscale());
		destination.setCdCodiceTerzoInt(source.getIdCodiceTerzoInt());
		destination.setCdCodiceTrasmittente(source.getIdCodiceTrasmittente());
		destination.setCdCodRapFiscaleCes(source.getIdCodiceRapFiscaleCes());
		destination.setCdFaxCedente(source.getFaxCedente());
		destination.setCdFormatoTrasmissione(source.getFormatoTrasmissione());
		destination.setCdHashXmlFirmato(source.getHashXmlFirmato());
		if (source.getIdentificativoSdiLotto() != null)
			destination.setCdIdentificativoSdiLotto(source.getIdentificativoSdiLotto().toString());
		destination.setCdNumCivicoSedeCessionario(source.getNumCivicoSedeCessionario());
		destination.setCdNumCivicoStabileCedente(source.getNumCivicoStabileCedente());
		destination.setCdNumeroCivicoSedeCedente(source.getNumeroCivicoSedeCedente());
		destination.setCdNumeroReaCedente(source.getNumeroReaCedente());
		destination.setCdNumIscrizioneAlboCedente(source.getNumIscrizioneAlboCedente());
		destination.setCdPaeseTrasmittente(source.getIdPaeseTrasmittente());
		destination.setCdProgressivoInvio(source.getProgressivoInvio());
		destination.setCdRifAmministrazioneCedente(source.getRifAmministrazioneCedente());
		destination.setCdTelefonoCedente(source.getTelefonoCedente());
		destination.setCdTelefonoTrasmittente(source.getTelefonoTrasmittente());
		destination.setDtDataIscrAlboCedente(source.getDataIscrizioneAlboCedente());
		destination.setDtDataOraPrimaCreazione(source.getDataOraPrimaCreazione());
		destination.setDtDataOraRicezione(source.getDataOraRicezione());
		destination.setDtDataOraUltimaModifica(source.getDataOraUltimaModifica());
		destination.setDtDataOraUltimoInvioSdi(source.getDataOraUltimoInvioSdi());
		destination.setFlDaStoricizzare(source.getFlagDaStoricizzare());
		destination.setFlEsitoVerificaFirma(source.getEsitoVerificaFirma());
		destination.setFlFtp(source.getFlagFtp());
		destination.setFlLottoEu(source.getFlagLottoEu());
		destination.setFlVerificaFirma(source.getFlagVerificaFirma());
		destination.setIdAdesione(source.getIdAdesione());
		destination.setIdComuneSedeCedente(source.getComuneSedeCedente());
		destination.setIdComuneSedeCessionario(source.getComuneSedeCessionario());
		destination.setIdComuneStabileCedente(source.getComuneStabileCedente());
		destination.setIdComuneStabileCessionario(source.getComuneStabileCessionario());
		destination.setIdDizSocioUnicoCedente(source.getSocioUnicoCedente());
		destination.setIdDizSoggettoEmittente(source.getSoggettoEmittente());
		destination.setIdDizStatoLiquidazCedente(source.getStatoLiquidazioneCedente());
		destination.setIdDizStatoLottoFattura(source.getStato());
		destination.setIdDizTipologiaDestinatario(source.getIdDizTipologiaDestinatario());
		destination.setIdEsitoInvio(source.getEsitoInvio());
		destination.setIdLotto(source.getIdLotto());
		destination.setIdNazioneSedeCedente(source.getNazioneSedeCedente());
		destination.setIdNazioneSedeCessionario(source.getNazioneSedeCessionario());
		destination.setIdNazioneStabileCedente(source.getNazioneStabileCedente());
		destination.setIdNazioneStabileCessionario(source.getNazioneStabileCessionario());
		destination.setIdPaeseCedente(source.getIdPaeseCedente());
		destination.setIdPaeseCessionario(source.getIdPaeseCessionario());
		destination.setIdPaeseRapFiscale(source.getPaeseRapFiscale());
		destination.setIdPaeseRapFiscaleCes(source.getIdPaeseRapFiscaleCes());
		destination.setIdPaeseTerzoInt(source.getIdPaeseTerzoInt());
		destination.setIdProvinciaAlboCedente(source.getProvinciaAlboCedente());
		destination.setIdProvinciaSedeCedente(source.getProvinciaSedeCedente());
		destination.setIdProvinciaSedeCessionario(source.getProvinciaSedeCessionario());
		destination.setIdProvinciaStabileCedente(source.getProvinciaStabileCedente());
		destination.setIdProvinciaStabileCes(source.getProvinciaStabileCessionario());
		destination.setIdRegimeFiscaleCedente(source.getRegimeFiscaleCedente());
		destination.setIdRegioneAlboCedente(source.getRegioneAlboCedente());
		destination.setIdRegioneReaCedente(source.getRegioneReaCedente());
		destination.setIdRegioneSedeCedente(source.getRegioneSedeCedente());
		destination.setIdRegioneSedeCessionario(source.getRegioneSedeCessionario());
		destination.setIdRegioneStabileCedente(source.getRegioneStabileCedente());
		destination.setIdRegioneStabileCessionario(source.getRegioneStabileCessionario());
		
		if (source.getIdUtenteAziendaAssegnatario() != null) {
			logger.info("Tentativo chiamata autorizzazione per recupero di sedia da IdUtenteAziendaAssegnatario " + source.getIdUtenteAziendaAssegnatario() + "dell'entity FeLotto con id: " + source.getIdLotto());
			String idSedia = this.autorizzazioneService.getIdSediaFromIdUtenteAzienda(source.getIdUtenteAziendaAssegnatario().toString());
			destination.setIdSediaAssegnatario(Long.valueOf(idSedia));
		}
		
		if (source.getIdUtenteAziendaCreatore() != null) {
			logger.info("Tentativo chiamata autorizzazione per recupero di sedia da IdUtenteAziendaCreatore " + source.getIdUtenteAziendaCreatore() + "dell'entity FeLotto con id: " + source.getIdLotto());
			String idSedia = this.autorizzazioneService.getIdSediaFromIdUtenteAzienda(source.getIdUtenteAziendaCreatore().toString());
			destination.setIdSediaCreatore(Long.valueOf(idSedia));
		}
		
		if (source.getIdUtenteAziendaUltimaMod() != null) {
			logger.info("Tentativo chiamata autorizzazione per recupero di sedia da IdUtenteAziendaUltimaMod " + source.getIdUtenteAziendaUltimaMod() + "dell'entity FeLotto con id: " + source.getIdLotto());
			String idSedia = this.autorizzazioneService.getIdSediaFromIdUtenteAzienda(source.getIdUtenteAziendaUltimaMod().toString());
			destination.setIdSediaUltimaMod(Long.valueOf(idSedia));
		}
		
		destination.setIdUfficioReaCedente(source.getUfficioReaCedente());
		
		
		if (source.getXmlFirmato() != null){
			String base64String = Base64.getEncoder().encodeToString(source.getXmlFirmato());
			logger.info("Tentativo chiamata documentale per salvataggion documento XmlFirmato tabella FeLotto con id: " + source.getIdLotto());
			OutputDocumentale doc = docService.uploadDocumento(base64String, source.getNomeXmlFirmato());
			destination.setIdXmlFirmato(doc.getId());
		}
		if (source.getXmlNonFirmato() != null){
			logger.info("Tentativo chiamata documentale per salvataggion documento XmlNonFirmato tabella FeLotto con id: " + source.getIdLotto());
			String base64String = Base64.getEncoder().encodeToString(source.getXmlNonFirmato());
			OutputDocumentale doc = docService.uploadDocumento(base64String, source.getNomeXmlNonFirmato());
			destination.setIdXmlNonFirmato(doc.getId());
		}
		
		destination.setImCapitaleSocialeCedente(source.getCapitaleSocialeCedente());
		destination.setNmAlboProfessionaleCedente(source.getAlboProfessionaleCedente());
		destination.setNmCognomeCedente(source.getCognomeCedente());
		destination.setNmCognomeCessionario(source.getCognomeCessionario());
		destination.setNmCognomeRapFiscale(source.getCognomeRapFiscale());
		destination.setNmCognomeRapFiscaleCes(source.getCognomeRapFiscaleCes());
		destination.setNmCognomeTerzoInt(source.getCognomeTerzoInt());
		destination.setNmComuneSedeCedenteEst(source.getComuneSedeCedenteEst());
		destination.setNmComuneSedeCessionarioEst(source.getComuneSedeCessionarioEst());
		destination.setNmComuneStabileCedenteEst(source.getComuneStabileCessionarioEst());
		destination.setNmComuneStabileCesEst(source.getComuneStabileCessionarioEst());
		destination.setNmContentTypeXmlFirmato(source.getContentTypeXmlFirmato());
		destination.setNmDenominazioneCedente(source.getDenominazioneCedente());
		destination.setNmDenominazioneCessionario(source.getDenominazioneCessionario());
		destination.setNmDenominazioneRapFiscale(source.getDenominazioneRapFiscale());
		destination.setNmDenominazioneRapFiscCes(source.getDenominazioneRapFiscaleCes());
		destination.setNmDenominazioneTerzoInt(source.getDenominazioneTerzoInt());
		destination.setNmEmailCedente(source.getEmailCedente());
		destination.setNmEmailTrasmittente(source.getEmailTrasmittente());
		destination.setNmIndirizStabileCessionario(source.getIndirizzoStabileCedente());
		destination.setNmIndirizzoSedeCedente(source.getIndirizzoSedeCedente());
		destination.setNmIndirizzoSedeCessionario(source.getIndirizzoSedeCessionario());
		destination.setNmIndirizzoStabileCedente(source.getIndirizzoStabileCedente());
		destination.setNmNomeCedente(source.getNomeCedente());
		destination.setNmNomeCessionario(source.getNomeCessionario());
		destination.setNmNomeRapFiscale(source.getNomeRapFiscale());
		destination.setNmNomeTerzoInt(source.getNomeTerzoInt());
		destination.setNmNomeXmlFirmato(source.getNomeXmlFirmato());
		destination.setNmNomeXmlNonFirmato(source.getNomeXmlNonFirmato());
		destination.setNmPecDestinatario(source.getPecDestinatario());
		destination.setNmTicketConservazione(source.getTicketConservazione());
		destination.setNmTitoloCedente(source.getTitoloCedente());
		destination.setNmTitoloCessionario(source.getTitoloCessionario());
		destination.setNmTitoloRapFiscale(source.getTitoloRapFiscale());
		destination.setNmTitoloTerzoInt(source.getTitoloTerzoInt());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		if (source.getVersioneLotto() != null)
			destination.setPgVersioneLotto(BigDecimal.valueOf(source.getVersioneLotto()));
		if (source.getSizeXmlFirmato() != null)
			destination.setQtSizeXmlFirmato(BigDecimal.valueOf(source.getSizeXmlFirmato()));
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		return destination;
	}


}
