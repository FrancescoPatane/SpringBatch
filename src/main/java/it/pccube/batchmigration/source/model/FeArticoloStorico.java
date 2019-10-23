package it.pccube.batchmigration.source.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;

public class FeArticoloStorico implements ModelEntity{
	
	public static final String TABLE_NAME = "FE_ARTICOLO_STORICO";
	
	private Long idArticoloStorico;
	
	private Long idArticolo;

	private String codiceTipo;

	private String codiceValore;

	private Long idDettaglioLinea;

	private String useridInserimento;

	private Date tmstInserimento;

	private String useridUltimoAggiornamento;

	private Date tmstUltimoAggiornamento;
	
	private Long idDettaglioLineaStorico;
	
	

	public Long getIdArticoloStorico() {
		return idArticoloStorico;
	}

	public void setIdArticoloStorico(Long idArticoloStorico) {
		this.idArticoloStorico = idArticoloStorico;
	}

	public Long getIdArticolo() {
		return idArticolo;
	}

	public void setIdArticolo(Long idArticolo) {
		this.idArticolo = idArticolo;
	}

	public String getCodiceTipo() {
		return codiceTipo;
	}

	public void setCodiceTipo(String codiceTipo) {
		this.codiceTipo = codiceTipo;
	}

	public String getCodiceValore() {
		return codiceValore;
	}

	public void setCodiceValore(String codiceValore) {
		this.codiceValore = codiceValore;
	}

	public Long getIdDettaglioLinea() {
		return idDettaglioLinea;
	}

	public void setIdDettaglioLinea(Long idDettaglioLinea) {
		this.idDettaglioLinea = idDettaglioLinea;
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

	public Long getIdDettaglioLineaStorico() {
		return idDettaglioLineaStorico;
	}

	public void setIdDettaglioLineaStorico(Long idDettaglioLineaStorico) {
		this.idDettaglioLineaStorico = idDettaglioLineaStorico;
	}

	@Override
	public String getPKDescription() {
		return this.idArticoloStorico.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	


}
