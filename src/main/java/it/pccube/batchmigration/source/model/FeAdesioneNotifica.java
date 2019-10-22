package it.pccube.batchmigration.source.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FeAdesioneNotifica implements ModelEntity {
	
	public static final String TABLE_NAME = "FE_ADESIONE_NOTIFICA";

	
	private Long idAdesione;
	
	private Long stato;
	
	private Date data;

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Long getIdAdesione() {
		return idAdesione;
	}

	public void setIdAdesione(Long idAdesione) {
		this.idAdesione = idAdesione;
	}

	public Long getStato() {
		return stato;
	}

	public void setStato(Long stato) {
		this.stato = stato;
	}

	@Override
	public String getPKDescription() {
		return this.idAdesione+";"+this.stato;
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}

}
