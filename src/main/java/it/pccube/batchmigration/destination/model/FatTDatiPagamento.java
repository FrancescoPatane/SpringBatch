package it.pccube.batchmigration.destination.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FatTDatiPagamento implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_T_DATI_PAGAMENTO";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_DATI_PAGAMENTO (id_dati_pagamento,id_diz_condizioni_pagamento,id_fattura,nm_utente_inserimento,ts_inserimento,nm_utente_ultima_modifica,ts_ultima_modifica)VALUES(:idDatiPagamento,:idDizCondizioniPagam,:idFattura,:nmUtenteInserimento,:tsInserimento,:nmUtenteUltimaModifica,:tsUltimaModifica)";



	private Long idDatiPagamento;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idFattura;

	private Long idDizCondizioniPagam;

	public Long getIdDatiPagamento() {
		return idDatiPagamento;
	}

	public void setIdDatiPagamento(Long idDatiPagamento) {
		this.idDatiPagamento = idDatiPagamento;
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

	public Long getIdFattura() {
		return idFattura;
	}

	public void setIdFattura(Long idFattura) {
		this.idFattura = idFattura;
	}

	public Long getIdDizCondizioniPagam() {
		return idDizCondizioniPagam;
	}

	public void setIdDizCondizioniPagam(Long idDizCondizioniPagam) {
		this.idDizCondizioniPagam = idDizCondizioniPagam;
	}

	@Override
	public String getPKDescription() {
		return this.idDatiPagamento.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}




}