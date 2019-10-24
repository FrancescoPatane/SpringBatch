package it.pccube.batchmigration.destination.model;

import it.pccube.batchmigration.model.ModelEntity;

public class FatTFoglioStileCfg implements ModelEntity{
	
	
	public static final String TABLE_NAME = "FAT_T_FOGLIO_STILE_CFG";
	
	public static final String INSERT_QUERY ="INSERT INTO FAT_T_FOGLIO_STILE_CFG (CD_VERSIONE_FOGLIO_STILE, ID_FOGLIO_STILE, ID_OJ_FOGLIO_STILE, NM_NOME_FOGLIO_STILE) VALUES (:cdVersioneFoglioStile, :idFoglioStile, :idOjFoglioStile, :nmNomeFoglioStile)";
	

	private String cdVersioneFoglioStile;
	
	private Long idFoglioStile;
	
	private String idOjFoglioStile;
	
	private String nmNomeFoglioStile;

	

	public String getCdVersioneFoglioStile() {
		return cdVersioneFoglioStile;
	}

	public void setCdVersioneFoglioStile(String cdVersioneFoglioStile) {
		this.cdVersioneFoglioStile = cdVersioneFoglioStile;
	}

	public Long getIdFoglioStile() {
		return idFoglioStile;
	}

	public void setIdFoglioStile(Long idFoglioStile) {
		this.idFoglioStile = idFoglioStile;
	}

	public String getIdOjFoglioStile() {
		return idOjFoglioStile;
	}

	public void setIdOjFoglioStile(String idOjFoglioStile) {
		this.idOjFoglioStile = idOjFoglioStile;
	}

	public String getNmNomeFoglioStile() {
		return nmNomeFoglioStile;
	}

	public void setNmNomeFoglioStile(String nmNomeFoglioStile) {
		this.nmNomeFoglioStile = nmNomeFoglioStile;
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
