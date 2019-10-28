package it.pccube.batchmigration.source.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FeNotifica implements ModelEntity {
	
	public static final String TABLE_NAME = "FE_NOTIFICA";


	private Date dataOraRicezione;

	private Long annoFatturaEsito;

	private Date dataOraConsegna;

	private Short flagErrore;

	private Long idFattura;

	private Long identificativoSdiArchivio;

	private Long idSdiEsitoCommittente;

	private Long identificativoSdiNotifica;

	private Long identificativoSdiLotto;

	private Long idArchivio;

	private Long idNotifica;

	private Long versioneLotto;

	private Long idLotto;

	private String numeroFatturaEsito;

	private Long posizioneFatturaEsito;

	private Long tipoNotifica;

	private Date tmstInserimento;

	private Date tmstUltimoAggiornamento;

	private String messageIdCommittente;

	private String messageId;

	private String descrizioneNotifica;

	private String useridInserimento;

	private String useridUltimoAggiornamento;

	private String versioneNotificaEsito;

	private String versioneNotifica;

	private String nomeFileLotto;

	private String esito;

	private String nomeFileArchivio;

	private String intermediarioDupliceRuolo;

	private String nomeFileNotifica;

	private String note;

	private String pecMessageId;

	private String descrizioneDestinatario;

	private String codiceDestinatario;

	private String logEccezioni;

	private String ticketConservazione;

	private String hashFileOriginale;
	
	private byte[] xmlNotifica;

	private byte[] zipNotifica;
	
	
	
	
	

	public Date getDataOraRicezione() {
		return dataOraRicezione;
	}

	public void setDataOraRicezione(Date dataOraRicezione) {
		this.dataOraRicezione = dataOraRicezione;
	}

	public Long getAnnoFatturaEsito() {
		return annoFatturaEsito;
	}

	public void setAnnoFatturaEsito(Long annoFatturaEsito) {
		this.annoFatturaEsito = annoFatturaEsito;
	}

	public Date getDataOraConsegna() {
		return dataOraConsegna;
	}

	public void setDataOraConsegna(Date dataOraConsegna) {
		this.dataOraConsegna = dataOraConsegna;
	}

	public Short getFlagErrore() {
		return flagErrore;
	}

	public void setFlagErrore(Short flagErrore) {
		this.flagErrore = flagErrore;
	}

	public Long getIdFattura() {
		return idFattura;
	}

	public void setIdFattura(Long idFattura) {
		this.idFattura = idFattura;
	}

	public Long getIdentificativoSdiArchivio() {
		return identificativoSdiArchivio;
	}

	public void setIdentificativoSdiArchivio(Long identificativoSdiArchivio) {
		this.identificativoSdiArchivio = identificativoSdiArchivio;
	}

	public Long getIdSdiEsitoCommittente() {
		return idSdiEsitoCommittente;
	}

	public void setIdSdiEsitoCommittente(Long idSdiEsitoCommittente) {
		this.idSdiEsitoCommittente = idSdiEsitoCommittente;
	}

	public Long getIdentificativoSdiNotifica() {
		return identificativoSdiNotifica;
	}

	public void setIdentificativoSdiNotifica(Long identificativoSdiNotifica) {
		this.identificativoSdiNotifica = identificativoSdiNotifica;
	}

	public Long getIdentificativoSdiLotto() {
		return identificativoSdiLotto;
	}

	public void setIdentificativoSdiLotto(Long identificativoSdiLotto) {
		this.identificativoSdiLotto = identificativoSdiLotto;
	}

	public Long getIdArchivio() {
		return idArchivio;
	}

	public void setIdArchivio(Long idArchivio) {
		this.idArchivio = idArchivio;
	}

	public Long getIdNotifica() {
		return idNotifica;
	}

	public void setIdNotifica(Long idNotifica) {
		this.idNotifica = idNotifica;
	}

	public Long getVersioneLotto() {
		return versioneLotto;
	}

	public void setVersioneLotto(Long versioneLotto) {
		this.versioneLotto = versioneLotto;
	}

	public Long getIdLotto() {
		return idLotto;
	}

	public void setIdLotto(Long idLotto) {
		this.idLotto = idLotto;
	}

	public String getNumeroFatturaEsito() {
		return numeroFatturaEsito;
	}

	public void setNumeroFatturaEsito(String numeroFatturaEsito) {
		this.numeroFatturaEsito = numeroFatturaEsito;
	}

	public Long getPosizioneFatturaEsito() {
		return posizioneFatturaEsito;
	}

	public void setPosizioneFatturaEsito(Long posizioneFatturaEsito) {
		this.posizioneFatturaEsito = posizioneFatturaEsito;
	}

	public Long getTipoNotifica() {
		return tipoNotifica;
	}

	public void setTipoNotifica(Long tipoNotifica) {
		this.tipoNotifica = tipoNotifica;
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

	public String getMessageIdCommittente() {
		return messageIdCommittente;
	}

	public void setMessageIdCommittente(String messageIdCommittente) {
		this.messageIdCommittente = messageIdCommittente;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getDescrizioneNotifica() {
		return descrizioneNotifica;
	}

	public void setDescrizioneNotifica(String descrizioneNotifica) {
		this.descrizioneNotifica = descrizioneNotifica;
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

	public String getVersioneNotificaEsito() {
		return versioneNotificaEsito;
	}

	public void setVersioneNotificaEsito(String versioneNotificaEsito) {
		this.versioneNotificaEsito = versioneNotificaEsito;
	}

	public String getVersioneNotifica() {
		return versioneNotifica;
	}

	public void setVersioneNotifica(String versioneNotifica) {
		this.versioneNotifica = versioneNotifica;
	}

	public String getNomeFileLotto() {
		return nomeFileLotto;
	}

	public void setNomeFileLotto(String nomeFileLotto) {
		this.nomeFileLotto = nomeFileLotto;
	}

	public String getEsito() {
		return esito;
	}

	public void setEsito(String esito) {
		this.esito = esito;
	}

	public String getNomeFileArchivio() {
		return nomeFileArchivio;
	}

	public void setNomeFileArchivio(String nomeFileArchivio) {
		this.nomeFileArchivio = nomeFileArchivio;
	}

	public String getIntermediarioDupliceRuolo() {
		return intermediarioDupliceRuolo;
	}

	public void setIntermediarioDupliceRuolo(String intermediarioDupliceRuolo) {
		this.intermediarioDupliceRuolo = intermediarioDupliceRuolo;
	}

	public String getNomeFileNotifica() {
		return nomeFileNotifica;
	}

	public void setNomeFileNotifica(String nomeFileNotifica) {
		this.nomeFileNotifica = nomeFileNotifica;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getPecMessageId() {
		return pecMessageId;
	}

	public void setPecMessageId(String pecMessageId) {
		this.pecMessageId = pecMessageId;
	}

	public String getDescrizioneDestinatario() {
		return descrizioneDestinatario;
	}

	public void setDescrizioneDestinatario(String descrizioneDestinatario) {
		this.descrizioneDestinatario = descrizioneDestinatario;
	}

	public String getCodiceDestinatario() {
		return codiceDestinatario;
	}

	public void setCodiceDestinatario(String codiceDestinatario) {
		this.codiceDestinatario = codiceDestinatario;
	}

	public String getLogEccezioni() {
		return logEccezioni;
	}

	public void setLogEccezioni(String logEccezioni) {
		this.logEccezioni = logEccezioni;
	}

	public String getTicketConservazione() {
		return ticketConservazione;
	}

	public void setTicketConservazione(String ticketConservazione) {
		this.ticketConservazione = ticketConservazione;
	}

	public String getHashFileOriginale() {
		return hashFileOriginale;
	}

	public void setHashFileOriginale(String hashFileOriginale) {
		this.hashFileOriginale = hashFileOriginale;
	}

	public byte[] getXmlNotifica() {
		return xmlNotifica;
	}

	public void setXmlNotifica(byte[] xmlNotifica) {
		this.xmlNotifica = xmlNotifica;
	}

	public byte[] getZipNotifica() {
		return zipNotifica;
	}

	public void setZipNotifica(byte[] zipNotifica) {
		this.zipNotifica = zipNotifica;
	}

	@Override
	public String getPKDescription() {
		return this.idNotifica.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	
	
	
	


}