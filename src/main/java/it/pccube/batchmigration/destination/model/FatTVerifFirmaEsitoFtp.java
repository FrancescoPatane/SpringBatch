package it.pccube.batchmigration.destination.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import it.pccube.batchmigration.model.ModelEntity;



public class FatTVerifFirmaEsitoFtp implements ModelEntity {
	
	
	public static final String TABLE_NAME = "FAT_T_VERIF_FIRMA_ESITO_FTP";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_VERIF_FIRMA_ESITO_FTP ( ID_VERIF_FIRMA_ESITO_FTP, ID_ESITO_FTP, DT_DATA_VERIFICA, ID_DIZ_RISPOSTA_WS_FIRMA, ID_DIZ_RISPOSTA_COD_FISCALE, FL_CHECK_HASH_DOCUMENTO, NM_UTENTE_INSERIMENTO, NM_UTENTE_ULTIMA_MODIFICA, TS_INSERIMENTO, TS_ULTIMA_MODIFICA ) VALUES ( :idVerifFirmaEsitoFtp, :idEsitoFtp, :dtDataVerifica, :idDizRispostaWsFirma, :idDizRispostaCodFiscale, :flCheckHashDocumento, :nmUtenteInserimento, :nmUtenteUltimaModifica, :tsInserimento, :tsUltimaModifica )";
	

	private Long idVerifFirmaEsitoFtp;

	private Date dtDataVerifica;

	private Short flCheckHashDocumento;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idDizRispostaCodFiscale;

	private Long idDizRispostaWsFirma;

	private Long idEsitoFtp;

	public Long getIdVerifFirmaEsitoFtp() {
		return idVerifFirmaEsitoFtp;
	}

	public void setIdVerifFirmaEsitoFtp(Long idVerifFirmaEsitoFtp) {
		this.idVerifFirmaEsitoFtp = idVerifFirmaEsitoFtp;
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

	public Long getIdEsitoFtp() {
		return idEsitoFtp;
	}

	public void setIdEsitoFtp(Long idEsitoFtp) {
		this.idEsitoFtp = idEsitoFtp;
	}

	@Override
	public String getPKDescription() {
		return this.idVerifFirmaEsitoFtp.toString();
	}


	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	

}