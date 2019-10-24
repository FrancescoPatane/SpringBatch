package it.pccube.batchmigration.source.model;

import it.pccube.batchmigration.model.ModelEntity;

public class FeConfigXsdSezione implements ModelEntity{
	
	public static final String TABLE_NAME = "FE_CONFIG_XSD_SEZIONE";

	
	private Long idConfigXsdSezione;
	
	private Long idConfigXsdSezionePadre;
	
	private String nomeSezione;
	
	private Short flagObbligatorio;
	
	private Long idConfigMacrosezApp;

	public Long getIdConfigXsdSezione() {
		return idConfigXsdSezione;
	}

	public void setIdConfigXsdSezione(Long idConfigXsdSezione) {
		this.idConfigXsdSezione = idConfigXsdSezione;
	}

	public Long getIdConfigXsdSezionePadre() {
		return idConfigXsdSezionePadre;
	}

	public void setIdConfigXsdSezionePadre(Long idConfigXsdSezionePadre) {
		this.idConfigXsdSezionePadre = idConfigXsdSezionePadre;
	}

	public String getNomeSezione() {
		return nomeSezione;
	}

	public void setNomeSezione(String nomeSezione) {
		this.nomeSezione = nomeSezione;
	}

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

	@Override
	public String getPKDescription() {
		return this.idConfigXsdSezione.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	
	
	

}
