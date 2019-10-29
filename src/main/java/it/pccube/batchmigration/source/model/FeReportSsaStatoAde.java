package it.pccube.batchmigration.source.model;

import it.pccube.batchmigration.model.ModelEntity;

import java.util.Date;



public class FeReportSsaStatoAde implements ModelEntity {

	public static final String TABLE_NAME = "FE_REPORT_SSA_STATO_ADE";
	
	
	private Date dataAdesioneA;

	private Date dataRichiesta;

	private Date dataModificaAdesioneA;

	private Date dataModificaAdesioneDa;

	private Date dataAdesioneDa;

	private Long statoRichiesta;

	private Long idReportSsaStatoAde;

	private Long statoAdesione;

	private Date tmstInserimento;

	private Date tmstUltimoAggiornamento;

	private String partitaIvaForn;

	private String useridUltimoAggiornamento;

	private String useridInserimento;

	private String denominazioneForn;

	private String cognomeForn;
	
	private String nomeForn;
	
	private byte[] report;

	public Date getDataAdesioneA() {
		return dataAdesioneA;
	}

	public void setDataAdesioneA(Date dataAdesioneA) {
		this.dataAdesioneA = dataAdesioneA;
	}

	public Date getDataRichiesta() {
		return dataRichiesta;
	}

	public void setDataRichiesta(Date dataRichiesta) {
		this.dataRichiesta = dataRichiesta;
	}

	public Date getDataModificaAdesioneA() {
		return dataModificaAdesioneA;
	}

	public void setDataModificaAdesioneA(Date dataModificaAdesioneA) {
		this.dataModificaAdesioneA = dataModificaAdesioneA;
	}

	public Date getDataModificaAdesioneDa() {
		return dataModificaAdesioneDa;
	}

	public void setDataModificaAdesioneDa(Date dataModificaAdesioneDa) {
		this.dataModificaAdesioneDa = dataModificaAdesioneDa;
	}

	public Date getDataAdesioneDa() {
		return dataAdesioneDa;
	}

	public void setDataAdesioneDa(Date dataAdesioneDa) {
		this.dataAdesioneDa = dataAdesioneDa;
	}

	public Long getStatoRichiesta() {
		return statoRichiesta;
	}

	public void setStatoRichiesta(Long statoRichiesta) {
		this.statoRichiesta = statoRichiesta;
	}

	public Long getIdReportSsaStatoAde() {
		return idReportSsaStatoAde;
	}

	public void setIdReportSsaStatoAde(Long idReportSsaStatoAde) {
		this.idReportSsaStatoAde = idReportSsaStatoAde;
	}

	public Long getStatoAdesione() {
		return statoAdesione;
	}

	public void setStatoAdesione(Long statoAdesione) {
		this.statoAdesione = statoAdesione;
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

	public String getPartitaIvaForn() {
		return partitaIvaForn;
	}

	public void setPartitaIvaForn(String partitaIvaForn) {
		this.partitaIvaForn = partitaIvaForn;
	}

	public String getUseridUltimoAggiornamento() {
		return useridUltimoAggiornamento;
	}

	public void setUseridUltimoAggiornamento(String useridUltimoAggiornamento) {
		this.useridUltimoAggiornamento = useridUltimoAggiornamento;
	}

	public String getUseridInserimento() {
		return useridInserimento;
	}

	public void setUseridInserimento(String useridInserimento) {
		this.useridInserimento = useridInserimento;
	}

	public String getDenominazioneForn() {
		return denominazioneForn;
	}

	public void setDenominazioneForn(String denominazioneForn) {
		this.denominazioneForn = denominazioneForn;
	}

	public String getCognomeForn() {
		return cognomeForn;
	}

	public void setCognomeForn(String cognomeForn) {
		this.cognomeForn = cognomeForn;
	}

	public String getNomeForn() {
		return nomeForn;
	}

	public void setNomeForn(String nomeForn) {
		this.nomeForn = nomeForn;
	}

	public byte[] getReport() {
		return report;
	}

	public void setReport(byte[] report) {
		this.report = report;
	}

	@Override
	public String getPKDescription() {
		return this.idReportSsaStatoAde.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	

	

}