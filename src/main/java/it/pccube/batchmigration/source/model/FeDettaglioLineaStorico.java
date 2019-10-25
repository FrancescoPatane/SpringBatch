package it.pccube.batchmigration.source.model;

import java.math.BigDecimal;
import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;

public class FeDettaglioLineaStorico implements ModelEntity {
	
	public static final String TABLE_NAME = "FE_DETTAGLIO_LINEA_STORICO";

	private Date dataInizioPeriodo;

	private Date dataFinePeriodo;

	private Long ritenuta;

	private Long tipoCessionePrestazione;

	private Long idDettaglioLineaStorico;

	private Long idFatturaStorico;

	private Long idDettaglioLinea;

	private Long idFattura;
	
	private Long idArticolo;
	
	private Long natura;

	private BigDecimal prezzoUnitario;

	private BigDecimal quantita;

	private BigDecimal prezzoTotale;

	private Long numeroLinea;

	private BigDecimal aliquotaIva;

	private Date tmstInserimento;

	private Date tmstUltimoAggiornamento;

	private String unitaMisura;

	private String descrizione;

	private String riferimentoAmministrazione;

	private String useridInserimento;

	private String useridUltimoAggiornamento;
	
	private Long esigibilitaIva;

	private BigDecimal arrotondamento;

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

	public Long getRitenuta() {
		return ritenuta;
	}

	public void setRitenuta(Long ritenuta) {
		this.ritenuta = ritenuta;
	}

	public Long getTipoCessionePrestazione() {
		return tipoCessionePrestazione;
	}

	public void setTipoCessionePrestazione(Long tipoCessionePrestazione) {
		this.tipoCessionePrestazione = tipoCessionePrestazione;
	}

	public Long getIdDettaglioLineaStorico() {
		return idDettaglioLineaStorico;
	}

	public void setIdDettaglioLineaStorico(Long idDettaglioLineaStorico) {
		this.idDettaglioLineaStorico = idDettaglioLineaStorico;
	}

	public Long getIdFatturaStorico() {
		return idFatturaStorico;
	}

	public void setIdFatturaStorico(Long idFatturaStorico) {
		this.idFatturaStorico = idFatturaStorico;
	}

	public Long getIdDettaglioLinea() {
		return idDettaglioLinea;
	}

	public void setIdDettaglioLinea(Long idDettaglioLinea) {
		this.idDettaglioLinea = idDettaglioLinea;
	}

	public Long getIdFattura() {
		return idFattura;
	}

	public void setIdFattura(Long idFattura) {
		this.idFattura = idFattura;
	}

	public Long getNatura() {
		return natura;
	}

	public void setNatura(Long natura) {
		this.natura = natura;
	}

	public BigDecimal getPrezzoUnitario() {
		return prezzoUnitario;
	}

	public void setPrezzoUnitario(BigDecimal prezzoUnitario) {
		this.prezzoUnitario = prezzoUnitario;
	}

	public BigDecimal getQuantita() {
		return quantita;
	}

	public void setQuantita(BigDecimal quantita) {
		this.quantita = quantita;
	}

	public BigDecimal getPrezzoTotale() {
		return prezzoTotale;
	}

	public void setPrezzoTotale(BigDecimal prezzoTotale) {
		this.prezzoTotale = prezzoTotale;
	}

	public Long getNumeroLinea() {
		return numeroLinea;
	}

	public void setNumeroLinea(Long numeroLinea) {
		this.numeroLinea = numeroLinea;
	}

	public BigDecimal getAliquotaIva() {
		return aliquotaIva;
	}

	public void setAliquotaIva(BigDecimal aliquotaIva) {
		this.aliquotaIva = aliquotaIva;
	}

	public Date getTmstInserimento() {
		return tmstInserimento;
	}

	public void setTmstInserimento(Date tmstInserimento) {
		this.tmstInserimento = tmstInserimento;
	}

	public Date getTmstUltimoAggiornamento() {
		return tmstUltimoAggiornamento;
	}

	public void setTmstUltimoAggiornamento(Date tmstUltimoAggiornamento) {
		this.tmstUltimoAggiornamento = tmstUltimoAggiornamento;
	}

	public String getUnitaMisura() {
		return unitaMisura;
	}

	public void setUnitaMisura(String unitaMisura) {
		this.unitaMisura = unitaMisura;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getRiferimentoAmministrazione() {
		return riferimentoAmministrazione;
	}

	public void setRiferimentoAmministrazione(String riferimentoAmministrazione) {
		this.riferimentoAmministrazione = riferimentoAmministrazione;
	}

	public String getUseridInserimento() {
		return useridInserimento;
	}

	public void setUseridInserimento(String useridInserimento) {
		this.useridInserimento = useridInserimento;
	}

	public String getUseridUltimoAggiornamento() {
		return useridUltimoAggiornamento;
	}

	public void setUseridUltimoAggiornamento(String useridUltimoAggiornamento) {
		this.useridUltimoAggiornamento = useridUltimoAggiornamento;
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
	
	public Long getIdArticolo() {
		return idArticolo;
	}

	public void setIdArticolo(Long idArticolo) {
		this.idArticolo = idArticolo;
	}

	@Override
	public String getPKDescription() {
		return this.idDettaglioLineaStorico.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	


}