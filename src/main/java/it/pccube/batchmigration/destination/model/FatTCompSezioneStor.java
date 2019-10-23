package it.pccube.batchmigration.destination.model;

import java.math.BigDecimal;
import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FatTCompSezioneStor implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_T_COMP_SEZIONE_STOR";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_COMP_SEZIONE_STOR (id_comp_sezione_stor,id_compilazione_sezione,id_config_macrosez_app,id_dettaglio_linea, id_dettaglio_linea_stor, id_diz_stato_compilazione, id_fattura, id_fattura_stor, id_lotto, nm_utente_inserimento, nm_utente_ultima_modifica, ts_inserimento, ts_ultima_modifica, pg_versione_lotto) VALUES (:idCompSezioneStor, :idCompilazioneSezione, :idConfigMacrosezApp, :idDettaglioLinea, :idDettaglioLineaStor, :idDizStatoCompilazione, :idFattura, :idFatturaStor, :idLotto, :nmUtenteInserimento, :nmUtenteUltimaModifica, :tsInserimento, :tsUltimaModifica, :pgVersioneLotto)";


	private Long idCompSezioneStor;

	private Long idCompilazioneSezione;

	private Long idDettaglioLinea;

	private Long idFattura;

	private Long idLotto;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private Date tsInserimento;

	private Date tsUltimaModifica;
	
	private BigDecimal pgVersioneLotto;

	private Long idDettaglioLineaStor;

	private Long idConfigMacrosezApp;

	private Long idDizStatoCompilazione;

	private Long idFatturaStor;

	public Long getIdCompSezioneStor() {
		return idCompSezioneStor;
	}

	public void setIdCompSezioneStor(Long idCompSezioneStor) {
		this.idCompSezioneStor = idCompSezioneStor;
	}

	public Long getIdCompilazioneSezione() {
		return idCompilazioneSezione;
	}

	public void setIdCompilazioneSezione(Long idCompilazioneSezione) {
		this.idCompilazioneSezione = idCompilazioneSezione;
	}

	public Long getIdDettaglioLinea() {
		return idDettaglioLinea;
	}

	public void setIdDettaglioLinea(Long idDettaglioLinea) {
		this.idDettaglioLinea = idDettaglioLinea;
	}

	public Long getIdFattura() {
		return idFattura;
	}

	public void setIdFattura(Long idFattura) {
		this.idFattura = idFattura;
	}

	public Long getIdLotto() {
		return idLotto;
	}

	public void setIdLotto(Long idLotto) {
		this.idLotto = idLotto;
	}

	public String getNmUtenteInserimento() {
		return nmUtenteInserimento;
	}

	public void setNmUtenteInserimento(String nmUtenteInserimento) {
		this.nmUtenteInserimento = nmUtenteInserimento;
	}

	public String getNmUtenteUltimaModifica() {
		return nmUtenteUltimaModifica;
	}

	public void setNmUtenteUltimaModifica(String nmUtenteUltimaModifica) {
		this.nmUtenteUltimaModifica = nmUtenteUltimaModifica;
	}

	public Date getTsInserimento() {
		return tsInserimento;
	}

	public void setTsInserimento(Date tsInserimento) {
		this.tsInserimento = tsInserimento;
	}

	public Date getTsUltimaModifica() {
		return tsUltimaModifica;
	}

	public void setTsUltimaModifica(Date tsUltimaModifica) {
		this.tsUltimaModifica = tsUltimaModifica;
	}

	public BigDecimal getPgVersioneLotto() {
		return pgVersioneLotto;
	}

	public void setPgVersioneLotto(BigDecimal pgVersioneLotto) {
		this.pgVersioneLotto = pgVersioneLotto;
	}

	public Long getIdDettaglioLineaStor() {
		return idDettaglioLineaStor;
	}

	public void setIdDettaglioLineaStor(Long idDettaglioLineaStor) {
		this.idDettaglioLineaStor = idDettaglioLineaStor;
	}

	public Long getIdDizStatoCompilazione() {
		return idDizStatoCompilazione;
	}

	public void setIdDizStatoCompilazione(Long idDizStatoCompilazione) {
		this.idDizStatoCompilazione = idDizStatoCompilazione;
	}

	public Long getIdFatturaStor() {
		return idFatturaStor;
	}

	public void setIdFatturaStor(Long idFatturaStor) {
		this.idFatturaStor = idFatturaStor;
	}
	
	public Long getIdConfigMacrosezApp() {
		return idConfigMacrosezApp;
	}

	public void setIdConfigMacrosezApp(Long idConfigMacrosezApp) {
		this.idConfigMacrosezApp = idConfigMacrosezApp;
	}

	@Override
	public String getPKDescription() {
		return this.idCompSezioneStor.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}

	
	


}