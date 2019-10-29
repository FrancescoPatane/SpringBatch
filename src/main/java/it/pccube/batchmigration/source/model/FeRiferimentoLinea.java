package it.pccube.batchmigration.source.model;

import it.pccube.batchmigration.model.ModelEntity;

import java.util.Date;


public class FeRiferimentoLinea implements ModelEntity {
	
	public static final String TABLE_NAME = "FE_RIFERIMENTO_LINEA";

	private Long idDatiDdt;

	private Long idDatiRiferimento;

	private Long idRiferimentoLinea;

	private Date tmstInserimento;

	private Date tmstUltimoAggiornamento;

	private String useridInserimento;

	private String useridUltimoAggiornamento;
	
	private Long idDettaglioLinea;
	
	
	
	public Long getIdDatiDdt() {
		return idDatiDdt;
	}

	public void setIdDatiDdt(Long idDatiDdt) {
		this.idDatiDdt = idDatiDdt;
	}

	public Long getIdDatiRiferimento() {
		return idDatiRiferimento;
	}

	public void setIdDatiRiferimento(Long idDatiRiferimento) {
		this.idDatiRiferimento = idDatiRiferimento;
	}

	public Long getIdRiferimentoLinea() {
		return idRiferimentoLinea;
	}

	public void setIdRiferimentoLinea(Long idRiferimentoLinea) {
		this.idRiferimentoLinea = idRiferimentoLinea;
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

	public Long getIdDettaglioLinea() {
		return idDettaglioLinea;
	}

	public void setIdDettaglioLinea(Long idDettaglioLinea) {
		this.idDettaglioLinea = idDettaglioLinea;
	}

	@Override
	public String getPKDescription() {
		return this.idRiferimentoLinea.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	

}