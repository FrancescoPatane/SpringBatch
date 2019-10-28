package it.pccube.batchmigration.source.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FeMonitoraggioInvioSdi implements ModelEntity  {
	
	public static final String TABLE_NAME = "FE_MONITORAGGIO_INVIO_SDI";

	private Long idMonitoraggioInvioSdi;

	private Long versioneLotto;

	private Long idArchivio;
	
	private Long idLotto;
	
	private Long esitoInvio;

	private Date dataOraInvio;

	private String useridInserimento;

	private Date tmstInserimento;

	private String useridUltimoAggiornamento;

	private Date tmstUltimoAggiornamento;

	private Long identificativoSdiLotto;

	private Date dataOraRicezione;
	
	private String log;
	
	private Long identificativoSdiArchivio;
	
	private Long tipologiaElementoInviato;

	public Long getIdMonitoraggioInvioSdi() {
		return idMonitoraggioInvioSdi;
	}

	public void setIdMonitoraggioInvioSdi(Long idMonitoraggioInvioSdi) {
		this.idMonitoraggioInvioSdi = idMonitoraggioInvioSdi;
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

	public Date getDataOraInvio() {
		return dataOraInvio;
	}

	public void setDataOraInvio(Date dataOraInvio) {
		this.dataOraInvio = dataOraInvio;
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

	public Long getIdentificativoSdiLotto() {
		return identificativoSdiLotto;
	}

	public void setIdentificativoSdiLotto(Long identificativoSdiLotto) {
		this.identificativoSdiLotto = identificativoSdiLotto;
	}

	public Date getDataOraRicezione() {
		return dataOraRicezione;
	}

	public void setDataOraRicezione(Date dataOraRicezione) {
		this.dataOraRicezione = dataOraRicezione;
	}

	public String getLog() {
		return log;
	}

	public void setLog(String log) {
		this.log = log;
	}

	

	public Long getIdentificativoSdiArchivio() {
		return identificativoSdiArchivio;
	}

	public void setIdentificativoSdiArchivio(Long identificativoSdiArchivio) {
		this.identificativoSdiArchivio = identificativoSdiArchivio;
	}
	
	

	public Long getEsitoInvio() {
		return esitoInvio;
	}

	public void setEsitoInvio(Long esitoInvio) {
		this.esitoInvio = esitoInvio;
	}
	
	

	public Long getTipologiaElementoInviato() {
		return tipologiaElementoInviato;
	}

	public void setTipologiaElementoInviato(Long tipologiaElementoInviato) {
		this.tipologiaElementoInviato = tipologiaElementoInviato;
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