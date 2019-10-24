package it.pccube.batchmigration.source.model;


import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FeDatiDdt implements ModelEntity {
	
	public static final String TABLE_NAME = "FE_DATI_DDT";

	

	private Date dataDdt;

	private Long idDatiDdt;

	private Long idFattura;

	private String numeroDdt;

	private Date tmstInserimento;

	private Date tmstUltimoAggiornamento;

	private String useridInserimento;

	private String useridUltimoAggiornamento;

	public Date getDataDdt() {
		return dataDdt;
	}

	public void setDataDdt(Date dataDdt) {
		this.dataDdt = dataDdt;
	}

	public Long getIdDatiDdt() {
		return idDatiDdt;
	}

	public void setIdDatiDdt(Long idDatiDdt) {
		this.idDatiDdt = idDatiDdt;
	}

	public Long getIdFattura() {
		return idFattura;
	}

	public void setIdFattura(Long idFattura) {
		this.idFattura = idFattura;
	}

	public String getNumeroDdt() {
		return numeroDdt;
	}

	public void setNumeroDdt(String numeroDdt) {
		this.numeroDdt = numeroDdt;
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
		return this.idDatiDdt.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	

}