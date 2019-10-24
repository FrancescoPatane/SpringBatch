package it.pccube.batchmigration.source.model;

import it.pccube.batchmigration.model.ModelEntity;

public class FeConfigFoglioStile implements ModelEntity{
	
	public static final String TABLE_NAME = "FE_CONFIG_FOGLIO_STILE";

	private Long idFoglioStile;
	
	private String nomeFoglioStile;
	
	private String versioneFoglioStile;
	
	private byte[] foglioStile;
	
	
	public Long getIdFoglioStile() {
		return idFoglioStile;
	}
	public void setIdFoglioStile(Long idFoglioStile) {
		this.idFoglioStile = idFoglioStile;
	}
	public String getNomeFoglioStile() {
		return nomeFoglioStile;
	}
	public void setNomeFoglioStile(String nomeFoglioStile) {
		this.nomeFoglioStile = nomeFoglioStile;
	}
	public String getVersioneFoglioStile() {
		return versioneFoglioStile;
	}
	public void setVersioneFoglioStile(String versioneFoglioStile) {
		this.versioneFoglioStile = versioneFoglioStile;
	}
	public byte[] getFoglioStile() {
		return foglioStile;
	}
	public void setFoglioStile(byte[] foglioStile) {
		this.foglioStile = foglioStile;
	}
	@Override
	public String getPKDescription() {
		return this.idFoglioStile.toString();
	}
	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	

}
