package it.pccube.batchmigration.processor;

import java.math.BigDecimal;
import java.util.Base64;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

import it.pccube.batchmigration.client.doc.DocumentaleService;
import it.pccube.batchmigration.client.doc.OutputDocumentale;
import it.pccube.batchmigration.destination.model.FatTLotto;
import it.pccube.batchmigration.source.model.FeLotto;

public class FeLottoMapper implements ItemProcessor<FeLotto, FatTLotto >{
	
	private static final Logger logger = LoggerFactory.getLogger(FeLottoMapper.class);

	
	@Autowired
	private DocumentaleService docService;

	@Override
	public FatTLotto process(FeLotto source) throws Exception {
		logger.info("Mapping FeLotto with PK: " + source.getIdLotto());
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
//TODO
//		entity.setIdSediaAssegnatario(idSediaAssegnatario);
//		entity.setIdSediaCreatore(idSediaCreatore);
//		entity.setIdSediaUltimaMod(idSediaUltimaMod);
		destination.setIdUfficioReaCedente(source.getUfficioReaCedente());
		
		
//		if (source.getXmlFirmato() != null){
//			String base64String = Base64.getEncoder().encodeToString(source.getXmlFirmato());
//			logger.info("Tentativo chiamata documentale per salvataggion documento XmlFirmato tabella FeLotto con id: " + source.getIdLotto());
//			OutputDocumentale doc = docService.uploadDocumento(base64String, source.getNomeXmlFirmato());
//			origin.setIdXmlFirmato(doc.getId());
//		}
//		if (source.getXmlNonFirmato() != null){
//			logger.info("Tentativo chiamata documentale per salvataggion documento XmlNonFirmato tabella FeLotto con id: " + source.getIdLotto());
//			String base64String = Base64.getEncoder().encodeToString(source.getXmlNonFirmato());
//			OutputDocumentale doc = docService.uploadDocumento(base64String, source.getNomeXmlNonFirmato());
//			origin.setIdXmlNonFirmato(doc.getId());
//		}
		
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
		logger.info("Mapping complete");
		return destination;
	}

//	@Override
//	public FeLotto mapRow(ResultSet rs, int rowNum) throws SQLException {
//		FeLotto bean = new FeLotto();
//		
//		bean.setIdLotto(rs.getLong("ID_LOTTO"));
//		bean.setDataIscrizioneAlboCedente(rs.getDate("DATA_ISCRIZIONE_ALBO_CEDENTE"));
//		bean.setFlagDaStoricizzare(rs.getBoolean("FLAG_DA_STORICIZZARE"));
//		bean.setDataOraRicezione(rs.getDate("DATA_ORA_RICEZIONE"));
//		bean.setDataOraUltimoInvioSdi(rs.getDate("DATA_ORA_ULTIMO_INVIO_SDI"));
//		bean.setDataOraUltimaModifica(rs.getDate("DATA_ORA_ULTIMA_MODIFICA"));
//		bean.setDataOraPrimaCreazione(rs.getDate("DATA_ORA_PRIMA_CREAZIONE"));
//		bean.setStatoLiquidazioneCedente(rs.getLong("STATO_LIQUIDAZIONE_CEDENTE"));
//		bean.setEsitoVerificaFirma(rs.getBoolean("ESITO_VERIFICA_FIRMA"));
//		bean.setNazioneSedeCedente(rs.getLong("NAZIONE_SEDE_CEDENTE"));
//		bean.setComuneStabileCedente(rs.getLong("COMUNE_STABILE_CEDENTE"));
//		bean.setProvinciaStabileCedente(rs.getLong("PROVINCIA_STABILE_CEDENTE"));
//		bean.setNazioneStabileCedente(rs.getLong("NAZIONE_STABILE_CEDENTE"));
//		bean.setProvinciaSedeCedente(rs.getLong("PROVINCIA_STABILE_CEDENTE"));
//		bean.setComuneSedeCedente(rs.getLong("COMUNE_SEDE_CEDENTE"));
//		bean.setIdPaeseCedente(rs.getLong("ID_PAESE_CEDENTE"));
//		bean.setNazioneSedeCessionario(rs.getLong("NAZIONE_SEDE_CESSIONARIO"));
//		bean.setRegioneStabileCedente(rs.getLong("REGIONE_STABILE_CEDENTE"));
//		bean.setRegioneSedeCessionario(rs.getLong("REGIONE_SEDE_CESSIONARIO"));
//		bean.setIdUtenteAziendaAssegnatario(rs.getLong("ID_UTENTE_AZIENDA_ASSEGNATARIO"));
//		bean.setIdUtenteAziendaUltimaMod(rs.getLong("ID_UTENTE_AZIENDA_ULTIMA_MOD"));
//		bean.setIdUtenteAziendaCreatore(rs.getLong("ID_UTENTE_AZIENDA_CREATORE"));
//		bean.setIdPaeseTerzoInt(rs.getLong("ID_PAESE_TERZO_INT"));
//		bean.setRegioneSedeCedente(rs.getLong("REGIONE_SEDE_CEDENTE"));
//		bean.setProvinciaSedeCessionario(rs.getLong("PROVINCIA_SEDE_CESSIONARIO"));
//		bean.setPaeseRapFiscale(rs.getLong("ID_PAESE_RAP_FISCALE"));
//		bean.setIdPaeseCessionario(rs.getLong("ID_PAESE_CESSIONARIO"));
//		bean.setComuneSedeCessionario(rs.getLong("COMUNE_SEDE_CEDENTE"));
//		bean.setIdentificativoSdiLotto(rs.getLong("IDENTIFICATIVO_SDI_LOTTO"));
//		bean.setCapitaleSocialeCedente(BigDecimal.valueOf(rs.getLong("CAPITALE_SOCIALE_CEDENTE")));
//		bean.setEsitoInvio(rs.getLong("ESITO_INVIO"));
//		bean.setStato(rs.getLong("STATO"));
//		bean.setSocioUnicoCedente(rs.getLong("SOCIO_UNICO_CEDENTE"));
//		bean.setRegimeFiscaleCedente(rs.getLong("REGIME_FISCALE_CEDENTE"));
//		bean.setTmstUltimoAggiornamento(rs.getDate("TMST_ULTIMO_AGGIORNAMENTO"));
//		bean.setTmstInserimento(rs.getDate("TMST_INSERIMENTO"));
//		bean.setTitoloRapFiscale(rs.getString("TITOLO_RAP_FISCALE"));
//		bean.setProgressivoInvio(rs.getString("PROGRESSIVO_INVIO"));
//		bean.setTitoloTerzoInt(rs.getString("TITOLO_TERZO_INT"));
//		bean.setTitoloCessionario(rs.getString("TITOLO_CESSIONARIO"));
//		bean.setTitoloCedente(rs.getString("TITOLO_CEDENTE"));
//		bean.setTelefonoTrasmittente(rs.getString("TELEFONO_TRASMITTENTE"));
//		bean.setFaxCedente(rs.getString("FAX_CEDENTE"));
//		bean.setTelefonoCedente(rs.getString("TITOLO_CEDENTE"));
//		bean.setCodiceFiscaleCedente(rs.getString("CODICE_FISCALE_CEDENTE"));
//		bean.setCodiceFiscaleTerzoInt(rs.getString("CODICE_FISCALE_TERZO_INT"));
//		bean.setCodiceFiscaleCessionario(rs.getString("CODICE_FISCALE_CESSIONARIO"));
//		bean.setCodiceFiscaleRapFiscale(rs.getString("CODICE_FISCALE_RAP_FISCALE"));
//		bean.setCodEoriCedente(rs.getString("COD_EORI_CEDENTE"));
//		bean.setCodEoriTerzoInt(rs.getString("COD_EORI_TERZO_INT"));
//		bean.setCodEoriCessionario(rs.getString("COD_EORI_CESSIONARIO"));
//		bean.setCodEoriRapFiscale(rs.getString("COD_EORI_RAP_FISCALE"));
//		bean.setRifAmministrazioneCedente(rs.getString("RIF_AMMINISTRAZIONE_CEDENTE"));
//		bean.setNumeroReaCedente(rs.getString("NUMERO_REA_CEDENTE"));
//		bean.setTicketConservazione(rs.getString("TICKET_CONSERVAZIONE"));
//		bean.setEmailCedente(rs.getString("EMAIL_CEDENTE"));
//		bean.setEmailTrasmittente(rs.getString("EMAIL_TRASMITTENTE"));
//		bean.setIdCodiceTerzoInt(rs.getString("ID_CODICE_TERZO_INT"));
//		bean.setIdCodiceCedente(rs.getString("ID_CODICE_CEDENTE"));
//		bean.setIdCodiceRapFiscale(rs.getString("ID_CODICE_RAP_FISCALE"));
//		bean.setIdCodiceCessionario(rs.getString("ID_CODICE_CESSIONARIO"));
//		bean.setIdCodiceTrasmittente(rs.getString("ID_CODICE_TRASMITTENTE"));
//		bean.setUseridInserimento(rs.getString("USERID_INSERIMENTO"));
//		bean.setUseridUltimoAggiornamento(rs.getString("USERID_ULTIMO_AGGIORNAMENTO"));
//		bean.setFormatoTrasmissione(rs.getString("FORMATO_TRASMISSIONE"));
//		bean.setCapStabileCedente(rs.getString("CAP_STABILE_CEDENTE"));
//		bean.setIdPaeseTrasmittente(rs.getString("ID_PAESE_TRASMITTENTE"));
//		bean.setCapSedeCedente(rs.getString("CAP_SEDE_CEDENTE"));
//		bean.setCapSedeCessionario(rs.getString("CAP_SEDE_CESSIONARIO"));
//		bean.setNomeXmlFirmato(rs.getString("NOME_XML_FIRMATO"));
//		bean.setNomeXmlNonFirmato(rs.getString("NOME_XML_NON_FIRMATO"));
//		bean.setCodiceDestinatario(rs.getString("CODICE_DESTINATARIO"));
//		bean.setNomeCedente(rs.getString("NOME_CEDENTE"));
//		bean.setNomeTerzoInt(rs.getString("NOME_TERZO_INT"));
//		bean.setComuneSedeCessionarioEst("COMUNE_SEDE_CESSIONARIO_EST");
//		bean.setIndirizzoSedeCessionario(rs.getString("INDIRIZZO_SEDE_CESSIONARIO"));
//		bean.setCognomeCessionario(rs.getString("COGNOME_CESSIONARIO"));
//		bean.setNomeCessionario(rs.getString("NOME_CESSIONARIO"));
//		bean.setCognomeRapFiscale(rs.getString("COGNOME_RAP_FISCALE"));
//		bean.setCognomeTerzoInt(rs.getString("COGNOME_TERZO_INT"));
//		bean.setCognomeCedente(rs.getString("COGNOME_CEDENTE"));
//		bean.setAlboProfessionaleCedente(rs.getString("ALBO_PROFESSIONALE_CEDENTE"));
//		bean.setNumIscrizioneAlboCedente(rs.getString("NUM_ISCRIZIONE_ALBO_CEDENTE"));
//		bean.setIndirizzoSedeCedente(rs.getString("INDIRIZZO_SEDE_CEDENTE"));
//		bean.setComuneSedeCedenteEst(rs.getString("COMUNE_SEDE_CEDENTE_EST"));
//		bean.setIndirizzoStabileCedente(rs.getString("INDIRIZZO_STABILE_CEDENTE"));
//		bean.setComuneStabileCedenteEst(rs.getString("COMUNE_STABILE_CEDENTE"));
//		bean.setNomeRapFiscale(rs.getString("NOME_RAP_FISCALE"));
//		bean.setNumeroCivicoSedeCedente(rs.getString("NUMERO_CIVICO_SEDE_CEDENTE"));
//		bean.setNumCivicoStabileCedente(rs.getString("NUM_CIVICO_STABILE_CEDENTE"));
//		bean.setNumCivicoSedeCessionario(rs.getString("NUM_CIVICO_SEDE_CESSIONARIO"));
//		bean.setDenominazioneRapFiscale(rs.getString("DENOMINAZIONE_RAP_FISCALE"));
//		bean.setDenominazioneCessionario(rs.getString("DENOMINAZIONE_CESSIONARIO"));
//		bean.setDenominazioneTerzoInt(rs.getString("DENOMINAZIONE_TERZO_INT"));
//		bean.setDenominazioneCedente(rs.getString(""));
//		bean.setRegioneAlboCedente(rs.getLong(""));
//		bean.setProvinciaAlboCedente(rs.getLong(""));
//		bean.setRegioneReaCedente(rs.getLong(""));
//		bean.setUfficioReaCedente(rs.getLong(""));
//		bean.setVersioneLotto(rs.getLong(""));
//		bean.setSizeXmlFirmato(rs.getLong(""));
//		bean.setHashXmlFirmato("");
//		bean.setContentTypeXmlFirmato("");
//		bean.setFlagVerificaFirma("");
//		bean.setFlagLottoEu("");
//		bean.setUserIdFlgLottoEu("");
//		bean.setTmstFlgLottoEu("");
//		bean.setFlagFtp(rs.getBoolean(""));
//		bean.setPecDestinatario(rs.getString(""));
//		bean.setNazioneStabileCessionario("");
//		bean.setProvinciaStabileCessionario("");
//		bean.setComuneStabileCessionario(rs.getLong(""));
//		bean.setCapStabileCessionario(rs.getString(""));
//		bean.setIndirizzoStabileCessionario(rs.getString(""));
//		bean.setNumCivicoStabileCessionario(rs.getString(""));
//		bean.setComuneStabileCessionarioEst(rs.getString(""));
//		bean.setRegioneStabileCessionario(rs.getLong(""));
//		bean.setIdPaeseRapFiscaleCes(rs.getLong(""));
//		bean.setIdCodiceRapFiscaleCes(rs.getLong(""));
//		bean.setCognomeRapFiscaleCes(rs.getString(""));
//		bean.setNomeRapFiscaleCes(rs.getString(""));
//		bean.setDenominazioneRapFiscaleCes("");
//		bean.setIdDizTipologiaDestinatario(rs.getLong(""));
//		bean.setIdAdesione(rs.getLong(""));
//		bean.setXmlFirmato(rs.getBytes(""));
//		bean.setXmlNonFirmato(rs.getBytes(""));
//		
//		
//		
//		return null;
//	}

}
