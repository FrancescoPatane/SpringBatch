package it.pccube.batchmigration.source.model;


import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;

public class FeVerifFirmaNotifica implements ModelEntity {

	public static final String TABLE_NAME = "FE_VERIF_FIRMA_NOTIFICA";


	private Long idVerifFirmaNotifica;

	private Long idNotifica;

	private Date dataVerifica;

	private Long idDizRispostaWsFirma;

	private Long idDizRispostaCodFiscale;

	private Short checkHashDocumento;

	private String useridInserimento;

	private Date tmstInserimento;

	private String useridUltimoAggiornamento;

	private Date tmstUltimoAggiornamento;

	public Long getIdVerifFirmaNotifica() {
		return idVerifFirmaNotifica;
	}

	public void setIdVerifFirmaNotifica(Long idVerifFirmaNotifica) {
		this.idVerifFirmaNotifica = idVerifFirmaNotifica;
	}

	public Long getIdNotifica() {
		return idNotifica;
	}

	public void setIdNotifica(Long idNotifica) {
		this.idNotifica = idNotifica;
	}

	public Date getDataVerifica() {
		return dataVerifica;
	}

	public void setDataVerifica(Date dataVerifica) {
		this.dataVerifica = dataVerifica;
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
		return this.idVerifFirmaNotifica.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	
	
}
