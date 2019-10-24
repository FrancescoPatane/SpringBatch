package it.pccube.batchmigration.source.model;


import it.pccube.batchmigration.model.ModelEntity;


public class FeConfigGenerale implements ModelEntity {

	public static final String TABLE_NAME = "FE_CONFIG_GENERALE";

	private Long idConfigGenerale;

	private String codice;

	private String valore;

	private String descrizione;

	private byte[] valoreBlob;

	public Long getIdConfigGenerale() {
		return idConfigGenerale;
	}

	public void setIdConfigGenerale(Long idConfigGenerale) {
		this.idConfigGenerale = idConfigGenerale;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getValore() {
		return valore;
	}

	public void setValore(String valore) {
		this.valore = valore;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public byte[] getValoreBlob() {
		return valoreBlob;
	}

	public void setValoreBlob(byte[] valoreBlob) {
		this.valoreBlob = valoreBlob;
	}

	@Override
	public String getPKDescription() {
		return this.idConfigGenerale.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	

}