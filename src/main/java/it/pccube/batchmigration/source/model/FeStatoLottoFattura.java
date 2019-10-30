package it.pccube.batchmigration.source.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FeStatoLottoFattura implements ModelEntity {
	
	public static final String TABLE_NAME = "FE_STATO_LOTTO_FATTURA";

	private Long idStatoLottoFattura;

	private Long stato;
	
	private Date dataOra;

	private Long versioneLotto;

	private Long idLotto;

	private Long idFattura;

	private String useridInserimento;

	private Date tmstInserimento;

	private String useridUltimoAggiornamento;

	private Date tmstUltimoAggiornamento;

	private Long idNotifica;

	private Long idMonitoraggioInvioSdi;

	public Long getIdStatoLottoFattura() {
		return idStatoLottoFattura;
	}

	public void setIdStatoLottoFattura(Long idStatoLottoFattura) {
		this.idStatoLottoFattura = idStatoLottoFattura;
	}

	public Long getStato() {
		return stato;
	}

	public void setStato(Long stato) {
		this.stato = stato;
	}

	public Date getDataOra() {
		return dataOra;
	}

	public void setDataOra(Date dataOra) {
		this.dataOra = dataOra;
	}

	public Long getVersioneLotto() {
		return versioneLotto;
	}

	public void setVersioneLotto(Long versioneLotto) {
		this.versioneLotto = versioneLotto;
	}

	public Long getIdLotto() {
		return idLotto;
	}

	public void setIdLotto(Long idLotto) {
		this.idLotto = idLotto;
	}

	public Long getIdFattura() {
		return idFattura;
	}

	public void setIdFattura(Long idFattura) {
		this.idFattura = idFattura;
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

	public Long getIdNotifica() {
		return idNotifica;
	}

	public void setIdNotifica(Long idNotifica) {
		this.idNotifica = idNotifica;
	}

	public Long getIdMonitoraggioInvioSdi() {
		return idMonitoraggioInvioSdi;
	}

	public void setIdMonitoraggioInvioSdi(Long idMonitoraggioInvioSdi) {
		this.idMonitoraggioInvioSdi = idMonitoraggioInvioSdi;
	}

	@Override
	public String getPKDescription() {
		return this.getIdStatoLottoFattura().toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	
	


}