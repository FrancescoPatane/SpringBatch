package it.pccube.batchmigration.destination.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FatTIpa implements ModelEntity {

	public static final String TABLE_NAME = "FAT_T_IPA";
	
	public static final String INSERT_QUERY ="INSERT INTO FAT_T_IPA (CD_CAP,CD_CODICE_FISCALE_FE,CD_CODICE_IPA,DT_DATA_AVVIO_FE,DT_DATA_VERIFICA_CF_FE,FL_UFFICIO_CENTRALE_FE,ID_DIZ_TIPO_ELEMENTO_IPA,ID_IPA,ID_IPA_PADRE,NM_COMUNE,NM_INDIRIZZO,NM_PROVINCIA,NM_REGIONE,NM_UTENTE_INSERIMENTO,NM_UTENTE_ULTIMA_MODIFICA,TS_INSERIMENTO,TS_ULTIMA_MODIFICA,TX_DESCRIZIONE,TX_DESCRIZIONE_COMPLETA) VALUES (:cdCap,:cdCodiceFiscaleFe,:cdCodiceIpa,:dtDataAvvioFe,:dtDataVerificaCfFe,:flUfficioCentraleFe,:idDizTipoElementoIpa,:idIpa,:idIpaPadre,:nmComune,:nmIndirizzo,:nmProvincia,:nmRegione,:nmUtenteInserimento,:nmUtenteUltimaModifica,:tsInserimento,:tsUltimaModifica,:txDescrizione,:txDescrizioneCompleta)";

	private Long idIpa;

	private String cdCap;

	private String cdCodiceFiscaleFe;

	private String cdCodiceIpa;

	private Date dtDataAvvioFe;

	private Date dtDataVerificaCfFe;

	private Short flUfficioCentraleFe;

	private String nmComune;

	private String nmIndirizzo;

	private String nmProvincia;

	private String nmRegione;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private String txDescrizione;

	private String txDescrizioneCompleta;

	private Long idDizTipoElementoIpa;

	private Long idIpaPadre;

	public Long getIdIpa() {
		return idIpa;
	}

	public void setIdIpa(Long idIpa) {
		this.idIpa = idIpa;
	}

	public String getCdCap() {
		return cdCap;
	}

	public void setCdCap(String cdCap) {
		this.cdCap = cdCap;
	}

	public String getCdCodiceFiscaleFe() {
		return cdCodiceFiscaleFe;
	}

	public void setCdCodiceFiscaleFe(String cdCodiceFiscaleFe) {
		this.cdCodiceFiscaleFe = cdCodiceFiscaleFe;
	}

	public String getCdCodiceIpa() {
		return cdCodiceIpa;
	}

	public void setCdCodiceIpa(String cdCodiceIpa) {
		this.cdCodiceIpa = cdCodiceIpa;
	}

	public Date getDtDataAvvioFe() {
		return dtDataAvvioFe;
	}

	public void setDtDataAvvioFe(Date dtDataAvvioFe) {
		this.dtDataAvvioFe = dtDataAvvioFe;
	}

	public Date getDtDataVerificaCfFe() {
		return dtDataVerificaCfFe;
	}

	public void setDtDataVerificaCfFe(Date dtDataVerificaCfFe) {
		this.dtDataVerificaCfFe = dtDataVerificaCfFe;
	}

	public Short getFlUfficioCentraleFe() {
		return flUfficioCentraleFe;
	}

	public void setFlUfficioCentraleFe(Short flUfficioCentraleFe) {
		this.flUfficioCentraleFe = flUfficioCentraleFe;
	}

	public String getNmComune() {
		return nmComune;
	}

	public void setNmComune(String nmComune) {
		this.nmComune = nmComune;
	}

	public String getNmIndirizzo() {
		return nmIndirizzo;
	}

	public void setNmIndirizzo(String nmIndirizzo) {
		this.nmIndirizzo = nmIndirizzo;
	}

	public String getNmProvincia() {
		return nmProvincia;
	}

	public void setNmProvincia(String nmProvincia) {
		this.nmProvincia = nmProvincia;
	}

	public String getNmRegione() {
		return nmRegione;
	}

	public void setNmRegione(String nmRegione) {
		this.nmRegione = nmRegione;
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

	public String getTxDescrizione() {
		return txDescrizione;
	}

	public void setTxDescrizione(String txDescrizione) {
		this.txDescrizione = txDescrizione;
	}

	public String getTxDescrizioneCompleta() {
		return txDescrizioneCompleta;
	}

	public void setTxDescrizioneCompleta(String txDescrizioneCompleta) {
		this.txDescrizioneCompleta = txDescrizioneCompleta;
	}

	public Long getIdDizTipoElementoIpa() {
		return idDizTipoElementoIpa;
	}

	public void setIdDizTipoElementoIpa(Long idDizTipoElementoIpa) {
		this.idDizTipoElementoIpa = idDizTipoElementoIpa;
	}

	public Long getIdIpaPadre() {
		return idIpaPadre;
	}

	public void setIdIpaPadre(Long idIpaPadre) {
		this.idIpaPadre = idIpaPadre;
	}

	@Override
	public String getPKDescription() {
		return this.idIpa.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	

}