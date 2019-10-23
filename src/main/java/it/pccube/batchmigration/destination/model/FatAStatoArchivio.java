package it.pccube.batchmigration.destination.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FatAStatoArchivio implements ModelEntity {

	
	public static final String TABLE_NAME = "FAT_A_STATO_ARCHIVIO";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_A_STATO_ARCHIVIO (ID_STATO_ARCHIVIO, ID_ARCHIVIO, ID_DIZ_STATO_ARCHIVIO, ID_MONITORAGGIO_INVIO_SDI, DT_DATA_ORA, NM_UTENTE_INSERIMENTO, NM_UTENTE_ULTIMA_MODIFICA, TS_INSERIMENTO, TS_ULTIMA_MODIFICA)VALUES (:idStatoArchivio, :idArchivio, :idDizStatoArchivio, :idMonitoraggioInvioSdi, :dtDataOra, :nmUtenteInserimento, :nmUtenteUltimaModifica, :tsInserimento, :tsUltimaModifica)";

	private Long idStatoArchivio;

	private Date dtDataOra;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idDizStatoArchivio;

	private Long idArchivio;

	private Long idMonitoraggioInvioSdi;

	public Long getIdStatoArchivio() {
		return idStatoArchivio;
	}

	public void setIdStatoArchivio(Long idStatoArchivio) {
		this.idStatoArchivio = idStatoArchivio;
	}

	public Date getDtDataOra() {
		return dtDataOra;
	}

	public void setDtDataOra(Date dtDataOra) {
		this.dtDataOra = dtDataOra;
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

	public Long getIdDizStatoArchivio() {
		return idDizStatoArchivio;
	}

	public void setIdDizStatoArchivio(Long idDizStatoArchivio) {
		this.idDizStatoArchivio = idDizStatoArchivio;
	}

	public Long getIdArchivio() {
		return idArchivio;
	}

	public void setIdArchivio(Long idArchivio) {
		this.idArchivio = idArchivio;
	}

	public Long getIdMonitoraggioInvioSdi() {
		return idMonitoraggioInvioSdi;
	}

	public void setIdMonitoraggioInvioSdi(Long idMonitoraggioInvioSdi) {
		this.idMonitoraggioInvioSdi = idMonitoraggioInvioSdi;
	}

	@Override
	public String getPKDescription() {
		return this.idStatoArchivio.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}

	

}