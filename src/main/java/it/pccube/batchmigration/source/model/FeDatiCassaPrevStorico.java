package it.pccube.batchmigration.source.model;

import java.math.BigDecimal;
import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;

public class FeDatiCassaPrevStorico implements ModelEntity {
	
	public static final String TABLE_NAME = "FE_DATI_CASSA_PREV_STORICO";
	
	private Long idDatiCassaPrevStorico;
	
	private Long idDatiCassaPrevidenziale;

	private Long tipoCassa;

	private BigDecimal alCassa;

	private BigDecimal importoContributoCassa;

	private BigDecimal imponibileCassa;

	private BigDecimal aliquotaIva;

	private Long ritenuta;

	private Long natura;

	private String riferimentoAmministrazione;

	private Long idFattura;
	
	private Long idFatturaStorico;

	private String useridInserimento;

	private Date tmstInserimento;

	private String useridUltimoAggiornamento;

	private Date tmstUltimoAggiornamento;
	
	private Long esigibilitaIva;
	
	private BigDecimal arrotondamento;
	
	private Long numeroSezione;

	public Long getIdDatiCassaPrevStorico() {
		return idDatiCassaPrevStorico;
	}

	public void setIdDatiCassaPrevStorico(Long idDatiCassaPrevStorico) {
		this.idDatiCassaPrevStorico = idDatiCassaPrevStorico;
	}

	public Long getIdDatiCassaPrevidenziale() {
		return idDatiCassaPrevidenziale;
	}

	public void setIdDatiCassaPrevidenziale(Long idDatiCassaPrevidenziale) {
		this.idDatiCassaPrevidenziale = idDatiCassaPrevidenziale;
	}

	public Long getTipoCassa() {
		return tipoCassa;
	}

	public void setTipoCassa(Long tipoCassa) {
		this.tipoCassa = tipoCassa;
	}

	public BigDecimal getAlCassa() {
		return alCassa;
	}

	public void setAlCassa(BigDecimal alCassa) {
		this.alCassa = alCassa;
	}

	public BigDecimal getImportoContributoCassa() {
		return importoContributoCassa;
	}

	public void setImportoContributoCassa(BigDecimal importoContributoCassa) {
		this.importoContributoCassa = importoContributoCassa;
	}

	public BigDecimal getImponibileCassa() {
		return imponibileCassa;
	}

	public void setImponibileCassa(BigDecimal imponibileCassa) {
		this.imponibileCassa = imponibileCassa;
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

	public Long getIdFatturaStorico() {
		return idFatturaStorico;
	}

	public void setIdFatturaStorico(Long idFatturaStorico) {
		this.idFatturaStorico = idFatturaStorico;
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

	public Long getNumeroSezione() {
		return numeroSezione;
	}

	public void setNumeroSezione(Long numeroSezione) {
		this.numeroSezione = numeroSezione;
	}

	@Override
	public String getPKDescription() {
		return this.idDatiCassaPrevStorico.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	
	
	

}
