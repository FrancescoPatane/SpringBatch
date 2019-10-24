package it.pccube.batchmigration.destination.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FatTConservAutoreLotto implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_T_CONSERV_AUTORE_LOTTO";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_CONSERV_AUTORE_LOTTO (CD_CODICE_FISCALE,ID_CONSERVAZ_AUTORE_LOTTO,ID_LOTTO,ID_UTENTE_AUTORE,NM_COGNOME,NM_NOME,NM_UTENTE_INSERIMENTO,NM_UTENTE_ULTIMA_MODIFICA,PG_VERSIONE_LOTTO,TS_INSERIMENTO,TS_ULTIMA_MODIFICA) VALUES (:cdCodiceFiscale,:idConservazAutoreLotto,:idLotto,:idUtenteAutore,:nmCognome,:nmNome,:nmUtenteInserimento,:nmUtenteUltimaModifica,:pgVersioneLotto,:tsInserimento,:tsUltimaModifica)";

	private Long idConservazAutoreLotto;

	private String cdCodiceFiscale;

	private Long idLotto;

	private Long idUtenteAutore;

	private String nmCognome;

	private String nmNome;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private BigDecimal pgVersioneLotto;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	public FatTConservAutoreLotto() {
	}

	public Long getIdConservazAutoreLotto() {
		return this.idConservazAutoreLotto;
	}

	public void setIdConservazAutoreLotto(Long idConservazAutoreLotto) {
		this.idConservazAutoreLotto = idConservazAutoreLotto;
	}

	public String getCdCodiceFiscale() {
		return this.cdCodiceFiscale;
	}

	public void setCdCodiceFiscale(String cdCodiceFiscale) {
		this.cdCodiceFiscale = cdCodiceFiscale;
	}

	public Long getIdLotto() {
		return this.idLotto;
	}

	public void setIdLotto(Long idLotto) {
		this.idLotto = idLotto;
	}

	public Long getIdUtenteAutore() {
		return this.idUtenteAutore;
	}

	public void setIdUtenteAutore(Long idUtenteAutore) {
		this.idUtenteAutore = idUtenteAutore;
	}

	public String getNmCognome() {
		return this.nmCognome;
	}

	public void setNmCognome(String nmCognome) {
		this.nmCognome = nmCognome;
	}

	public String getNmNome() {
		return this.nmNome;
	}

	public void setNmNome(String nmNome) {
		this.nmNome = nmNome;
	}

	public String getNmUtenteInserimento() {
		return this.nmUtenteInserimento;
	}

	public void setNmUtenteInserimento(String nmUtenteInserimento) {
		this.nmUtenteInserimento = nmUtenteInserimento;
	}

	public String getNmUtenteUltimaModifica() {
		return this.nmUtenteUltimaModifica;
	}

	public void setNmUtenteUltimaModifica(String nmUtenteUltimaModifica) {
		this.nmUtenteUltimaModifica = nmUtenteUltimaModifica;
	}

	public BigDecimal getPgVersioneLotto() {
		return this.pgVersioneLotto;
	}

	public void setPgVersioneLotto(BigDecimal pgVersioneLotto) {
		this.pgVersioneLotto = pgVersioneLotto;
	}

	public Date getTsInserimento() {
		return this.tsInserimento;
	}

	public void setTsInserimento(Date tsInserimento) {
		this.tsInserimento = tsInserimento;
	}

	public Date getTsUltimaModifica() {
		return this.tsUltimaModifica;
	}

	public void setTsUltimaModifica(Date tsUltimaModifica) {
		this.tsUltimaModifica = tsUltimaModifica;
	}

	public Serializable getPrimaryKey() {
		return this.idConservazAutoreLotto;
	}

	@Override
	public String getPKDescription() {
		return this.idConservazAutoreLotto.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}

}