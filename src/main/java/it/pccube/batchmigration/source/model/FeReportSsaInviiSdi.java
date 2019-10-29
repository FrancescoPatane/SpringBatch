package it.pccube.batchmigration.source.model;

import it.pccube.batchmigration.model.ModelEntity;

import java.util.Date;

public class FeReportSsaInviiSdi implements ModelEntity {

	public static final String TABLE_NAME = "FE_REPORT_SSA_INVII_SDI";
	
	private Long idReportSsaInviiSdi;
	
	private Long idLotto;
	
	private Long versioneLotto;
	
	private Long idArchivio;
	
	private String partitaIvaForn;
	
	private String denominazioneForn;
	
	private String nomeForn;
	
	private String cognomeForn;
	
	private Date dataInvioDa;
	
	private Date dataInvioA;
	
	private Long esitoInvio;
	
	private Date dataRichiesta;
	
	private Long statoRichiesta;
	
	private String useridInserimento;
	
	private Date tmstInserimento;
	
	private String useridUltimoAggiornamento;
	
	private Date tmstUltimoAggiornamento;
	
	private byte[] report;

	public Long getIdReportSsaInviiSdi() {
		return idReportSsaInviiSdi;
	}

	public void setIdReportSsaInviiSdi(Long idReportSsaInviiSdi) {
		this.idReportSsaInviiSdi = idReportSsaInviiSdi;
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

	public Long getIdArchivio() {
		return idArchivio;
	}

	public void setIdArchivio(Long idArchivio) {
		this.idArchivio = idArchivio;
	}

	public String getPartitaIvaForn() {
		return partitaIvaForn;
	}

	public void setPartitaIvaForn(String partitaIvaForn) {
		this.partitaIvaForn = partitaIvaForn;
	}

	public String getDenominazioneForn() {
		return denominazioneForn;
	}

	public void setDenominazioneForn(String denominazioneForn) {
		this.denominazioneForn = denominazioneForn;
	}

	public String getNomeForn() {
		return nomeForn;
	}

	public void setNomeForn(String nomeForn) {
		this.nomeForn = nomeForn;
	}

	public String getCognomeForn() {
		return cognomeForn;
	}

	public void setCognomeForn(String cognomeForn) {
		this.cognomeForn = cognomeForn;
	}

	public Date getDataInvioDa() {
		return dataInvioDa;
	}

	public void setDataInvioDa(Date dataInvioDa) {
		this.dataInvioDa = dataInvioDa;
	}

	public Date getDataInvioA() {
		return dataInvioA;
	}

	public void setDataInvioA(Date dataInvioA) {
		this.dataInvioA = dataInvioA;
	}

	public Long getEsitoInvio() {
		return esitoInvio;
	}

	public void setEsitoInvio(Long esitoInvio) {
		this.esitoInvio = esitoInvio;
	}

	public Date getDataRichiesta() {
		return dataRichiesta;
	}

	public void setDataRichiesta(Date dataRichiesta) {
		this.dataRichiesta = dataRichiesta;
	}

	public Long getStatoRichiesta() {
		return statoRichiesta;
	}

	public void setStatoRichiesta(Long statoRichiesta) {
		this.statoRichiesta = statoRichiesta;
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

	public byte[] getReport() {
		return report;
	}

	public void setReport(byte[] report) {
		this.report = report;
	}

	@Override
	public String getPKDescription() {
		return this.idReportSsaInviiSdi.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	
	
	
}