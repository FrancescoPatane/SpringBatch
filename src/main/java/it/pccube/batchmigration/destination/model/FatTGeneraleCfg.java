package it.pccube.batchmigration.destination.model;

import java.io.Serializable;
import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FatTGeneraleCfg implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_T_GENERALE_CFG";
	
	public static final String INSERT_QUERY ="INSERT INTO FAT_T_GENERALE_CFG (CD_CODICE, DS_DESCRIZIONE, DS_VALORE, ID_CONFIG_GENERALE, ID_VALORE_BLOB, NM_UTENTE_INSERIMENTO, NM_UTENTE_ULTIMA_MODIFICA, TS_INSERIMENTO, TS_ULTIMA_MODIFICA) VALUES( :cdCodice, :dsDescrizione, :dsValore, :idConfigGenerale, :idValoreBlob, :nmUtenteInserimento, :nmUtenteUltimaModifica, :tsInserimento, :tsUltimaModifica )";

	private Long idConfigGenerale;

	private String cdCodice;

	private String dsDescrizione;

	private String dsValore;
	
	private String idValoreBlob;
	
	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;
	
	private Date tsInserimento;

	private Date tsUltimaModifica;

	
	public FatTGeneraleCfg() {
		super();
	}

	
	public Long getIdConfigGenerale() {
		return this.idConfigGenerale;
	}

	public void setIdConfigGenerale(Long idConfigGenerale) {
		this.idConfigGenerale = idConfigGenerale;
	}

	public String getCdCodice() {
		return this.cdCodice;
	}

	public void setCdCodice(String cdCodice) {
		this.cdCodice = cdCodice;
	}

	public String getDsDescrizione() {
		return this.dsDescrizione;
	}

	public void setDsDescrizione(String dsDescrizione) {
		this.dsDescrizione = dsDescrizione;
	}

	public String getDsValore() {
		return this.dsValore;
	}

	public void setDsValore(String dsValore) {
		this.dsValore = dsValore;
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


	
	public Serializable getPrimaryKey() {
		return this.idConfigGenerale;
	}


	public String getIdValoreBlob() {
		return idValoreBlob;
	}


	public void setIdValoreBlob(String idValoreBlob) {
		this.idValoreBlob = idValoreBlob;
	}


	@Override
	public String getPKDescription() {
		return this.idConfigGenerale.toString();
	}


	@Override
	public String getTableName() {
		return TABLE_NAME;
	}

	
}