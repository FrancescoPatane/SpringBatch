package it.pccube.batchmigration.destination.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;

public class FatTAdesioneNotifica implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_T_ADESIONE_NOTIFICA";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_ADESIONE_NOTIFICA (ID_ADESIONE, ID_DIZ_STATO_ADESIONE_NOTIFICA, DT_DATA_NOTIFICA, NM_UTENTE_INSERIMENTO, NM_UTENTE_ULTIMA_MODIFICA, TS_INSERIMENTO, TS_ULTIMA_MODIFICA) VALUES (:idAdesione, :idDizStatoAdesioneNotifica, :dtDataNotifica, :nmUtenteInserimento, :nmUtenteUltimaModifica, :tsInserimento, :tsUltimaModifica)";

	private Long idAdesione;
	
	private Long idDizStatoAdesioneNotifica;

	private Date dtDataNotifica;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	public Long getIdAdesione() {
		return idAdesione;
	}

	public void setIdAdesione(Long idAdesione) {
		this.idAdesione = idAdesione;
	}

	public Long getIdDizStatoAdesioneNotifica() {
		return idDizStatoAdesioneNotifica;
	}

	public void setIdDizStatoAdesioneNotifica(Long idDizStatoAdesioneNotifica) {
		this.idDizStatoAdesioneNotifica = idDizStatoAdesioneNotifica;
	}

	public Date getDtDataNotifica() {
		return dtDataNotifica;
	}

	public void setDtDataNotifica(Date dtDataNotifica) {
		this.dtDataNotifica = dtDataNotifica;
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
		return this.idAdesione+";"+this.idDizStatoAdesioneNotifica;
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}

}