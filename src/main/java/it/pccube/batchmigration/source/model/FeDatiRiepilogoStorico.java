package it.pccube.batchmigration.source.model;

import java.math.BigDecimal;
import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;

public class FeDatiRiepilogoStorico implements ModelEntity {
	
	
	public static final String TABLE_NAME = "FE_DATI_RIEPILOGO_STORICO";

	private Long idDatiRiepilogoStorico;
	
	private Long idDatiRiepilogo;

	private BigDecimal aliquotaIva;

	private Long natura;

	private BigDecimal speseAccessorie;

	private BigDecimal arrotondamento;

	private BigDecimal imponibileImporto;

	private BigDecimal imposta;

	private Long esigibilitaIva;

	private String riferimentoNormativo;

	private Long idFattura;
	
	private Long idFatturaStorico;

	private String useridInserimento;

	private Date tmstInserimento;

	private String useridUltimoAggiornamento;

	private Date tmstUltimoAggiornamento;

	public Long getIdDatiRiepilogo() {
		return idDatiRiepilogo;
	}

	public void setIdDatiRiepilogo(Long idDatiRiepilogo) {
		this.idDatiRiepilogo = idDatiRiepilogo;
	}

	public BigDecimal getAliquotaIva() {
		return aliquotaIva;
	}

	public void setAliquotaIva(BigDecimal aliquotaIva) {
		this.aliquotaIva = aliquotaIva;
	}

	public Long getNatura() {
		return natura;
	}

	public void setNatura(Long natura) {
		this.natura = natura;
	}

	public BigDecimal getSpeseAccessorie() {
		return speseAccessorie;
	}

	public void setSpeseAccessorie(BigDecimal speseAccessorie) {
		this.speseAccessorie = speseAccessorie;
	}

	public BigDecimal getArrotondamento() {
		return arrotondamento;
	}

	public void setArrotondamento(BigDecimal arrotondamento) {
		this.arrotondamento = arrotondamento;
	}

	public BigDecimal getImponibileImporto() {
		return imponibileImporto;
	}

	public void setImponibileImporto(BigDecimal imponibileImporto) {
		this.imponibileImporto = imponibileImporto;
	}

	public BigDecimal getImposta() {
		return imposta;
	}

	public void setImposta(BigDecimal imposta) {
		this.imposta = imposta;
	}

	public Long getEsigibilitaIva() {
		return esigibilitaIva;
	}

	public void setEsigibilitaIva(Long esigibilitaIva) {
		this.esigibilitaIva = esigibilitaIva;
	}

	public String getRiferimentoNormativo() {
		return riferimentoNormativo;
	}

	public void setRiferimentoNormativo(String riferimentoNormativo) {
		this.riferimentoNormativo = riferimentoNormativo;
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
	
	public Long getIdDatiRiepilogoStorico() {
		return idDatiRiepilogoStorico;
	}

	public void setIdDatiRiepilogoStorico(Long idDatiRiepilogoStorico) {
		this.idDatiRiepilogoStorico = idDatiRiepilogoStorico;
	}

	public Long getIdFatturaStorico() {
		return idFatturaStorico;
	}

	public void setIdFatturaStorico(Long idFatturaStorico) {
		this.idFatturaStorico = idFatturaStorico;
	}

	@Override
	public String getPKDescription() {
		return this.idDatiRiepilogoStorico.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
}
