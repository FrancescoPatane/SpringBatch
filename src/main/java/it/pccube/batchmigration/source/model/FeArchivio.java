package it.pccube.batchmigration.source.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import it.pccube.batchmigration.model.ModelEntity;




public class FeArchivio implements ModelEntity {

	public static final String TABLE_NAME = "FE_ARCHIVIO";


	private Long idArchivio;

	private String nomeFile;

	private Long identificativoSdiArchivio;

	private Date dataOraInvioSdi;

	private Date dataOraRicezione;

	private String useridInserimento;

	private Date tmstInserimento;

	private String useridUltimoAggiornamento;

	private Date tmstUltimoAggiornamento;

	private Long stato;
	
	private Long idUtenteAziendaCreatore;
	
	private Date dataOraCreazione;
	
	private byte[] fileArchivio;
	
	private Long esitoInvio;

	public Long getIdArchivio() {
		return idArchivio;
	}

	public void setIdArchivio(Long idArchivio) {
		this.idArchivio = idArchivio;
	}

	public String getNomeFile() {
		return nomeFile;
	}

	public void setNomeFile(String nomeFile) {
		this.nomeFile = nomeFile;
	}

	public Long getIdentificativoSdiArchivio() {
		return identificativoSdiArchivio;
	}

	public void setIdentificativoSdiArchivio(Long identificativoSdiArchivio) {
		this.identificativoSdiArchivio = identificativoSdiArchivio;
	}

	public Date getDataOraInvioSdi() {
		return dataOraInvioSdi;
	}

	public void setDataOraInvioSdi(Date dataOraInvioSdi) {
		this.dataOraInvioSdi = dataOraInvioSdi;
	}

	public Date getDataOraRicezione() {
		return dataOraRicezione;
	}

	public void setDataOraRicezione(Date dataOraRicezione) {
		this.dataOraRicezione = dataOraRicezione;
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

	public Long getStato() {
		return stato;
	}

	public void setStato(Long stato) {
		this.stato = stato;
	}

	public Long getIdUtenteAziendaCreatore() {
		return idUtenteAziendaCreatore;
	}

	public void setIdUtenteAziendaCreatore(Long idUtenteAziendaCreatore) {
		this.idUtenteAziendaCreatore = idUtenteAziendaCreatore;
	}

	public Date getDataOraCreazione() {
		return dataOraCreazione;
	}

	public void setDataOraCreazione(Date dataOraCreazione) {
		this.dataOraCreazione = dataOraCreazione;
	}

	public byte[] getFileArchivio() {
		return fileArchivio;
	}

	public void setFileArchivio(byte[] fileArchivio) {
		this.fileArchivio = fileArchivio;
	}

	public Long getEsitoInvio() {
		return esitoInvio;
	}

	public void setEsitoInvio(Long esitoInvio) {
		this.esitoInvio = esitoInvio;
	}

	@Override
	public String getPKDescription() {
		return this.idArchivio.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	

}
