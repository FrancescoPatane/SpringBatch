package it.pccube.batchmigration.source.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;

public class FeAssegnazione implements ModelEntity{
	
	public static final String TABLE_NAME = "FE_ASSEGNAZIONE";
	
	private Long idAssegnazione;
	private Long idLotto;
	private Long versioneLotto;
	private Long idUtenteAziendaMittente;
	private Long idUtenteAziendaDest;
	private Date dataAssegnazione;
	private Long tipoAssegnazione;
	private String motivoAssegnazione;
	private String useridInserimento;
	private Date tmstInserimento;
	private String useridUltimoAggiornamento;
	private Date tmstUltimoAggiornamento;
	
	
	public Long getIdAssegnazione() {
		return idAssegnazione;
	}
	public void setIdAssegnazione(Long idAssegnazione) {
		this.idAssegnazione = idAssegnazione;
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
	public Long getIdUtenteAziendaMittente() {
		return idUtenteAziendaMittente;
	}
	public void setIdUtenteAziendaMittente(Long idUtenteAziendaMittente) {
		this.idUtenteAziendaMittente = idUtenteAziendaMittente;
	}
	public Long getIdUtenteAziendaDest() {
		return idUtenteAziendaDest;
	}
	public void setIdUtenteAziendaDest(Long idUtenteAziendaDest) {
		this.idUtenteAziendaDest = idUtenteAziendaDest;
	}
	public Date getDataAssegnazione() {
		return dataAssegnazione;
	}
	public void setDataAssegnazione(Date dataAssegnazione) {
		this.dataAssegnazione = dataAssegnazione;
	}
	public Long getTipoAssegnazione() {
		return tipoAssegnazione;
	}
	public void setTipoAssegnazione(Long tipoAssegnazione) {
		this.tipoAssegnazione = tipoAssegnazione;
	}
	public String getMotivoAssegnazione() {
		return motivoAssegnazione;
	}
	public void setMotivoAssegnazione(String motivoAssegnazione) {
		this.motivoAssegnazione = motivoAssegnazione;
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
	@Override
	public String getPKDescription() {
		return this.idAssegnazione.toString();
	}
	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	
	

}
