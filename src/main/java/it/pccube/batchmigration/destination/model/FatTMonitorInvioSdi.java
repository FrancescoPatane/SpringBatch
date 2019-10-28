package it.pccube.batchmigration.destination.model;

import java.math.BigDecimal;
import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FatTMonitorInvioSdi implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_T_MONITOR_INVIO_SDI";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_MONITOR_INVIO_SDI ( CD_IDENTIFICATIVO_SDI_ARCHIVIO, CD_IDENTIFICATIVO_SDI_LOTTO, DT_DATA_ORA_INVIO, DT_DATA_ORA_RICEZIONE, ID_ARCHIVIO, ID_DIZ_TIPO_ELEMENTO_INVIATO, ID_ESITO_INVIO, ID_LOTTO, ID_MONITORAGGIO_INVIO_SDI, NM_UTENTE_INSERIMENTO, NM_UTENTE_ULTIMA_MODIFICA, OJ_LOG, PG_VERSIONE_LOTTO, TS_INSERIMENTO, TS_ULTIMA_MODIFICA ) VALUES ( :cdIdentificativoSdiArchivio, :cdIdentificativoSdiLotto, :dtDataOraInvio, :dtDataOraRicezione, :idArchivio, :idDizTipElementoInviato, :idEsitoInvio, :idLotto, :idMonitoraggioInvioSdi, :nmUtenteInserimento, :nmUtenteUltimaModifica, :ojLog, :pgVersioneLotto, :tsInserimento, :tsUltimaModifica )";

	private Long idMonitoraggioInvioSdi;

	private String cdIdentificativoSdiArchivio;

	private String cdIdentificativoSdiLotto;

	private Date dtDataOraInvio;

	private Date dtDataOraRicezione;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private String ojLog;

	private BigDecimal pgVersioneLotto;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idEsitoInvio;

	private Long idDizTipElementoInviato;

	private Long idArchivio;

	private Long idLotto;

	public Long getIdMonitoraggioInvioSdi() {
		return idMonitoraggioInvioSdi;
	}

	public void setIdMonitoraggioInvioSdi(Long idMonitoraggioInvioSdi) {
		this.idMonitoraggioInvioSdi = idMonitoraggioInvioSdi;
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

	public Date getDtDataOraInvio() {
		return dtDataOraInvio;
	}

	public void setDtDataOraInvio(Date dtDataOraInvio) {
		this.dtDataOraInvio = dtDataOraInvio;
	}

	public Date getDtDataOraRicezione() {
		return dtDataOraRicezione;
	}

	public void setDtDataOraRicezione(Date dtDataOraRicezione) {
		this.dtDataOraRicezione = dtDataOraRicezione;
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

	public String getOjLog() {
		return ojLog;
	}

	public void setOjLog(String ojLog) {
		this.ojLog = ojLog;
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

	public Long getIdDizTipElementoInviato() {
		return idDizTipElementoInviato;
	}

	public void setIdDizTipElementoInviato(Long idDizTipElementoInviato) {
		this.idDizTipElementoInviato = idDizTipElementoInviato;
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

	@Override
	public String getPKDescription() {
		return this.idMonitoraggioInvioSdi.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	
	
	
	
	
	
	
	


}