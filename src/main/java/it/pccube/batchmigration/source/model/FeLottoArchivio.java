package it.pccube.batchmigration.source.model;

import it.pccube.batchmigration.model.ModelEntity;

import java.io.Serializable;
import java.util.Date;


public class FeLottoArchivio implements ModelEntity{
	
	
	public static final String TABLE_NAME = "FE_LOTTO_ARCHIVIO";
	
	
	private Long idLotto;
	
	private Long idArchivio;

	private Long versioneLotto;
	
	private String useridInserimento;

	private Date tmstInserimento;

	private String useridUltimoAggiornamento;

	private Date tmstUltimoAggiornamento;

	public Long getIdLotto() {
		return idLotto;
	}

	public void setIdLotto(Long idLotto) {
		this.idLotto = idLotto;
	}

	public Long getIdArchivio() {
		return idArchivio;
	}

	public void setIdArchivio(Long idArchivio) {
		this.idArchivio = idArchivio;
	}

	public Long getVersioneLotto() {
		return versioneLotto;
	}

	public void setVersioneLotto(Long versioneLotto) {
		this.versioneLotto = versioneLotto;
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
		return this.idLotto+";"+this.idArchivio;
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	
	
	

}