package it.pccube.batchmigration.source.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;

public class FeDatiSalStorico implements ModelEntity {
	
	public static final String TABLE_NAME = "FE_DATI_SAL_STORICO";



	private Long idDatiSal;
	
	private Long idDatiSalStorico;

	private Long riferimentoFase;

	private Long idFattura;
	
	private Long idFatturaStorico;

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

	public Long getIdDatiSalStorico() {
		return idDatiSalStorico;
	}

	public void setIdDatiSalStorico(Long idDatiSalStorico) {
		this.idDatiSalStorico = idDatiSalStorico;
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

	public Long getIdFatturaStorico() {
		return idFatturaStorico;
	}

	public void setIdFatturaStorico(Long idFatturaStorico) {
		this.idFatturaStorico = idFatturaStorico;
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
		return this.idDatiSalStorico.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	

}
