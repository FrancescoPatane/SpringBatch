package it.pccube.batchmigration.destination.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import it.pccube.batchmigration.model.ModelEntity;



public class FatTArchivio implements ModelEntity {

	public static final String TABLE_NAME = "FAT_T_ARCHIVIO";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_ARCHIVIO (cd_identificativo_sdi_archivio,dt_data_ora_creazione,dt_data_ora_invio_sdi,dt_data_ora_ricezione,id_archivio,id_diz_stato_archivio,id_esito_invio,id_file_archivio,id_sedia_creatore,nm_nome_file,nm_utente_inserimento,nm_utente_ultima_modifica,ts_inserimento,ts_ultima_modifica) VALUES (:cdIdentificativoSdiArchivio, :dtDataOraCreazione, :dtDataOraInvioSdi, :dtDataOraRicezione, :idArchivio, :idDizStatoArchivio, :idEsitoInvio, :idFileArchivio, :idSediaCreatore, :nmNomeFile, :nmUtenteInserimento, :nmUtenteUltimaModifica, :tsInserimento, :tsUltimaModifica)";

	
	private Long idArchivio;

	private String cdIdentificativoSdiArchivio;

	private Date dtDataOraCreazione;

	private Date dtDataOraInvioSdi;

	private Date dtDataOraRicezione;

	private Long idDizStatoArchivio;

	private Long idSediaCreatore;

	private String nmNomeFile;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private String idFileArchivio;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idEsitoInvio;

	public Long getIdArchivio() {
		return idArchivio;
	}

	public void setIdArchivio(Long idArchivio) {
		this.idArchivio = idArchivio;
	}

	public String getCdIdentificativoSdiArchivio() {
		return cdIdentificativoSdiArchivio;
	}

	public void setCdIdentificativoSdiArchivio(String cdIdentificativoSdiArchivio) {
		this.cdIdentificativoSdiArchivio = cdIdentificativoSdiArchivio;
	}

	public Date getDtDataOraCreazione() {
		return dtDataOraCreazione;
	}

	public void setDtDataOraCreazione(Date dtDataOraCreazione) {
		this.dtDataOraCreazione = dtDataOraCreazione;
	}

	public Date getDtDataOraInvioSdi() {
		return dtDataOraInvioSdi;
	}

	public void setDtDataOraInvioSdi(Date dtDataOraInvioSdi) {
		this.dtDataOraInvioSdi = dtDataOraInvioSdi;
	}

	public Date getDtDataOraRicezione() {
		return dtDataOraRicezione;
	}

	public void setDtDataOraRicezione(Date dtDataOraRicezione) {
		this.dtDataOraRicezione = dtDataOraRicezione;
	}

	public Long getIdDizStatoArchivio() {
		return idDizStatoArchivio;
	}

	public void setIdDizStatoArchivio(Long idDizStatoArchivio) {
		this.idDizStatoArchivio = idDizStatoArchivio;
	}

	public Long getIdSediaCreatore() {
		return idSediaCreatore;
	}

	public void setIdSediaCreatore(Long idSediaCreatore) {
		this.idSediaCreatore = idSediaCreatore;
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

	public String getIdFileArchivio() {
		return idFileArchivio;
	}

	public void setIdFileArchivio(String idFileArchivio) {
		this.idFileArchivio = idFileArchivio;
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

	public Long getIdEsitoInvio() {
		return idEsitoInvio;
	}

	public void setIdEsitoInvio(Long idEsitoInvio) {
		this.idEsitoInvio = idEsitoInvio;
	}

	@Override
	public String getPKDescription() {
		return this.idArchivio.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}

	

}