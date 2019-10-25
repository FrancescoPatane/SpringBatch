package it.pccube.batchmigration.source.model;



import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FeEsitoFtp implements ModelEntity {

	
	public static final String TABLE_NAME="FE_ESITO_FTP";
	


	private Long idEsitoFtp;
	
	private Long idSupportoFtp;
	
	private String identificativoNodo;
	
	private Date dataOraRicezione;
	
	private Date dataOraEsito;
	
	private String nomeSupporto;
	
	private String esito;
	
	private String versioneEsito;
	
	private String nomeFileEsito;
	
	private Short flagAttuale;
	
	private Short flagVersoSdi;
	
	private Long stato;
	
	private Short flagRigenerato;
	
	private Short flagErroreStato;
	
	private Short flagErroreControlliFile;
	
	private String logErroreControlliFile;
	
	private String useridInserimento;
	
	private Date tmstInserimento;
	
	private String useridUltimoAggiornamento;
	
	private Date tmstUltimoAggiornamento;
	
	private String tipoEsito;
	
	private byte[] fileNonFirmato;
	
	private byte[] fileFirmato;
	
	private byte[] fileCifrato;
	
	

	public Long getIdEsitoFtp() {
		return idEsitoFtp;
	}

	public void setIdEsitoFtp(Long idEsitoFtp) {
		this.idEsitoFtp = idEsitoFtp;
	}

	public Long getIdSupportoFtp() {
		return idSupportoFtp;
	}

	public void setIdSupportoFtp(Long idSupportoFtp) {
		this.idSupportoFtp = idSupportoFtp;
	}

	public String getIdentificativoNodo() {
		return identificativoNodo;
	}

	public void setIdentificativoNodo(String identificativoNodo) {
		this.identificativoNodo = identificativoNodo;
	}

	public Date getDataOraRicezione() {
		return dataOraRicezione;
	}

	public void setDataOraRicezione(Date dataOraRicezione) {
		this.dataOraRicezione = dataOraRicezione;
	}

	public Date getDataOraEsito() {
		return dataOraEsito;
	}

	public void setDataOraEsito(Date dataOraEsito) {
		this.dataOraEsito = dataOraEsito;
	}

	public String getNomeSupporto() {
		return nomeSupporto;
	}

	public void setNomeSupporto(String nomeSupporto) {
		this.nomeSupporto = nomeSupporto;
	}

	public String getEsito() {
		return esito;
	}

	public void setEsito(String esito) {
		this.esito = esito;
	}

	public String getVersioneEsito() {
		return versioneEsito;
	}

	public void setVersioneEsito(String versioneEsito) {
		this.versioneEsito = versioneEsito;
	}

	public String getNomeFileEsito() {
		return nomeFileEsito;
	}

	public void setNomeFileEsito(String nomeFileEsito) {
		this.nomeFileEsito = nomeFileEsito;
	}

	public Short getFlagAttuale() {
		return flagAttuale;
	}

	public void setFlagAttuale(Short flagAttuale) {
		this.flagAttuale = flagAttuale;
	}

	public Short getFlagVersoSdi() {
		return flagVersoSdi;
	}

	public void setFlagVersoSdi(Short flagVersoSdi) {
		this.flagVersoSdi = flagVersoSdi;
	}

	public Long getStato() {
		return stato;
	}

	public void setStato(Long stato) {
		this.stato = stato;
	}

	public Short getFlagRigenerato() {
		return flagRigenerato;
	}

	public void setFlagRigenerato(Short flagRigenerato) {
		this.flagRigenerato = flagRigenerato;
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

	public String getTipoEsito() {
		return tipoEsito;
	}

	public void setTipoEsito(String tipoEsito) {
		this.tipoEsito = tipoEsito;
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
		return this.idEsitoFtp.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	

	
}