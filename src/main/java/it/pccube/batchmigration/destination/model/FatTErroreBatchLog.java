package it.pccube.batchmigration.destination.model;

import java.sql.Timestamp;

import it.pccube.batchmigration.model.ModelEntity;

public class FatTErroreBatchLog implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_T_ERRORE_BATCH_LOG";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_ERRORE_BATCH_LOG (ID_LOG_ERRORE_BATCH_DB,NM_CODICE_ERRORE,NM_PACKAGE,NM_PROCEDURA,TS_DATA,TX_DESCRIZIONE_ERRORE,TX_NOTE) VALUES (:idLogErroreBatchDb,:nmCodiceErrore,:nmPackage,:nmProcedura,:tsData,:txDescrizioneErrore,:txNote)";


	private Long idLogErroreBatchDb;

	private String nmCodiceErrore;

	private String nmPackage;

	private String nmProcedura;

	private Timestamp tsData;

	private String txDescrizioneErrore;

	private String txNote;

	public long getIdLogErroreBatchDb() {
		return idLogErroreBatchDb;
	}

	public void setIdLogErroreBatchDb(long idLogErroreBatchDb) {
		this.idLogErroreBatchDb = idLogErroreBatchDb;
	}

	public String getNmCodiceErrore() {
		return nmCodiceErrore;
	}

	public void setNmCodiceErrore(String nmCodiceErrore) {
		this.nmCodiceErrore = nmCodiceErrore;
	}

	public String getNmPackage() {
		return nmPackage;
	}

	public void setNmPackage(String nmPackage) {
		this.nmPackage = nmPackage;
	}

	public String getNmProcedura() {
		return nmProcedura;
	}

	public void setNmProcedura(String nmProcedura) {
		this.nmProcedura = nmProcedura;
	}

	public Timestamp getTsData() {
		return tsData;
	}

	public void setTsData(Timestamp tsData) {
		this.tsData = tsData;
	}

	public String getTxDescrizioneErrore() {
		return txDescrizioneErrore;
	}

	public void setTxDescrizioneErrore(String txDescrizioneErrore) {
		this.txDescrizioneErrore = txDescrizioneErrore;
	}

	public String getTxNote() {
		return txNote;
	}

	public void setTxNote(String txNote) {
		this.txNote = txNote;
	}

	@Override
	public String getPKDescription() {
		return this.idLogErroreBatchDb.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	
	
	
	
	

}