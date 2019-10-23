package it.pccube.batchmigration.source.model;


import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FeCompilazioneSezione implements ModelEntity {


	public static final String TABLE_NAME = "FE_COMPILAZIONE_SEZIONE";
	
	private Long idCompilazioneSezione;

	private Long idLotto;

	private Long idFattura;

	private Long idConfigMacrosezApp;

	private Long statoCompilazione;

	private String useridInserimento;

	private Date tmstInserimento;

	private String useridUltimoAggiornamento;

	private Date tmstUltimoAggiornamento;

	private Long idDettaglioLinea;
	
	

	public Long getIdCompilazioneSezione() {
		return idCompilazioneSezione;
	}

	public void setIdCompilazioneSezione(Long idCompilazioneSezione) {
		this.idCompilazioneSezione = idCompilazioneSezione;
	}

	public Long getIdLotto() {
		return idLotto;
	}

	public void setIdLotto(Long idLotto) {
		this.idLotto = idLotto;
	}

	public Long getIdFattura() {
		return idFattura;
	}

	public void setIdFattura(Long idFattura) {
		this.idFattura = idFattura;
	}

	public Long getIdConfigMacrosezApp() {
		return idConfigMacrosezApp;
	}

	public void setIdConfigMacrosezApp(Long idConfigMacrosezApp) {
		this.idConfigMacrosezApp = idConfigMacrosezApp;
	}

	public Long getStatoCompilazione() {
		return statoCompilazione;
	}

	public void setStatoCompilazione(Long statoCompilazione) {
		this.statoCompilazione = statoCompilazione;
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

	public Long getIdDettaglioLinea() {
		return idDettaglioLinea;
	}

	public void setIdDettaglioLinea(Long idDettaglioLinea) {
		this.idDettaglioLinea = idDettaglioLinea;
	}

	@Override
	public String getPKDescription() {
		return this.idCompilazioneSezione.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}

	
	
	



}