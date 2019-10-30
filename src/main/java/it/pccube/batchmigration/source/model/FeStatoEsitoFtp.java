package it.pccube.batchmigration.source.model;



import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FeStatoEsitoFtp  implements ModelEntity {
	
	public static final String TABLE_NAME = "FE_STATO_ESITO_FTP";


	private Long idStatoEsitoFtp;
	
	private Long idEsitoFtp;
	
	private Long idStatoEsitoFtpPrec;
	
	private Date dataInizio;
	
	private Date dataFine;
	
	private Long stato;
	
	private Short flagAttuale;
	
	private Short flagErroreControlliFile;
	
	private String logErroreControlliFile;
	
	private String useridInserimento;
	
	private Date tmstInserimento;
	
	private String useridUltimoAggiornamento;
	
	private Date tmstUltimoAggiornamento;

	public Long getIdStatoEsitoFtp() {
		return idStatoEsitoFtp;
	}

	public void setIdStatoEsitoFtp(Long idStatoEsitoFtp) {
		this.idStatoEsitoFtp = idStatoEsitoFtp;
	}

	public Long getIdEsitoFtp() {
		return idEsitoFtp;
	}

	public void setIdEsitoFtp(Long idEsitoFtp) {
		this.idEsitoFtp = idEsitoFtp;
	}

	public Long getIdStatoEsitoFtpPrec() {
		return idStatoEsitoFtpPrec;
	}

	public void setIdStatoEsitoFtpPrec(Long idStatoEsitoFtpPrec) {
		this.idStatoEsitoFtpPrec = idStatoEsitoFtpPrec;
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

	public Long getStato() {
		return stato;
	}

	public void setStato(Long stato) {
		this.stato = stato;
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
		return this.idStatoEsitoFtp.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	
	
	
	
	
}