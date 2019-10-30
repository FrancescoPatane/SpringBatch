package it.pccube.batchmigration.source.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;

public class FeStatoExcelFattura implements ModelEntity {
	
	public static final String TABLE_NAME = "FE_STATO_EXCEL_FATTURA";

	private Long idStatoExcelFattura;

	private Long idExcelFattura;

	private Long stato;

	private Date dataInizio;

	private Date dataFine;
	
	private Short flagAttuale;
	
	private Long idStatoExcelFatturaPrec;
	
	private Date tmstInserimento;
	
	private Date tmstUltimoAggiornamento;
	
	private String useridInserimento;
	
	private String useridUltimoAggiornamento;

	public Long getIdStatoExcelFattura() {
		return idStatoExcelFattura;
	}

	public void setIdStatoExcelFattura(Long idStatoExcelFattura) {
		this.idStatoExcelFattura = idStatoExcelFattura;
	}

	public Long getIdExcelFattura() {
		return idExcelFattura;
	}

	public void setIdExcelFattura(Long idExcelFattura) {
		this.idExcelFattura = idExcelFattura;
	}

	public Long getStato() {
		return stato;
	}

	public void setStato(Long stato) {
		this.stato = stato;
	}

	public Date getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}

	public Date getDataFine() {
		return dataFine;
	}

	public void setDataFine(Date dataFine) {
		this.dataFine = dataFine;
	}

	public Short getFlagAttuale() {
		return flagAttuale;
	}

	public void setFlagAttuale(Short flagAttuale) {
		this.flagAttuale = flagAttuale;
	}

	public Long getIdStatoExcelFatturaPrec() {
		return idStatoExcelFatturaPrec;
	}

	public void setIdStatoExcelFatturaPrec(Long idStatoExcelFatturaPrec) {
		this.idStatoExcelFatturaPrec = idStatoExcelFatturaPrec;
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
		return this.idStatoExcelFattura.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	

}
