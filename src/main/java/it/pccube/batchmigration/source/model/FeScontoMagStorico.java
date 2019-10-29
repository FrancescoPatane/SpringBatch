package it.pccube.batchmigration.source.model;

import java.math.BigDecimal;
import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;

public class FeScontoMagStorico implements ModelEntity {
	
	public static final String TABLE_NAME = "FE_SCONTO_MAG_STORICO";
	
	private Long idScontoMaggiorazioneStorico;
	
	private Long idFatturaStorico;
	
	private Long idDettaglioLineaStorico;
	
	private Long idScontoMaggiorazione;

	private Long tipo;

	private BigDecimal percentuale;

	private BigDecimal importo;

	private Long idFattura;

	private Long idDettaglioLinea;

	private String useridInserimento;

	private Date tmstInserimento;

	private String useridUltimoAggiornamento;

	private Date tmstUltimoAggiornamento;

	public Long getIdScontoMaggiorazioneStorico() {
		return idScontoMaggiorazioneStorico;
	}

	public void setIdScontoMaggiorazioneStorico(Long idScontoMaggiorazioneStorico) {
		this.idScontoMaggiorazioneStorico = idScontoMaggiorazioneStorico;
	}

	public Long getIdFatturaStorico() {
		return idFatturaStorico;
	}

	public void setIdFatturaStorico(Long idFatturaStorico) {
		this.idFatturaStorico = idFatturaStorico;
	}

	public Long getIdDettaglioLineaStorico() {
		return idDettaglioLineaStorico;
	}

	public void setIdDettaglioLineaStorico(Long idDettaglioLineaStorico) {
		this.idDettaglioLineaStorico = idDettaglioLineaStorico;
	}

	public Long getIdScontoMaggiorazione() {
		return idScontoMaggiorazione;
	}

	public void setIdScontoMaggiorazione(Long idScontoMaggiorazione) {
		this.idScontoMaggiorazione = idScontoMaggiorazione;
	}

	public Long getTipo() {
		return tipo;
	}

	public void setTipo(Long tipo) {
		this.tipo = tipo;
	}

	public BigDecimal getPercentuale() {
		return percentuale;
	}

	public void setPercentuale(BigDecimal percentuale) {
		this.percentuale = percentuale;
	}

	public BigDecimal getImporto() {
		return importo;
	}

	public void setImporto(BigDecimal importo) {
		this.importo = importo;
	}

	public Long getIdFattura() {
		return idFattura;
	}

	public void setIdFattura(Long idFattura) {
		this.idFattura = idFattura;
	}

	public Long getIdDettaglioLinea() {
		return idDettaglioLinea;
	}

	public void setIdDettaglioLinea(Long idDettaglioLinea) {
		this.idDettaglioLinea = idDettaglioLinea;
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

	@Override
	public String getPKDescription() {
		return this.idScontoMaggiorazioneStorico.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	
	
	
}
