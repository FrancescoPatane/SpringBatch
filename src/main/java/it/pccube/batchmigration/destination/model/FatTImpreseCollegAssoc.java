package it.pccube.batchmigration.destination.model;

import java.util.Date;
import it.pccube.batchmigration.model.ModelEntity;
public class FatTImpreseCollegAssoc implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_T_IMPRESE_COLLEG_ASSOC";
	
	public static final String INSERT_QUERY ="INSERT INTO FAT_T_IMPRESE_COLLEG_ASSOC ( CD_CODICE_FISCALE, CD_NUMERO_REA, CD_PARTITA_IVA, ID_ADESIONE, ID_DIZ_TIPOLOGIA, ID_IMPRESE_COLLEG_ASSOC, NM_DENOMINAZIONE, NM_UTENTE_INSERIMENTO, NM_UTENTE_ULTIMA_MODIFICA, TS_INSERIMENTO, TS_ULTIMA_MODIFICA ) VALUES ( :cdCodiceFiscale, :cdNumeroRea, :cdPartitaIva, :idAdesione, :idDizTipologia, :idImpreseCollegAssoc, :nmDenominazione, :nmUtenteInserimento, :nmUtenteUltimaModifica, :tsInserimento, :tsUltimaModifica)";

	private Long idImpreseCollegAssoc;

	private String cdCodiceFiscale;

	private String cdNumeroRea;

	private String cdPartitaIva;

	private String nmDenominazione;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idDizTipologia;
	
	private Long idAdesione;

	public Long getIdImpreseCollegAssoc() {
		return idImpreseCollegAssoc;
	}

	public void setIdImpreseCollegAssoc(Long idImpreseCollegAssoc) {
		this.idImpreseCollegAssoc = idImpreseCollegAssoc;
	}

	public String getCdCodiceFiscale() {
		return cdCodiceFiscale;
	}

	public void setCdCodiceFiscale(String cdCodiceFiscale) {
		this.cdCodiceFiscale = cdCodiceFiscale;
	}

	public String getCdNumeroRea() {
		return cdNumeroRea;
	}

	public void setCdNumeroRea(String cdNumeroRea) {
		this.cdNumeroRea = cdNumeroRea;
	}

	public String getCdPartitaIva() {
		return cdPartitaIva;
	}

	public void setCdPartitaIva(String cdPartitaIva) {
		this.cdPartitaIva = cdPartitaIva;
	}

	public String getNmDenominazione() {
		return nmDenominazione;
	}

	public void setNmDenominazione(String nmDenominazione) {
		this.nmDenominazione = nmDenominazione;
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

	public Long getIdDizTipologia() {
		return idDizTipologia;
	}

	public void setIdDizTipologia(Long idDizTipologia) {
		this.idDizTipologia = idDizTipologia;
	}

	public Long getIdAdesione() {
		return idAdesione;
	}

	public void setIdAdesione(Long idAdesione) {
		this.idAdesione = idAdesione;
	}

	@Override
	public String getPKDescription() {
		return this.idImpreseCollegAssoc.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	
	

}