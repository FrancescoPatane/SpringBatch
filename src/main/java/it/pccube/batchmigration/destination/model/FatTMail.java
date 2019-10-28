package it.pccube.batchmigration.destination.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;

public class FatTMail implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_T_MAIL";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_MAIL ( DT_DATA_DECADENZA, DT_DATA_ORA_INVIO, DT_DATA_SOSPENSIONE, ID_ADESIONE, ID_DIZ_TIPOLOGIA_EMAIL, ID_DIZ_TIPOLOGIA_UTENTE_INVIO, ID_FATTURA, ID_LOTTO, ID_MAIL, ID_MAIL_PRINCIPALE, ID_SEDIA_DEST, NM_INDIRIZZO_DESTINATARIO, NM_UTENTE_INSERIMENTO, NM_UTENTE_ULTIMA_MODIFICA, NR_GIORNI_MANCANTI_DECADENZA, NR_GIORNI_MANCANTI_SOSPENSIONE, NR_UTENTE_INVIO, OJ_TESTO, PG_VERSIONE_LOTTO, TS_INSERIMENTO, TS_ULTIMA_MODIFICA ) VALUES ( :dtDataDecadenza, :dtDataOraInvio, :dtDataSospensione, :idAdesione, :idDizTipologiaEmail, :idDizTipologiaUtenteInvio, :idFattura, :idLotto, :idMail, :idMailPrincipale, :idSediaDest, :nmIndirizzoDestinatario, :nmUtenteInserimento, :nmUtenteUltimaModifica, :nrGiorniMancantiDecadenza, :nrGiorniMancantiSospensione, :nrUtenteInvio, :ojTesto, :pgVersioneLotto, :tsInserimento, :tsUltimaModifica )";
	
	
	private Long idMail;

	private Date dtDataDecadenza;

	private Date dtDataOraInvio;

	private Date dtDataSospensione;

	private Long idSediaDest;

	private String nmIndirizzoDestinatario;

	private Long nrGiorniMancantiDecadenza;

	private Long nrGiorniMancantiSospensione;

	private Long nrUtenteInvio;

	private byte[] ojTesto;

	private Long pgVersioneLotto;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idAdesione;

	private Long idFattura;

	private Long idLotto;

	private Long idDizTipologiaEmail;
	
	private Long idDizTipologiaUtenteInvio;
	
	private Long idMailPrincipale;

	public Long getIdMail() {
		return idMail;
	}

	public void setIdMail(Long idMail) {
		this.idMail = idMail;
	}

	public Date getDtDataDecadenza() {
		return dtDataDecadenza;
	}

	public void setDtDataDecadenza(Date dtDataDecadenza) {
		this.dtDataDecadenza = dtDataDecadenza;
	}

	public Date getDtDataOraInvio() {
		return dtDataOraInvio;
	}

	public void setDtDataOraInvio(Date dtDataOraInvio) {
		this.dtDataOraInvio = dtDataOraInvio;
	}

	public Date getDtDataSospensione() {
		return dtDataSospensione;
	}

	public void setDtDataSospensione(Date dtDataSospensione) {
		this.dtDataSospensione = dtDataSospensione;
	}

	public Long getIdSediaDest() {
		return idSediaDest;
	}

	public void setIdSediaDest(Long idSediaDest) {
		this.idSediaDest = idSediaDest;
	}

	public String getNmIndirizzoDestinatario() {
		return nmIndirizzoDestinatario;
	}

	public void setNmIndirizzoDestinatario(String nmIndirizzoDestinatario) {
		this.nmIndirizzoDestinatario = nmIndirizzoDestinatario;
	}

	public Long getNrGiorniMancantiDecadenza() {
		return nrGiorniMancantiDecadenza;
	}

	public void setNrGiorniMancantiDecadenza(Long nrGiorniMancantiDecadenza) {
		this.nrGiorniMancantiDecadenza = nrGiorniMancantiDecadenza;
	}

	public Long getNrGiorniMancantiSospensione() {
		return nrGiorniMancantiSospensione;
	}

	public void setNrGiorniMancantiSospensione(Long nrGiorniMancantiSospensione) {
		this.nrGiorniMancantiSospensione = nrGiorniMancantiSospensione;
	}

	public Long getNrUtenteInvio() {
		return nrUtenteInvio;
	}

	public void setNrUtenteInvio(Long nrUtenteInvio) {
		this.nrUtenteInvio = nrUtenteInvio;
	}

	public byte[] getOjTesto() {
		return ojTesto;
	}

	public void setOjTesto(byte[] ojTesto) {
		this.ojTesto = ojTesto;
	}

	public Long getPgVersioneLotto() {
		return pgVersioneLotto;
	}

	public void setPgVersioneLotto(Long pgVersioneLotto) {
		this.pgVersioneLotto = pgVersioneLotto;
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

	public Long getIdAdesione() {
		return idAdesione;
	}

	public void setIdAdesione(Long idAdesione) {
		this.idAdesione = idAdesione;
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

	public Long getIdDizTipologiaEmail() {
		return idDizTipologiaEmail;
	}

	public void setIdDizTipologiaEmail(Long idDizTipologiaEmail) {
		this.idDizTipologiaEmail = idDizTipologiaEmail;
	}

	public Long getIdDizTipologiaUtenteInvio() {
		return idDizTipologiaUtenteInvio;
	}

	public void setIdDizTipologiaUtenteInvio(Long idDizTipologiaUtenteInvio) {
		this.idDizTipologiaUtenteInvio = idDizTipologiaUtenteInvio;
	}

	public Long getIdMailPrincipale() {
		return idMailPrincipale;
	}

	public void setIdMailPrincipale(Long idMailPrincipale) {
		this.idMailPrincipale = idMailPrincipale;
	}

	@Override
	public String getPKDescription() {
		return this.idMail.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	

}