package it.pccube.batchmigration.destination.model;

import java.math.BigDecimal;
import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FatTVerifFirmServNotif implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_T_VERIF_FIRM_SERV_NOTIF";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_VERIF_FIRM_SERV_NOTIF ( CD_CERT_SERIAL_NUMBER, CD_CERT_STATUS, CD_CERT_STATUS_CODE, CD_CRL_NUMBER, DS_CERT_STATUS_INFO, DT_CERT_END_DATE, DT_CERT_START_DATE, DT_CRL_EMISSION_DATE, ID_DIZ_TIPOLOGIA_FIRMA, ID_VERIF_FIRMA_NOTIFICA, ID_VERIF_FIRMA_SERVICE_NOTIF, NM_ISSUER_DN, NM_SUBJECT_DN, NM_UTENTE_INSERIMENTO, NM_UTENTE_ULTIMA_MODIFICA, NR_CERT_LEVEL, TS_INSERIMENTO, TS_ULTIMA_MODIFICA ) VALUES ( :cdCertSerialNumber, :cdCertStatus, :cdCertStatusCode, :cdCrlNumber, :dsCertStatusInfo, :dtCertEndDate, :dtCertStartDate, :dtCrlEmissionDate, :idDizTipologiaFirma, :idVerifFirmaNotifica, :idVerifFirmaServiceNotif, :nmIssuerDn, :nmSubjectDn, :nmUtenteInserimento, :nmUtenteUltimaModifica, :nrCertLevel, :tsInserimento, :tsUltimaModifica )";

	private Long idVerifFirmaServiceNotif;

	private String cdCertSerialNumber;

	private String cdCertStatus;

	private String cdCertStatusCode;

	private String cdCrlNumber;

	private String dsCertStatusInfo;

	private Date dtCertEndDate;

	private Date dtCertStartDate;

	private Date dtCrlEmissionDate;

	private String nmIssuerDn;

	private String nmSubjectDn;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private BigDecimal nrCertLevel;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idVerifFirmaNotifica;

	private Long idDizTipologiaFirma;

	public Long getIdVerifFirmaServiceNotif() {
		return idVerifFirmaServiceNotif;
	}

	public void setIdVerifFirmaServiceNotif(Long idVerifFirmaServiceNotif) {
		this.idVerifFirmaServiceNotif = idVerifFirmaServiceNotif;
	}

	public String getCdCertSerialNumber() {
		return cdCertSerialNumber;
	}

	public void setCdCertSerialNumber(String cdCertSerialNumber) {
		this.cdCertSerialNumber = cdCertSerialNumber;
	}

	public String getCdCertStatus() {
		return cdCertStatus;
	}

	public void setCdCertStatus(String cdCertStatus) {
		this.cdCertStatus = cdCertStatus;
	}

	public String getCdCertStatusCode() {
		return cdCertStatusCode;
	}

	public void setCdCertStatusCode(String cdCertStatusCode) {
		this.cdCertStatusCode = cdCertStatusCode;
	}

	public String getCdCrlNumber() {
		return cdCrlNumber;
	}

	public void setCdCrlNumber(String cdCrlNumber) {
		this.cdCrlNumber = cdCrlNumber;
	}

	public String getDsCertStatusInfo() {
		return dsCertStatusInfo;
	}

	public void setDsCertStatusInfo(String dsCertStatusInfo) {
		this.dsCertStatusInfo = dsCertStatusInfo;
	}

	public Date getDtCertEndDate() {
		return dtCertEndDate;
	}

	public void setDtCertEndDate(Date dtCertEndDate) {
		this.dtCertEndDate = dtCertEndDate;
	}

	public Date getDtCertStartDate() {
		return dtCertStartDate;
	}

	public void setDtCertStartDate(Date dtCertStartDate) {
		this.dtCertStartDate = dtCertStartDate;
	}

	public Date getDtCrlEmissionDate() {
		return dtCrlEmissionDate;
	}

	public void setDtCrlEmissionDate(Date dtCrlEmissionDate) {
		this.dtCrlEmissionDate = dtCrlEmissionDate;
	}

	public String getNmIssuerDn() {
		return nmIssuerDn;
	}

	public void setNmIssuerDn(String nmIssuerDn) {
		this.nmIssuerDn = nmIssuerDn;
	}

	public String getNmSubjectDn() {
		return nmSubjectDn;
	}

	public void setNmSubjectDn(String nmSubjectDn) {
		this.nmSubjectDn = nmSubjectDn;
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

	public BigDecimal getNrCertLevel() {
		return nrCertLevel;
	}

	public void setNrCertLevel(BigDecimal nrCertLevel) {
		this.nrCertLevel = nrCertLevel;
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

	public Long getIdVerifFirmaNotifica() {
		return idVerifFirmaNotifica;
	}

	public void setIdVerifFirmaNotifica(Long idVerifFirmaNotifica) {
		this.idVerifFirmaNotifica = idVerifFirmaNotifica;
	}

	public Long getIdDizTipologiaFirma() {
		return idDizTipologiaFirma;
	}

	public void setIdDizTipologiaFirma(Long idDizTipologiaFirma) {
		this.idDizTipologiaFirma = idDizTipologiaFirma;
	}

	@Override
	public String getPKDescription() {
		return this.idVerifFirmaServiceNotif.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	

}