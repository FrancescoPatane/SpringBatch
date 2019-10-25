package it.pccube.batchmigration.destination.model;

import java.math.BigDecimal;
import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FatTDettaglioPagamento implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_T_DETTAGLIO_PAGAMENTO";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_DETTAGLIO_PAGAMENTO (CD_ABI,CD_BIC,CD_CAB,CD_CF_QUIETANZANTE,CD_CODICE_PAGAMENTO,CD_COD_UFFICIO_POSTALE,CD_IBAN,DT_DATA_DECORRENZA_PENALE,DT_DATA_LIMITE_PAGAMENTO_ANT,DT_DATA_RIF_TERMINI_PAGAMENTO,DT_DATA_SCADENZA_PAGAMENTO,ID_DATI_PAGAMENTO,ID_DETTAGLIO_PAGAMENTO,ID_DIZ_MODALITA_PAGAMENTO,IM_IMPORTO_PAGAMENTO,IM_PENALITA_PAGAMENTI_RIT,IM_SCONTO_PAGAMENTO_ANTICIPATO,NM_BENEFICIARIO,NM_COGNOME_QUIETANZANTE,NM_ISTITUTO_FINANZIARIO,NM_NOME_QUIETANZANTE,NM_TITOLO_QUIETANZANTE,NM_UTENTE_INSERIMENTO,NM_UTENTE_ULTIMA_MODIFICA,NR_GIORNI_TERMINI_PAGAMENTO,TS_INSERIMENTO,TS_ULTIMA_MODIFICA)VALUES(:cdAbi,:cdBic,:cdCab,:cdCfQuietanzante,:cdCodUfficioPostale,:cdCodicePagamento,:cdIban,:dtDataDecorrenzaPenale,:dtDataLimitePagamentoAnt,:dtDataRifTerminiPagamento,:dtDataScadenzaPagamento,:idDatiPagamento,:idDettaglioPagamento,:idDizModalitaPagamento,:imImportoPagamento,:imPenalitaPagamentiRit,:imScontoPagamentoAnticipato,:nmBeneficiario,:nmCognomeQuietanzante,:nmIstitutoFinanziario,:nmNomeQuietanzante,:nmTitoloQuietanzante,:nmUtenteInserimento,:nmUtenteUltimaModifica,:nrGiorniTerminiPagamento,:tsInserimento,:tsUltimaModifica)";

	private Long idDettaglioPagamento;

	private String cdAbi;

	private String cdBic;

	private String cdCab;

	private String cdCfQuietanzante;

	private String cdCodUfficioPostale;

	private String cdCodicePagamento;

	private String cdIban;

	private Date dtDataDecorrenzaPenale;

	private Date dtDataLimitePagamentoAnt;

	private Date dtDataRifTerminiPagamento;

	private Date dtDataScadenzaPagamento;

	private BigDecimal imImportoPagamento;

	private BigDecimal imPenalitaPagamentiRit;

	private BigDecimal imScontoPagamentoAnticipato;

	private String nmBeneficiario;

	private String nmCognomeQuietanzante;

	private String nmIstitutoFinanziario;

	private String nmNomeQuietanzante;

	private String nmTitoloQuietanzante;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private BigDecimal nrGiorniTerminiPagamento;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idDatiPagamento;

	private Long idDizModalitaPagamento;

	public Long getIdDettaglioPagamento() {
		return idDettaglioPagamento;
	}

	public void setIdDettaglioPagamento(Long idDettaglioPagamento) {
		this.idDettaglioPagamento = idDettaglioPagamento;
	}

	public String getCdAbi() {
		return cdAbi;
	}

	public void setCdAbi(String cdAbi) {
		this.cdAbi = cdAbi;
	}

	public String getCdBic() {
		return cdBic;
	}

	public void setCdBic(String cdBic) {
		this.cdBic = cdBic;
	}

	public String getCdCab() {
		return cdCab;
	}

	public void setCdCab(String cdCab) {
		this.cdCab = cdCab;
	}

	public String getCdCfQuietanzante() {
		return cdCfQuietanzante;
	}

	public void setCdCfQuietanzante(String cdCfQuietanzante) {
		this.cdCfQuietanzante = cdCfQuietanzante;
	}

	public String getCdCodUfficioPostale() {
		return cdCodUfficioPostale;
	}

	public void setCdCodUfficioPostale(String cdCodUfficioPostale) {
		this.cdCodUfficioPostale = cdCodUfficioPostale;
	}

	public String getCdCodicePagamento() {
		return cdCodicePagamento;
	}

	public void setCdCodicePagamento(String cdCodicePagamento) {
		this.cdCodicePagamento = cdCodicePagamento;
	}

	public String getCdIban() {
		return cdIban;
	}

	public void setCdIban(String cdIban) {
		this.cdIban = cdIban;
	}

	public Date getDtDataDecorrenzaPenale() {
		return dtDataDecorrenzaPenale;
	}

	public void setDtDataDecorrenzaPenale(Date dtDataDecorrenzaPenale) {
		this.dtDataDecorrenzaPenale = dtDataDecorrenzaPenale;
	}

	public Date getDtDataLimitePagamentoAnt() {
		return dtDataLimitePagamentoAnt;
	}

	public void setDtDataLimitePagamentoAnt(Date dtDataLimitePagamentoAnt) {
		this.dtDataLimitePagamentoAnt = dtDataLimitePagamentoAnt;
	}

	public Date getDtDataRifTerminiPagamento() {
		return dtDataRifTerminiPagamento;
	}

	public void setDtDataRifTerminiPagamento(Date dtDataRifTerminiPagamento) {
		this.dtDataRifTerminiPagamento = dtDataRifTerminiPagamento;
	}

	public Date getDtDataScadenzaPagamento() {
		return dtDataScadenzaPagamento;
	}

	public void setDtDataScadenzaPagamento(Date dtDataScadenzaPagamento) {
		this.dtDataScadenzaPagamento = dtDataScadenzaPagamento;
	}

	public BigDecimal getImImportoPagamento() {
		return imImportoPagamento;
	}

	public void setImImportoPagamento(BigDecimal imImportoPagamento) {
		this.imImportoPagamento = imImportoPagamento;
	}

	public BigDecimal getImPenalitaPagamentiRit() {
		return imPenalitaPagamentiRit;
	}

	public void setImPenalitaPagamentiRit(BigDecimal imPenalitaPagamentiRit) {
		this.imPenalitaPagamentiRit = imPenalitaPagamentiRit;
	}

	public BigDecimal getImScontoPagamentoAnticipato() {
		return imScontoPagamentoAnticipato;
	}

	public void setImScontoPagamentoAnticipato(BigDecimal imScontoPagamentoAnticipato) {
		this.imScontoPagamentoAnticipato = imScontoPagamentoAnticipato;
	}

	public String getNmBeneficiario() {
		return nmBeneficiario;
	}

	public void setNmBeneficiario(String nmBeneficiario) {
		this.nmBeneficiario = nmBeneficiario;
	}

	public String getNmCognomeQuietanzante() {
		return nmCognomeQuietanzante;
	}

	public void setNmCognomeQuietanzante(String nmCognomeQuietanzante) {
		this.nmCognomeQuietanzante = nmCognomeQuietanzante;
	}

	public String getNmIstitutoFinanziario() {
		return nmIstitutoFinanziario;
	}

	public void setNmIstitutoFinanziario(String nmIstitutoFinanziario) {
		this.nmIstitutoFinanziario = nmIstitutoFinanziario;
	}

	public String getNmNomeQuietanzante() {
		return nmNomeQuietanzante;
	}

	public void setNmNomeQuietanzante(String nmNomeQuietanzante) {
		this.nmNomeQuietanzante = nmNomeQuietanzante;
	}

	public String getNmTitoloQuietanzante() {
		return nmTitoloQuietanzante;
	}

	public void setNmTitoloQuietanzante(String nmTitoloQuietanzante) {
		this.nmTitoloQuietanzante = nmTitoloQuietanzante;
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

	public BigDecimal getNrGiorniTerminiPagamento() {
		return nrGiorniTerminiPagamento;
	}

	public void setNrGiorniTerminiPagamento(BigDecimal nrGiorniTerminiPagamento) {
		this.nrGiorniTerminiPagamento = nrGiorniTerminiPagamento;
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

	public Long getIdDatiPagamento() {
		return idDatiPagamento;
	}

	public void setIdDatiPagamento(Long idDatiPagamento) {
		this.idDatiPagamento = idDatiPagamento;
	}

	public Long getIdDizModalitaPagamento() {
		return idDizModalitaPagamento;
	}

	public void setIdDizModalitaPagamento(Long idDizModalitaPagamento) {
		this.idDizModalitaPagamento = idDizModalitaPagamento;
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