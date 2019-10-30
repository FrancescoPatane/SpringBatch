package it.pccube.batchmigration.destination.model;

import java.math.BigDecimal;
import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FatTVerifFirmaLotto implements ModelEntity {
	
	
	public static final String TABLE_NAME = "FAT_T_VERIF_FIRMA_LOTTO";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_VERIF_FIRMA_LOTTO ( ID_VERIF_FIRMA_LOTTO, ID_LOTTO, PG_VERSIONE_LOTTO, DT_DATA_VERIFICA, ID_DIZ_RISPOSTA_WS_FIRMA, ID_DIZ_RISPOSTA_COD_FISCALE, FL_CHECK_HASH_DOCUMENTO, ID_PDF_ESITO, NM_UTENTE_INSERIMENTO, TS_INSERIMENTO, NM_UTENTE_ULTIMA_MODIFICA, TS_ULTIMA_MODIFICA ) VALUES ( :idVerifFirmaLotto, :idLotto, :pgVersioneLotto, :dtDataVerifica, :idDizRispostaWsFirma, :idDizRispostaCodFiscale, :flCheckHashDocumento, :idPdfEsito, :nmUtenteInserimento, :tsInserimento, :nmUtenteUltimaModifica, :tsUltimaModifica )";
	
	private Long idVerifFirmaLotto;

	private Date dtDataVerifica;

	private BigDecimal flCheckHashDocumento;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private String idPdfEsito;

	private BigDecimal pgVersioneLotto;

	private Date tsInserimento;
	
	private Date tsUltimaModifica;

	private Long idDizRispostaCodFiscale;

	private Long idDizRispostaWsFirma;

	private Long idLotto;

	public Long getIdVerifFirmaLotto() {
		return idVerifFirmaLotto;
	}

	public void setIdVerifFirmaLotto(Long idVerifFirmaLotto) {
		this.idVerifFirmaLotto = idVerifFirmaLotto;
	}

	public Date getDtDataVerifica() {
		return dtDataVerifica;
	}

	public void setDtDataVerifica(Date dtDataVerifica) {
		this.dtDataVerifica = dtDataVerifica;
	}

	public BigDecimal getFlCheckHashDocumento() {
		return flCheckHashDocumento;
	}

	public void setFlCheckHashDocumento(BigDecimal flCheckHashDocumento) {
		this.flCheckHashDocumento = flCheckHashDocumento;
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

	public String getIdPdfEsito() {
		return idPdfEsito;
	}

	public void setIdPdfEsito(String idPdfEsito) {
		this.idPdfEsito = idPdfEsito;
	}

	public BigDecimal getPgVersioneLotto() {
		return pgVersioneLotto;
	}

	public void setPgVersioneLotto(BigDecimal pgVersioneLotto) {
		this.pgVersioneLotto = pgVersioneLotto;
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

	public Long getIdDizRispostaCodFiscale() {
		return idDizRispostaCodFiscale;
	}

	public void setIdDizRispostaCodFiscale(Long idDizRispostaCodFiscale) {
		this.idDizRispostaCodFiscale = idDizRispostaCodFiscale;
	}

	public Long getIdDizRispostaWsFirma() {
		return idDizRispostaWsFirma;
	}

	public void setIdDizRispostaWsFirma(Long idDizRispostaWsFirma) {
		this.idDizRispostaWsFirma = idDizRispostaWsFirma;
	}

	public Long getIdLotto() {
		return idLotto;
	}

	public void setIdLotto(Long idLotto) {
		this.idLotto = idLotto;
	}
	
	
	@Override
	public String getPKDescription() {
		return this.idVerifFirmaLotto.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	

}