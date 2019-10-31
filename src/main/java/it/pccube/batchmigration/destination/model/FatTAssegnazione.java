package it.pccube.batchmigration.destination.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FatTAssegnazione implements ModelEntity {

	public static final String TABLE_NAME = "FAT_T_ASSEGNAZIONE";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_ASSEGNAZIONE ( DS_MOTIVO_ASSEGNAZIONE, DT_DATA_ASSEGNAZIONE, ID_ASSEGNAZIONE, ID_DIZ_TIPO_ASSEGNAZIONE, ID_LOTTO, ID_SEDIA_DEST, ID_SEDIA_MITTENTE, NM_UTENTE_INSERIMENTO, NM_UTENTE_ULTIMA_MODIFICA, PG_VERSIONE_LOTTO, TS_INSERIMENTO, TS_ULTIMA_MODIFICA ) VALUES ( :dsMotivoAssegnazione, :dtDataAssegnazione, :idAssegnazione, :idDizTipoAssegnazione, :idLotto, :idSediaDest, :idSediaMittente, :nmUtenteInserimento, :nmUtenteUltimaModifica, :pgVersioneLotto, :tsInserimento, :tsUltimaModifica )";

	private Long idAssegnazione;

	private String dsMotivoAssegnazione;

	private Date dtDataAssegnazione;

	private Long idSediaDest;

	private Long idSediaMittente;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private Long pgVersioneLotto;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idLotto;

	private Long idDizTipoAssegnazione;

	public Long getIdAssegnazione() {
		return idAssegnazione;
	}

	public void setIdAssegnazione(Long idAssegnazione) {
		this.idAssegnazione = idAssegnazione;
	}

	public String getDsMotivoAssegnazione() {
		return dsMotivoAssegnazione;
	}

	public void setDsMotivoAssegnazione(String dsMotivoAssegnazione) {
		this.dsMotivoAssegnazione = dsMotivoAssegnazione;
	}

	public Date getDtDataAssegnazione() {
		return dtDataAssegnazione;
	}

	public void setDtDataAssegnazione(Date dtDataAssegnazione) {
		this.dtDataAssegnazione = dtDataAssegnazione;
	}

	public Long getIdSediaDest() {
		return idSediaDest;
	}

	public void setIdSediaDest(Long idSediaDest) {
		this.idSediaDest = idSediaDest;
	}

	public Long getIdSediaMittente() {
		return idSediaMittente;
	}

	public void setIdSediaMittente(Long idSediaMittente) {
		this.idSediaMittente = idSediaMittente;
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

	public Long getPgVersioneLotto() {
		return pgVersioneLotto;
	}

	public void setPgVersioneLotto(Long pgVersioneLotto) {
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

	public Long getIdLotto() {
		return idLotto;
	}

	public void setIdLotto(Long idLotto) {
		this.idLotto = idLotto;
	}

	public Long getIdDizTipoAssegnazione() {
		return idDizTipoAssegnazione;
	}

	public void setIdDizTipoAssegnazione(Long idDizTipoAssegnazione) {
		this.idDizTipoAssegnazione = idDizTipoAssegnazione;
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