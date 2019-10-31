package it.pccube.batchmigration.source.model;

import java.io.Serializable;
import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FeVerifFirmaServiceLotto implements ModelEntity {
	
	public static final String TABLE_NAME = "FE_VERIF_FIRMA_SERVICE_LOTTO";


	private Long idVerifFirmaServiceLotto;

	private String issuerDn;

	private String subjectDn;

	private String certSerialNumber;

	private Long certStatus;

	private Long certStatusCode;

	private String certStatusInfo;

	private Long certLevel;

	private Date certStartDate;

	private Date certEndDate;

	private String crlNumber;

	private Date crlEmissionDate;

	private FeVerifFirmaLotto feVerifFirmaLotto;

	private String useridInserimento;

	private Date tmstInserimento;

	private String useridUltimoAggiornamento;

	private Date tmstUltimoAggiornamento;

	private Long tipologiaFirma;

	public Long getIdVerifFirmaServiceLotto() {
		return idVerifFirmaServiceLotto;
	}

	public void setIdVerifFirmaServiceLotto(Long idVerifFirmaServiceLotto) {
		this.idVerifFirmaServiceLotto = idVerifFirmaServiceLotto;
	}

	public String getIssuerDn() {
		return issuerDn;
	}

	public void setIssuerDn(String issuerDn) {
		this.issuerDn = issuerDn;
	}

	public String getSubjectDn() {
		return subjectDn;
	}

	public void setSubjectDn(String subjectDn) {
		this.subjectDn = subjectDn;
	}

	public String getCertSerialNumber() {
		return certSerialNumber;
	}

	public void setCertSerialNumber(String certSerialNumber) {
		this.certSerialNumber = certSerialNumber;
	}

	public Long getCertStatus() {
		return certStatus;
	}

	public void setCertStatus(Long certStatus) {
		this.certStatus = certStatus;
	}

	public Long getCertStatusCode() {
		return certStatusCode;
	}

	public void setCertStatusCode(Long certStatusCode) {
		this.certStatusCode = certStatusCode;
	}

	public String getCertStatusInfo() {
		return certStatusInfo;
	}

	public void setCertStatusInfo(String certStatusInfo) {
		this.certStatusInfo = certStatusInfo;
	}

	public Long getCertLevel() {
		return certLevel;
	}

	public void setCertLevel(Long certLevel) {
		this.certLevel = certLevel;
	}

	public Date getCertStartDate() {
		return certStartDate;
	}

	public void setCertStartDate(Date certStartDate) {
		this.certStartDate = certStartDate;
	}

	public Date getCertEndDate() {
		return certEndDate;
	}

	public void setCertEndDate(Date certEndDate) {
		this.certEndDate = certEndDate;
	}

	public String getCrlNumber() {
		return crlNumber;
	}

	public void setCrlNumber(String crlNumber) {
		this.crlNumber = crlNumber;
	}

	public Date getCrlEmissionDate() {
		return crlEmissionDate;
	}

	public void setCrlEmissionDate(Date crlEmissionDate) {
		this.crlEmissionDate = crlEmissionDate;
	}

	public FeVerifFirmaLotto getFeVerifFirmaLotto() {
		return feVerifFirmaLotto;
	}

	public void setFeVerifFirmaLotto(FeVerifFirmaLotto feVerifFirmaLotto) {
		this.feVerifFirmaLotto = feVerifFirmaLotto;
	}

	public String getUseridInserimento() {
		return useridInserimento;
	}

	public void setUseridInserimento(String useridInserimento) {
		this.useridInserimento = useridInserimento;
	}

	public Date getTmstInserimento() {
		return tmstInserimento;
	}

	public void setTmstInserimento(Date tmstInserimento) {
		this.tmstInserimento = tmstInserimento;
	}

	public String getUseridUltimoAggiornamento() {
		return useridUltimoAggiornamento;
	}

	public void setUseridUltimoAggiornamento(String useridUltimoAggiornamento) {
		this.useridUltimoAggiornamento = useridUltimoAggiornamento;
	}

	public Date getTmstUltimoAggiornamento() {
		return tmstUltimoAggiornamento;
	}

	public void setTmstUltimoAggiornamento(Date tmstUltimoAggiornamento) {
		this.tmstUltimoAggiornamento = tmstUltimoAggiornamento;
	}

	public Long getTipologiaFirma() {
		return tipologiaFirma;
	}

	public void setTipologiaFirma(Long tipologiaFirma) {
		this.tipologiaFirma = tipologiaFirma;
	}

	@Override
	public String getPKDescription() {
		return this.idVerifFirmaServiceLotto.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	


}