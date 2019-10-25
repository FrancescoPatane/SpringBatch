package it.pccube.batchmigration.source.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FeErroreNotifica implements ModelEntity {

	public static final String TABLE_NAME = "FE_ERRORE_NOTIFICA";

	private Long idErroreNotifica;

	private String codice;

	private String descrizione;

	private Long idNotifica;

	private String useridInserimento;

	private Date tmstInserimento;

	private String useridUltimoAggiornamento;

	private Date tmstUltimoAggiornamento;

	public Long getIdErroreNotifica() {
		return idErroreNotifica;
	}

	public void setIdErroreNotifica(Long idErroreNotifica) {
		this.idErroreNotifica = idErroreNotifica;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	

	public Long getIdNotifica() {
		return idNotifica;
	}

	public void setIdNotifica(Long idNotifica) {
		this.idNotifica = idNotifica;
	}

	public String getUseridInserimento() {
		return useridInserimento;
	}

	public void setUseridInserimento(String useridInserimento) {
		this.useridInserimento = useridInserimento;
	}

	public Date getTmstInserimento() {
		return tmstInserimento;
	}

	public void setTmstInserimento(Date tmstInserimento) {
		this.tmstInserimento = tmstInserimento;
	}

	public String getUseridUltimoAggiornamento() {
		return useridUltimoAggiornamento;
	}

	public void setUseridUltimoAggiornamento(String useridUltimoAggiornamento) {
		this.useridUltimoAggiornamento = useridUltimoAggiornamento;
	}

	public Date getTmstUltimoAggiornamento() {
		return tmstUltimoAggiornamento;
	}

	public void setTmstUltimoAggiornamento(Date tmstUltimoAggiornamento) {
		this.tmstUltimoAggiornamento = tmstUltimoAggiornamento;
	}

	@Override
	public String getPKDescription() {
		return this.idErroreNotifica.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	


}