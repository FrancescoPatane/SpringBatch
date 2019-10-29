package it.pccube.batchmigration.source.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;

public class FeReportSdi implements ModelEntity {
	
	public static final String TABLE_NAME = "FE_REPORT_SDI";
	
	private String cfPivaUtente;
	private Date dataOraPrelievo;
	private byte[] fileReport;
	private String identificativoNodo;
	private Long idReport;
	private String nomeFile;
	private String tipo;
	private Date tmstInserimento;
	private Date tmstUltimoAggiornamento;
	private String useridInserimento;
	private String useridUltimoAggiornamento;
	public String getCfPivaUtente() {
		return cfPivaUtente;
	}
	public void setCfPivaUtente(String cfPivaUtente) {
		this.cfPivaUtente = cfPivaUtente;
	}
	public Date getDataOraPrelievo() {
		return dataOraPrelievo;
	}
	public void setDataOraPrelievo(Date dataOraPrelievo) {
		this.dataOraPrelievo = dataOraPrelievo;
	}
	public byte[] getFileReport() {
		return fileReport;
	}
	public void setFileReport(byte[] fileReport) {
		this.fileReport = fileReport;
	}
	public String getIdentificativoNodo() {
		return identificativoNodo;
	}
	public void setIdentificativoNodo(String identificativoNodo) {
		this.identificativoNodo = identificativoNodo;
	}
	public Long getIdReport() {
		return idReport;
	}
	public void setIdReport(Long idReport) {
		this.idReport = idReport;
	}
	public String getNomeFile() {
		return nomeFile;
	}
	public void setNomeFile(String nomeFile) {
		this.nomeFile = nomeFile;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
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
	@Override
	public String getPKDescription() {
		return this.idReport.toString();
	}
	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	
	

}
