package it.pccube.batchmigration.destination.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;

public class FatTVerifFirmaAde implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_T_VERIF_FIRMA_ADE";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_VERIF_FIRMA_ADE ( ID_VERIF_FIRMA_ADE, ID_ADESIONE, DT_DATA_VERIFICA, ID_DIZ_RISPOSTA_WS_FIRMA, ID_DIZ_RISPOSTA_COD_FISCALE, FL_CHECK_HASH_DOCUMENTO, ID_PDF_ESITO, NM_UTENTE_INSERIMENTO, NM_UTENTE_ULTIMA_MODIFICA, TS_INSERIMENTO, TS_ULTIMA_MODIFICA ) VALUES ( :idVerifFirmaAde, :idAdesione, :dtDataVerifica, :idDizRispostaWsFirma, :idDizRispostaCodFiscale, :flCheckHashDocumento, :idPdfEsito, :nmUtenteInserimento, :nmUtenteUltimaModifica, :tsInserimento, :tsUltimaModifica )";


	private Long idVerifFirmaAde;

	private Date dtDataVerifica;

	private Short flCheckHashDocumento;

	private String idPdfEsito;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idDizRispostaCodFiscale;

	private Long idDizRispostaWsFirma;

	private Long idAdesione;

	public Long getIdVerifFirmaAde() {
		return idVerifFirmaAde;
	}

	public void setIdVerifFirmaAde(Long idVerifFirmaAde) {
		this.idVerifFirmaAde = idVerifFirmaAde;
	}

	public Date getDtDataVerifica() {
		return dtDataVerifica;
	}

	public void setDtDataVerifica(Date dtDataVerifica) {
		this.dtDataVerifica = dtDataVerifica;
	}

	public Short getFlCheckHashDocumento() {
		return flCheckHashDocumento;
	}

	public void setFlCheckHashDocumento(Short flCheckHashDocumento) {
		this.flCheckHashDocumento = flCheckHashDocumento;
	}

	public String getIdPdfEsito() {
		return idPdfEsito;
	}

	public void setIdPdfEsito(String idPdfEsito) {
		this.idPdfEsito = idPdfEsito;
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

	public Long getIdAdesione() {
		return idAdesione;
	}

	public void setIdAdesione(Long idAdesione) {
		this.idAdesione = idAdesione;
	}

	@Override
	public String getPKDescription() {
		return this.idVerifFirmaAde.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	
	

}