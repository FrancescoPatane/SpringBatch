package it.pccube.batchmigration.source.model;


import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FeAllegato implements ModelEntity {
	
	public static final String TABLE_NAME = "FE_ALLEGATO";


	private Long idAllegato;

	private String nomeAttachment;

	private String algoritmoCompressione;

	private String formatoAttachment;

	private String descrizioneAttachment;

	private Long idFattura;

	private String useridInserimento;

	private Date tmstInserimento;

	private String useridUltimoAggiornamento;

	private Date tmstUltimoAggiornamento;
	
	private byte[] attachment;

	public Long getIdAllegato() {
		return idAllegato;
	}

	public void setIdAllegato(Long idAllegato) {
		this.idAllegato = idAllegato;
	}

	public String getNomeAttachment() {
		return nomeAttachment;
	}

	public void setNomeAttachment(String nomeAttachment) {
		this.nomeAttachment = nomeAttachment;
	}

	public String getAlgoritmoCompressione() {
		return algoritmoCompressione;
	}

	public void setAlgoritmoCompressione(String algoritmoCompressione) {
		this.algoritmoCompressione = algoritmoCompressione;
	}

	public String getFormatoAttachment() {
		return formatoAttachment;
	}

	public void setFormatoAttachment(String formatoAttachment) {
		this.formatoAttachment = formatoAttachment;
	}

	public String getDescrizioneAttachment() {
		return descrizioneAttachment;
	}

	public void setDescrizioneAttachment(String descrizioneAttachment) {
		this.descrizioneAttachment = descrizioneAttachment;
	}

	public Long getIdFattura() {
		return idFattura;
	}

	public void setIdFattura(Long idFattura) {
		this.idFattura = idFattura;
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

	public byte[] getAttachment() {
		return attachment;
	}

	public void setAttachment(byte[] attachment) {
		this.attachment = attachment;
	}

	@Override
	public String getPKDescription() {
		return this.idAllegato.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	


}