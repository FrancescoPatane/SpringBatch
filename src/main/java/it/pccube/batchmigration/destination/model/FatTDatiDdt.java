package it.pccube.batchmigration.destination.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;




public class FatTDatiDdt implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_T_DATI_DDT";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_DATI_DDT (cd_numero_ddt,dt_data_ddt,id_dati_ddt,id_fattura,nm_utente_inserimento,nm_utente_ultima_modifica,ts_inserimento,ts_ultima_modifica) VALUES (:cdNumeroDdt,:dtDataDdt,:idDatiDdt,:idFattura,:nmUtenteInserimento,:nmUtenteUltimaModifica,:tsInserimento,:tsUltimaModifica)";


	private Long idDatiDdt;

	private String cdNumeroDdt;

	private Date dtDataDdt;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private Date tsInserimento;
	
	private Date tsUltimaModifica;

	private Long idFattura;

	public Long getIdDatiDdt() {
		return idDatiDdt;
	}

	public void setIdDatiDdt(Long idDatiDdt) {
		this.idDatiDdt = idDatiDdt;
	}

	public String getCdNumeroDdt() {
		return cdNumeroDdt;
	}

	public void setCdNumeroDdt(String cdNumeroDdt) {
		this.cdNumeroDdt = cdNumeroDdt;
	}

	public Date getDtDataDdt() {
		return dtDataDdt;
	}

	public void setDtDataDdt(Date dtDataDdt) {
		this.dtDataDdt = dtDataDdt;
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
		return this.idDatiDdt.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}

	

}