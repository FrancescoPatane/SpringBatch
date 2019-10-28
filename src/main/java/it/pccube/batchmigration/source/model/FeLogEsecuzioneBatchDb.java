package it.pccube.batchmigration.source.model;

import java.sql.Timestamp;

import it.pccube.batchmigration.model.ModelEntity;

public class FeLogEsecuzioneBatchDb implements ModelEntity{
	
	public static final String TABLE_NAME = "FE_LOG_ESECUZIONE_BATCH_DB";
	
	private Timestamp dataFineEsecuzione;
	
	private Timestamp dataInizioEsecuzione;
	
	private String erroreEsecuzione;
	
	private Long idLogEsecuzioneBatchDb;
	
	private Long numElementiComplessivi;
	
	private Long numElementiElaborati;
	
	private String package_;
	
	private String procedura;

	public Timestamp getDataFineEsecuzione() {
		return dataFineEsecuzione;
	}

	public void setDataFineEsecuzione(Timestamp dataFineEsecuzione) {
		this.dataFineEsecuzione = dataFineEsecuzione;
	}

	public Timestamp getDataInizioEsecuzione() {
		return dataInizioEsecuzione;
	}

	public void setDataInizioEsecuzione(Timestamp dataInizioEsecuzione) {
		this.dataInizioEsecuzione = dataInizioEsecuzione;
	}

	public String getErroreEsecuzione() {
		return erroreEsecuzione;
	}

	public void setErroreEsecuzione(String erroreEsecuzione) {
		this.erroreEsecuzione = erroreEsecuzione;
	}

	public Long getIdLogEsecuzioneBatchDb() {
		return idLogEsecuzioneBatchDb;
	}

	public void setIdLogEsecuzioneBatchDb(Long idLogEsecuzioneBatchDb) {
		this.idLogEsecuzioneBatchDb = idLogEsecuzioneBatchDb;
	}

	public Long getNumElementiComplessivi() {
		return numElementiComplessivi;
	}

	public void setNumElementiComplessivi(Long numElementiComplessivi) {
		this.numElementiComplessivi = numElementiComplessivi;
	}

	

	public Long getNumElementiElaborati() {
		return numElementiElaborati;
	}

	public void setNumElementiElaborati(Long numElementiElaborati) {
		this.numElementiElaborati = numElementiElaborati;
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
		return this.idLogEsecuzioneBatchDb.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	
	
	
	

}
