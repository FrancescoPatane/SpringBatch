package it.pccube.batchmigration.source.model;


import it.pccube.batchmigration.model.ModelEntity;

public class FeConfigEsitoVerifFirma implements ModelEntity {
	
	public static final String TABLE_NAME = "FE_CONFIG_ESITO_VERIF_FIRMA";

	private Long idConfigEsitoVerifFirma;
	private Short raggiungibile;
	private Short riconosciuto;
	private Short verifica;
	private Short modelloConforme;
	private Short firmatari;
	private Short stato;
	private String descrizione;
	private Short ritornoServiceVerifica;
	
	
	public Long getIdConfigEsitoVerifFirma() {
		return idConfigEsitoVerifFirma;
	}
	public void setIdConfigEsitoVerifFirma(Long idConfigEsitoVerifFirma) {
		this.idConfigEsitoVerifFirma = idConfigEsitoVerifFirma;
	}
	public Short getRaggiungibile() {
		return raggiungibile;
	}
	public void setRaggiungibile(Short raggiungibile) {
		this.raggiungibile = raggiungibile;
	}
	public Short getRiconosciuto() {
		return riconosciuto;
	}
	public void setRiconosciuto(Short riconosciuto) {
		this.riconosciuto = riconosciuto;
	}
	public Short getVerifica() {
		return verifica;
	}
	public void setVerifica(Short verifica) {
		this.verifica = verifica;
	}
	public Short getModelloConforme() {
		return modelloConforme;
	}
	public void setModelloConforme(Short modelloConforme) {
		this.modelloConforme = modelloConforme;
	}
	public Short getFirmatari() {
		return firmatari;
	}
	public void setFirmatari(Short firmatari) {
		this.firmatari = firmatari;
	}
	public Short getStato() {
		return stato;
	}
	public void setStato(Short stato) {
		this.stato = stato;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public Short getRitornoServiceVerifica() {
		return ritornoServiceVerifica;
	}
	public void setRitornoServiceVerifica(Short ritornoServiceVerifica) {
		this.ritornoServiceVerifica = ritornoServiceVerifica;
	}
	@Override
	public String getPKDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	

	
}
