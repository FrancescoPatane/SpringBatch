package it.pccube.batchmigration.destination.model;

import it.pccube.batchmigration.model.ModelEntity;



public class FatTMacrosezAppCfg implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_T_MACROSEZ_APP_CFG";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_MACROSEZ_APP_CFG (ds_descrizione, fl_obbligatorio, id_config_macrosez_app, nm_contesto) VALUES (:dsDescrizione, :flObbligatorio, :idConfigMacrosezApp, :nmContesto)";
	
	
	private Long idConfigMacrosezApp;

	private String dsDescrizione;
	
	private Short flObbligatorio;

	private String nmContesto;


	public FatTMacrosezAppCfg() {
	}

	public Long getIdConfigMacrosezApp() {
		return this.idConfigMacrosezApp;
	}

	public void setIdConfigMacrosezApp(Long idConfigMacrosezApp) {
		this.idConfigMacrosezApp = idConfigMacrosezApp;
	}

	public String getDsDescrizione() {
		return this.dsDescrizione;
	}

	public void setDsDescrizione(String dsDescrizione) {
		this.dsDescrizione = dsDescrizione;
	}

	public Short getFlObbligatorio() {
		return this.flObbligatorio;
	}

	public void setFlObbligatorio(Short flObbligatorio) {
		this.flObbligatorio = flObbligatorio;
	}

	public String getNmContesto() {
		return this.nmContesto;
	}

	public void setNmContesto(String nmContesto) {
		this.nmContesto = nmContesto;
	}

	@Override
	public String getPKDescription() {
		return this.idConfigMacrosezApp.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}


}