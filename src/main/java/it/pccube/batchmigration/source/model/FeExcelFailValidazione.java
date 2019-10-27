package it.pccube.batchmigration.source.model;

import it.pccube.batchmigration.model.ModelEntity;

import java.util.Date;

public class FeExcelFailValidazione implements ModelEntity {

	
	public static final String TABLE_NAME="FE_EXCEL_FAIL_VALIDAZIONE";

	private Long idExcelFailValidazione;
	
	private Long idExcelFattura;
	
	private String colonnaCella;
	
	private String rigaCella;
	
	private Long idDizTipoValidazione;
	
	private Long idRegolaValidazione;
	
	private String useridInserimento;
	
	private Date tmstInserimento;
	
	private String useridUltimoAggiornamento;
	
	private Date tmstUltimoAggiornamento;
	
	private String nomeSheet;

	public Long getIdExcelFailValidazione() {
		return idExcelFailValidazione;
	}

	public void setIdExcelFailValidazione(Long idExcelFailValidazione) {
		this.idExcelFailValidazione = idExcelFailValidazione;
	}

	public Long getIdExcelFattura() {
		return idExcelFattura;
	}

	public void setIdExcelFattura(Long idExcelFattura) {
		this.idExcelFattura = idExcelFattura;
	}

	public String getColonnaCella() {
		return colonnaCella;
	}

	public void setColonnaCella(String colonnaCella) {
		this.colonnaCella = colonnaCella;
	}

	public String getRigaCella() {
		return rigaCella;
	}

	public void setRigaCella(String rigaCella) {
		this.rigaCella = rigaCella;
	}

	public Long getIdDizTipoValidazione() {
		return idDizTipoValidazione;
	}

	public void setIdDizTipoValidazione(Long idDizTipoValidazione) {
		this.idDizTipoValidazione = idDizTipoValidazione;
	}

	public Long getIdRegolaValidazione() {
		return idRegolaValidazione;
	}

	public void setIdRegolaValidazione(Long idRegolaValidazione) {
		this.idRegolaValidazione = idRegolaValidazione;
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

	public String getNomeSheet() {
		return nomeSheet;
	}

	public void setNomeSheet(String nomeSheet) {
		this.nomeSheet = nomeSheet;
	}

	@Override
	public String getPKDescription() {
		return this.idExcelFailValidazione.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	


	
}
