package it.pccube.batchmigration.source.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FeVerifFirmaLotto implements ModelEntity {

	public static final String TABLE_NAME = "FE_VERIF_FIRMA_LOTTO";
	
	private Short checkHashDocumento;

	private Long idDizRispostaWsFirma;

	private Long idVerifFirmaLotto;

	private Long idLotto;

	private Long idDizRispostaCodFiscale;

	private Date dataVerifica;

	private Date tmstInserimento;

	private Date tmstUltimoAggiornamento;

	private String useridInserimento;

	private String useridUltimoAggiornamento;
	
	private Long versioneLotto;
	
	private byte[] pdfEsito;

	public Short getCheckHashDocumento() {
		return checkHashDocumento;
	}

	public void setCheckHashDocumento(Short checkHashDocumento) {
		this.checkHashDocumento = checkHashDocumento;
	}

	public Long getIdDizRispostaWsFirma() {
		return idDizRispostaWsFirma;
	}

	public void setIdDizRispostaWsFirma(Long idDizRispostaWsFirma) {
		this.idDizRispostaWsFirma = idDizRispostaWsFirma;
	}

	public Long getIdVerifFirmaLotto() {
		return idVerifFirmaLotto;
	}

	public void setIdVerifFirmaLotto(Long idVerifFirmaLotto) {
		this.idVerifFirmaLotto = idVerifFirmaLotto;
	}

	public Long getIdLotto() {
		return idLotto;
	}

	public void setIdLotto(Long idLotto) {
		this.idLotto = idLotto;
	}

	public Long getIdDizRispostaCodFiscale() {
		return idDizRispostaCodFiscale;
	}

	public void setIdDizRispostaCodFiscale(Long idDizRispostaCodFiscale) {
		this.idDizRispostaCodFiscale = idDizRispostaCodFiscale;
	}

	public Date getDataVerifica() {
		return dataVerifica;
	}

	public void setDataVerifica(Date dataVerifica) {
		this.dataVerifica = dataVerifica;
	}

	public Date getTmstInserimento() {
		return tmstInserimento;
	}

	public void setTmstInserimento(Date tmstInserimento) {
		this.tmstInserimento = tmstInserimento;
	}

	public Date getTmstUltimoAggiornamento() {
		return tmstUltimoAggiornamento;
	}

	public void setTmstUltimoAggiornamento(Date tmstUltimoAggiornamento) {
		this.tmstUltimoAggiornamento = tmstUltimoAggiornamento;
	}

	public String getUseridInserimento() {
		return useridInserimento;
	}

	public void setUseridInserimento(String useridInserimento) {
		this.useridInserimento = useridInserimento;
	}

	public String getUseridUltimoAggiornamento() {
		return useridUltimoAggiornamento;
	}

	public void setUseridUltimoAggiornamento(String useridUltimoAggiornamento) {
		this.useridUltimoAggiornamento = useridUltimoAggiornamento;
	}

	public Long getVersioneLotto() {
		return versioneLotto;
	}

	public void setVersioneLotto(Long versioneLotto) {
		this.versioneLotto = versioneLotto;
	}

	public byte[] getPdfEsito() {
		return pdfEsito;
	}

	public void setPdfEsito(byte[] pdfEsito) {
		this.pdfEsito = pdfEsito;
	}

	@Override
	public String getPKDescription() {
		return this.idVerifFirmaLotto.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	
	
	
	

}