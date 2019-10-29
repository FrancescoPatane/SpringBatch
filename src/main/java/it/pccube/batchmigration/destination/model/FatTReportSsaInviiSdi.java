package it.pccube.batchmigration.destination.model;

import java.math.BigDecimal;
import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FatTReportSsaInviiSdi implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_T_REPORT_SSA_INVII_SDI";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_REPORT_SSA_INVII_SDI ( CD_PARTITA_IVA_FORN, DT_DATA_INVIO_A, DT_DATA_INVIO_DA, DT_DATA_RICHIESTA, ID_ARCHIVIO, ID_DIZ_STATO_RICHIESTA, ID_ESITO_INVIO, ID_LOTTO, ID_REPORT, ID_REPORT_SSA_INVII_SDI, NM_COGNOME_FORN, NM_DENOMINAZIONE_FORN, NM_NOME_FORN, NM_UTENTE_INSERIMENTO, NM_UTENTE_ULTIMA_MODIFICA, PG_VERSIONE_LOTTO, TS_INSERIMENTO, TS_ULTIMA_MODIFICA ) VALUES ( :cdPartitaIvaForn, :dtDataInvioA, :dtDataInvioDa, :dtDataRichiesta, :idArchivio, :idDizStatoRichiesta, :idEsitoInvio, :idLotto, :idReport, :idReportSsaInviiSdi, :nmCognomeForn, :nmDenominazioneForn, :nmNomeForn, :nmUtenteInserimento, :nmUtenteUltimaModifica, :pgVersioneLotto, :tsInserimento, :tsUltimaModifica )";
	
	private Long idReportSsaInviiSdi;

	private String cdPartitaIvaForn;

	private Date dtDataInvioA;

	private Date dtDataInvioDa;

	private Date dtDataRichiesta;

	private Long idArchivio;

	private Long idLotto;

	private String nmCognomeForn;

	private String nmDenominazioneForn;

	private String nmNomeForn;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;
	
	private String idReport;

	private BigDecimal pgVersioneLotto;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idEsitoInvio;

	private Long idDizStatoRichiesta;

	public Long getIdReportSsaInviiSdi() {
		return idReportSsaInviiSdi;
	}

	public void setIdReportSsaInviiSdi(Long idReportSsaInviiSdi) {
		this.idReportSsaInviiSdi = idReportSsaInviiSdi;
	}

	public String getCdPartitaIvaForn() {
		return cdPartitaIvaForn;
	}

	public void setCdPartitaIvaForn(String cdPartitaIvaForn) {
		this.cdPartitaIvaForn = cdPartitaIvaForn;
	}

	public Date getDtDataInvioA() {
		return dtDataInvioA;
	}

	public void setDtDataInvioA(Date dtDataInvioA) {
		this.dtDataInvioA = dtDataInvioA;
	}

	public Date getDtDataInvioDa() {
		return dtDataInvioDa;
	}

	public void setDtDataInvioDa(Date dtDataInvioDa) {
		this.dtDataInvioDa = dtDataInvioDa;
	}

	public Date getDtDataRichiesta() {
		return dtDataRichiesta;
	}

	public void setDtDataRichiesta(Date dtDataRichiesta) {
		this.dtDataRichiesta = dtDataRichiesta;
	}

	public Long getIdArchivio() {
		return idArchivio;
	}

	public void setIdArchivio(Long idArchivio) {
		this.idArchivio = idArchivio;
	}

	public Long getIdLotto() {
		return idLotto;
	}

	public void setIdLotto(Long idLotto) {
		this.idLotto = idLotto;
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

	public Long getIdEsitoInvio() {
		return idEsitoInvio;
	}

	public void setIdEsitoInvio(Long idEsitoInvio) {
		this.idEsitoInvio = idEsitoInvio;
	}

	public Long getIdDizStatoRichiesta() {
		return idDizStatoRichiesta;
	}

	public void setIdDizStatoRichiesta(Long idDizStatoRichiesta) {
		this.idDizStatoRichiesta = idDizStatoRichiesta;
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