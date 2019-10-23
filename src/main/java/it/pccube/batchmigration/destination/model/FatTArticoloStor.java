package it.pccube.batchmigration.destination.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;

public class FatTArticoloStor implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_T_ARTICOLO_STOR";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_ARTICOLO_STOR (id_articolo_stor, id_articolo, cd_codice_tipo, cd_codice_valore, id_dettaglio_linea, id_dettaglio_linea_stor, nm_utente_inserimento, ts_inserimento, nm_utente_ultima_modifica, ts_ultima_modifica) VALUES (:idArticoloStor, :idArticolo, :cdCodiceTipo, :cdCodiceValore, :idDettaglioLinea, :idDettaglioLineaStor, :nmUtenteInserimento, :tsInserimento, :nmUtenteUltimaModifica, :tsUltimaModifica)";

	

	private Long idArticoloStor;

	private String cdCodiceTipo;

	private String cdCodiceValore;

	private Long idArticolo;

	private Long idDettaglioLinea;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idDettaglioLineaStor;
	
	

	public Long getIdArticoloStor() {
		return idArticoloStor;
	}

	public void setIdArticoloStor(Long idArticoloStor) {
		this.idArticoloStor = idArticoloStor;
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

	public Long getIdArticolo() {
		return idArticolo;
	}

	public void setIdArticolo(Long idArticolo) {
		this.idArticolo = idArticolo;
	}

	public Long getIdDettaglioLinea() {
		return idDettaglioLinea;
	}

	public void setIdDettaglioLinea(Long idDettaglioLinea) {
		this.idDettaglioLinea = idDettaglioLinea;
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

	public Long getIdDettaglioLineaStor() {
		return idDettaglioLineaStor;
	}

	public void setIdDettaglioLineaStor(Long idDettaglioLineaStor) {
		this.idDettaglioLineaStor = idDettaglioLineaStor;
	}

	@Override
	public String getPKDescription() {
		return this.idArticoloStor.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	


}