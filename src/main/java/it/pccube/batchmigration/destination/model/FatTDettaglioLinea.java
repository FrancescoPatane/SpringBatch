package it.pccube.batchmigration.destination.model;

import java.math.BigDecimal;
import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FatTDettaglioLinea implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_T_DETTAGLIO_LINEA";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_DETTAGLIO_LINEA(CD_RIFERIMENTO_AMMINISTRAZIONE, CD_UNITA_MISURA, DT_DATA_FINE_PERIODO, DT_DATA_INIZIO_PERIODO, ID_ARTICOLO, ID_DETTAGLIO_LINEA, ID_DIZ_ESIGIBILITA_IVA, ID_DIZ_NATURA, ID_DIZ_RITENUTA, ID_DIZ_TIPO_CESSIONE_PREST, ID_FATTURA, IM_ARROTONDAMENTO, IM_PREZZO_TOTALE, IM_PREZZO_UNITARIO, NM_UTENTE_INSERIMENTO, NM_UTENTE_ULTIMA_MODIFICA, PC_ALIQUOTA_IVA, PG_NUMERO_LINEA, QT_QUANTITA, TS_INSERIMENTO, TS_ULTIMA_MODIFICA, TX_DESCRIZIONE) VALUES (:cdRiferimentoAmministrazione, :cdUnitaMisura, :dtDataFinePeriodo, :dtDataInizioPeriodo, :idArticolo, :idDettaglioLinea, :idDizEsigibilitaIva, :idDizNatura, :idDizRitenuta, :idDizTipoCessionePrest, :idFattura, :imArrotondamento, :imPrezzoTotale, :imPrezzoUnitario, :nmUtenteInserimento, :nmUtenteUltimaModifica, :pcAliquotaIva, :pgNumeroLinea, :qtQuantita, :tsInserimento, :tsUltimaModifica, :txDescrizione)";

	
	private Long idDettaglioLinea;
	
	private String cdRiferimentoAmministrazione;

	private String cdUnitaMisura;

	private Date dtDataFinePeriodo;

	private Date dtDataInizioPeriodo;

	private Long idArticolo;

	private BigDecimal imArrotondamento;

	private BigDecimal imPrezzoTotale;

	private BigDecimal imPrezzoUnitario;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private BigDecimal pcAliquotaIva;

	private Long pgNumeroLinea;

	private BigDecimal qtQuantita;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private String txDescrizione;

	private Long idDizTipoCessionePrest;

	private Long idFattura;

	private Long idDizEsigibilitaIva;

	private Long idDizNatura;

	private Long idDizRitenuta;

	public Long getIdDettaglioLinea() {
		return idDettaglioLinea;
	}

	public void setIdDettaglioLinea(Long idDettaglioLinea) {
		this.idDettaglioLinea = idDettaglioLinea;
	}

	public String getCdRiferimentoAmministrazione() {
		return cdRiferimentoAmministrazione;
	}

	public void setCdRiferimentoAmministrazione(String cdRiferimentoAmministrazione) {
		this.cdRiferimentoAmministrazione = cdRiferimentoAmministrazione;
	}

	public String getCdUnitaMisura() {
		return cdUnitaMisura;
	}

	public void setCdUnitaMisura(String cdUnitaMisura) {
		this.cdUnitaMisura = cdUnitaMisura;
	}

	public Date getDtDataFinePeriodo() {
		return dtDataFinePeriodo;
	}

	public void setDtDataFinePeriodo(Date dtDataFinePeriodo) {
		this.dtDataFinePeriodo = dtDataFinePeriodo;
	}

	public Date getDtDataInizioPeriodo() {
		return dtDataInizioPeriodo;
	}

	public void setDtDataInizioPeriodo(Date dtDataInizioPeriodo) {
		this.dtDataInizioPeriodo = dtDataInizioPeriodo;
	}

	public Long getIdArticolo() {
		return idArticolo;
	}

	public void setIdArticolo(Long idArticolo) {
		this.idArticolo = idArticolo;
	}

	public BigDecimal getImArrotondamento() {
		return imArrotondamento;
	}

	public void setImArrotondamento(BigDecimal imArrotondamento) {
		this.imArrotondamento = imArrotondamento;
	}

	public BigDecimal getImPrezzoTotale() {
		return imPrezzoTotale;
	}

	public void setImPrezzoTotale(BigDecimal imPrezzoTotale) {
		this.imPrezzoTotale = imPrezzoTotale;
	}

	public BigDecimal getImPrezzoUnitario() {
		return imPrezzoUnitario;
	}

	public void setImPrezzoUnitario(BigDecimal imPrezzoUnitario) {
		this.imPrezzoUnitario = imPrezzoUnitario;
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

	public BigDecimal getPcAliquotaIva() {
		return pcAliquotaIva;
	}

	public void setPcAliquotaIva(BigDecimal pcAliquotaIva) {
		this.pcAliquotaIva = pcAliquotaIva;
	}

	public Long getPgNumeroLinea() {
		return pgNumeroLinea;
	}

	public void setPgNumeroLinea(Long pgNumeroLinea) {
		this.pgNumeroLinea = pgNumeroLinea;
	}

	public BigDecimal getQtQuantita() {
		return qtQuantita;
	}

	public void setQtQuantita(BigDecimal qtQuantita) {
		this.qtQuantita = qtQuantita;
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

	public String getTxDescrizione() {
		return txDescrizione;
	}

	public void setTxDescrizione(String txDescrizione) {
		this.txDescrizione = txDescrizione;
	}

	public Long getIdDizTipoCessionePrest() {
		return idDizTipoCessionePrest;
	}

	public void setIdDizTipoCessionePrest(Long idDizTipoCessionePrest) {
		this.idDizTipoCessionePrest = idDizTipoCessionePrest;
	}

	public Long getIdFattura() {
		return idFattura;
	}

	public void setIdFattura(Long idFattura) {
		this.idFattura = idFattura;
	}

	public Long getIdDizEsigibilitaIva() {
		return idDizEsigibilitaIva;
	}

	public void setIdDizEsigibilitaIva(Long idDizEsigibilitaIva) {
		this.idDizEsigibilitaIva = idDizEsigibilitaIva;
	}

	public Long getIdDizNatura() {
		return idDizNatura;
	}

	public void setIdDizNatura(Long idDizNatura) {
		this.idDizNatura = idDizNatura;
	}

	public Long getIdDizRitenuta() {
		return idDizRitenuta;
	}

	public void setIdDizRitenuta(Long idDizRitenuta) {
		this.idDizRitenuta = idDizRitenuta;
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