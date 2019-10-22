package it.pccube.batchmigration.source.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FeCausaleFattura  implements ModelEntity{
	
	public static final String TABLE_NAME = "FE_CAUSALE_FATTURA";


	private Long idCausaleFattura;
	
	private Long idFattura;
	
	private String causale;
	
	private String useridInserimento;
	
	private Date tmstInserimento;
	
	private String useridUltimoAggiornamento;
	
	private Date tmstUltimoAggiornamento;

	public Long getIdCausaleFattura() {
		return idCausaleFattura;
	}

	public void setIdCausaleFattura(Long idCausaleFattura) {
		this.idCausaleFattura = idCausaleFattura;
	}

	public Long getIdFattura() {
		return idFattura;
	}

	public void setIdFattura(Long idFattura) {
		this.idFattura = idFattura;
	}

	public String getCausale() {
		return causale;
	}

	public void setCausale(String causale) {
		this.causale = causale;
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
		return this.idCausaleFattura.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	
	
	
	


}
