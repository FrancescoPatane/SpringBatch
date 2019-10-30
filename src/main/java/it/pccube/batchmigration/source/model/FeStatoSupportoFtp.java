package it.pccube.batchmigration.source.model;


import it.pccube.batchmigration.model.ModelEntity;

import java.util.Date;


public class FeStatoSupportoFtp implements ModelEntity {

	public static final String TABLE_NAME = "FE_STATO_SUPPORTO_FTP";


	private Long idStatoSupportoFtp;

	private Long idStatoSupportoFtpPrec;

	private Long stato;

	private Date dataInizio;

	private Date dataFine;

	private Long idSupportoFtp;

	private Short flagAttuale;

	private Short flagErroreControlliFile;

	private String logErroreControlliFile;

	private String useridInserimento;

	private Date tmstInserimento;

	private String useridUltimoAggiornamento;

	private Date tmstUltimoAggiornamento;

	public Long getIdStatoSupportoFtp() {
		return idStatoSupportoFtp;
	}

	public void setIdStatoSupportoFtp(Long idStatoSupportoFtp) {
		this.idStatoSupportoFtp = idStatoSupportoFtp;
	}

	public Long getIdStatoSupportoFtpPrec() {
		return idStatoSupportoFtpPrec;
	}

	public void setIdStatoSupportoFtpPrec(Long idStatoSupportoFtpPrec) {
		this.idStatoSupportoFtpPrec = idStatoSupportoFtpPrec;
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

	public Long getIdSupportoFtp() {
		return idSupportoFtp;
	}

	public void setIdSupportoFtp(Long idSupportoFtp) {
		this.idSupportoFtp = idSupportoFtp;
	}

	public Short getFlagAttuale() {
		return flagAttuale;
	}

	public void setFlagAttuale(Short flagAttuale) {
		this.flagAttuale = flagAttuale;
	}

	public Short getFlagErroreControlliFile() {
		return flagErroreControlliFile;
	}

	public void setFlagErroreControlliFile(Short flagErroreControlliFile) {
		this.flagErroreControlliFile = flagErroreControlliFile;
	}

	public String getLogErroreControlliFile() {
		return logErroreControlliFile;
	}

	public void setLogErroreControlliFile(String logErroreControlliFile) {
		this.logErroreControlliFile = logErroreControlliFile;
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
		return this.getIdStatoSupportoFtp().toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}






}