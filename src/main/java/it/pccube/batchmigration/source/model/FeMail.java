package it.pccube.batchmigration.source.model;

import java.sql.Date;

import it.pccube.batchmigration.model.ModelEntity;

public class FeMail implements ModelEntity  {
	
	public static final String TABLE_NAME = "FE_MAIL";
	
	private	Date dataDecadenza;
	private	Date dataOraInvio;
	private	Date dataSospensione;
	private	Long giorniMancantiDecadenza;
	private	Long giorniMancantiSospensione;
	private	Long idAdesione;
	private	Long idFattura;
	private	Long idLotto;
	private	Long idMail;
	private	Long idMailPrincipale;
	private	Long idUtenteAziendaDest;
	private	String indirizzoDestinatario;
	private	byte[] testo;
	private	Long tipologia;
	private	Long tipologiaUtenteInvio;
	private	Date tmstInserimento;
	private	Date tmstUltimoAggiornamento;
	private	String useridInserimento;
	private	String useridUltimoAggiornamento;
	private	Long utenteInvio;
	private	Long versioneLotto;
	public Date getDataDecadenza() {
		return dataDecadenza;
	}
	public void setDataDecadenza(Date dataDecadenza) {
		this.dataDecadenza = dataDecadenza;
	}
	public Date getDataOraInvio() {
		return dataOraInvio;
	}
	public void setDataOraInvio(Date dataOraInvio) {
		this.dataOraInvio = dataOraInvio;
	}
	public Date getDataSospensione() {
		return dataSospensione;
	}
	public void setDataSospensione(Date dataSospensione) {
		this.dataSospensione = dataSospensione;
	}
	public Long getGiorniMancantiDecadenza() {
		return giorniMancantiDecadenza;
	}
	public void setGiorniMancantiDecadenza(Long giorniMancantiDecadenza) {
		this.giorniMancantiDecadenza = giorniMancantiDecadenza;
	}
	public Long getGiorniMancantiSospensione() {
		return giorniMancantiSospensione;
	}
	public void setGiorniMancantiSospensione(Long giorniMancantiSospensione) {
		this.giorniMancantiSospensione = giorniMancantiSospensione;
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
	public Long getIdMail() {
		return idMail;
	}
	public void setIdMail(Long idMail) {
		this.idMail = idMail;
	}
	public Long getIdMailPrincipale() {
		return idMailPrincipale;
	}
	public void setIdMailPrincipale(Long idMailPrincipale) {
		this.idMailPrincipale = idMailPrincipale;
	}
	public Long getIdUtenteAziendaDest() {
		return idUtenteAziendaDest;
	}
	public void setIdUtenteAziendaDest(Long idUtenteAziendaDest) {
		this.idUtenteAziendaDest = idUtenteAziendaDest;
	}
	public String getIndirizzoDestinatario() {
		return indirizzoDestinatario;
	}
	public void setIndirizzoDestinatario(String indirizzoDestinatario) {
		this.indirizzoDestinatario = indirizzoDestinatario;
	}
	public byte[] getTesto() {
		return testo;
	}
	public void setTesto(byte[] testo) {
		this.testo = testo;
	}
	public Long getTipologia() {
		return tipologia;
	}
	public void setTipologia(Long tipologia) {
		this.tipologia = tipologia;
	}
	public Long getTipologiaUtenteInvio() {
		return tipologiaUtenteInvio;
	}
	public void setTipologiaUtenteInvio(Long tipologiaUtenteInvio) {
		this.tipologiaUtenteInvio = tipologiaUtenteInvio;
	}
	public Date getTmstInserimento() {
		return tmstInserimento;
	}
	public void setTmstInserimento(Date tmstInserimento) {
		this.tmstInserimento = tmstInserimento;
	}
	public Date getTmstUltimoAggiornamento() {
		return tmstUltimoAggiornamento;
	}
	public void setTmstUltimoAggiornamento(Date tmstUltimoAggiornamento) {
		this.tmstUltimoAggiornamento = tmstUltimoAggiornamento;
	}
	public String getUseridInserimento() {
		return useridInserimento;
	}
	public void setUseridInserimento(String useridInserimento) {
		this.useridInserimento = useridInserimento;
	}
	public String getUseridUltimoAggiornamento() {
		return useridUltimoAggiornamento;
	}
	public void setUseridUltimoAggiornamento(String useridUltimoAggiornamento) {
		this.useridUltimoAggiornamento = useridUltimoAggiornamento;
	}
	public Long getUtenteInvio() {
		return utenteInvio;
	}
	public void setUtenteInvio(Long utenteInvio) {
		this.utenteInvio = utenteInvio;
	}
	public Long getVersioneLotto() {
		return versioneLotto;
	}
	public void setVersioneLotto(Long versioneLotto) {
		this.versioneLotto = versioneLotto;
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
