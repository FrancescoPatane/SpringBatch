package it.pccube.batchmigration.destination.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FatTDatiSalStor implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_T_DATI_SAL_STOR";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_DATI_SAL_STOR ( CD_RIFERIMENTO_FASE, ID_DATI_SAL, ID_DATI_SAL_STOR, ID_FATTURA, ID_FATTURA_STOR, NM_UTENTE_INSERIMENTO, NM_UTENTE_ULTIMA_MODIFICA, TS_INSERIMENTO, TS_ULTIMA_MODIFICA )VALUES( :cdRiferimentoFase, :idDatiSal, :idDatiSalStor, :idFattura, :idFatturaStor, :nmUtenteInserimento, :nmUtenteUltimaModifica , :tsInserimento, :tsUltimaModifica )";

	private Long idDatiSalStor;

	private String cdRiferimentoFase;

	private Long idDatiSal;

	private Long idFattura;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idFatturaStor;

	public Long getIdDatiSalStor() {
		return idDatiSalStor;
	}

	public void setIdDatiSalStor(Long idDatiSalStor) {
		this.idDatiSalStor = idDatiSalStor;
	}

	public String getCdRiferimentoFase() {
		return cdRiferimentoFase;
	}

	public void setCdRiferimentoFase(String cdRiferimentoFase) {
		this.cdRiferimentoFase = cdRiferimentoFase;
	}

	public Long getIdDatiSal() {
		return idDatiSal;
	}

	public void setIdDatiSal(Long idDatiSal) {
		this.idDatiSal = idDatiSal;
	}

	public Long getIdFattura() {
		return idFattura;
	}

	public void setIdFattura(Long idFattura) {
		this.idFattura = idFattura;
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

	public Long getIdFatturaStor() {
		return idFatturaStor;
	}

	public void setIdFatturaStor(Long idFatturaStor) {
		this.idFatturaStor = idFatturaStor;
	}

	@Override
	public String getPKDescription() {
		return this.idDatiSalStor.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	

}