package it.pccube.batchmigration.destination.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;

public class FatTDatiPagamentoStor implements ModelEntity {
	
	
	public static final String TABLE_NAME = "FAT_T_DATI_PAGAMENTO_STOR";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_DATI_PAGAMENTO_STOR (id_dati_pagamento_stor,id_dati_pagamento,id_diz_condizioni_pagamento,id_fattura,id_fattura_stor,nm_utente_inserimento,ts_inserimento,nm_utente_ultima_modifica,ts_ultima_modifica)VALUES(:idDatiPagamentoStor,:idDatiPagamento,:idDizCondizioniPagam,:idFattura,:idFatturaStor,:nmUtenteInserimento,:tsInserimento,:nmUtenteUltimaModifica,:tsUltimaModifica)";

	
	private static final long serialVersionUID = 1L;

	private Long idDatiPagamentoStor;

	private Long idDatiPagamento;

	private Long idFattura;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idFatturaStor;

	private Long idDizCondizioniPagam;

	public Long getIdDatiPagamentoStor() {
		return idDatiPagamentoStor;
	}

	public void setIdDatiPagamentoStor(Long idDatiPagamentoStor) {
		this.idDatiPagamentoStor = idDatiPagamentoStor;
	}

	public Long getIdDatiPagamento() {
		return idDatiPagamento;
	}

	public void setIdDatiPagamento(Long idDatiPagamento) {
		this.idDatiPagamento = idDatiPagamento;
	}

	public Long getIdFattura() {
		return idFattura;
	}

	public void setIdFattura(Long idFattura) {
		this.idFattura = idFattura;
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

	public Long getIdFatturaStor() {
		return idFatturaStor;
	}

	public void setIdFatturaStor(Long idFatturaStor) {
		this.idFatturaStor = idFatturaStor;
	}

	public Long getIdDizCondizioniPagam() {
		return idDizCondizioniPagam;
	}

	public void setIdDizCondizioniPagam(Long idDizCondizioniPagam) {
		this.idDizCondizioniPagam = idDizCondizioniPagam;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String getPKDescription() {
		return this.idDatiPagamentoStor.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	
	

	
}