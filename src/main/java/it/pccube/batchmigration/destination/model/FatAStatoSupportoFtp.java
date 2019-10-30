package it.pccube.batchmigration.destination.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FatAStatoSupportoFtp implements ModelEntity {

	
	public static final String TABLE_NAME = "FAT_A_STATO_SUPPORTO_FTP";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_A_STATO_SUPPORTO_FTP ( DT_DATA_FINE, DT_DATA_INIZIO, FL_ATTUALE, FL_ERRORE_CONTROLLI_FILE, ID_DIZ_STATO_SUPPORTO_FTP, ID_STATO_SUPPORTO_FTP, ID_STATO_SUPPORTO_FTP_PREC, ID_SUPPORTO_FTP, NM_LOG_ERRORE_CONTROLLI_FILE, NM_UTENTE_INSERIMENTO, NM_UTENTE_ULTIMA_MODIFICA, TS_INSERIMENTO, TS_ULTIMA_MODIFICA ) VALUES ( :dtDataFine, :dtDataInizio, :flAttuale, :flErroreControlliFile, :idDizStatoSupportoFtp, :idStatoSupportoFtp, :idStatoSupportoFtpPrec, :idSupportoFtp, :nmLogErroreControlliFile, :nmUtenteInserimento, :nmUtenteUltimaModifica, :tsInserimento, :tsUltimaModifica )";
	
	
	
	private Long idStatoSupportoFtp;

	private Date dtDataFine;

	private Date dtDataInizio;

	private Short flAttuale;

	private Short flErroreControlliFile;

	private String nmLogErroreControlliFile;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idStatoSupportoFtpPrec;

	private Long idSupportoFtp;

	private Long idDizStatoSupportoFtp;

	public Long getIdStatoSupportoFtp() {
		return idStatoSupportoFtp;
	}

	public void setIdStatoSupportoFtp(Long idStatoSupportoFtp) {
		this.idStatoSupportoFtp = idStatoSupportoFtp;
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

	public Short getFlErroreControlliFile() {
		return flErroreControlliFile;
	}

	public void setFlErroreControlliFile(Short flErroreControlliFile) {
		this.flErroreControlliFile = flErroreControlliFile;
	}

	public String getNmLogErroreControlliFile() {
		return nmLogErroreControlliFile;
	}

	public void setNmLogErroreControlliFile(String nmLogErroreControlliFile) {
		this.nmLogErroreControlliFile = nmLogErroreControlliFile;
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

	public Long getIdStatoSupportoFtpPrec() {
		return idStatoSupportoFtpPrec;
	}

	public void setIdStatoSupportoFtpPrec(Long idStatoSupportoFtpPrec) {
		this.idStatoSupportoFtpPrec = idStatoSupportoFtpPrec;
	}

	public Long getIdSupportoFtp() {
		return idSupportoFtp;
	}

	public void setIdSupportoFtp(Long idSupportoFtp) {
		this.idSupportoFtp = idSupportoFtp;
	}

	public Long getIdDizStatoSupportoFtp() {
		return idDizStatoSupportoFtp;
	}

	public void setIdDizStatoSupportoFtp(Long idDizStatoSupportoFtp) {
		this.idDizStatoSupportoFtp = idDizStatoSupportoFtp;
	}

	@Override
	public String getPKDescription() {
		return this.getIdStatoSupportoFtp().toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	

}