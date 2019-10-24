package it.pccube.batchmigration.destination.model;


import it.pccube.batchmigration.model.ModelEntity;


public class FatTXsdCampoCfg implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_T_XSD_CAMPO_CFG";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_XSD_CAMPO_CFG ( fl_obbligatorio, id_config_xsd_campo, id_config_xsd_sezione, nm_nome_campo, nm_nome_campo_mapping, nm_nome_tabella_mapping ) VALUES( :flObbligatorio, :idConfigXsdCampo, :idXsdSezioneCfg, :nmNomeCampo, :nmNomeCampoMapping, :nmNomeTabellaMapping )";

	
	private Long idConfigXsdCampo;

	private Short flObbligatorio;

	private String nmNomeCampo;

	private String nmNomeCampoMapping;

	private String nmNomeTabellaMapping;

	private Long idXsdSezioneCfg;
	
	

	public Long getIdConfigXsdCampo() {
		return idConfigXsdCampo;
	}

	public void setIdConfigXsdCampo(Long idConfigXsdCampo) {
		this.idConfigXsdCampo = idConfigXsdCampo;
	}

	public Short getFlObbligatorio() {
		return flObbligatorio;
	}

	public void setFlObbligatorio(Short flObbligatorio) {
		this.flObbligatorio = flObbligatorio;
	}

	public String getNmNomeCampo() {
		return nmNomeCampo;
	}

	public void setNmNomeCampo(String nmNomeCampo) {
		this.nmNomeCampo = nmNomeCampo;
	}

	public String getNmNomeCampoMapping() {
		return nmNomeCampoMapping;
	}

	public void setNmNomeCampoMapping(String nmNomeCampoMapping) {
		this.nmNomeCampoMapping = nmNomeCampoMapping;
	}

	public String getNmNomeTabellaMapping() {
		return nmNomeTabellaMapping;
	}

	public void setNmNomeTabellaMapping(String nmNomeTabellaMapping) {
		this.nmNomeTabellaMapping = nmNomeTabellaMapping;
	}

	public Long getIdXsdSezioneCfg() {
		return idXsdSezioneCfg;
	}

	public void setIdXsdSezioneCfg(Long idXsdSezioneCfg) {
		this.idXsdSezioneCfg = idXsdSezioneCfg;
	}

	@Override
	public String getPKDescription() {
		return this.idConfigXsdCampo.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}

	
}