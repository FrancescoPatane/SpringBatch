package it.pccube.batchmigration.source.model;

import it.pccube.batchmigration.model.ModelEntity;

import java.util.Date;


public class FeImpreseCollegAssoc implements ModelEntity {
	
	public static final String TABLE_NAME = "FE_IMPRESE_COLLEG_ASSOC";


	private 		Long		idImpreseCollegAssoc;
	private Long tipologia;

	private 		String		denominazione;
	private 		String		numeroRea;
	private 		String		codiceFiscale;
	private 		String		partitaIva;
	private 		Long	idAdesione;
	private 		String		useridInserimento;
	private 		Date		tmstInserimento;
	private 		String		useridUltimoAggiornamento;
	private 		Date		tmstUltimoAggiornamento;
	public Long getIdImpreseCollegAssoc() {
		return idImpreseCollegAssoc;
	}
	public void setIdImpreseCollegAssoc(Long idImpreseCollegAssoc) {
		this.idImpreseCollegAssoc = idImpreseCollegAssoc;
	}
	public Long getTipologia() {
		return tipologia;
	}
	public void setTipologia(Long tipologia) {
		this.tipologia = tipologia;
	}
	public String getDenominazione() {
		return denominazione;
	}
	public void setDenominazione(String denominazione) {
		this.denominazione = denominazione;
	}
	public String getNumeroRea() {
		return numeroRea;
	}
	public void setNumeroRea(String numeroRea) {
		this.numeroRea = numeroRea;
	}
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	public String getPartitaIva() {
		return partitaIva;
	}
	public void setPartitaIva(String partitaIva) {
		this.partitaIva = partitaIva;
	}
	public Long getIdAdesione() {
		return idAdesione;
	}
	public void setIdAdesione(Long idAdesione) {
		this.idAdesione = idAdesione;
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
		return this.idImpreseCollegAssoc.toString();
	}
	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	


}
