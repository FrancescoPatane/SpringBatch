package it.pccube.batchmigration.destination.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;



public class FatTEsitoVerifFirmaCfg implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_T_ESITO_VERIF_FIRMA_CFG";
	
	public static final String INSERT_QUERY ="INSERT INTO FAT_T_ESITO_VERIF_FIRMA_CFG ( CD_RITORNO_SERVICE_VERIFICA, CD_STATO, DS_DESCRIZIONE, FL_FIRMATARI, FL_MODELLO_CONFORME, FL_RAGGIUNGIBILE, FL_RICONOSCIUTO, FL_VERIFICA, ID_CONFIG_ESITO_VERIF_FIRMA, NM_UTENTE_INSERIMENTO, NM_UTENTE_ULTIMA_MODIFICA, TS_INSERIMENTO, TS_ULTIMA_MODIFICA) VALUES ( :cdRitornoServiceVerifica, :cdStato, :dsDescrizione, :flFirmatari, :flModelloConforme, :flRaggiungibile, :flRiconosciuto, :flVerifica, :idConfigEsitoVerifFirma, :nmUtenteInserimento, :nmUtenteUltimaModifica, :tsInserimento, :tsUltimaModifica )";

	private Long idConfigEsitoVerifFirma;

	private String cdRitornoServiceVerifica;

	private String dsDescrizione;

	private Short flFirmatari;

	private Short flModelloConforme;

	private Short flRaggiungibile;

	private Short flRiconosciuto;

	private Short flVerifica;

	private String cdStato;
	
	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;
	
	private Date tsInserimento;

	private Date tsUltimaModifica;

	public Long getIdConfigEsitoVerifFirma() {
		return idConfigEsitoVerifFirma;
	}

	public void setIdConfigEsitoVerifFirma(Long idConfigEsitoVerifFirma) {
		this.idConfigEsitoVerifFirma = idConfigEsitoVerifFirma;
	}

	public String getCdRitornoServiceVerifica() {
		return cdRitornoServiceVerifica;
	}

	public void setCdRitornoServiceVerifica(String cdRitornoServiceVerifica) {
		this.cdRitornoServiceVerifica = cdRitornoServiceVerifica;
	}

	public String getDsDescrizione() {
		return dsDescrizione;
	}

	public void setDsDescrizione(String dsDescrizione) {
		this.dsDescrizione = dsDescrizione;
	}

	public Short getFlFirmatari() {
		return flFirmatari;
	}

	public void setFlFirmatari(Short flFirmatari) {
		this.flFirmatari = flFirmatari;
	}

	public Short getFlModelloConforme() {
		return flModelloConforme;
	}

	public void setFlModelloConforme(Short flModelloConforme) {
		this.flModelloConforme = flModelloConforme;
	}

	public Short getFlRaggiungibile() {
		return flRaggiungibile;
	}

	public void setFlRaggiungibile(Short flRaggiungibile) {
		this.flRaggiungibile = flRaggiungibile;
	}

	public Short getFlRiconosciuto() {
		return flRiconosciuto;
	}

	public void setFlRiconosciuto(Short flRiconosciuto) {
		this.flRiconosciuto = flRiconosciuto;
	}

	public Short getFlVerifica() {
		return flVerifica;
	}

	public void setFlVerifica(Short flVerifica) {
		this.flVerifica = flVerifica;
	}

	public String getCdStato() {
		return cdStato;
	}

	public void setCdStato(String cdStato) {
		this.cdStato = cdStato;
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

	@Override
	public String getPKDescription() {
		return this.idConfigEsitoVerifFirma.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}

	
	

}