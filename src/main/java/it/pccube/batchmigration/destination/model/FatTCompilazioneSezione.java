package it.pccube.batchmigration.destination.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FatTCompilazioneSezione implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_T_COMPILAZIONE_SEZIONE";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_COMPILAZIONE_SEZIONE (ID_COMPILAZIONE_SEZIONE,ID_CONFIG_MACROSEZ_APP,ID_DETTAGLIO_LINEA,ID_DIZ_STATO_COMPILAZIONE,ID_FATTURA,ID_LOTTO,NM_UTENTE_INSERIMENTO,NM_UTENTE_ULTIMA_MODIFICA,TS_INSERIMENTO,TS_ULTIMA_MODIFICA) VALUES (:idCompilazioneSezione, :idConfigMacrosezApp, :idDettaglioLinea, :idDizStatoCompilazione, :idFattura, :idLotto, :nmUtenteInserimento, :nmUtenteUltimaModifica, :tsInserimento, :tsUltimaModifica)";


	private Long idCompilazioneSezione;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idDettaglioLinea;

	private Long idDizStatoCompilazione;

	private Long idFattura;

	private Long idLotto;

	private Long idConfigMacrosezApp;

	public Long getIdCompilazioneSezione() {
		return idCompilazioneSezione;
	}

	public void setIdCompilazioneSezione(Long idCompilazioneSezione) {
		this.idCompilazioneSezione = idCompilazioneSezione;
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

	public Long getIdDettaglioLinea() {
		return idDettaglioLinea;
	}

	public void setIdDettaglioLinea(Long idDettaglioLinea) {
		this.idDettaglioLinea = idDettaglioLinea;
	}

	public Long getIdDizStatoCompilazione() {
		return idDizStatoCompilazione;
	}

	public void setIdDizStatoCompilazione(Long idDizStatoCompilazione) {
		this.idDizStatoCompilazione = idDizStatoCompilazione;
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

	public Long getIdConfigMacrosezApp() {
		return idConfigMacrosezApp;
	}

	public void setIdConfigMacrosezApp(Long idConfigMacrosezApp) {
		this.idConfigMacrosezApp = idConfigMacrosezApp;
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