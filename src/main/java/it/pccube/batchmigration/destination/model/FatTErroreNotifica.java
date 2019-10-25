package it.pccube.batchmigration.destination.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FatTErroreNotifica implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_T_ERRORE_NOTIFICA";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_ERRORE_NOTIFICA (cd_codice,ds_descrizione,id_errore_notifica,id_notifica,nm_utente_inserimento,nm_utente_ultima_modifica,ts_inserimento,ts_ultima_modifica) VALUES (:cdCodice,:dsDescrizione,:idErroreNotifica,:idNotifica,:nmUtenteInserimento,:nmUtenteUltimaModifica,:tsInserimento,:tsUltimaModifica)";
	
	

	private Long idErroreNotifica;

	private String cdCodice;

	private String dsDescrizione;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idNotifica;

	public Long getIdErroreNotifica() {
		return idErroreNotifica;
	}

	public void setIdErroreNotifica(Long idErroreNotifica) {
		this.idErroreNotifica = idErroreNotifica;
	}

	public String getCdCodice() {
		return cdCodice;
	}

	public void setCdCodice(String cdCodice) {
		this.cdCodice = cdCodice;
	}

	public String getDsDescrizione() {
		return dsDescrizione;
	}

	public void setDsDescrizione(String dsDescrizione) {
		this.dsDescrizione = dsDescrizione;
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

	public Long getIdNotifica() {
		return idNotifica;
	}

	public void setIdNotifica(Long idNotifica) {
		this.idNotifica = idNotifica;
	}

	@Override
	public String getPKDescription() {
		return this.idErroreNotifica.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	

}