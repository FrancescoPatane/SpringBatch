package it.pccube.batchmigration.destination.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;

public class FatTApplicativoLog implements ModelEntity {

	public static final String TABLE_NAME = "FAT_T_APPLICATIVO_LOG";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_APPLICATIVO_LOG (CD_INDIRIZZO_IP, DT_DATA_OPERAZIONE, ID_ADESIONE, ID_ARCHIVIO, ID_DETTAGLIO_LINEA, ID_EXCEL_FATTURA, ID_FATTURA, ID_LOG_APPLICATIVO, ID_LOTTO, ID_NOTIFICA, ID_OPERAZIONE, ID_REPORT_SSA_INVII_SDI, ID_REPORT_SSA_STATO_ADE, ID_RIC_ESTRAZIONE_UFFICIALE, ID_RIC_IMPRONTA_ARCHIVIO, ID_SEDIA, ID_SUPPORTO, ID_UTENTE_AMMINISTRAZIONE, NM_UTENTE_INSERIMENTO, NM_UTENTE_ULTIMA_MODIFICA, PG_VERSIONE_LOTTO, TS_INSERIMENTO, TS_ULTIMA_MODIFICA )VALUES( :cdIndirizzoIp, :dtDataOperazione, :idAdesione, :idArchivio, :idDettaglioLinea, :idExcelFattura, :idFattura, :idLogApplicativo, :idLotto, :idNotifica, :idOperazione, :idReportSsaInviiSdi, :idReportSsaStatoAde, :idRicEstrazioneUfficiale, :idRicImprontaArchivio, :idSedia, :idSupporto, :idUtenteAmministrazione, :nmUtenteInserimento, :nmUtenteUltimaModifica,  :pgVersioneLotto, :tsInserimento, :tsUltimaModifica)";


	private Long idLogApplicativo;

	private String cdIndirizzoIp;

	private Date dtDataOperazione;

	private Long idAdesione;

	private Long idArchivio;

	private Long idDettaglioLinea;

	private Long idExcelFattura;

	private Long idFattura;

	private Long idLotto;

	private Long idNotifica;

	private Long idReportSsaInviiSdi;

	private Long idReportSsaStatoAde;

	private Long idRicEstrazioneUfficiale;

	private Long idRicImprontaArchivio;

	private Long idSedia;

	private Long idSupporto;

	private Long idUtenteAmministrazione;

	private Long pgVersioneLotto;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idOperazione;

	public Long getIdLogApplicativo() {
		return idLogApplicativo;
	}

	public void setIdLogApplicativo(Long idLogApplicativo) {
		this.idLogApplicativo = idLogApplicativo;
	}

	public String getCdIndirizzoIp() {
		return cdIndirizzoIp;
	}

	public void setCdIndirizzoIp(String cdIndirizzoIp) {
		this.cdIndirizzoIp = cdIndirizzoIp;
	}

	public Date getDtDataOperazione() {
		return dtDataOperazione;
	}

	public void setDtDataOperazione(Date dtDataOperazione) {
		this.dtDataOperazione = dtDataOperazione;
	}

	public Long getIdAdesione() {
		return idAdesione;
	}

	public void setIdAdesione(Long idAdesione) {
		this.idAdesione = idAdesione;
	}

	public Long getIdArchivio() {
		return idArchivio;
	}

	public void setIdArchivio(Long idArchivio) {
		this.idArchivio = idArchivio;
	}

	public Long getIdDettaglioLinea() {
		return idDettaglioLinea;
	}

	public void setIdDettaglioLinea(Long idDettaglioLinea) {
		this.idDettaglioLinea = idDettaglioLinea;
	}

	public Long getIdExcelFattura() {
		return idExcelFattura;
	}

	public void setIdExcelFattura(Long idExcelFattura) {
		this.idExcelFattura = idExcelFattura;
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

	public Long getIdNotifica() {
		return idNotifica;
	}

	public void setIdNotifica(Long idNotifica) {
		this.idNotifica = idNotifica;
	}

	public Long getIdReportSsaInviiSdi() {
		return idReportSsaInviiSdi;
	}

	public void setIdReportSsaInviiSdi(Long idReportSsaInviiSdi) {
		this.idReportSsaInviiSdi = idReportSsaInviiSdi;
	}

	public Long getIdReportSsaStatoAde() {
		return idReportSsaStatoAde;
	}

	public void setIdReportSsaStatoAde(Long idReportSsaStatoAde) {
		this.idReportSsaStatoAde = idReportSsaStatoAde;
	}

	public Long getIdRicEstrazioneUfficiale() {
		return idRicEstrazioneUfficiale;
	}

	public void setIdRicEstrazioneUfficiale(Long idRicEstrazioneUfficiale) {
		this.idRicEstrazioneUfficiale = idRicEstrazioneUfficiale;
	}

	public Long getIdRicImprontaArchivio() {
		return idRicImprontaArchivio;
	}

	public void setIdRicImprontaArchivio(Long idRicImprontaArchivio) {
		this.idRicImprontaArchivio = idRicImprontaArchivio;
	}

	public Long getIdSedia() {
		return idSedia;
	}

	public void setIdSedia(Long idSedia) {
		this.idSedia = idSedia;
	}

	public Long getIdSupporto() {
		return idSupporto;
	}

	public void setIdSupporto(Long idSupporto) {
		this.idSupporto = idSupporto;
	}

	public Long getIdUtenteAmministrazione() {
		return idUtenteAmministrazione;
	}

	public void setIdUtenteAmministrazione(Long idUtenteAmministrazione) {
		this.idUtenteAmministrazione = idUtenteAmministrazione;
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

	public Long getIdOperazione() {
		return idOperazione;
	}

	public void setIdOperazione(Long idOperazione) {
		this.idOperazione = idOperazione;
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