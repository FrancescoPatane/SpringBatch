package it.pccube.batchmigration.destination.model;

import java.io.Serializable;
import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FatTVerifFirmaSuppFtp implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_T_VERIF_FIRMA_SUPP_FTP";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_VERIF_FIRMA_SUPP_FTP ( FL_CHECK_HASH_DOCUMENTO, ID_DIZ_RISPOSTA_COD_FISCALE, ID_DIZ_RISPOSTA_WS_FIRMA, ID_SUPPORTO_FTP, ID_VERIF_FIRMA_SUPPORTO_FTP, NM_UTENTE_INSERIMENTO, NM_UTENTE_ULTIMA_MODIFICA, TS_DATA_VERIFICA, TS_INSERIMENTO, TS_ULTIMA_MODIFICA ) VALUES ( :flCheckHashDocumento, :idDizRispostaCodFiscale, :idDizRispostaWsFirma, :idSupportoFtp, :idVerifFirmaSupportoFtp, :nmUtenteInserimento, :nmUtenteUltimaModifica, :tsDataVerifica, :tsInserimento, :tsUltimaModifica )";


	private Long idVerifFirmaSupportoFtp;

	private Short flCheckHashDocumento;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private Date tsDataVerifica;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idSupportoFtp;

	private Long idDizRispostaCodFiscale;

	private Long idDizRispostaWsFirma;

	public Long getIdVerifFirmaSupportoFtp() {
		return idVerifFirmaSupportoFtp;
	}

	public void setIdVerifFirmaSupportoFtp(Long idVerifFirmaSupportoFtp) {
		this.idVerifFirmaSupportoFtp = idVerifFirmaSupportoFtp;
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

	public Date getTsDataVerifica() {
		return tsDataVerifica;
	}

	public void setTsDataVerifica(Date tsDataVerifica) {
		this.tsDataVerifica = tsDataVerifica;
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

	public Long getIdSupportoFtp() {
		return idSupportoFtp;
	}

	public void setIdSupportoFtp(Long idSupportoFtp) {
		this.idSupportoFtp = idSupportoFtp;
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
		return this.idVerifFirmaSupportoFtp.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	

}