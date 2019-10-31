package it.pccube.batchmigration.destination.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;

public class FatTLottoArchivio implements ModelEntity {

	public static final String TABLE_NAME = "FAT_T_LOTTO_ARCHIVIO";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_LOTTO_ARCHIVIO ( ID_LOTTO, ID_ARCHIVIO, PG_VERSIONE_LOTTO, NM_UTENTE_INSERIMENTO, NM_UTENTE_ULTIMA_MODIFICA, TS_INSERIMENTO, TS_ULTIMA_MODIFICA ) VALUES ( :idLotto, :idArchivio, :pgVersioneLotto, :nmUtenteInserimento, :nmUtenteUltimaModifica, :tsInserimento, :tsUltimaModifica )";

	
	private Long idLotto;

	private Long idArchivio;

	private BigDecimal pgVersioneLotto;
	
	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private Date tsInserimento;

	private Date tsUltimaModifica;

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

	public BigDecimal getPgVersioneLotto() {
		return pgVersioneLotto;
	}

	public void setPgVersioneLotto(BigDecimal pgVersioneLotto) {
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
	
	@Override
	public String getPKDescription() {
		return this.idLotto+";"+this.idArchivio;
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}

}