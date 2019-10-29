package it.pccube.batchmigration.destination.model;

import java.io.Serializable;
import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FatTReportSsaStatoAde implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_T_REPORT_SSA_STATO_ADE";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_REPORT_SSA_STATO_ADE ( CD_PARTITA_IVA_FORN, DT_DATA_ADESIONE_A, DT_DATA_ADESIONE_DA, DT_DATA_MODIFICA_ADESIONE_A, DT_DATA_MODIFICA_ADESIONE_DA, DT_DATA_RICHIESTA, ID_DIZ_STATO_ADESIONE, ID_DIZ_STATO_RICHIESTA, ID_REPORT, ID_REPORT_SSA_STATO_ADE, NM_COGNOME_FORN, NM_DENOMINAZIONE_FORN, NM_NOME_FORN, NM_UTENTE_INSERIMENTO, NM_UTENTE_ULTIMA_MODIFICA, TS_INSERIMENTO, TS_ULTIMA_MODIFICA ) VALUES ( :cdPartitaIvaForn, :dtDataAdesioneA, :dtDataAdesioneDa, :dtDataModificaAdesioneA, :dtDataModificaAdesioneDa, :dtDataRichiesta, :idDizStatoAdesione, :idDizStatoRichiesta, :idReport, :idReportSsaStatoAde, :nmCognomeForn, :nmDenominazioneForn, :nmNomeForn, :nmUtenteInserimento, :nmUtenteUltimaModifica, :tsInserimento, :tsUltimaModifica )";
	
	
	private Long idReportSsaStatoAde;

	private String cdPartitaIvaForn;

	private Date dtDataAdesioneA;

	private Date dtDataAdesioneDa;

	private Date dtDataModificaAdesioneA;

	private Date dtDataModificaAdesioneDa;

	private Date dtDataRichiesta;

	private String nmCognomeForn;

	private String nmDenominazioneForn;

	private String nmNomeForn;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private String idReport;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idDizStatoAdesione;

	private Long idDizStatoRichiesta;

	public Long getIdReportSsaStatoAde() {
		return idReportSsaStatoAde;
	}

	public void setIdReportSsaStatoAde(Long idReportSsaStatoAde) {
		this.idReportSsaStatoAde = idReportSsaStatoAde;
	}

	public String getCdPartitaIvaForn() {
		return cdPartitaIvaForn;
	}

	public void setCdPartitaIvaForn(String cdPartitaIvaForn) {
		this.cdPartitaIvaForn = cdPartitaIvaForn;
	}

	public Date getDtDataAdesioneA() {
		return dtDataAdesioneA;
	}

	public void setDtDataAdesioneA(Date dtDataAdesioneA) {
		this.dtDataAdesioneA = dtDataAdesioneA;
	}

	public Date getDtDataAdesioneDa() {
		return dtDataAdesioneDa;
	}

	public void setDtDataAdesioneDa(Date dtDataAdesioneDa) {
		this.dtDataAdesioneDa = dtDataAdesioneDa;
	}

	public Date getDtDataModificaAdesioneA() {
		return dtDataModificaAdesioneA;
	}

	public void setDtDataModificaAdesioneA(Date dtDataModificaAdesioneA) {
		this.dtDataModificaAdesioneA = dtDataModificaAdesioneA;
	}

	public Date getDtDataModificaAdesioneDa() {
		return dtDataModificaAdesioneDa;
	}

	public void setDtDataModificaAdesioneDa(Date dtDataModificaAdesioneDa) {
		this.dtDataModificaAdesioneDa = dtDataModificaAdesioneDa;
	}

	public Date getDtDataRichiesta() {
		return dtDataRichiesta;
	}

	public void setDtDataRichiesta(Date dtDataRichiesta) {
		this.dtDataRichiesta = dtDataRichiesta;
	}

	public String getNmCognomeForn() {
		return nmCognomeForn;
	}

	public void setNmCognomeForn(String nmCognomeForn) {
		this.nmCognomeForn = nmCognomeForn;
	}

	public String getNmDenominazioneForn() {
		return nmDenominazioneForn;
	}

	public void setNmDenominazioneForn(String nmDenominazioneForn) {
		this.nmDenominazioneForn = nmDenominazioneForn;
	}

	public String getNmNomeForn() {
		return nmNomeForn;
	}

	public void setNmNomeForn(String nmNomeForn) {
		this.nmNomeForn = nmNomeForn;
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

	public String getIdReport() {
		return idReport;
	}

	public void setIdReport(String idReport) {
		this.idReport = idReport;
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

	public Long getIdDizStatoAdesione() {
		return idDizStatoAdesione;
	}

	public void setIdDizStatoAdesione(Long idDizStatoAdesione) {
		this.idDizStatoAdesione = idDizStatoAdesione;
	}

	public Long getIdDizStatoRichiesta() {
		return idDizStatoRichiesta;
	}

	public void setIdDizStatoRichiesta(Long idDizStatoRichiesta) {
		this.idDizStatoRichiesta = idDizStatoRichiesta;
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