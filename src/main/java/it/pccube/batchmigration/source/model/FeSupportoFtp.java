package it.pccube.batchmigration.source.model;


import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FeSupportoFtp implements ModelEntity {

	public static final String TABLE_NAME = "FE_SUPPORTO_FTP";

	private Long idSupportoFtp;

	private String nomeFileSupporto;

	private Date dataOraCreazFileQuad;

	private Long numFatture;

	private Long numRicevutaConsegna;

	private Long numMancataConsegna;

	private Long numScarto;

	private Long numEsito;

	private Long numMetadatiInvioFile;

	private Long numEsitoCommittente;

	private Long numScartoEsitoCommittente;

	private Long numDecorrenzaTermini;

	private Long numAttestazioneTrasmFattura;

	private String versioneQuadratura;

	private String nomeFileQuadratura;

	private Date dataOraCreazioneSupporto;

	private Date dataOraRicezioneSupporto;

	private String numeroSequenziale;

	private Short flagVersoSdi;

	private Date dataOraInvio;

	private Long stato;

	private Short flagErroreStato;

	private Short flagErroreControlliFile ;

	private String logErroreControlliFile;

	private String useridInserimento;

	private Date tmstInserimento;

	private String useridUltimoAggiornamento;

	private Date tmstUltimoAggiornamento;

	private String identificativoNodo;

	private Long numDatiFattura;

	private Long numEsitoDatiFattura;

	private byte[] fileQuadratura;

	private byte[] fileNonFirmato;

	private byte[] fileFirmato;

	private byte[] fileCifrato;

	public Long getIdSupportoFtp() {
		return idSupportoFtp;
	}

	public void setIdSupportoFtp(Long idSupportoFtp) {
		this.idSupportoFtp = idSupportoFtp;
	}

	public String getNomeFileSupporto() {
		return nomeFileSupporto;
	}

	public void setNomeFileSupporto(String nomeFileSupporto) {
		this.nomeFileSupporto = nomeFileSupporto;
	}

	public Date getDataOraCreazFileQuad() {
		return dataOraCreazFileQuad;
	}

	public void setDataOraCreazFileQuad(Date dataOraCreazFileQuad) {
		this.dataOraCreazFileQuad = dataOraCreazFileQuad;
	}

	public Long getNumFatture() {
		return numFatture;
	}

	public void setNumFatture(Long numFatture) {
		this.numFatture = numFatture;
	}

	public Long getNumRicevutaConsegna() {
		return numRicevutaConsegna;
	}

	public void setNumRicevutaConsegna(Long numRicevutaConsegna) {
		this.numRicevutaConsegna = numRicevutaConsegna;
	}

	public Long getNumMancataConsegna() {
		return numMancataConsegna;
	}

	public void setNumMancataConsegna(Long numMancataConsegna) {
		this.numMancataConsegna = numMancataConsegna;
	}

	public Long getNumScarto() {
		return numScarto;
	}

	public void setNumScarto(Long numScarto) {
		this.numScarto = numScarto;
	}

	public Long getNumEsito() {
		return numEsito;
	}

	public void setNumEsito(Long numEsito) {
		this.numEsito = numEsito;
	}

	public Long getNumMetadatiInvioFile() {
		return numMetadatiInvioFile;
	}

	public void setNumMetadatiInvioFile(Long numMetadatiInvioFile) {
		this.numMetadatiInvioFile = numMetadatiInvioFile;
	}

	public Long getNumEsitoCommittente() {
		return numEsitoCommittente;
	}

	public void setNumEsitoCommittente(Long numEsitoCommittente) {
		this.numEsitoCommittente = numEsitoCommittente;
	}

	public Long getNumScartoEsitoCommittente() {
		return numScartoEsitoCommittente;
	}

	public void setNumScartoEsitoCommittente(Long numScartoEsitoCommittente) {
		this.numScartoEsitoCommittente = numScartoEsitoCommittente;
	}

	public Long getNumDecorrenzaTermini() {
		return numDecorrenzaTermini;
	}

	public void setNumDecorrenzaTermini(Long numDecorrenzaTermini) {
		this.numDecorrenzaTermini = numDecorrenzaTermini;
	}

	public Long getNumAttestazioneTrasmFattura() {
		return numAttestazioneTrasmFattura;
	}

	public void setNumAttestazioneTrasmFattura(Long numAttestazioneTrasmFattura) {
		this.numAttestazioneTrasmFattura = numAttestazioneTrasmFattura;
	}

	public String getVersioneQuadratura() {
		return versioneQuadratura;
	}

	public void setVersioneQuadratura(String versioneQuadratura) {
		this.versioneQuadratura = versioneQuadratura;
	}

	public String getNomeFileQuadratura() {
		return nomeFileQuadratura;
	}

	public void setNomeFileQuadratura(String nomeFileQuadratura) {
		this.nomeFileQuadratura = nomeFileQuadratura;
	}

	public Date getDataOraCreazioneSupporto() {
		return dataOraCreazioneSupporto;
	}

	public void setDataOraCreazioneSupporto(Date dataOraCreazioneSupporto) {
		this.dataOraCreazioneSupporto = dataOraCreazioneSupporto;
	}

	public Date getDataOraRicezioneSupporto() {
		return dataOraRicezioneSupporto;
	}

	public void setDataOraRicezioneSupporto(Date dataOraRicezioneSupporto) {
		this.dataOraRicezioneSupporto = dataOraRicezioneSupporto;
	}

	public String getNumeroSequenziale() {
		return numeroSequenziale;
	}

	public void setNumeroSequenziale(String numeroSequenziale) {
		this.numeroSequenziale = numeroSequenziale;
	}

	public Short getFlagVersoSdi() {
		return flagVersoSdi;
	}

	public void setFlagVersoSdi(Short flagVersoSdi) {
		this.flagVersoSdi = flagVersoSdi;
	}

	public Date getDataOraInvio() {
		return dataOraInvio;
	}

	public void setDataOraInvio(Date dataOraInvio) {
		this.dataOraInvio = dataOraInvio;
	}

	public Long getStato() {
		return stato;
	}

	public void setStato(Long stato) {
		this.stato = stato;
	}

	public Short getFlagErroreStato() {
		return flagErroreStato;
	}

	public void setFlagErroreStato(Short flagErroreStato) {
		this.flagErroreStato = flagErroreStato;
	}

	public Short getFlagErroreControlliFile() {
		return flagErroreControlliFile;
	}

	public void setFlagErroreControlliFile(Short flagErroreControlliFile) {
		this.flagErroreControlliFile = flagErroreControlliFile;
	}

	public String getLogErroreControlliFile() {
		return logErroreControlliFile;
	}

	public void setLogErroreControlliFile(String logErroreControlliFile) {
		this.logErroreControlliFile = logErroreControlliFile;
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

	public String getIdentificativoNodo() {
		return identificativoNodo;
	}

	public void setIdentificativoNodo(String identificativoNodo) {
		this.identificativoNodo = identificativoNodo;
	}

	public Long getNumDatiFattura() {
		return numDatiFattura;
	}

	public void setNumDatiFattura(Long numDatiFattura) {
		this.numDatiFattura = numDatiFattura;
	}

	public Long getNumEsitoDatiFattura() {
		return numEsitoDatiFattura;
	}

	public void setNumEsitoDatiFattura(Long numEsitoDatiFattura) {
		this.numEsitoDatiFattura = numEsitoDatiFattura;
	}

	public byte[] getFileQuadratura() {
		return fileQuadratura;
	}

	public void setFileQuadratura(byte[] fileQuadratura) {
		this.fileQuadratura = fileQuadratura;
	}

	public byte[] getFileNonFirmato() {
		return fileNonFirmato;
	}

	public void setFileNonFirmato(byte[] fileNonFirmato) {
		this.fileNonFirmato = fileNonFirmato;
	}

	public byte[] getFileFirmato() {
		return fileFirmato;
	}

	public void setFileFirmato(byte[] fileFirmato) {
		this.fileFirmato = fileFirmato;
	}

	public byte[] getFileCifrato() {
		return fileCifrato;
	}

	public void setFileCifrato(byte[] fileCifrato) {
		this.fileCifrato = fileCifrato;
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