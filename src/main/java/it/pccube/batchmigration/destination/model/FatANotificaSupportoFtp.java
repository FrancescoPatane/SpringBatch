package it.pccube.batchmigration.destination.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;



public class FatANotificaSupportoFtp implements ModelEntity {

	public static final String TABLE_NAME = "FAT_A_NOTIFICA_SUPPORTO_FTP";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_A_NOTIFICA_SUPPORTO_FTP (FL_LAVORATO, ID_DIZ_TIPO_NOTIFICA, ID_FILE_NOTIFICA, ID_NOTIFICA, ID_NOTIFICA_SUPPORTO_FTP, ID_SUPPORTO_FTP, NM_NOME_FILE_NOTIFICA, NM_UTENTE_INSERIMENTO, NM_UTENTE_ULTIMA_MODIFICA, TS_INSERIMENTO, TS_ULTIMA_MODIFICA )VALUES( :flLavorato, :idDizTipoNotifica, :idFileNotifica, :idNotifica, :idNotificaSupportoFtp, :idSupportoFtp, :nmNomeFileNotifica, :nmUtenteInserimento, :nmUtenteUltimaModifica, :tsInserimento, :tsUltimaModifica )";
	
	
	private Long idNotificaSupportoFtp;

	private Short flLavorato;

	private String nmNomeFileNotifica;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private String idFileNotifica;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idNotifica;

	private Long idSupportoFtp;

	private Long idDizTipoNotifica;

	public Long getIdNotificaSupportoFtp() {
		return idNotificaSupportoFtp;
	}

	public void setIdNotificaSupportoFtp(Long idNotificaSupportoFtp) {
		this.idNotificaSupportoFtp = idNotificaSupportoFtp;
	}

	public Short getFlLavorato() {
		return flLavorato;
	}

	public void setFlLavorato(Short flLavorato) {
		this.flLavorato = flLavorato;
	}

	public String getNmNomeFileNotifica() {
		return nmNomeFileNotifica;
	}

	public void setNmNomeFileNotifica(String nmNomeFileNotifica) {
		this.nmNomeFileNotifica = nmNomeFileNotifica;
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

	public String getIdFileNotifica() {
		return idFileNotifica;
	}

	public void setIdFileNotifica(String idFileNotifica) {
		this.idFileNotifica = idFileNotifica;
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

	public Long getIdNotifica() {
		return idNotifica;
	}

	public void setIdNotifica(Long idNotifica) {
		this.idNotifica = idNotifica;
	}

	public Long getIdSupportoFtp() {
		return idSupportoFtp;
	}

	public void setIdSupportoFtp(Long idSupportoFtp) {
		this.idSupportoFtp = idSupportoFtp;
	}

	public Long getIdDizTipoNotifica() {
		return idDizTipoNotifica;
	}

	public void setIdDizTipoNotifica(Long idDizTipoNotifica) {
		this.idDizTipoNotifica = idDizTipoNotifica;
	}

	@Override
	public String getPKDescription() {
		return this.idNotificaSupportoFtp.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	

	

}