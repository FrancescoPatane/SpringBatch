package it.pccube.batchmigration.destination.model;

import java.math.BigDecimal;
import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;

public class FatTAllegatoStor implements ModelEntity {

	
	public static final String TABLE_NAME = "FAT_T_ALLEGATO_STOR";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_ALLEGATO_STOR (ID_ALLEGATO_STOR, DS_DESCRIZIONE_ATTACHMENT,ID_ALLEGATO,ID_ATTACHMENT,ID_FATTURA,ID_FATTURA_STOR,NM_ALGORITMO_COMPRESSIONE,NM_FORMATO_ATTACHMENT,NM_NOME_ATTACHMENT,NM_UTENTE_INSERIMENTO,NM_UTENTE_ULTIMA_MODIFICA,TS_INSERIMENTO,TS_ULTIMA_MODIFICA) VALUES (:idAllegatoStor, :dsDescrizioneAttachment, :idAllegato, :idAttachment, :idFattura, :idFatturaStor, :nmAlgoritmoCompressione, :nmFormatoAttachment, :nmNomeAttachment, :nmUtenteInserimento, :nmUtenteUltimaModifica, :tsInserimento, :tsUltimaModifica)";

	private Long idAllegatoStor;

	private String dsDescrizioneAttachment;

	private Long idAllegato;

	private BigDecimal idFattura;

	private String nmAlgoritmoCompressione;

	private String nmFormatoAttachment;

	private String nmNomeAttachment;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private String idAttachment;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idFatturaStor;

	public Long getIdAllegatoStor() {
		return idAllegatoStor;
	}

	public void setIdAllegatoStor(Long idAllegatoStor) {
		this.idAllegatoStor = idAllegatoStor;
	}

	public String getDsDescrizioneAttachment() {
		return dsDescrizioneAttachment;
	}

	public void setDsDescrizioneAttachment(String dsDescrizioneAttachment) {
		this.dsDescrizioneAttachment = dsDescrizioneAttachment;
	}

	public Long getIdAllegato() {
		return idAllegato;
	}

	public void setIdAllegato(Long idAllegato) {
		this.idAllegato = idAllegato;
	}

	public BigDecimal getIdFattura() {
		return idFattura;
	}

	public void setIdFattura(BigDecimal idFattura) {
		this.idFattura = idFattura;
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

	public Long getIdFatturaStor() {
		return idFatturaStor;
	}

	public void setIdFatturaStor(Long idFatturaStor) {
		this.idFatturaStor = idFatturaStor;
	}

	@Override
	public String getPKDescription() {
		return this.idAllegatoStor.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}


	
	
	

}