package it.pccube.batchmigration.destination.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FatAStatoEsitoFtp implements ModelEntity {

	
	public static final String TABLE_NAME = "FAT_A_STATO_ESITO_FTP";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_A_STATO_ESITO_FTP ( DT_DATA_FINE, DT_DATA_INIZIO, FL_ATTUALE, FL_ERRORE_CONTROLLI_FILE, ID_DIZ_STATO_ESITO_FTP, ID_ESITO_FTP, ID_STATO_ESITO_FTP, ID_STATO_ESITO_FTP_PREC, NM_LOG_ERRORE_CONTROLLI_FILE, NM_UTENTE_INSERIMENTO, NM_UTENTE_ULTIMA_MODIFICA, TS_INSERIMENTO, TS_ULTIMA_MODIFICA ) VALUES ( :dtDataFine, :dtDataInizio, :flAttuale, :flErroreControlliFile, :idDizStatoEsitoFtp, :idEsitoFtp, :idStatoEsitoFtp, :idStatoEsitoFtpPrec, :nmLogErroreControlliFile, :nmUtenteInserimento, :nmUtenteUltimaModifica, :tsInserimento, :tsUltimaModifica )";


	private Long idStatoEsitoFtp;

	private Date dtDataFine;

	private Date dtDataInizio;

	private Short flAttuale;

	private Short flErroreControlliFile;

	private String nmLogErroreControlliFile;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idEsitoFtp;

	private Long idDizStatoEsitoFtp;

	private Long idStatoEsitoFtpPrec;
	
	
	public Long getIdStatoEsitoFtp() {
		return idStatoEsitoFtp;
	}

	public void setIdStatoEsitoFtp(Long idStatoEsitoFtp) {
		this.idStatoEsitoFtp = idStatoEsitoFtp;
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

	public Long getIdEsitoFtp() {
		return idEsitoFtp;
	}

	public void setIdEsitoFtp(Long idEsitoFtp) {
		this.idEsitoFtp = idEsitoFtp;
	}

	public Long getIdDizStatoEsitoFtp() {
		return idDizStatoEsitoFtp;
	}

	public void setIdDizStatoEsitoFtp(Long idDizStatoEsitoFtp) {
		this.idDizStatoEsitoFtp = idDizStatoEsitoFtp;
	}

	public Long getIdStatoEsitoFtpPrec() {
		return idStatoEsitoFtpPrec;
	}

	public void setIdStatoEsitoFtpPrec(Long idStatoEsitoFtpPrec) {
		this.idStatoEsitoFtpPrec = idStatoEsitoFtpPrec;
	}

	@Override
	public String getPKDescription() {
		return this.idStatoEsitoFtp.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	
	
	

}