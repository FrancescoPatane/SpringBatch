package it.pccube.batchmigration.source.model;

import java.math.BigDecimal;
import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FeDettaglioLinea implements ModelEntity {
	
	public static final String TABLE_NAME = "FE_DETTAGLIO_LINEA";

	private Long idDettaglioLinea;
	
	private Long idArticolo;

	private Long numeroLinea;

	private Long tipoCessionePrestazione;

	private String descrizione;

	private BigDecimal quantita;

	private String unitaMisura;

	private Date dataInizioPeriodo;

	private Date dataFinePeriodo;

	/** the prezzoUnitario. */
	private BigDecimal prezzoUnitario;

	private BigDecimal prezzoTotale;

	private BigDecimal aliquotaIva;

	private Long ritenuta;

	private Long natura;

	private String riferimentoAmministrazione;

	private Long idFattura;

	private String useridInserimento;

	private Date tmstInserimento;

	private String useridUltimoAggiornamento;

	private Date tmstUltimoAggiornamento;
	
	private Long esigibilitaIva;

	private BigDecimal arrotondamento;

	public Long getIdDettaglioLinea() {
		return idDettaglioLinea;
	}

	public void setIdDettaglioLinea(Long idDettaglioLinea) {
		this.idDettaglioLinea = idDettaglioLinea;
	}

	public Long getIdArticolo() {
		return idArticolo;
	}

	public void setIdArticolo(Long idArticolo) {
		this.idArticolo = idArticolo;
	}

	public Long getNumeroLinea() {
		return numeroLinea;
	}

	public void setNumeroLinea(Long numeroLinea) {
		this.numeroLinea = numeroLinea;
	}

	public Long getTipoCessionePrestazione() {
		return tipoCessionePrestazione;
	}

	public void setTipoCessionePrestazione(Long tipoCessionePrestazione) {
		this.tipoCessionePrestazione = tipoCessionePrestazione;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public BigDecimal getQuantita() {
		return quantita;
	}

	public void setQuantita(BigDecimal quantita) {
		this.quantita = quantita;
	}

	public String getUnitaMisura() {
		return unitaMisura;
	}

	public void setUnitaMisura(String unitaMisura) {
		this.unitaMisura = unitaMisura;
	}

	public Date getDataInizioPeriodo() {
		return dataInizioPeriodo;
	}

	public void setDataInizioPeriodo(Date dataInizioPeriodo) {
		this.dataInizioPeriodo = dataInizioPeriodo;
	}

	public Date getDataFinePeriodo() {
		return dataFinePeriodo;
	}

	public void setDataFinePeriodo(Date dataFinePeriodo) {
		this.dataFinePeriodo = dataFinePeriodo;
	}

	public BigDecimal getPrezzoUnitario() {
		return prezzoUnitario;
	}

	public void setPrezzoUnitario(BigDecimal prezzoUnitario) {
		this.prezzoUnitario = prezzoUnitario;
	}

	public BigDecimal getPrezzoTotale() {
		return prezzoTotale;
	}

	public void setPrezzoTotale(BigDecimal prezzoTotale) {
		this.prezzoTotale = prezzoTotale;
	}

	public BigDecimal getAliquotaIva() {
		return aliquotaIva;
	}

	public void setAliquotaIva(BigDecimal aliquotaIva) {
		this.aliquotaIva = aliquotaIva;
	}

	public Long getRitenuta() {
		return ritenuta;
	}

	public void setRitenuta(Long ritenuta) {
		this.ritenuta = ritenuta;
	}

	public Long getNatura() {
		return natura;
	}

	public void setNatura(Long natura) {
		this.natura = natura;
	}

	public String getRiferimentoAmministrazione() {
		return riferimentoAmministrazione;
	}

	public void setRiferimentoAmministrazione(String riferimentoAmministrazione) {
		this.riferimentoAmministrazione = riferimentoAmministrazione;
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

	public Long getEsigibilitaIva() {
		return esigibilitaIva;
	}

	public void setEsigibilitaIva(Long esigibilitaIva) {
		this.esigibilitaIva = esigibilitaIva;
	}

	public BigDecimal getArrotondamento() {
		return arrotondamento;
	}

	public void setArrotondamento(BigDecimal arrotondamento) {
		this.arrotondamento = arrotondamento;
	}

	@Override
	public String getPKDescription() {
		return this.idDettaglioLinea.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	


}