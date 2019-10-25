package it.pccube.batchmigration.source.model;

import it.pccube.batchmigration.model.ModelEntity;

import java.math.BigDecimal;
import java.util.Date;

public class FeDettaglioPagamento implements ModelEntity {

	public static final String TABLE_NAME = "FE_DETTAGLIO_PAGAMENTO";

	private Long idDettaglioPagamento;

	private String beneficiario;

	private Long modalitaPagamento;

	private Date dataRifTerminiPagamento;

	private Long giorniTerminiPagamento;

	private Date dataScadenzaPagamento;

	private BigDecimal importoPagamento;

	private String codUfficioPostale;

	private String cognomeQuietanzante;

	private String nomeQuietanzante;

	private String cfQuietanzante;

	private String titoloQuietanzante;

	private String istitutoFinanziario;

	private String iban;

	private String abi;

	private String cab;

	private String bic;

	private BigDecimal scontoPagamentoAnticipato;

	private Date dataLimitePagamentoAnt;

	private BigDecimal penalitaPagamentiRitardati;

	private Date dataDecorrenzaPenale;

	private String codicePagamento;

	private Long idDatiPagamento;

	private String useridInserimento;

	private Date tmstInserimento;

	private String useridUltimoAggiornamento;

	private Date tmstUltimoAggiornamento;

	public Long getIdDettaglioPagamento() {
		return idDettaglioPagamento;
	}

	public void setIdDettaglioPagamento(Long idDettaglioPagamento) {
		this.idDettaglioPagamento = idDettaglioPagamento;
	}

	public String getBeneficiario() {
		return beneficiario;
	}

	public void setBeneficiario(String beneficiario) {
		this.beneficiario = beneficiario;
	}

	public Long getModalitaPagamento() {
		return modalitaPagamento;
	}

	public void setModalitaPagamento(Long modalitaPagamento) {
		this.modalitaPagamento = modalitaPagamento;
	}

	public Date getDataRifTerminiPagamento() {
		return dataRifTerminiPagamento;
	}

	public void setDataRifTerminiPagamento(Date dataRifTerminiPagamento) {
		this.dataRifTerminiPagamento = dataRifTerminiPagamento;
	}

	public Long getGiorniTerminiPagamento() {
		return giorniTerminiPagamento;
	}

	public void setGiorniTerminiPagamento(Long giorniTerminiPagamento) {
		this.giorniTerminiPagamento = giorniTerminiPagamento;
	}

	public Date getDataScadenzaPagamento() {
		return dataScadenzaPagamento;
	}

	public void setDataScadenzaPagamento(Date dataScadenzaPagamento) {
		this.dataScadenzaPagamento = dataScadenzaPagamento;
	}

	public BigDecimal getImportoPagamento() {
		return importoPagamento;
	}

	public void setImportoPagamento(BigDecimal importoPagamento) {
		this.importoPagamento = importoPagamento;
	}

	public String getCodUfficioPostale() {
		return codUfficioPostale;
	}

	public void setCodUfficioPostale(String codUfficioPostale) {
		this.codUfficioPostale = codUfficioPostale;
	}

	public String getCognomeQuietanzante() {
		return cognomeQuietanzante;
	}

	public void setCognomeQuietanzante(String cognomeQuietanzante) {
		this.cognomeQuietanzante = cognomeQuietanzante;
	}

	public String getNomeQuietanzante() {
		return nomeQuietanzante;
	}

	public void setNomeQuietanzante(String nomeQuietanzante) {
		this.nomeQuietanzante = nomeQuietanzante;
	}

	public String getCfQuietanzante() {
		return cfQuietanzante;
	}

	public void setCfQuietanzante(String cfQuietanzante) {
		this.cfQuietanzante = cfQuietanzante;
	}

	public String getTitoloQuietanzante() {
		return titoloQuietanzante;
	}

	public void setTitoloQuietanzante(String titoloQuietanzante) {
		this.titoloQuietanzante = titoloQuietanzante;
	}

	public String getIstitutoFinanziario() {
		return istitutoFinanziario;
	}

	public void setIstitutoFinanziario(String istitutoFinanziario) {
		this.istitutoFinanziario = istitutoFinanziario;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getAbi() {
		return abi;
	}

	public void setAbi(String abi) {
		this.abi = abi;
	}

	public String getCab() {
		return cab;
	}

	public void setCab(String cab) {
		this.cab = cab;
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	public BigDecimal getScontoPagamentoAnticipato() {
		return scontoPagamentoAnticipato;
	}

	public void setScontoPagamentoAnticipato(BigDecimal scontoPagamentoAnticipato) {
		this.scontoPagamentoAnticipato = scontoPagamentoAnticipato;
	}

	public Date getDataLimitePagamentoAnt() {
		return dataLimitePagamentoAnt;
	}

	public void setDataLimitePagamentoAnt(Date dataLimitePagamentoAnt) {
		this.dataLimitePagamentoAnt = dataLimitePagamentoAnt;
	}

	public BigDecimal getPenalitaPagamentiRitardati() {
		return penalitaPagamentiRitardati;
	}

	public void setPenalitaPagamentiRitardati(BigDecimal penalitaPagamentiRitardati) {
		this.penalitaPagamentiRitardati = penalitaPagamentiRitardati;
	}

	public Date getDataDecorrenzaPenale() {
		return dataDecorrenzaPenale;
	}

	public void setDataDecorrenzaPenale(Date dataDecorrenzaPenale) {
		this.dataDecorrenzaPenale = dataDecorrenzaPenale;
	}

	public String getCodicePagamento() {
		return codicePagamento;
	}

	public void setCodicePagamento(String codicePagamento) {
		this.codicePagamento = codicePagamento;
	}

	public Long getIdDatiPagamento() {
		return idDatiPagamento;
	}

	public void setIdDatiPagamento(Long idDatiPagamento) {
		this.idDatiPagamento = idDatiPagamento;
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
		return this.idDettaglioPagamento.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	
	
	
}