package it.pccube.batchmigration.source.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;

public class FeRiferimentoLineaStorico implements ModelEntity {
	
	public static final String TABLE_NAME = "FE_RIFERIMENTO_LINEA_STORICO";
	
	
	private Long idDatiDdt;

	private Long idDatiRiferimento;

	private Long idRiferimentoLinea;
	
	private Long idDettaglioLinea;
	
	private Long idDatiDdtStorico;

	private Long idDatiRiferimentoStorico;

	private Long idRiferimentoLineaStorico;
	
	private Long idDettaglioLineaStorico;

	private Date tmstInserimento;

	private Date tmstUltimoAggiornamento;

	private String useridInserimento;

	private String useridUltimoAggiornamento;

	public Long getIdDatiDdt() {
		return idDatiDdt;
	}

	public void setIdDatiDdt(Long idDatiDdt) {
		this.idDatiDdt = idDatiDdt;
	}

	public Long getIdDatiRiferimento() {
		return idDatiRiferimento;
	}

	public void setIdDatiRiferimento(Long idDatiRiferimento) {
		this.idDatiRiferimento = idDatiRiferimento;
	}

	public Long getIdRiferimentoLinea() {
		return idRiferimentoLinea;
	}

	public void setIdRiferimentoLinea(Long idRiferimentoLinea) {
		this.idRiferimentoLinea = idRiferimentoLinea;
	}

	public Long getIdDettaglioLinea() {
		return idDettaglioLinea;
	}

	public void setIdDettaglioLinea(Long idDettaglioLinea) {
		this.idDettaglioLinea = idDettaglioLinea;
	}

	public Long getIdDatiDdtStorico() {
		return idDatiDdtStorico;
	}

	public void setIdDatiDdtStorico(Long idDatiDdtStorico) {
		this.idDatiDdtStorico = idDatiDdtStorico;
	}

	public Long getIdDatiRiferimentoStorico() {
		return idDatiRiferimentoStorico;
	}

	public void setIdDatiRiferimentoStorico(Long idDatiRiferimentoStorico) {
		this.idDatiRiferimentoStorico = idDatiRiferimentoStorico;
	}

	public Long getIdRiferimentoLineaStorico() {
		return idRiferimentoLineaStorico;
	}

	public void setIdRiferimentoLineaStorico(Long idRiferimentoLineaStorico) {
		this.idRiferimentoLineaStorico = idRiferimentoLineaStorico;
	}

	public Long getIdDettaglioLineaStorico() {
		return idDettaglioLineaStorico;
	}

	public void setIdDettaglioLineaStorico(Long idDettaglioLineaStorico) {
		this.idDettaglioLineaStorico = idDettaglioLineaStorico;
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

	@Override
	public String getPKDescription() {
		return this.idRiferimentoLineaStorico.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	
	
	
	

}
