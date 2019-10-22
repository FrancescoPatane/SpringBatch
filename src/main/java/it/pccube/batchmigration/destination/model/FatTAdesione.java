package it.pccube.batchmigration.destination.model;

import java.math.BigDecimal;
import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FatTAdesione implements ModelEntity {

	public static final String TABLE_NAME = "FAT_T_ADESIONE";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_ADESIONE (cd_cap_sede,cd_cap_stabile,cd_codice,cd_codice_fiscale,cd_fax_sede,cd_fax_stabile,cd_numero_civico_sede,cd_numero_civico_stabile,cd_numero_iscrizione_albo,cd_numero_rea,cd_telefono_sede,cd_telefono_stabile,ds_tipologia_societaria,dt_data_decadenza_ade,dt_data_fine_validita,dt_data_inizio_validita,dt_data_iscrizione_albo,dt_data_sospensione_ade,fl_attuale,fl_pmi_dipendenti,fl_pmi_raccomandazione,fl_pmi_totale_bilancio,fl_pmi_ultimo_bilancio,fl_verifica_firma,id_adesione,id_adesione_prec,id_comune_sede,id_comune_stabile,id_diz_socio_unico,id_diz_stato_adesione,id_diz_stato_liquidazione,id_nazione_stabile,id_paese,id_provincia_albo,id_provincia_sede,id_provincia_stabile,id_regime_fiscale,id_regione_albo,id_regione_rea,id_regione_sede,id_regione_stabile,id_sedia,id_ufficio_rea,im_capitale_sociale,nm_albo_professionale,nm_comune_sede_est,nm_comune_stabile_est,nm_email,nm_indirizzo_sede,nm_indirizzo_stabile,nm_ragione_sociale,nm_regione_sede_est,nm_riferimento_amministrazione,nm_utente_inserimento,nm_utente_ultima_modifica,nr_num_giorni_catalog_disat,ts_inserimento,ts_ultima_modifica) VALUES (:cdCapSede, :cdCapStabile, :cdCodice, :cdCodiceFiscale, :cdFaxSede, :cdFaxStabile, :cdNumeroCivicoSede, :cdNumeroCivicoStabile, :cdNumeroIscrizioneAlbo, :cdNumeroRea, :cdTelefonoSede, :cdTelefonoStabile, :dsTipologiaSocietaria, :dtDataDecadenzaAde, :dtDataFineValidita, :dtDataInizioValidita, :dtDataIscrizioneAlbo, :dtDataSospensioneAde, :flAttuale, :flPmiDipendenti, :flPmiRaccomandazione, :flPmiTotaleBilancio, :flPmiUltimoBilancio, :flVerificaFirma, :idAdesione, :idAdesionePrec, :idComuneSede, :idComuneStabile, :idDizSocioUnico, :idDizStatoAdesione, :idDizStatoLiquidazione, :idNazioneStabile, :idPaese, :idProvinciaAlbo, :idProvinciaSede, :idProvinciaStabile, :idRegimeFiscale, :idRegioneAlbo, :idRegioneRea, :idRegioneSede, :idRegioneStabile, :idSedia, :idUfficioRea, :imCapitaleSociale, :nmAlboProfessionale, :nmComuneSedeEst, :nmComuneStabileEst, :nmEmail, :nmIndirizzoSede, :nmIndirizzoStabile, :nmRagioneSociale, :nmRegioneSedeEst, :nmRiferimentoAmministrazione, :nmUtenteInserimento, :nmUtenteUltimaModifica, :nrNumGiorniCatalogDisat, :tsInserimento, :tsUltimaModifica)";

	private Long idAdesione;

	private String cdCapSede;

	private String cdCapStabile;
	
	
	private String cdCodiceFiscale;
	
	private String cdFaxSede;

	private String cdFaxStabile;

	private String cdNumeroCivicoSede;

	private String cdNumeroCivicoStabile;
	
	private String cdNumeroIscrizioneAlbo;

	private String cdNumeroRea;

	private String cdTelefonoSede;

	private String cdTelefonoStabile;
	
	private String dsTipologiaSocietaria;
	
	private Date dtDataDecadenzaAde;

	private Date dtDataFineValidita;
	
	private Date dtDataInizioValidita;

	private Date dtDataIscrizioneAlbo;

	private Date dtDataSospensioneAde;

	private Short flAttuale;
	
	private Short flPmiDipendenti;
	
	private Short flPmiRaccomandazione;
	
	private Short flPmiTotaleBilancio;
	
	private Short flPmiUltimoBilancio;
	
	private Short flVerificaFirma;
	
	private String cdCodice;
	
	private Long idComuneSede;
	
	private Long idComuneStabile;
	
	private Long idNazioneStabile;
	
	private Long idPaese;
	
	private Long idProvinciaAlbo;
	
	private Long idProvinciaSede;
	
	private Long idProvinciaStabile;
	
	private Long idRegioneAlbo;
	
	private Long idRegioneRea;
	
	private Long idRegioneSede;
	
	private Long idRegioneStabile;
	
	private Long idSedia;
	
	private Long idUfficioRea;
	
	private BigDecimal imCapitaleSociale;

	private String nmAlboProfessionale;

	private String nmComuneSedeEst;

	private String nmComuneStabileEst;
	
	private String nmEmail;
	
	private String nmIndirizzoSede;
	
	private String nmIndirizzoStabile;
	
	private String nmRagioneSociale;
	
	private String nmRegioneSedeEst;
	
	private String nmRiferimentoAmministrazione;

	private String nmUtenteInserimento;
	
	private String nmUtenteUltimaModifica;

	private Long nrNumGiorniCatalogDisat;
	
	private Date tsInserimento;
	
	private Date tsUltimaModifica;
	
	private Long idDizSocioUnico;
	
	private Long idDizStatoAdesione;

	private Long idDizStatoLiquidazione;
	
	private Long idRegimeFiscale;
	
	private Long idAdesionePrec;

	
	
	public Long getIdAdesione() {
		return idAdesione;
	}



	public void setIdAdesione(Long idAdesione) {
		this.idAdesione = idAdesione;
	}



	public String getCdCapSede() {
		return cdCapSede;
	}



	public void setCdCapSede(String cdCapSede) {
		this.cdCapSede = cdCapSede;
	}



	public String getCdCapStabile() {
		return cdCapStabile;
	}



	public void setCdCapStabile(String cdCapStabile) {
		this.cdCapStabile = cdCapStabile;
	}



	public String getCdCodiceFiscale() {
		return cdCodiceFiscale;
	}



	public void setCdCodiceFiscale(String cdCodiceFiscale) {
		this.cdCodiceFiscale = cdCodiceFiscale;
	}



	public String getCdFaxSede() {
		return cdFaxSede;
	}



	public void setCdFaxSede(String cdFaxSede) {
		this.cdFaxSede = cdFaxSede;
	}



	public String getCdFaxStabile() {
		return cdFaxStabile;
	}



	public void setCdFaxStabile(String cdFaxStabile) {
		this.cdFaxStabile = cdFaxStabile;
	}



	public String getCdNumeroCivicoSede() {
		return cdNumeroCivicoSede;
	}



	public void setCdNumeroCivicoSede(String cdNumeroCivicoSede) {
		this.cdNumeroCivicoSede = cdNumeroCivicoSede;
	}



	public String getCdNumeroCivicoStabile() {
		return cdNumeroCivicoStabile;
	}



	public void setCdNumeroCivicoStabile(String cdNumeroCivicoStabile) {
		this.cdNumeroCivicoStabile = cdNumeroCivicoStabile;
	}



	public String getCdNumeroIscrizioneAlbo() {
		return cdNumeroIscrizioneAlbo;
	}



	public void setCdNumeroIscrizioneAlbo(String cdNumeroIscrizioneAlbo) {
		this.cdNumeroIscrizioneAlbo = cdNumeroIscrizioneAlbo;
	}



	public String getCdNumeroRea() {
		return cdNumeroRea;
	}



	public void setCdNumeroRea(String cdNumeroRea) {
		this.cdNumeroRea = cdNumeroRea;
	}



	public String getCdTelefonoSede() {
		return cdTelefonoSede;
	}



	public void setCdTelefonoSede(String cdTelefonoSede) {
		this.cdTelefonoSede = cdTelefonoSede;
	}



	public String getCdTelefonoStabile() {
		return cdTelefonoStabile;
	}



	public void setCdTelefonoStabile(String cdTelefonoStabile) {
		this.cdTelefonoStabile = cdTelefonoStabile;
	}



	public String getDsTipologiaSocietaria() {
		return dsTipologiaSocietaria;
	}



	public void setDsTipologiaSocietaria(String dsTipologiaSocietaria) {
		this.dsTipologiaSocietaria = dsTipologiaSocietaria;
	}



	public Date getDtDataDecadenzaAde() {
		return dtDataDecadenzaAde;
	}



	public void setDtDataDecadenzaAde(Date dtDataDecadenzaAde) {
		this.dtDataDecadenzaAde = dtDataDecadenzaAde;
	}



	public Date getDtDataFineValidita() {
		return dtDataFineValidita;
	}



	public void setDtDataFineValidita(Date dtDataFineValidita) {
		this.dtDataFineValidita = dtDataFineValidita;
	}



	public Date getDtDataInizioValidita() {
		return dtDataInizioValidita;
	}



	public void setDtDataInizioValidita(Date dtDataInizioValidita) {
		this.dtDataInizioValidita = dtDataInizioValidita;
	}



	public Date getDtDataIscrizioneAlbo() {
		return dtDataIscrizioneAlbo;
	}



	public void setDtDataIscrizioneAlbo(Date dtDataIscrizioneAlbo) {
		this.dtDataIscrizioneAlbo = dtDataIscrizioneAlbo;
	}



	public Date getDtDataSospensioneAde() {
		return dtDataSospensioneAde;
	}



	public void setDtDataSospensioneAde(Date dtDataSospensioneAde) {
		this.dtDataSospensioneAde = dtDataSospensioneAde;
	}



	public Short getFlAttuale() {
		return flAttuale;
	}



	public void setFlAttuale(Short flAttuale) {
		this.flAttuale = flAttuale;
	}



	public Short getFlPmiDipendenti() {
		return flPmiDipendenti;
	}



	public void setFlPmiDipendenti(Short flPmiDipendenti) {
		this.flPmiDipendenti = flPmiDipendenti;
	}



	public Short getFlPmiRaccomandazione() {
		return flPmiRaccomandazione;
	}



	public void setFlPmiRaccomandazione(Short flPmiRaccomandazione) {
		this.flPmiRaccomandazione = flPmiRaccomandazione;
	}



	public Short getFlPmiTotaleBilancio() {
		return flPmiTotaleBilancio;
	}



	public void setFlPmiTotaleBilancio(Short flPmiTotaleBilancio) {
		this.flPmiTotaleBilancio = flPmiTotaleBilancio;
	}



	public Short getFlPmiUltimoBilancio() {
		return flPmiUltimoBilancio;
	}



	public void setFlPmiUltimoBilancio(Short flPmiUltimoBilancio) {
		this.flPmiUltimoBilancio = flPmiUltimoBilancio;
	}



	public String getCdCodice() {
		return cdCodice;
	}



	public void setCdCodice(String cdCodice) {
		this.cdCodice = cdCodice;
	}



	public Long getIdComuneSede() {
		return idComuneSede;
	}



	public void setIdComuneSede(Long idComuneSede) {
		this.idComuneSede = idComuneSede;
	}



	public Long getIdComuneStabile() {
		return idComuneStabile;
	}



	public void setIdComuneStabile(Long idComuneStabile) {
		this.idComuneStabile = idComuneStabile;
	}



	public Long getIdNazioneStabile() {
		return idNazioneStabile;
	}



	public void setIdNazioneStabile(Long idNazioneStabile) {
		this.idNazioneStabile = idNazioneStabile;
	}



	public Long getIdPaese() {
		return idPaese;
	}



	public void setIdPaese(Long idPaese) {
		this.idPaese = idPaese;
	}



	public Long getIdProvinciaAlbo() {
		return idProvinciaAlbo;
	}



	public void setIdProvinciaAlbo(Long idProvinciaAlbo) {
		this.idProvinciaAlbo = idProvinciaAlbo;
	}



	public Long getIdProvinciaSede() {
		return idProvinciaSede;
	}



	public void setIdProvinciaSede(Long idProvinciaSede) {
		this.idProvinciaSede = idProvinciaSede;
	}



	public Long getIdProvinciaStabile() {
		return idProvinciaStabile;
	}



	public void setIdProvinciaStabile(Long idProvinciaStabile) {
		this.idProvinciaStabile = idProvinciaStabile;
	}



	public Long getIdRegioneAlbo() {
		return idRegioneAlbo;
	}



	public void setIdRegioneAlbo(Long idRegioneAlbo) {
		this.idRegioneAlbo = idRegioneAlbo;
	}



	public Long getIdRegioneRea() {
		return idRegioneRea;
	}



	public void setIdRegioneRea(Long idRegioneRea) {
		this.idRegioneRea = idRegioneRea;
	}



	public Long getIdRegioneSede() {
		return idRegioneSede;
	}



	public void setIdRegioneSede(Long idRegioneSede) {
		this.idRegioneSede = idRegioneSede;
	}



	public Long getIdRegioneStabile() {
		return idRegioneStabile;
	}



	public void setIdRegioneStabile(Long idRegioneStabile) {
		this.idRegioneStabile = idRegioneStabile;
	}



	public Long getIdSedia() {
		return idSedia;
	}



	public void setIdSedia(Long idSedia) {
		this.idSedia = idSedia;
	}



	public Long getIdUfficioRea() {
		return idUfficioRea;
	}



	public void setIdUfficioRea(Long idUfficioRea) {
		this.idUfficioRea = idUfficioRea;
	}



	public BigDecimal getImCapitaleSociale() {
		return imCapitaleSociale;
	}



	public void setImCapitaleSociale(BigDecimal imCapitaleSociale) {
		this.imCapitaleSociale = imCapitaleSociale;
	}



	public String getNmAlboProfessionale() {
		return nmAlboProfessionale;
	}



	public void setNmAlboProfessionale(String nmAlboProfessionale) {
		this.nmAlboProfessionale = nmAlboProfessionale;
	}



	public String getNmComuneSedeEst() {
		return nmComuneSedeEst;
	}



	public void setNmComuneSedeEst(String nmComuneSedeEst) {
		this.nmComuneSedeEst = nmComuneSedeEst;
	}



	public String getNmComuneStabileEst() {
		return nmComuneStabileEst;
	}



	public void setNmComuneStabileEst(String nmComuneStabileEst) {
		this.nmComuneStabileEst = nmComuneStabileEst;
	}



	public String getNmEmail() {
		return nmEmail;
	}



	public void setNmEmail(String nmEmail) {
		this.nmEmail = nmEmail;
	}



	public String getNmIndirizzoSede() {
		return nmIndirizzoSede;
	}



	public void setNmIndirizzoSede(String nmIndirizzoSede) {
		this.nmIndirizzoSede = nmIndirizzoSede;
	}



	public String getNmIndirizzoStabile() {
		return nmIndirizzoStabile;
	}



	public void setNmIndirizzoStabile(String nmIndirizzoStabile) {
		this.nmIndirizzoStabile = nmIndirizzoStabile;
	}



	public String getNmRagioneSociale() {
		return nmRagioneSociale;
	}



	public void setNmRagioneSociale(String nmRagioneSociale) {
		this.nmRagioneSociale = nmRagioneSociale;
	}



	public String getNmRegioneSedeEst() {
		return nmRegioneSedeEst;
	}



	public void setNmRegioneSedeEst(String nmRegioneSedeEst) {
		this.nmRegioneSedeEst = nmRegioneSedeEst;
	}



	public String getNmRiferimentoAmministrazione() {
		return nmRiferimentoAmministrazione;
	}



	public void setNmRiferimentoAmministrazione(String nmRiferimentoAmministrazione) {
		this.nmRiferimentoAmministrazione = nmRiferimentoAmministrazione;
	}



	public String getNmUtenteInserimento() {
		return nmUtenteInserimento;
	}



	public void setNmUtenteInserimento(String nmUtenteInserimento) {
		this.nmUtenteInserimento = nmUtenteInserimento;
	}



	public String getNmUtenteUltimaModifica() {
		return nmUtenteUltimaModifica;
	}



	public void setNmUtenteUltimaModifica(String nmUtenteUltimaModifica) {
		this.nmUtenteUltimaModifica = nmUtenteUltimaModifica;
	}



	public Long getNrNumGiorniCatalogDisat() {
		return nrNumGiorniCatalogDisat;
	}



	public void setNrNumGiorniCatalogDisat(Long nrNumGiorniCatalogDisat) {
		this.nrNumGiorniCatalogDisat = nrNumGiorniCatalogDisat;
	}



	public Date getTsInserimento() {
		return tsInserimento;
	}



	public void setTsInserimento(Date tsInserimento) {
		this.tsInserimento = tsInserimento;
	}



	public Date getTsUltimaModifica() {
		return tsUltimaModifica;
	}



	public void setTsUltimaModifica(Date tsUltimaModifica) {
		this.tsUltimaModifica = tsUltimaModifica;
	}



	public Long getIdDizSocioUnico() {
		return idDizSocioUnico;
	}



	public void setIdDizSocioUnico(Long idDizSocioUnico) {
		this.idDizSocioUnico = idDizSocioUnico;
	}



	public Long getIdDizStatoAdesione() {
		return idDizStatoAdesione;
	}



	public void setIdDizStatoAdesione(Long idDizStatoAdesione) {
		this.idDizStatoAdesione = idDizStatoAdesione;
	}



	public Long getIdDizStatoLiquidazione() {
		return idDizStatoLiquidazione;
	}



	public void setIdDizStatoLiquidazione(Long idDizStatoLiquidazione) {
		this.idDizStatoLiquidazione = idDizStatoLiquidazione;
	}



	public Long getIdRegimeFiscale() {
		return idRegimeFiscale;
	}



	public void setIdRegimeFiscale(Long idRegimeFiscale) {
		this.idRegimeFiscale = idRegimeFiscale;
	}



	public Long getIdAdesionePrec() {
		return idAdesionePrec;
	}



	public void setIdAdesionePrec(Long idAdesionePrec) {
		this.idAdesionePrec = idAdesionePrec;
	}

	public Short getFlVerificaFirma() {
		return flVerificaFirma;
	}



	public void setFlVerificaFirma(Short flVerificaFirma) {
		this.flVerificaFirma = flVerificaFirma;
	}



	@Override
	public String getPKDescription() {
		return this.idAdesione.toString();
	}



	@Override
	public String getTableName() {
		return TABLE_NAME;
	}



	


	
	

}