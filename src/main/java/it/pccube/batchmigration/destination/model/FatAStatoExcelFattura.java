package it.pccube.batchmigration.destination.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FatAStatoExcelFattura implements ModelEntity {

	
	public static final String TABLE_NAME = "FAT_A_STATO_EXCEL_FATTURA";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_A_STATO_EXCEL_FATTURA ( DT_DATA_FINE, DT_DATA_INIZIO, FL_ATTUALE, ID_DIZ_STATO_EXCEL_FATTURA, ID_EXCEL_FATTURA, ID_STATO_EXCEL_FATTURA, ID_STATO_EXCEL_FATTURA_PREC, NM_UTENTE_INSERIMENTO, NM_UTENTE_ULTIMA_MODIFICA, TS_INSERIMENTO, TS_ULTIMA_MODIFICA ) VALUES ( :dtDataFine, :dtDataInizio, :flAttuale, :idDizStatoExcelFattura, :idExcelFattura, :idStatoExcelFattura, :iDstatoExcelFatturaPrec, :nmUtenteInserimento, :nmUtenteUltimaModifica, :tsInserimento, :tsUltimaModifica )";

	private Long idStatoExcelFattura;

	private Date dtDataFine;

	private Date dtDataInizio;

	private Short flAttuale;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idExcelFattura;

	private Long idDizStatoExcelFattura;

	private Long iDstatoExcelFatturaPrec;

	public Long getIdStatoExcelFattura() {
		return idStatoExcelFattura;
	}

	public void setIdStatoExcelFattura(Long idStatoExcelFattura) {
		this.idStatoExcelFattura = idStatoExcelFattura;
	}

	public Date getDtDataFine() {
		return dtDataFine;
	}

	public void setDtDataFine(Date dtDataFine) {
		this.dtDataFine = dtDataFine;
	}

	public Date getDtDataInizio() {
		return dtDataInizio;
	}

	public void setDtDataInizio(Date dtDataInizio) {
		this.dtDataInizio = dtDataInizio;
	}

	public Short getFlAttuale() {
		return flAttuale;
	}

	public void setFlAttuale(Short flAttuale) {
		this.flAttuale = flAttuale;
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

	public Long getIdExcelFattura() {
		return idExcelFattura;
	}

	public void setIdExcelFattura(Long idExcelFattura) {
		this.idExcelFattura = idExcelFattura;
	}

	public Long getIdDizStatoExcelFattura() {
		return idDizStatoExcelFattura;
	}

	public void setIdDizStatoExcelFattura(Long idDizStatoExcelFattura) {
		this.idDizStatoExcelFattura = idDizStatoExcelFattura;
	}

	public Long getiDstatoExcelFatturaPrec() {
		return iDstatoExcelFatturaPrec;
	}

	public void setiDstatoExcelFatturaPrec(Long iDstatoExcelFatturaPrec) {
		this.iDstatoExcelFatturaPrec = iDstatoExcelFatturaPrec;
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