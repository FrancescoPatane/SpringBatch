package it.pccube.batchmigration.source.model;

import it.pccube.batchmigration.model.ModelEntity;

import java.util.Date;


public class FeDatiSal implements ModelEntity {
	
	public static final String TABLE_NAME = "FE_DATI_SAL";



	private Long idDatiSal;

	private Long riferimentoFase;

	private Long idFattura;

	private String useridInserimento;

	private Date tmstInserimento;

	private String useridUltimoAggiornamento;

	private Date tmstUltimoAggiornamento;

	public Long getIdDatiSal() {
		return idDatiSal;
	}

	public void setIdDatiSal(Long idDatiSal) {
		this.idDatiSal = idDatiSal;
	}

	public Long getRiferimentoFase() {
		return riferimentoFase;
	}

	public void setRiferimentoFase(Long riferimentoFase) {
		this.riferimentoFase = riferimentoFase;
	}

	public Long getIdFattura() {
		return idFattura;
	}

	public void setIdFattura(Long idFattura) {
		this.idFattura = idFattura;
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
		return this.idDatiSal.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	


}