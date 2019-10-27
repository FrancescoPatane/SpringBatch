package it.pccube.batchmigration.source.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FeExcelFattura implements ModelEntity {

	
	public static final String TABLE_NAME="FE_EXCEL_FATTURA";
	
	private Long idExcelFattura;
	
	private Date dataOraCaricamento;
	
	private Date dataOraUltimaModifica;
	
	private Long idUtenteAzienda;
	
	private String descrizione;
	
	private Long stato;
	
	private Long idLotto;
	
	private Long versioneLotto;
	
	private Long idFattura;
	
	private Long idExcelFatturaSostituente;
	
	private String useridInserimento;
	
	private Date tmstInserimento;
	
	private String useridUltimoAggiornamento;
	
	private Date tmstUltimoAggiornamento;
	
	private String contentTypeExcelOriginale;
	
	private String nomeExcelOriginale;
	
	private String contentTypeExcelValidazione;
	
	private String nomeExcelValidazione;
	
	private byte[] fileExcelOriginale;
	
	private byte[] fileExcelConValidazioni;

	public Long getIdExcelFattura() {
		return idExcelFattura;
	}

	public void setIdExcelFattura(Long idExcelFattura) {
		this.idExcelFattura = idExcelFattura;
	}

	public Date getDataOraCaricamento() {
		return dataOraCaricamento;
	}

	public void setDataOraCaricamento(Date dataOraCaricamento) {
		this.dataOraCaricamento = dataOraCaricamento;
	}

	public Date getDataOraUltimaModifica() {
		return dataOraUltimaModifica;
	}

	public void setDataOraUltimaModifica(Date dataOraUltimaModifica) {
		this.dataOraUltimaModifica = dataOraUltimaModifica;
	}

	public Long getIdUtenteAzienda() {
		return idUtenteAzienda;
	}

	public void setIdUtenteAzienda(Long idUtenteAzienda) {
		this.idUtenteAzienda = idUtenteAzienda;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Long getStato() {
		return stato;
	}

	public void setStato(Long stato) {
		this.stato = stato;
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

	public String getContentTypeExcelOriginale() {
		return contentTypeExcelOriginale;
	}

	public void setContentTypeExcelOriginale(String contentTypeExcelOriginale) {
		this.contentTypeExcelOriginale = contentTypeExcelOriginale;
	}

	public String getNomeExcelOriginale() {
		return nomeExcelOriginale;
	}

	public void setNomeExcelOriginale(String nomeExcelOriginale) {
		this.nomeExcelOriginale = nomeExcelOriginale;
	}

	public String getContentTypeExcelValidazione() {
		return contentTypeExcelValidazione;
	}

	public void setContentTypeExcelValidazione(String contentTypeExcelValidazione) {
		this.contentTypeExcelValidazione = contentTypeExcelValidazione;
	}

	public String getNomeExcelValidazione() {
		return nomeExcelValidazione;
	}

	public void setNomeExcelValidazione(String nomeExcelValidazione) {
		this.nomeExcelValidazione = nomeExcelValidazione;
	}

	public byte[] getFileExcelOriginale() {
		return fileExcelOriginale;
	}

	public void setFileExcelOriginale(byte[] fileExcelOriginale) {
		this.fileExcelOriginale = fileExcelOriginale;
	}

	public byte[] getFileExcelConValidazioni() {
		return fileExcelConValidazioni;
	}

	public void setFileExcelConValidazioni(byte[] fileExcelConValidazioni) {
		this.fileExcelConValidazioni = fileExcelConValidazioni;
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
