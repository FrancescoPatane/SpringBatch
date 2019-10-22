package it.pccube.batchmigration.destination.model;

import java.io.Serializable;
import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FatTAllegato implements ModelEntity {

	public static final String TABLE_NAME = "FAT_T_ALLEGATO";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_ALLEGATO (DS_DESCRIZIONE_ATTACHMENT,ID_ALLEGATO,ID_ATTACHMENT,ID_FATTURA,NM_ALGORITMO_COMPRESSIONE,NM_FORMATO_ATTACHMENT,NM_NOME_ATTACHMENT,NM_UTENTE_INSERIMENTO,NM_UTENTE_ULTIMA_MODIFICA,TS_INSERIMENTO,TS_ULTIMA_MODIFICA) VALUES (:dsDescrizioneAttachment, :idAllegato, :idAttachment, :idFattura, :nmAlgoritmoCompressione, :nmFormatoAttachment, :nmNomeAttachment, :nmUtenteInserimento, :nmUtenteUltimaModifica, :tsInserimento, :tsUltimaModifica)";


	private Long idAllegato;

	private String dsDescrizioneAttachment;

	private String nmAlgoritmoCompressione;

	private String nmFormatoAttachment;

	private String nmNomeAttachment;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private String idAttachment;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idFattura;

	public Long getIdAllegato() {
		return idAllegato;
	}

	public void setIdAllegato(Long idAllegato) {
		this.idAllegato = idAllegato;
	}

	public String getDsDescrizioneAttachment() {
		return dsDescrizioneAttachment;
	}

	public void setDsDescrizioneAttachment(String dsDescrizioneAttachment) {
		this.dsDescrizioneAttachment = dsDescrizioneAttachment;
	}

	public String getNmAlgoritmoCompressione() {
		return nmAlgoritmoCompressione;
	}

	public void setNmAlgoritmoCompressione(String nmAlgoritmoCompressione) {
		this.nmAlgoritmoCompressione = nmAlgoritmoCompressione;
	}

	public String getNmFormatoAttachment() {
		return nmFormatoAttachment;
	}

	public void setNmFormatoAttachment(String nmFormatoAttachment) {
		this.nmFormatoAttachment = nmFormatoAttachment;
	}

	public String getNmNomeAttachment() {
		return nmNomeAttachment;
	}

	public void setNmNomeAttachment(String nmNomeAttachment) {
		this.nmNomeAttachment = nmNomeAttachment;
	}

	public String getNmUtenteInserimento() {
		return nmUtenteInserimento;
	}

	public void setNmUtenteInserimento(String nmUtenteInserimento) {
		this.nmUtenteInserimento = nmUtenteInserimento;
	}

	public String getNmUtenteUltimaModifica() {
		return nmUtenteUltimaModifica;
	}

	public void setNmUtenteUltimaModifica(String nmUtenteUltimaModifica) {
		this.nmUtenteUltimaModifica = nmUtenteUltimaModifica;
	}

	public String getIdAttachment() {
		return idAttachment;
	}

	public void setIdAttachment(String idAttachment) {
		this.idAttachment = idAttachment;
	}

	public Date getTsInserimento() {
		return tsInserimento;
	}

	public void setTsInserimento(Date tsInserimento) {
		this.tsInserimento = tsInserimento;
	}

	public Date getTsUltimaModifica() {
		return tsUltimaModifica;
	}

	public void setTsUltimaModifica(Date tsUltimaModifica) {
		this.tsUltimaModifica = tsUltimaModifica;
	}

	public Long getIdFattura() {
		return idFattura;
	}

	public void setIdFattura(Long idFattura) {
		this.idFattura = idFattura;
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