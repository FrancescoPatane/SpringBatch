package it.pccube.batchmigration.destination.model;

import java.math.BigDecimal;
import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FatTAltroDatoGestionale implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_T_ALTRO_DATO_GESTIONALE";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_ALTRO_DATO_GESTIONALE (CD_RIFERIMENTO_TESTO, DT_DATA_RIFERIMENTO_DATA, ID_ALTRO_DATO_GESTIONALE, ID_DETTAGLIO_LINEA, NM_TIPO_DATO, NM_UTENTE_INSERIMENTO, NM_UTENTE_ULTIMA_MODIFICA, NR_RIFERIMENTO_NUMERO, TS_INSERIMENTO, TS_ULTIMA_MODIFICA) VALUES (:cdRiferimentoTesto, :dtDataRiferimentoData, :idAltroDatoGestionale, :idDettaglioLinea, :nmTipoDato, :nmUtenteInserimento, :nmUtenteUltimaModifica, :nrRiferimentoNumero, :tsInserimento, :tsUltimaModifica)";


	private Long idAltroDatoGestionale;

	private String cdRiferimentoTesto;

	private Date dtDataRiferimentoData;

	private String nmTipoDato;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private BigDecimal nrRiferimentoNumero;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idDettaglioLinea;

	public Long getIdAltroDatoGestionale() {
		return idAltroDatoGestionale;
	}

	public void setIdAltroDatoGestionale(Long idAltroDatoGestionale) {
		this.idAltroDatoGestionale = idAltroDatoGestionale;
	}

	public String getCdRiferimentoTesto() {
		return cdRiferimentoTesto;
	}

	public void setCdRiferimentoTesto(String cdRiferimentoTesto) {
		this.cdRiferimentoTesto = cdRiferimentoTesto;
	}

	public Date getDtDataRiferimentoData() {
		return dtDataRiferimentoData;
	}

	public void setDtDataRiferimentoData(Date dtDataRiferimentoData) {
		this.dtDataRiferimentoData = dtDataRiferimentoData;
	}

	public String getNmTipoDato() {
		return nmTipoDato;
	}

	public void setNmTipoDato(String nmTipoDato) {
		this.nmTipoDato = nmTipoDato;
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

	public BigDecimal getNrRiferimentoNumero() {
		return nrRiferimentoNumero;
	}

	public void setNrRiferimentoNumero(BigDecimal nrRiferimentoNumero) {
		this.nrRiferimentoNumero = nrRiferimentoNumero;
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

	public Long getIdDettaglioLinea() {
		return idDettaglioLinea;
	}

	public void setIdDettaglioLinea(Long idDettaglioLinea) {
		this.idDettaglioLinea = idDettaglioLinea;
	}

	@Override
	public String getPKDescription() {
		return this.idAltroDatoGestionale.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}



}