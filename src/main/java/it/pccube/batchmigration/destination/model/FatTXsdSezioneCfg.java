package it.pccube.batchmigration.destination.model;


import it.pccube.batchmigration.model.ModelEntity;


public class FatTXsdSezioneCfg implements ModelEntity{
	
	public static final String TABLE_NAME = "FAT_T_XSD_SEZIONE_CFG";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_XSD_SEZIONE_CFG ( fl_obbligatorio, id_config_xsd_sezione, id_config_xsd_sezione_padre, nm_nome_sezione, id_config_macrosez_app ) VALUES( :flObbligatorio, :idConfigXsdSezione, :idConfigXsdSezionePadre, :nmNomeSezione, :idConfigMacrosezApp)";

	

	private Long idConfigXsdSezione;

	private Short flObbligatorio;

	private String nmNomeSezione;

	private Long idConfigMacrosezApp;

	private Long idConfigXsdSezionePadre;



	public Long getIdConfigXsdSezione() {
		return idConfigXsdSezione;
	}

	public void setIdConfigXsdSezione(Long idConfigXsdSezione) {
		this.idConfigXsdSezione = idConfigXsdSezione;
	}

	public Short getFlObbligatorio() {
		return flObbligatorio;
	}

	public void setFlObbligatorio(Short flObbligatorio) {
		this.flObbligatorio = flObbligatorio;
	}

	public String getNmNomeSezione() {
		return nmNomeSezione;
	}

	public void setNmNomeSezione(String nmNomeSezione) {
		this.nmNomeSezione = nmNomeSezione;
	}

	public Long getIdConfigMacrosezApp() {
		return idConfigMacrosezApp;
	}

	public void setIdConfigMacrosezApp(Long idConfigMacrosezApp) {
		this.idConfigMacrosezApp = idConfigMacrosezApp;
	}

	public Long getIdConfigXsdSezionePadre() {
		return idConfigXsdSezionePadre;
	}

	public void setIdConfigXsdSezionePadre(Long idConfigXsdSezionePadre) {
		this.idConfigXsdSezionePadre = idConfigXsdSezionePadre;
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