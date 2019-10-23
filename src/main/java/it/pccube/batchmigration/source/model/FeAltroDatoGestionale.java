package it.pccube.batchmigration.source.model;

import it.pccube.batchmigration.model.ModelEntity;

import java.math.BigDecimal;
import java.util.Date;


public class FeAltroDatoGestionale implements ModelEntity {
	
	public static final String TABLE_NAME = "FE_ALTRO_DATO_GESTIONALE";


	private Long idAltroDatoGestionale;

	private String tipoDato;

	private String riferimentoTesto;

	private BigDecimal riferimentoNumero;

	private Date riferimentoData;

	private Long dettaglioLinea;

	private String useridInserimento;

	private Date tmstInserimento;

	private String useridUltimoAggiornamento;

	private Date tmstUltimoAggiornamento;

	public Long getIdAltroDatoGestionale() {
		return idAltroDatoGestionale;
	}

	public void setIdAltroDatoGestionale(Long idAltroDatoGestionale) {
		this.idAltroDatoGestionale = idAltroDatoGestionale;
	}

	public String getTipoDato() {
		return tipoDato;
	}

	public void setTipoDato(String tipoDato) {
		this.tipoDato = tipoDato;
	}

	public String getRiferimentoTesto() {
		return riferimentoTesto;
	}

	public void setRiferimentoTesto(String riferimentoTesto) {
		this.riferimentoTesto = riferimentoTesto;
	}

	public BigDecimal getRiferimentoNumero() {
		return riferimentoNumero;
	}

	public void setRiferimentoNumero(BigDecimal riferimentoNumero) {
		this.riferimentoNumero = riferimentoNumero;
	}

	public Date getRiferimentoData() {
		return riferimentoData;
	}

	public void setRiferimentoData(Date riferimentoData) {
		this.riferimentoData = riferimentoData;
	}

	public Long getDettaglioLinea() {
		return dettaglioLinea;
	}

	public void setDettaglioLinea(Long dettaglioLinea) {
		this.dettaglioLinea = dettaglioLinea;
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
		return this.idAltroDatoGestionale.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}

	


}