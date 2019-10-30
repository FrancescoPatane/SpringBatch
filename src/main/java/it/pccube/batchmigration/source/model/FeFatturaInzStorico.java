package it.pccube.batchmigration.source.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;

public class FeFatturaInzStorico implements ModelEntity{
	
	public static final String TABLE_NAME = "FE_FATTURA_INZ_STORICO";
	
	private Long idFattura;
	
	private Long idFatturaStorico;
	
	private Long idt;
	
	private Long tipoIniziativa;
	
	private Date tmstInserimento;
	
	private Date tmstUltimoAggiornamento;
	
	private String useridInserimento;
	
	private String useridUltimoAggiornamento;

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

	public Long getIdt() {
		return idt;
	}

	public void setIdt(Long idt) {
		this.idt = idt;
	}

	public Long getTipoIniziativa() {
		return tipoIniziativa;
	}

	public void setTipoIniziativa(Long tipoIniziativa) {
		this.tipoIniziativa = tipoIniziativa;
	}

	public Date getTmstInserimento() {
		return tmstInserimento;
	}

	public void setTmstInserimento(Date tmstInserimento) {
		this.tmstInserimento = tmstInserimento;
	}

	public Date getTmstUltimoAggiornamento() {
		return tmstUltimoAggiornamento;
	}

	public void setTmstUltimoAggiornamento(Date tmstUltimoAggiornamento) {
		this.tmstUltimoAggiornamento = tmstUltimoAggiornamento;
	}

	public String getUseridInserimento() {
		return useridInserimento;
	}

	public void setUseridInserimento(String useridInserimento) {
		this.useridInserimento = useridInserimento;
	}

	public String getUseridUltimoAggiornamento() {
		return useridUltimoAggiornamento;
	}

	public void setUseridUltimoAggiornamento(String useridUltimoAggiornamento) {
		this.useridUltimoAggiornamento = useridUltimoAggiornamento;
	}

	@Override
	public String getPKDescription() {
		return this.idFatturaStorico.toString()+";"+this.idt.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	
	
}
