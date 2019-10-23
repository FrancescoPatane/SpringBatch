package it.pccube.batchmigration.destination.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FatAStatoAdesione implements ModelEntity {

	public static final String TABLE_NAME = "FAT_A_STATO_ADESIONE";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_A_STATO_ADESIONE (ID_STATO_ADESIONE, DT_DATA_FINE, DT_DATA_INIZIO, FL_ATTUALE, NM_UTENTE_INSERIMENTO, NM_UTENTE_ULTIMA_MODIFICA, TS_INSERIMENTO, TS_ULTIMA_MODIFICA, ID_ADESIONE, ID_DIZ_STATO_ADESIONE, ID_STATO_ADESIONE_PREC) VALUES (:idStatoAdesione,:dtDataFine, :dtDataInizio, :flAttuale, :nmUtenteInserimento, :nmUtenteUltimaModifica, :tsInserimento, :tsUltimaModifica, :idAdesione, :idDizStatoAdesione, :idStatoAdesionePrec)";

	private Long idStatoAdesione;

	private Date dtDataFine;

	private Date dtDataInizio;

	private Short flAttuale;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idDizStatoAdesione;
	
	private Long idAdesione;

	private Long idStatoAdesionePrec;

	public Long getIdStatoAdesione() {
		return idStatoAdesione;
	}

	public void setIdStatoAdesione(Long idStatoAdesione) {
		this.idStatoAdesione = idStatoAdesione;
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

	public Long getIdDizStatoAdesione() {
		return idDizStatoAdesione;
	}

	public void setIdDizStatoAdesione(Long idDizStatoAdesione) {
		this.idDizStatoAdesione = idDizStatoAdesione;
	}

	public Long getIdAdesione() {
		return idAdesione;
	}

	public void setIdAdesione(Long idAdesione) {
		this.idAdesione = idAdesione;
	}

	public Long getIdStatoAdesionePrec() {
		return idStatoAdesionePrec;
	}

	public void setIdStatoAdesionePrec(Long idStatoAdesionePrec) {
		this.idStatoAdesionePrec = idStatoAdesionePrec;
	}

	@Override
	public String getPKDescription() {
		return this.idStatoAdesione.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}

	

}