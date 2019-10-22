package it.pccube.batchmigration.source.model;

import java.sql.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FeCausaleFatturaStorico implements ModelEntity{
	
	public static final String TABLE_NAME = "FE_CAUSALE_FATTURA_STORICO";
	
	private Long idCausaleFatturaStorico;
	
	private Long idCausaleFattura;
	
	private String causale;
	
	private Long idFattura;
	
	private Long idFatturaStorico;
	
	private String useridInserimento;
	
	private Date tmstInserimento;
	
	private String useridUltimoAggiornamento;
	
	private Date tmstUltimoAggiornamento;

	public Long getIdCausaleFatturaStorico() {
		return idCausaleFatturaStorico;
	}

	public void setIdCausaleFatturaStorico(Long idCausaleFatturaStorico) {
		this.idCausaleFatturaStorico = idCausaleFatturaStorico;
	}

	public Long getIdCausaleFattura() {
		return idCausaleFattura;
	}

	public void setIdCausaleFattura(Long idCausaleFattura) {
		this.idCausaleFattura = idCausaleFattura;
	}

	public String getCausale() {
		return causale;
	}

	public void setCausale(String causale) {
		this.causale = causale;
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
		return this.idCausaleFatturaStorico.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	


}
