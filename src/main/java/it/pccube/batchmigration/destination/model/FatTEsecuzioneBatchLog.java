package it.pccube.batchmigration.destination.model;


import it.pccube.batchmigration.model.ModelEntity;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class FatTEsecuzioneBatchLog implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_T_ESECUZIONE_BATCH_LOG";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_ESECUZIONE_BATCH_LOG ( CN_NUM_ELEMENTI_COMPLESSIVI, CN_NUM_ELEMENTI_ELABORATI, DT_DATA_FINE_ESECUZIONE, DT_DATA_INIZIO_ESECUZIONE, FG_ERRORE_ESECUZIONE, ID_LOG_ESECUZIONE_BATCH_DB, NM_PACKAGE, NM_PROCEDURA ) VALUES ( :cnNumElementiComplessivi, :cnNumElementiElaborati, :dtDataFineEsecuzione, :dtDataInizioEsecuzione, :fgErroreEsecuzione, :idLogEsecuzioneBatchDb, :nmPackage, :nmProcedura )";

	private Long idLogEsecuzioneBatchDb;

	private BigDecimal cnNumElementiComplessivi;

	private BigDecimal cnNumElementiElaborati;

	private Timestamp dtDataFineEsecuzione;

	private Timestamp dtDataInizioEsecuzione;

	private String fgErroreEsecuzione;

	private String nmPackage;

	private String nmProcedura;

	public Long getIdLogEsecuzioneBatchDb() {
		return idLogEsecuzioneBatchDb;
	}

	public void setIdLogEsecuzioneBatchDb(Long idLogEsecuzioneBatchDb) {
		this.idLogEsecuzioneBatchDb = idLogEsecuzioneBatchDb;
	}

	public BigDecimal getCnNumElementiComplessivi() {
		return cnNumElementiComplessivi;
	}

	public void setCnNumElementiComplessivi(BigDecimal cnNumElementiComplessivi) {
		this.cnNumElementiComplessivi = cnNumElementiComplessivi;
	}

	public BigDecimal getCnNumElementiElaborati() {
		return cnNumElementiElaborati;
	}

	public void setCnNumElementiElaborati(BigDecimal cnNumElementiElaborati) {
		this.cnNumElementiElaborati = cnNumElementiElaborati;
	}

	public Timestamp getDtDataFineEsecuzione() {
		return dtDataFineEsecuzione;
	}

	public void setDtDataFineEsecuzione(Timestamp dtDataFineEsecuzione) {
		this.dtDataFineEsecuzione = dtDataFineEsecuzione;
	}

	public Timestamp getDtDataInizioEsecuzione() {
		return dtDataInizioEsecuzione;
	}

	public void setDtDataInizioEsecuzione(Timestamp dtDataInizioEsecuzione) {
		this.dtDataInizioEsecuzione = dtDataInizioEsecuzione;
	}

	public String getFgErroreEsecuzione() {
		return fgErroreEsecuzione;
	}

	public void setFgErroreEsecuzione(String fgErroreEsecuzione) {
		this.fgErroreEsecuzione = fgErroreEsecuzione;
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

	@Override
	public String getPKDescription() {
		return this.idLogEsecuzioneBatchDb.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	

}