package it.pccube.batchmigration.source.model;

import java.sql.Timestamp;

import it.pccube.batchmigration.model.ModelEntity;

public class FeLogErroreBatchDb implements ModelEntity{
	
	public static final String TABLE_NAME = "FE_LOG_ERRORE_BATCH_DB";
	
	private String codiceErrore;
	
	private Timestamp data;
	
	private String descrizioneErrore;
	
	private Long idLogErroreBatchDb;
	
	private String note;
	
	private String package_;
	
	private String procedura;
	
	
	
	public String getCodiceErrore() {
		return codiceErrore;
	}
	public void setCodiceErrore(String codiceErrore) {
		this.codiceErrore = codiceErrore;
	}
	public Timestamp getData() {
		return data;
	}
	public void setData(Timestamp data) {
		this.data = data;
	}
	public String getDescrizioneErrore() {
		return descrizioneErrore;
	}
	public void setDescrizioneErrore(String descrizioneErrore) {
		this.descrizioneErrore = descrizioneErrore;
	}
	public Long getIdLogErroreBatchDb() {
		return idLogErroreBatchDb;
	}
	public void setIdLogErroreBatchDb(Long idLogErroreBatchDb) {
		this.idLogErroreBatchDb = idLogErroreBatchDb;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getPackage_() {
		return package_;
	}
	public void setPackage_(String package_) {
		this.package_ = package_;
	}
	public String getProcedura() {
		return procedura;
	}
	public void setProcedura(String procedura) {
		this.procedura = procedura;
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
