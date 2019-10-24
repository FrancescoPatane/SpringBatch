package it.pccube.batchmigration.source.model;


import it.pccube.batchmigration.model.ModelEntity;


public class FeConfigMacrosezApp implements ModelEntity {
	
	public static final String TABLE_NAME = "FE_CONFIG_MACROSEZ_APP";

	private Short flagObbligatorio;

	private Long idConfigMacrosezApp;

	private String descrizione;
	
	private String contesto;

	public Short getFlagObbligatorio() {
		return flagObbligatorio;
	}

	public void setFlagObbligatorio(Short flagObbligatorio) {
		this.flagObbligatorio = flagObbligatorio;
	}

	public Long getIdConfigMacrosezApp() {
		return idConfigMacrosezApp;
	}

	public void setIdConfigMacrosezApp(Long idConfigMacrosezApp) {
		this.idConfigMacrosezApp = idConfigMacrosezApp;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getContesto() {
		return contesto;
	}

	public void setContesto(String contesto) {
		this.contesto = contesto;
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