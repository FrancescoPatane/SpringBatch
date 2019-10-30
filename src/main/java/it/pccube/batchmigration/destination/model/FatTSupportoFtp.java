package it.pccube.batchmigration.destination.model;

import java.math.BigDecimal;
import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FatTSupportoFtp implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_T_SUPPORTO_FTP";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_SUPPORTO_FTP ( CD_NUM_ATTESTAZ_TRASM_FATTURA, CD_NUM_DECORRENZA_TERMINI, CD_NUM_ESITO, CD_NUM_ESITO_COMMITTENTE, CD_NUM_FATTURE, CD_NUM_MANCATA_CONSEGNA, CD_NUM_METADATI_INVIO_FILE, CD_NUM_RICEVUTA_CONSEGNA, CD_NUM_SCARTO, CD_NUM_SCARTO_ESIT_COMMITTENTE, CD_VERSIONE_QUADRATURA, DT_DATA_ORA_CREAZ_FILE_QUAD, DT_DATA_ORA_CREAZIONE_SUPPORTO, DT_DATA_ORA_INVIO, DT_DATA_ORA_RICEZIONE_SUPPORTO, FL_ERRORE_CONTROLLI_FILE, FL_ERRORE_STATO, FL_VERSO_SDI, ID_DIZ_STATO_SUPPORTO_FTP, ID_FILE_CIFRATO, ID_FILE_FIRMATO, ID_FILE_NON_FIRMATO, ID_FILE_QUADRATURA, ID_SUPPORTO_FTP, NM_IDENTIFICATIVO_NODO, NM_LOG_ERRORE_CONTROLLI_FILE, NM_NOME_FILE_QUADRATURA, NM_NOME_FILE_SUPPORTO, NM_UTENTE_INSERIMENTO, NM_UTENTE_ULTIMA_MODIFICA, NR_NUM_DATI_FATTURA, NR_NUM_ESITO_DATI_FATTURA, PG_NUMERO_SEQUENZIALE, TS_INSERIMENTO, TS_ULTIMA_MODIFICA ) VALUES ( :cdNumAttestazTrasmFattura, :cdNumDecorrenzaTermini, :cdNumEsito, :cdNumEsitoCommittente, :cdNumFatture, :cdNumMancataConsegna, :cdNumMetadatiInvioFile, :cdNumRicevutaConsegna, :cdNumScarto, :cdNumScartoEsitCommittente, :cdVersioneQuadratura, :dtDataOraCreazFileQuad, :dtDataOraCreazioneSupporto, :dtDataOraInvio, :dtDataOraRicezioneSupporto, :flErroreControlliFile, :flErroreStato, :flVersoSdi, :idDizStatoSupportoFtp, :idFileCifrato, :idFileFirmato, :idFileNonFirmato, :idFileQuadratura, :idSupportoFtp, :nmIdentificativoNodo, :nmLogErroreControlliFile, :nmNomeFileQuadratura, :nmNomeFileSupporto, :nmUtenteInserimento, :nmUtenteUltimaModifica, :nrNumDatiFattura, :nrNumEsitoDatiFattura, :pgNumeroSequenziale, :tsInserimento, :tsUltimaModifica )";
	
	private Long idSupportoFtp;

	private String cdNumAttestazTrasmFattura;

	private String cdNumDecorrenzaTermini;

	private String cdNumEsito;

	private String cdNumEsitoCommittente;

	private String cdNumFatture;

	private String cdNumMancataConsegna;

	private String cdNumMetadatiInvioFile;

	private String cdNumRicevutaConsegna;

	private String cdNumScarto;

	private String cdNumScartoEsitCommittente;

	private String cdVersioneQuadratura;

	private Date dtDataOraCreazFileQuad;

	private Date dtDataOraCreazioneSupporto;

	private Date dtDataOraInvio;

	private Date dtDataOraRicezioneSupporto;

	private Short flErroreControlliFile;

	private Short flErroreStato;

	private Short flVersoSdi;

	private String nmIdentificativoNodo;

	private String nmLogErroreControlliFile;

	private String nmNomeFileQuadratura;

	private String nmNomeFileSupporto;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private BigDecimal nrNumDatiFattura;

	private BigDecimal nrNumEsitoDatiFattura;

	
	private String idFileCifrato;

	private String idFileFirmato;

	private String idFileNonFirmato;

	private String idFileQuadratura;

	private String pgNumeroSequenziale;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idDizStatoSupportoFtp;

	public Long getIdSupportoFtp() {
		return idSupportoFtp;
	}

	public void setIdSupportoFtp(Long idSupportoFtp) {
		this.idSupportoFtp = idSupportoFtp;
	}

	public String getCdNumAttestazTrasmFattura() {
		return cdNumAttestazTrasmFattura;
	}

	public void setCdNumAttestazTrasmFattura(String cdNumAttestazTrasmFattura) {
		this.cdNumAttestazTrasmFattura = cdNumAttestazTrasmFattura;
	}

	public String getCdNumDecorrenzaTermini() {
		return cdNumDecorrenzaTermini;
	}

	public void setCdNumDecorrenzaTermini(String cdNumDecorrenzaTermini) {
		this.cdNumDecorrenzaTermini = cdNumDecorrenzaTermini;
	}

	public String getCdNumEsito() {
		return cdNumEsito;
	}

	public void setCdNumEsito(String cdNumEsito) {
		this.cdNumEsito = cdNumEsito;
	}

	public String getCdNumEsitoCommittente() {
		return cdNumEsitoCommittente;
	}

	public void setCdNumEsitoCommittente(String cdNumEsitoCommittente) {
		this.cdNumEsitoCommittente = cdNumEsitoCommittente;
	}

	public String getCdNumFatture() {
		return cdNumFatture;
	}

	public void setCdNumFatture(String cdNumFatture) {
		this.cdNumFatture = cdNumFatture;
	}

	public String getCdNumMancataConsegna() {
		return cdNumMancataConsegna;
	}

	public void setCdNumMancataConsegna(String cdNumMancataConsegna) {
		this.cdNumMancataConsegna = cdNumMancataConsegna;
	}

	public String getCdNumMetadatiInvioFile() {
		return cdNumMetadatiInvioFile;
	}

	public void setCdNumMetadatiInvioFile(String cdNumMetadatiInvioFile) {
		this.cdNumMetadatiInvioFile = cdNumMetadatiInvioFile;
	}

	public String getCdNumRicevutaConsegna() {
		return cdNumRicevutaConsegna;
	}

	public void setCdNumRicevutaConsegna(String cdNumRicevutaConsegna) {
		this.cdNumRicevutaConsegna = cdNumRicevutaConsegna;
	}

	public String getCdNumScarto() {
		return cdNumScarto;
	}

	public void setCdNumScarto(String cdNumScarto) {
		this.cdNumScarto = cdNumScarto;
	}

	public String getCdNumScartoEsitCommittente() {
		return cdNumScartoEsitCommittente;
	}

	public void setCdNumScartoEsitCommittente(String cdNumScartoEsitCommittente) {
		this.cdNumScartoEsitCommittente = cdNumScartoEsitCommittente;
	}

	public String getCdVersioneQuadratura() {
		return cdVersioneQuadratura;
	}

	public void setCdVersioneQuadratura(String cdVersioneQuadratura) {
		this.cdVersioneQuadratura = cdVersioneQuadratura;
	}

	public Date getDtDataOraCreazFileQuad() {
		return dtDataOraCreazFileQuad;
	}

	public void setDtDataOraCreazFileQuad(Date dtDataOraCreazFileQuad) {
		this.dtDataOraCreazFileQuad = dtDataOraCreazFileQuad;
	}

	public Date getDtDataOraCreazioneSupporto() {
		return dtDataOraCreazioneSupporto;
	}

	public void setDtDataOraCreazioneSupporto(Date dtDataOraCreazioneSupporto) {
		this.dtDataOraCreazioneSupporto = dtDataOraCreazioneSupporto;
	}

	public Date getDtDataOraInvio() {
		return dtDataOraInvio;
	}

	public void setDtDataOraInvio(Date dtDataOraInvio) {
		this.dtDataOraInvio = dtDataOraInvio;
	}

	public Date getDtDataOraRicezioneSupporto() {
		return dtDataOraRicezioneSupporto;
	}

	public void setDtDataOraRicezioneSupporto(Date dtDataOraRicezioneSupporto) {
		this.dtDataOraRicezioneSupporto = dtDataOraRicezioneSupporto;
	}

	public Short getFlErroreControlliFile() {
		return flErroreControlliFile;
	}

	public void setFlErroreControlliFile(Short flErroreControlliFile) {
		this.flErroreControlliFile = flErroreControlliFile;
	}

	public Short getFlErroreStato() {
		return flErroreStato;
	}

	public void setFlErroreStato(Short flErroreStato) {
		this.flErroreStato = flErroreStato;
	}

	public Short getFlVersoSdi() {
		return flVersoSdi;
	}

	public void setFlVersoSdi(Short flVersoSdi) {
		this.flVersoSdi = flVersoSdi;
	}

	public String getNmIdentificativoNodo() {
		return nmIdentificativoNodo;
	}

	public void setNmIdentificativoNodo(String nmIdentificativoNodo) {
		this.nmIdentificativoNodo = nmIdentificativoNodo;
	}

	public String getNmLogErroreControlliFile() {
		return nmLogErroreControlliFile;
	}

	public void setNmLogErroreControlliFile(String nmLogErroreControlliFile) {
		this.nmLogErroreControlliFile = nmLogErroreControlliFile;
	}

	public String getNmNomeFileQuadratura() {
		return nmNomeFileQuadratura;
	}

	public void setNmNomeFileQuadratura(String nmNomeFileQuadratura) {
		this.nmNomeFileQuadratura = nmNomeFileQuadratura;
	}

	public String getNmNomeFileSupporto() {
		return nmNomeFileSupporto;
	}

	public void setNmNomeFileSupporto(String nmNomeFileSupporto) {
		this.nmNomeFileSupporto = nmNomeFileSupporto;
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

	public BigDecimal getNrNumDatiFattura() {
		return nrNumDatiFattura;
	}

	public void setNrNumDatiFattura(BigDecimal nrNumDatiFattura) {
		this.nrNumDatiFattura = nrNumDatiFattura;
	}

	public BigDecimal getNrNumEsitoDatiFattura() {
		return nrNumEsitoDatiFattura;
	}

	public void setNrNumEsitoDatiFattura(BigDecimal nrNumEsitoDatiFattura) {
		this.nrNumEsitoDatiFattura = nrNumEsitoDatiFattura;
	}

	public String getIdFileCifrato() {
		return idFileCifrato;
	}

	public void setIdFileCifrato(String idFileCifrato) {
		this.idFileCifrato = idFileCifrato;
	}

	public String getIdFileFirmato() {
		return idFileFirmato;
	}

	public void setIdFileFirmato(String idFileFirmato) {
		this.idFileFirmato = idFileFirmato;
	}

	public String getIdFileNonFirmato() {
		return idFileNonFirmato;
	}

	public void setIdFileNonFirmato(String idFileNonFirmato) {
		this.idFileNonFirmato = idFileNonFirmato;
	}

	public String getIdFileQuadratura() {
		return idFileQuadratura;
	}

	public void setIdFileQuadratura(String idFileQuadratura) {
		this.idFileQuadratura = idFileQuadratura;
	}

	public String getPgNumeroSequenziale() {
		return pgNumeroSequenziale;
	}

	public void setPgNumeroSequenziale(String pgNumeroSequenziale) {
		this.pgNumeroSequenziale = pgNumeroSequenziale;
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

	public Long getIdDizStatoSupportoFtp() {
		return idDizStatoSupportoFtp;
	}

	public void setIdDizStatoSupportoFtp(Long idDizStatoSupportoFtp) {
		this.idDizStatoSupportoFtp = idDizStatoSupportoFtp;
	}
	
	@Override
	public String getPKDescription() {
		return this.getIdSupportoFtp().toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}

	
	
	


}