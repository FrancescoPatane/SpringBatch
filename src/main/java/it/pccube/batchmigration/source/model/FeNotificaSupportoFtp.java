package it.pccube.batchmigration.source.model;



import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FeNotificaSupportoFtp implements ModelEntity {
	
	public static final String TABLE_NAME = "FE_NOTIFICA_SUPPORTO_FTP";


	private Long idNotificaSupportoFtp;
	
	private Long idNotifica;
	
	private Long idSupportoFtp;
	
	private Long tipoNotifica;
	
	private Short flagLavorato;
	
	private String nomeFileNotifica;
	
	private String useridInserimento;
	
	private Date tmstInserimento;
	
	private String useridUltimoAggiornamento;
	
	private Date tmstUltimoAggiornamento;
	
	private byte[] fileNotifica;

	public Long getIdNotificaSupportoFtp() {
		return idNotificaSupportoFtp;
	}

	public void setIdNotificaSupportoFtp(Long idNotificaSupportoFtp) {
		this.idNotificaSupportoFtp = idNotificaSupportoFtp;
	}

	public Long getIdNotifica() {
		return idNotifica;
	}

	public void setIdNotifica(Long idNotifica) {
		this.idNotifica = idNotifica;
	}

	public Long getIdSupportoFtp() {
		return idSupportoFtp;
	}

	public void setIdSupportoFtp(Long idSupportoFtp) {
		this.idSupportoFtp = idSupportoFtp;
	}

	public Long getTipoNotifica() {
		return tipoNotifica;
	}

	public void setTipoNotifica(Long tipoNotifica) {
		this.tipoNotifica = tipoNotifica;
	}

	public Short getFlagLavorato() {
		return flagLavorato;
	}

	public void setFlagLavorato(Short flagLavorato) {
		this.flagLavorato = flagLavorato;
	}

	public String getNomeFileNotifica() {
		return nomeFileNotifica;
	}

	public void setNomeFileNotifica(String nomeFileNotifica) {
		this.nomeFileNotifica = nomeFileNotifica;
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

	public byte[] getFileNotifica() {
		return fileNotifica;
	}

	public void setFileNotifica(byte[] fileNotifica) {
		this.fileNotifica = fileNotifica;
	}

	@Override
	public String getPKDescription() {
		return this.idNotificaSupportoFtp.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	
	
	
	
}