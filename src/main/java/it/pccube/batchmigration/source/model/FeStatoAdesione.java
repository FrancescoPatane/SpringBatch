package it.pccube.batchmigration.source.model;

import it.pccube.batchmigration.model.ModelEntity;

import java.util.Date;

public class FeStatoAdesione implements ModelEntity {
	
	public static final String TABLE_NAME = "FE_STATO_ADESIONE";


	private 		Long		idStatoAdesione;
	private 		Date		dataInizio;
	private 		Date		dataFine;
	private 		Long 		idAdesione;
	private 		Long 		idStato;
	private 		Long 		idStatoAdesionePrec;
	private			Short		flagAttuale;
	private 		String		useridInserimento;
	private 		Date		tmstInserimento;
	private 		String		useridUltimoAggiornamento;
	private 		Date		tmstUltimoAggiornamento;
	
	
	public Long getIdStatoAdesione() {
		return idStatoAdesione;
	}
	public void setIdStatoAdesione(Long idStatoAdesione) {
		this.idStatoAdesione = idStatoAdesione;
	}
	public Date getDataInizio() {
		return dataInizio;
	}
	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}
	public Date getDataFine() {
		return dataFine;
	}
	public void setDataFine(Date dataFine) {
		this.dataFine = dataFine;
	}
	
	public Long getIdAdesione() {
		return idAdesione;
	}
	public void setIdAdesione(Long idAdesione) {
		this.idAdesione = idAdesione;
	}
	public Long getIdStato() {
		return idStato;
	}
	public void setIdStato(Long idStato) {
		this.idStato = idStato;
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
	
	
	public Long getIdStatoAdesionePrec() {
		return idStatoAdesionePrec;
	}
	public void setIdStatoAdesionePrec(Long idStatoAdesionePrec) {
		this.idStatoAdesionePrec = idStatoAdesionePrec;
	}
	public Short getFlagAttuale() {
		return flagAttuale;
	}
	public void setFlagAttuale(Short flagAttuale) {
		this.flagAttuale = flagAttuale;
	}
	@Override
	public String getPKDescription() {
		return this.idStatoAdesione.toString();
	}
	@Override
	public String getTableName() {
		return TABLE_NAME;
	}




}
