package it.pccube.batchmigration.source.model;

import it.pccube.batchmigration.model.ModelEntity;

public class FeConfigXsdCampo implements ModelEntity{
	
	public static final String TABLE_NAME = "FE_CONFIG_XSD_CAMPO";
	
	private Long idConfigXsdCampo;
	
	private String nomeCampo;
	
	private Long idConfigXsdSezione;
	
	private Short flagObbligatorio;
	
	private String nomeTabellaMapping;
	
	private String nomeCampoMapping;

	public Long getIdConfigXsdCampo() {
		return idConfigXsdCampo;
	}

	public void setIdConfigXsdCampo(Long idConfigXsdCampo) {
		this.idConfigXsdCampo = idConfigXsdCampo;
	}

	public String getNomeCampo() {
		return nomeCampo;
	}

	public void setNomeCampo(String nomeCampo) {
		this.nomeCampo = nomeCampo;
	}

	public Long getIdConfigXsdSezione() {
		return idConfigXsdSezione;
	}

	public void setIdConfigXsdSezione(Long idConfigXsdSezione) {
		this.idConfigXsdSezione = idConfigXsdSezione;
	}

	public Short getFlagObbligatorio() {
		return flagObbligatorio;
	}

	public void setFlagObbligatorio(Short flagObbligatorio) {
		this.flagObbligatorio = flagObbligatorio;
	}

	public String getNomeTabellaMapping() {
		return nomeTabellaMapping;
	}

	public void setNomeTabellaMapping(String nomeTabellaMapping) {
		this.nomeTabellaMapping = nomeTabellaMapping;
	}

	public String getNomeCampoMapping() {
		return nomeCampoMapping;
	}

	public void setNomeCampoMapping(String nomeCampoMapping) {
		this.nomeCampoMapping = nomeCampoMapping;
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
