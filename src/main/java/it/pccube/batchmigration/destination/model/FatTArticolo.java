package it.pccube.batchmigration.destination.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;



public class FatTArticolo implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_T_ARTICOLO";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_ARTICOLO (id_articolo, cd_codice_tipo, cd_codice_valore, id_dettaglio_linea, nm_utente_inserimento, ts_inserimento, nm_utente_ultima_modifica, ts_ultima_modifica) VALUES (:idArticolo, :cdCodiceTipo, :cdCodiceValore, :idDettaglioLinea, :nmUtenteInserimento, :tsInserimento, :nmUtenteUltimaModifica, :tsUltimaModifica)";

	
	private Long idArticolo;

	private String cdCodiceTipo;

	private String cdCodiceValore;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idDettaglioLinea;

	public Long getIdArticolo() {
		return idArticolo;
	}

	public void setIdArticolo(Long idArticolo) {
		this.idArticolo = idArticolo;
	}

	public String getCdCodiceTipo() {
		return cdCodiceTipo;
	}

	public void setCdCodiceTipo(String cdCodiceTipo) {
		this.cdCodiceTipo = cdCodiceTipo;
	}

	public String getCdCodiceValore() {
		return cdCodiceValore;
	}

	public void setCdCodiceValore(String cdCodiceValore) {
		this.cdCodiceValore = cdCodiceValore;
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

	public Long getIdDettaglioLinea() {
		return idDettaglioLinea;
	}

	public void setIdDettaglioLinea(Long idDettaglioLinea) {
		this.idDettaglioLinea = idDettaglioLinea;
	}

	@Override
	public String getPKDescription() {
		return this.idArticolo.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}


}