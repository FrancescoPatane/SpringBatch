package it.pccube.batchmigration.source.model;


import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FeCompSezioneStorico implements ModelEntity {
	
	public static final String TABLE_NAME = "FE_COMP_SEZIONE_STORICO";


	private Long idCompSezioneStorico;

	private Long idCompilazioneSezione;

	private Long idLotto;
	
	private Long versioneLotto;

	private Long idFattura;
	
	private Long idFatturaStorico;
	
	private Long idDettaglioLinea;
	
	private Long idDettaglioLineaStorico;

	private Long idConfigMacroSezApp;

	private Long statoCompilazione;

	private String useridInserimento;

	private Date tmstInserimento;

	private String useridUltimoAggiornamento;

	private Date tmstUltimoAggiornamento;

	

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

	public Long getVersioneLotto() {
		return versioneLotto;
	}

	public void setVersioneLotto(Long versioneLotto) {
		this.versioneLotto = versioneLotto;
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

	public Long getIdDettaglioLinea() {
		return idDettaglioLinea;
	}

	public void setIdDettaglioLinea(Long idDettaglioLinea) {
		this.idDettaglioLinea = idDettaglioLinea;
	}

	public Long getIdDettaglioLineaStorico() {
		return idDettaglioLineaStorico;
	}

	public void setIdDettaglioLineaStorico(Long idDettaglioLineaStorico) {
		this.idDettaglioLineaStorico = idDettaglioLineaStorico;
	}

	public Long getIdConfigMacroSezApp() {
		return idConfigMacroSezApp;
	}

	public void setIdConfigMacroSezApp(Long idConfigMacroSezApp) {
		this.idConfigMacroSezApp = idConfigMacroSezApp;
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
	
	public Long getIdCompSezioneStorico() {
		return idCompSezioneStorico;
	}

	public void setIdCompSezioneStorico(Long idCompSezioneStorico) {
		this.idCompSezioneStorico = idCompSezioneStorico;
	}

	@Override
	public String getPKDescription() {
		return this.idCompSezioneStorico.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}

	

}