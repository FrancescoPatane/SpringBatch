package it.pccube.batchmigration.destination.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FatTVerifFirmaNotifica implements ModelEntity {
	
	
	public static final String TABLE_NAME = "FAT_T_VERIF_FIRMA_NOTIFICA";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_VERIF_FIRMA_NOTIFICA ( DT_DATA_VERIFICA, FL_CHECK_HASH_DOCUMENTO, ID_DIZ_RISPOSTA_COD_FISCALE, ID_DIZ_RISPOSTA_WS_FIRMA, ID_NOTIFICA, ID_VERIF_FIRMA_NOTIFICA, NM_UTENTE_INSERIMENTO, NM_UTENTE_ULTIMA_MODIFICA, TS_INSERIMENTO, TS_ULTIMA_MODIFICA ) VALUES ( :dtDataVerifica, :flCheckHashDocumento, :idDizRispostaCodFiscale, :idDizRispostaWsFirma, :idNotifica, :idVerifFirmaNotifica, :nmUtenteInserimento, :nmUtenteUltimaModifica, :tsInserimento, :tsUltimaModifica )";
	
	private Long idVerifFirmaNotifica;

	private Timestamp dtDataVerifica;

	private BigDecimal flCheckHashDocumento;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idNotifica;

	private Long idDizRispostaCodFiscale;

	private Long idDizRispostaWsFirma;

	public Long getIdVerifFirmaNotifica() {
		return idVerifFirmaNotifica;
	}

	public void setIdVerifFirmaNotifica(Long idVerifFirmaNotifica) {
		this.idVerifFirmaNotifica = idVerifFirmaNotifica;
	}

	public Timestamp getDtDataVerifica() {
		return dtDataVerifica;
	}

	public void setDtDataVerifica(Timestamp dtDataVerifica) {
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

	public Long getIdNotifica() {
		return idNotifica;
	}

	public void setIdNotifica(Long idNotifica) {
		this.idNotifica = idNotifica;
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

	@Override
	public String getPKDescription() {
		return this.idVerifFirmaNotifica.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	
	
	

}