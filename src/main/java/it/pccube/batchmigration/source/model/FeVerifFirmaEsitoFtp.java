package it.pccube.batchmigration.source.model;


import it.pccube.batchmigration.model.ModelEntity;

import java.util.Date;


public class FeVerifFirmaEsitoFtp implements ModelEntity {

	public static final String TABLE_NAME = "FE_VERIF_FIRMA_ESITO_FTP";
	
	

	private Long idVerifFirmaEsitoFtp;
	
	private Long idEsitoFtp;
	
	private Long idDizRispostaWsFirma;
	
	private Long idDizRispostaCodFiscale;
	
	private Date dataVerifica;
	
	private Short checkHashDocumento;
	
	private String useridInserimento;
	
	private Date tmstInserimento;
	
	private String useridUltimoAggiornamento;
	
	private Date tmstUltimoAggiornamento;
	
	
	


	public Long getIdVerifFirmaEsitoFtp() {
		return idVerifFirmaEsitoFtp;
	}


	public void setIdVerifFirmaEsitoFtp(Long idVerifFirmaEsitoFtp) {
		this.idVerifFirmaEsitoFtp = idVerifFirmaEsitoFtp;
	}


	public Long getIdEsitoFtp() {
		return idEsitoFtp;
	}


	public void setIdEsitoFtp(Long idEsitoFtp) {
		this.idEsitoFtp = idEsitoFtp;
	}


	public Long getIdDizRispostaWsFirma() {
		return idDizRispostaWsFirma;
	}


	public void setIdDizRispostaWsFirma(Long idDizRispostaWsFirma) {
		this.idDizRispostaWsFirma = idDizRispostaWsFirma;
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


	public Short getCheckHashDocumento() {
		return checkHashDocumento;
	}


	public void setCheckHashDocumento(Short checkHashDocumento) {
		this.checkHashDocumento = checkHashDocumento;
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


	@Override
	public String getPKDescription() {
		return this.idVerifFirmaEsitoFtp.toString();
	}


	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	
}