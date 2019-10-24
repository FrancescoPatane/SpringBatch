package it.pccube.batchmigration.source.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;

public class FeDatiPagamentoStorico implements ModelEntity {
	
	
	public static final String TABLE_NAME = "FE_DATI_PAGAMENTO_STORICO";
	
	private Long idDatiPagamentoStorico;
	
	private Long idDatiPagamento;

	private Long condizioniPagamento;

	private Long idFattura;
	
	private Long idFatturaStorico;

	private String useridInserimento;

	private Date tmstInserimento;

	private String useridUltimoAggiornamento;

	private Date tmstUltimoAggiornamento;

	public Long getIdDatiPagamentoStorico() {
		return idDatiPagamentoStorico;
	}

	public void setIdDatiPagamentoStorico(Long idDatiPagamentoStorico) {
		this.idDatiPagamentoStorico = idDatiPagamentoStorico;
	}

	public Long getIdDatiPagamento() {
		return idDatiPagamento;
	}

	public void setIdDatiPagamento(Long idDatiPagamento) {
		this.idDatiPagamento = idDatiPagamento;
	}

	public Long getCondizioniPagamento() {
		return condizioniPagamento;
	}

	public void setCondizioniPagamento(Long condizioniPagamento) {
		this.condizioniPagamento = condizioniPagamento;
	}

	public Long getIdFattura() {
		return idFattura;
	}

	public void setIdFattura(Long idFattura) {
		this.idFattura = idFattura;
	}

	public Long getIdFatturaStorico() {
		return idFatturaStorico;
	}

	public void setIdFatturaStorico(Long idFatturaStorico) {
		this.idFatturaStorico = idFatturaStorico;
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
		return this.idDatiPagamentoStorico.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	
	
	
}
