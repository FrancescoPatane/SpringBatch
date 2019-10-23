package it.pccube.batchmigration.source.model;

import java.math.BigDecimal;
import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;

public class FeAltroDatoGestStorico implements ModelEntity {
	
	public static final String TABLE_NAME = "FE_ALTRO_DATO_GESTIONALE";

	private Long idAltroDatoGestStorico;
	
	private Long idAltroDatoGestionale;

	private String tipoDato;

	private String riferimentoTesto;

	private BigDecimal riferimentoNumero;

	private Date riferimentoData;

	private Long idDettaglioLinea;
	
	private Long idDettaglioLineaStorico;

	private String useridInserimento;

	private Date tmstInserimento;

	private String useridUltimoAggiornamento;

	private Date tmstUltimoAggiornamento;

	public Long getIdAltroDatoGestStorico() {
		return idAltroDatoGestStorico;
	}

	public void setIdAltroDatoGestStorico(Long idAltroDatoGestStorico) {
		this.idAltroDatoGestStorico = idAltroDatoGestStorico;
	}

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

	public Long getIdDettaglioLinea() {
		return idDettaglioLinea;
	}

	public void setIdDettaglioLinea(Long idDettaglioLinea) {
		this.idDettaglioLinea = idDettaglioLinea;
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

	public Long getIdDettaglioLineaStorico() {
		return idDettaglioLineaStorico;
	}

	public void setIdDettaglioLineaStorico(Long idDettaglioLineaStorico) {
		this.idDettaglioLineaStorico = idDettaglioLineaStorico;
	}

	@Override
	public String getPKDescription() {
		return this.idAltroDatoGestStorico.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	

}
