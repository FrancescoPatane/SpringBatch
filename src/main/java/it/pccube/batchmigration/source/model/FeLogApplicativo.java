package it.pccube.batchmigration.source.model;

import it.pccube.batchmigration.model.ModelEntity;

import java.util.Date;


public class FeLogApplicativo implements ModelEntity {
	
	public static final String TABLE_NAME = "FE_LOG_APPLICATIVO";


	
	private Long idLogApplicativo;
	
	private String indirizzoIp;
	
	private Long idOperazione;
	
	private Long idAdesione;
	
	private Long idLotto;
	
	private Long versioneLotto;
	
	private Long idFattura;
	
	private Long idArchivio;
	
	private Long idSupporto;
	
	private Long idNotifica;
	
	private Long idDettaglioLinea;
	
	private Date dataOperazione;
	
	private String useridInserimento;

	private Date tmstInserimento;
	
	private String useridUltimoAggiornamento;
	
	private Date tmstUltimoAggiornamento;
	
	private Long idUtenteAzienda;

	private Long idUtenteAmministrazione;

	private Long idExcelFattura;
	
	private Long idRicImprontaArchivio;
	
	private Long idRicEstrazioneUfficiale;
	
	private Long idReportSsaStatoAde;
	
	private Long idReportSsaInviiSdi;

	public Long getIdLogApplicativo() {
		return idLogApplicativo;
	}

	public void setIdLogApplicativo(Long idLogApplicativo) {
		this.idLogApplicativo = idLogApplicativo;
	}

	public String getIndirizzoIp() {
		return indirizzoIp;
	}

	public void setIndirizzoIp(String indirizzoIp) {
		this.indirizzoIp = indirizzoIp;
	}

	public Long getIdOperazione() {
		return idOperazione;
	}

	public void setIdOperazione(Long idOperazione) {
		this.idOperazione = idOperazione;
	}

	public Long getIdAdesione() {
		return idAdesione;
	}

	public void setIdAdesione(Long idAdesione) {
		this.idAdesione = idAdesione;
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

	public Long getIdArchivio() {
		return idArchivio;
	}

	public void setIdArchivio(Long idArchivio) {
		this.idArchivio = idArchivio;
	}

	public Long getIdSupporto() {
		return idSupporto;
	}

	public void setIdSupporto(Long idSupporto) {
		this.idSupporto = idSupporto;
	}

	public Long getIdNotifica() {
		return idNotifica;
	}

	public void setIdNotifica(Long idNotifica) {
		this.idNotifica = idNotifica;
	}

	public Long getIdDettaglioLinea() {
		return idDettaglioLinea;
	}

	public void setIdDettaglioLinea(Long idDettaglioLinea) {
		this.idDettaglioLinea = idDettaglioLinea;
	}

	public Date getDataOperazione() {
		return dataOperazione;
	}

	public void setDataOperazione(Date dataOperazione) {
		this.dataOperazione = dataOperazione;
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

	public Long getIdUtenteAzienda() {
		return idUtenteAzienda;
	}

	public void setIdUtenteAzienda(Long idUtenteAzienda) {
		this.idUtenteAzienda = idUtenteAzienda;
	}

	public Long getIdUtenteAmministrazione() {
		return idUtenteAmministrazione;
	}

	public void setIdUtenteAmministrazione(Long idUtenteAmministrazione) {
		this.idUtenteAmministrazione = idUtenteAmministrazione;
	}

	public Long getIdExcelFattura() {
		return idExcelFattura;
	}

	public void setIdExcelFattura(Long idExcelFattura) {
		this.idExcelFattura = idExcelFattura;
	}

	public Long getIdRicImprontaArchivio() {
		return idRicImprontaArchivio;
	}

	public void setIdRicImprontaArchivio(Long idRicImprontaArchivio) {
		this.idRicImprontaArchivio = idRicImprontaArchivio;
	}

	public Long getIdRicEstrazioneUfficiale() {
		return idRicEstrazioneUfficiale;
	}

	public void setIdRicEstrazioneUfficiale(Long idRicEstrazioneUfficiale) {
		this.idRicEstrazioneUfficiale = idRicEstrazioneUfficiale;
	}

	public Long getIdReportSsaStatoAde() {
		return idReportSsaStatoAde;
	}

	public void setIdReportSsaStatoAde(Long idReportSsaStatoAde) {
		this.idReportSsaStatoAde = idReportSsaStatoAde;
	}

	

	public Long getIdReportSsaInviiSdi() {
		return idReportSsaInviiSdi;
	}

	public void setIdReportSsaInviiSdi(Long idReportSsaInviiSdi) {
		this.idReportSsaInviiSdi = idReportSsaInviiSdi;
	}

	@Override
	public String getPKDescription() {
		return this.idLogApplicativo.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	

}