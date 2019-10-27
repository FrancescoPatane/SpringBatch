package it.pccube.batchmigration.destination.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FatTExcelFattura implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_T_EXCEL_FATTURA";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_EXCEL_FATTURA ( DS_DESCRIZIONE, DT_DATA_ORA_CARICAMENTO, DT_DATA_ORA_ULTIMA_MODIFICA, ID_DIZ_STATO_EXCEL_FATTURA, ID_EXCEL_FATTURA, ID_EXCEL_FATTURA_SOSTITUENTE, ID_FATTURA, ID_FILE_EXCEL_CON_VALIDAZIONI, ID_FILE_EXCEL_ORIGINALE, ID_LOTTO, ID_SEDIA, NM_CONTENT_TYPE_EXCEL_ORIG, NM_CONTENT_TYPE_EXCEL_VALIDAZ, NM_NOME_EXCEL_ORIGINALE, NM_NOME_EXCEL_VALIDAZIONI, NM_UTENTE_INSERIMENTO, NM_UTENTE_ULTIMA_MODIFICA, PG_VERSIONE_LOTTO, TS_INSERIMENTO, TS_ULTIMA_MODIFICA )VALUES( :dsDescrizione, :dtDataOraCaricamento, :dtDataOraUltimaModifica, :idDizStatoExcelFattura, :idExcelFattura, :idExcelFatturaSostituente, :idFattura, :idFileExcelConValidazioni, :idFileExcelOriginale, :idLotto, :idSedia, :nmContentTypeExcelOrig, :nmContentTypeExcelValidaz, :nmNomeExcelOriginale, :nmNomeExcelValidazioni, :nmUtenteInserimento, :nmUtenteUltimaModifica, :pgVersioneLotto, :tsInserimento, :tsUltimaModifica )";

	private Long idExcelFattura;

	private String dsDescrizione;

	private Date dtDataOraCaricamento;

	private Date dtDataOraUltimaModifica;

	private Long idSedia;

	private String nmContentTypeExcelOrig;

	private String nmContentTypeExcelValidaz;

	private String nmNomeExcelOriginale;

	private String nmNomeExcelValidazioni;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private String idFileExcelConValidazioni;
	
	private String idFileExcelOriginale;

	private Long pgVersioneLotto;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idFattura;

	private Long idExcelFatturaSostituente;

	private Long idLotto;

	private Long idDizStatoExcelFattura;

	public Long getIdExcelFattura() {
		return idExcelFattura;
	}

	public void setIdExcelFattura(Long idExcelFattura) {
		this.idExcelFattura = idExcelFattura;
	}

	public String getDsDescrizione() {
		return dsDescrizione;
	}

	public void setDsDescrizione(String dsDescrizione) {
		this.dsDescrizione = dsDescrizione;
	}

	public Date getDtDataOraCaricamento() {
		return dtDataOraCaricamento;
	}

	public void setDtDataOraCaricamento(Date dtDataOraCaricamento) {
		this.dtDataOraCaricamento = dtDataOraCaricamento;
	}

	public Date getDtDataOraUltimaModifica() {
		return dtDataOraUltimaModifica;
	}

	public void setDtDataOraUltimaModifica(Date dtDataOraUltimaModifica) {
		this.dtDataOraUltimaModifica = dtDataOraUltimaModifica;
	}

	public Long getIdSedia() {
		return idSedia;
	}

	public void setIdSedia(Long idSedia) {
		this.idSedia = idSedia;
	}

	public String getNmContentTypeExcelOrig() {
		return nmContentTypeExcelOrig;
	}

	public void setNmContentTypeExcelOrig(String nmContentTypeExcelOrig) {
		this.nmContentTypeExcelOrig = nmContentTypeExcelOrig;
	}

	public String getNmContentTypeExcelValidaz() {
		return nmContentTypeExcelValidaz;
	}

	public void setNmContentTypeExcelValidaz(String nmContentTypeExcelValidaz) {
		this.nmContentTypeExcelValidaz = nmContentTypeExcelValidaz;
	}

	public String getNmNomeExcelOriginale() {
		return nmNomeExcelOriginale;
	}

	public void setNmNomeExcelOriginale(String nmNomeExcelOriginale) {
		this.nmNomeExcelOriginale = nmNomeExcelOriginale;
	}

	public String getNmNomeExcelValidazioni() {
		return nmNomeExcelValidazioni;
	}

	public void setNmNomeExcelValidazioni(String nmNomeExcelValidazioni) {
		this.nmNomeExcelValidazioni = nmNomeExcelValidazioni;
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

	public String getIdFileExcelConValidazioni() {
		return idFileExcelConValidazioni;
	}

	public void setIdFileExcelConValidazioni(String idFileExcelConValidazioni) {
		this.idFileExcelConValidazioni = idFileExcelConValidazioni;
	}

	public String getIdFileExcelOriginale() {
		return idFileExcelOriginale;
	}

	public void setIdFileExcelOriginale(String idFileExcelOriginale) {
		this.idFileExcelOriginale = idFileExcelOriginale;
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

	public Long getIdFattura() {
		return idFattura;
	}

	public void setIdFattura(Long idFattura) {
		this.idFattura = idFattura;
	}

	public Long getIdExcelFatturaSostituente() {
		return idExcelFatturaSostituente;
	}

	public void setIdExcelFatturaSostituente(Long idExcelFatturaSostituente) {
		this.idExcelFatturaSostituente = idExcelFatturaSostituente;
	}

	public Long getIdLotto() {
		return idLotto;
	}

	public void setIdLotto(Long idLotto) {
		this.idLotto = idLotto;
	}

	public Long getIdDizStatoExcelFattura() {
		return idDizStatoExcelFattura;
	}

	public void setIdDizStatoExcelFattura(Long idDizStatoExcelFattura) {
		this.idDizStatoExcelFattura = idDizStatoExcelFattura;
	}

	@Override
	public String getPKDescription() {
		return this.idExcelFattura.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	
	



}