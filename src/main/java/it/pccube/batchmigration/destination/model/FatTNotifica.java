package it.pccube.batchmigration.destination.model;

import java.math.BigDecimal;
import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FatTNotifica implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_T_NOTIFICA";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_NOTIFICA ( CD_CODICE_DESTINATARIO, CD_ESITO, CD_HASH_FILE_ORIGINALE, CD_IDENTIFICATIVO_SDI_ARCHIVIO, CD_IDENTIFICATIVO_SDI_LOTTO, CD_IDENTIFICATIVO_SDI_NOTIFICA, CD_MESSAGE_ID, CD_MESSAGE_ID_COMMITTENTE, CD_NUMERO_FATTURA_ESITO, CD_VERSIONE_NOTIFICA, CD_VERSIONE_NOTIFICA_ESITO, DS_DESCRIZIONE_DESTINATARIO, DS_DESCRIZIONE_NOTIFICA, DT_DATA_ORA_CONSEGNA, DT_DATA_ORA_RICEZIONE, FL_ERRORE, ID_ARCHIVIO, ID_DIZ_TIPO_NOTIFICA, ID_FATTURA, ID_LOTTO, ID_NOTIFICA, ID_SDI_ESITO_COMMITTENTE, ID_XML_NOTIFICA, ID_ZIP_NOTIFICA, NM_INTERMEDIARIO_DUPLICE_RUOLO, NM_NOME_FILE_ARCHIVIO, NM_NOME_FILE_LOTTO, NM_NOME_FILE_NOTIFICA, NM_PEC_MESSAGE_ID, NM_TICKET_CONSERVAZIONE, NM_UTENTE_INSERIMENTO, NM_UTENTE_ULTIMA_MODIFICA, NR_ANNO_FATTURA_ESITO, NR_POSIZIONE_FATTURA_ESITO, OJ_LOG_ECCEZIONI, PG_VERSIONE_LOTTO, TS_INSERIMENTO, TS_ULTIMA_MODIFICA, TX_NOTE )VALUES( :cdCodiceDestinatario, :cdEsito, :cdHashFileOriginale, :cdIdentificativoSdiArchivio, :cdIdentificativoSdiLotto, :cdIdentificativoSdiNotifica, :cdMessageId, :cdMessageIdCommittente, :cdNumeroFatturaEsito, :cdVersioneNotifica, :cdVersioneNotificaEsito, :dsDescrizioneDestinatario, :dsDescrizioneNotifica, :dtDataOraConsegna, :dtDataOraRicezione, :flErrore, :idArchivio, :idDizTipoNotifica, :idFattura, :idLotto, :idNotifica, :idSdiEsitoCommittente, :idXmlNotifica, :idZipNotifica, :nmIntermediarioDupliceRuolo, :nmNomeFileArchivio, :nmNomeFileLotto, :nmNomeFileNotifica, :nmPecMessageId, :nmTicketConservazione, :nmUtenteInserimento, :nmUtenteUltimaModifica, :nrAnnoFatturaEsito, :nrPosizioneFatturaEsito, :ojLogEccezioni, :pgVersioneLotto, :tsInserimento, :tsUltimaModifica, :txNote )";
	
	
	private Long idNotifica;

	private String cdCodiceDestinatario;

	private String cdEsito;

	private String cdHashFileOriginale;

	private String cdIdentificativoSdiArchivio;

	private String cdIdentificativoSdiLotto;

	private String cdIdentificativoSdiNotifica;

	private String cdNumeroFatturaEsito;

	private String cdVersioneNotifica;

	private String cdVersioneNotificaEsito;

	private String dsDescrizioneDestinatario;

	private String dsDescrizioneNotifica;

	private String cdMessageIdCommittente;

	private Date dtDataOraConsegna;

	private Date dtDataOraRicezione;

	private Short flErrore;

	private Long idSdiEsitoCommittente;

	private String nmIntermediarioDupliceRuolo;

	private String cdMessageId;

	private String nmNomeFileArchivio;

	private String nmNomeFileLotto;

	private String nmNomeFileNotifica;

	private String nmPecMessageId;

	private String nmTicketConservazione;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private BigDecimal nrAnnoFatturaEsito;

	private BigDecimal nrPosizioneFatturaEsito;

	private String ojLogEccezioni;

	private String idXmlNotifica;

	private String idZipNotifica;

	private BigDecimal pgVersioneLotto;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private String txNote;

	private Long idDizTipoNotifica;

	private Long idArchivio;

	private Long idFattura;

	private Long idLotto;
	
	
	
	

	public Long getIdNotifica() {
		return idNotifica;
	}

	public void setIdNotifica(Long idNotifica) {
		this.idNotifica = idNotifica;
	}

	public String getCdCodiceDestinatario() {
		return cdCodiceDestinatario;
	}

	public void setCdCodiceDestinatario(String cdCodiceDestinatario) {
		this.cdCodiceDestinatario = cdCodiceDestinatario;
	}

	public String getCdEsito() {
		return cdEsito;
	}

	public void setCdEsito(String cdEsito) {
		this.cdEsito = cdEsito;
	}

	public String getCdHashFileOriginale() {
		return cdHashFileOriginale;
	}

	public void setCdHashFileOriginale(String cdHashFileOriginale) {
		this.cdHashFileOriginale = cdHashFileOriginale;
	}

	public String getCdIdentificativoSdiArchivio() {
		return cdIdentificativoSdiArchivio;
	}

	public void setCdIdentificativoSdiArchivio(String cdIdentificativoSdiArchivio) {
		this.cdIdentificativoSdiArchivio = cdIdentificativoSdiArchivio;
	}

	public String getCdIdentificativoSdiLotto() {
		return cdIdentificativoSdiLotto;
	}

	public void setCdIdentificativoSdiLotto(String cdIdentificativoSdiLotto) {
		this.cdIdentificativoSdiLotto = cdIdentificativoSdiLotto;
	}

	public String getCdIdentificativoSdiNotifica() {
		return cdIdentificativoSdiNotifica;
	}

	public void setCdIdentificativoSdiNotifica(String cdIdentificativoSdiNotifica) {
		this.cdIdentificativoSdiNotifica = cdIdentificativoSdiNotifica;
	}

	public String getCdNumeroFatturaEsito() {
		return cdNumeroFatturaEsito;
	}

	public void setCdNumeroFatturaEsito(String cdNumeroFatturaEsito) {
		this.cdNumeroFatturaEsito = cdNumeroFatturaEsito;
	}

	public String getCdVersioneNotifica() {
		return cdVersioneNotifica;
	}

	public void setCdVersioneNotifica(String cdVersioneNotifica) {
		this.cdVersioneNotifica = cdVersioneNotifica;
	}

	public String getCdVersioneNotificaEsito() {
		return cdVersioneNotificaEsito;
	}

	public void setCdVersioneNotificaEsito(String cdVersioneNotificaEsito) {
		this.cdVersioneNotificaEsito = cdVersioneNotificaEsito;
	}

	public String getDsDescrizioneDestinatario() {
		return dsDescrizioneDestinatario;
	}

	public void setDsDescrizioneDestinatario(String dsDescrizioneDestinatario) {
		this.dsDescrizioneDestinatario = dsDescrizioneDestinatario;
	}

	public String getDsDescrizioneNotifica() {
		return dsDescrizioneNotifica;
	}

	public void setDsDescrizioneNotifica(String dsDescrizioneNotifica) {
		this.dsDescrizioneNotifica = dsDescrizioneNotifica;
	}

	public String getCdMessageIdCommittente() {
		return cdMessageIdCommittente;
	}

	public void setCdMessageIdCommittente(String cdMessageIdCommittente) {
		this.cdMessageIdCommittente = cdMessageIdCommittente;
	}

	public Date getDtDataOraConsegna() {
		return dtDataOraConsegna;
	}

	public void setDtDataOraConsegna(Date dtDataOraConsegna) {
		this.dtDataOraConsegna = dtDataOraConsegna;
	}

	public Date getDtDataOraRicezione() {
		return dtDataOraRicezione;
	}

	public void setDtDataOraRicezione(Date dtDataOraRicezione) {
		this.dtDataOraRicezione = dtDataOraRicezione;
	}

	public Short getFlErrore() {
		return flErrore;
	}

	public void setFlErrore(Short flErrore) {
		this.flErrore = flErrore;
	}

	public Long getIdSdiEsitoCommittente() {
		return idSdiEsitoCommittente;
	}

	public void setIdSdiEsitoCommittente(Long idSdiEsitoCommittente) {
		this.idSdiEsitoCommittente = idSdiEsitoCommittente;
	}

	public String getNmIntermediarioDupliceRuolo() {
		return nmIntermediarioDupliceRuolo;
	}

	public void setNmIntermediarioDupliceRuolo(String nmIntermediarioDupliceRuolo) {
		this.nmIntermediarioDupliceRuolo = nmIntermediarioDupliceRuolo;
	}

	public String getCdMessageId() {
		return cdMessageId;
	}

	public void setCdMessageId(String cdMessageId) {
		this.cdMessageId = cdMessageId;
	}

	public String getNmNomeFileArchivio() {
		return nmNomeFileArchivio;
	}

	public void setNmNomeFileArchivio(String nmNomeFileArchivio) {
		this.nmNomeFileArchivio = nmNomeFileArchivio;
	}

	public String getNmNomeFileLotto() {
		return nmNomeFileLotto;
	}

	public void setNmNomeFileLotto(String nmNomeFileLotto) {
		this.nmNomeFileLotto = nmNomeFileLotto;
	}

	public String getNmNomeFileNotifica() {
		return nmNomeFileNotifica;
	}

	public void setNmNomeFileNotifica(String nmNomeFileNotifica) {
		this.nmNomeFileNotifica = nmNomeFileNotifica;
	}

	public String getNmPecMessageId() {
		return nmPecMessageId;
	}

	public void setNmPecMessageId(String nmPecMessageId) {
		this.nmPecMessageId = nmPecMessageId;
	}

	public String getNmTicketConservazione() {
		return nmTicketConservazione;
	}

	public void setNmTicketConservazione(String nmTicketConservazione) {
		this.nmTicketConservazione = nmTicketConservazione;
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

	public BigDecimal getNrAnnoFatturaEsito() {
		return nrAnnoFatturaEsito;
	}

	public void setNrAnnoFatturaEsito(BigDecimal nrAnnoFatturaEsito) {
		this.nrAnnoFatturaEsito = nrAnnoFatturaEsito;
	}

	public BigDecimal getNrPosizioneFatturaEsito() {
		return nrPosizioneFatturaEsito;
	}

	public void setNrPosizioneFatturaEsito(BigDecimal nrPosizioneFatturaEsito) {
		this.nrPosizioneFatturaEsito = nrPosizioneFatturaEsito;
	}

	public String getOjLogEccezioni() {
		return ojLogEccezioni;
	}

	public void setOjLogEccezioni(String ojLogEccezioni) {
		this.ojLogEccezioni = ojLogEccezioni;
	}

	public String getIdXmlNotifica() {
		return idXmlNotifica;
	}

	public void setIdXmlNotifica(String idXmlNotifica) {
		this.idXmlNotifica = idXmlNotifica;
	}

	public String getIdZipNotifica() {
		return idZipNotifica;
	}

	public void setIdZipNotifica(String idZipNotifica) {
		this.idZipNotifica = idZipNotifica;
	}

	public BigDecimal getPgVersioneLotto() {
		return pgVersioneLotto;
	}

	public void setPgVersioneLotto(BigDecimal pgVersioneLotto) {
		this.pgVersioneLotto = pgVersioneLotto;
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

	public String getTxNote() {
		return txNote;
	}

	public void setTxNote(String txNote) {
		this.txNote = txNote;
	}

	public Long getIdDizTipoNotifica() {
		return idDizTipoNotifica;
	}

	public void setIdDizTipoNotifica(Long idDizTipoNotifica) {
		this.idDizTipoNotifica = idDizTipoNotifica;
	}

	public Long getIdArchivio() {
		return idArchivio;
	}

	public void setIdArchivio(Long idArchivio) {
		this.idArchivio = idArchivio;
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

	@Override
	public String getPKDescription() {
		return this.idNotifica.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	
	

}