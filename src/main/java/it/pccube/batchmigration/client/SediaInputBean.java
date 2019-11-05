package it.pccube.batchmigration.client;


import java.io.Serializable;

public class SediaInputBean implements Serializable {

	private static final long serialVersionUID = 605844951595441135L;

	public SediaInputBean() {
		super();
	}

	private String idUtenteAziendaAmministrazione;

	private String tipoUtente;

	public String getIdUtenteAziendaAmministrazione() {
		return idUtenteAziendaAmministrazione;
	}

	public void setIdUtenteAziendaAmministrazione(String idUtenteAziendaAmministrazione) {
		this.idUtenteAziendaAmministrazione = idUtenteAziendaAmministrazione;
	}

	public String getTipoUtente() {
		return tipoUtente;
	}

	public void setTipoUtente(String tipoUtente) {
		this.tipoUtente = tipoUtente;
	}

	@Override
	public String toString() {
		return "SediaInputBean [idUtenteAziendaAmministrazione=" + idUtenteAziendaAmministrazione + ", tipoUtente="
				+ tipoUtente + "]";
	}
	
	
}
