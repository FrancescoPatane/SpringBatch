package it.pccube.batchmigration.destination.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FatTCausaleFattura implements ModelEntity {
	
	
	public static final String TABLE_NAME = "FAT_T_CAUSALE_FATTURA";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_CAUSALE_FATTURA (id_causale_fattura, ds_causale, id_fattura, nm_utente_inserimento, ts_inserimento, nm_utente_ultima_modifica, ts_ultima_modifica) VALUES (:idCausaleFattura, :dsCausale, :idFattura, :nmUtenteInserimento, :tsInserimento, :nmUtenteUltimaModifica, :tsUltimaModifica)";



	private Long idCausaleFattura;

	private String dsCausale;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idFattura;

	public Long getIdCausaleFattura() {
		return idCausaleFattura;
	}

	public void setIdCausaleFattura(Long idCausaleFattura) {
		this.idCausaleFattura = idCausaleFattura;
	}

	public String getDsCausale() {
		return dsCausale;
	}

	public void setDsCausale(String dsCausale) {
		this.dsCausale = dsCausale;
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

	public Long getIdFattura() {
		return idFattura;
	}

	public void setIdFattura(Long idFattura) {
		this.idFattura = idFattura;
	}

	@Override
	public String getPKDescription() {
		return this.idCausaleFattura.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}



}