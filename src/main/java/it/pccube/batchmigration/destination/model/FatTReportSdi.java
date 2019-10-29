package it.pccube.batchmigration.destination.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FatTReportSdi implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_T_REPORT_SDI";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_REPORT_SDI ( CD_CF_PIVA_UTENTE, CD_TIPO, DT_DATA_ORA_PRELIEVO, ID_FILE_REPORT, ID_REPORT, NM_IDENTIFICATIVO_NODO, NM_NOME_FILE, NM_UTENTE_INSERIMENTO, NM_UTENTE_ULTIMA_MODIFICA, TS_INSERIMENTO, TS_ULTIMA_MODIFICA ) VALUES ( :cdCfPivaUtente, :cdTipo, :dtDataOraPrelievo, :idFileReport, :idReport, :nmIdentificativoNodo, :nmNomeFile, :nmUtenteInserimento, :nmUtenteUltimaModifica, :tsInserimento, :tsUltimaModifica )";
	
	
	private Long idReport;

	private String cdCfPivaUtente;

	private String cdTipo;

	private Date dtDataOraPrelievo;

	private String idFileReport;

	private String nmIdentificativoNodo;

	private String nmNomeFile;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	public Long getIdReport() {
		return idReport;
	}

	public void setIdReport(Long idReport) {
		this.idReport = idReport;
	}

	public String getCdCfPivaUtente() {
		return cdCfPivaUtente;
	}

	public void setCdCfPivaUtente(String cdCfPivaUtente) {
		this.cdCfPivaUtente = cdCfPivaUtente;
	}

	public String getCdTipo() {
		return cdTipo;
	}

	public void setCdTipo(String cdTipo) {
		this.cdTipo = cdTipo;
	}

	public Date getDtDataOraPrelievo() {
		return dtDataOraPrelievo;
	}

	public void setDtDataOraPrelievo(Date dtDataOraPrelievo) {
		this.dtDataOraPrelievo = dtDataOraPrelievo;
	}

	public String getIdFileReport() {
		return idFileReport;
	}

	public void setIdFileReport(String idFileReport) {
		this.idFileReport = idFileReport;
	}

	public String getNmIdentificativoNodo() {
		return nmIdentificativoNodo;
	}

	public void setNmIdentificativoNodo(String nmIdentificativoNodo) {
		this.nmIdentificativoNodo = nmIdentificativoNodo;
	}

	public String getNmNomeFile() {
		return nmNomeFile;
	}

	public void setNmNomeFile(String nmNomeFile) {
		this.nmNomeFile = nmNomeFile;
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

	@Override
	public String getPKDescription() {
		return this.idReport.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	
	
}