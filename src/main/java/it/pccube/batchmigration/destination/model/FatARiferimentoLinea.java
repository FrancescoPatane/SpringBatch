package it.pccube.batchmigration.destination.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FatARiferimentoLinea implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_A_RIFERIMENTO_LINEA";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_A_RIFERIMENTO_LINEA ( ID_DATI_DDT, ID_DATI_RIFERIMENTO, ID_DETTAGLIO_LINEA, ID_RIFERIMENTO_LINEA, NM_UTENTE_INSERIMENTO, NM_UTENTE_ULTIMA_MODIFICA, TS_INSERIMENTO, TS_ULTIMA_MODIFICA ) VALUES ( :idDatiDdt, :idDatiRiferimento, :idDettaglioLinea, :idRiferimentoLinea, :nmUtenteInserimento, :nmUtenteUltimaModifica, :tsInserimento, :tsUltimaModifica )";
	

	private Long idRiferimentoLinea;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idDatiDdt;

	private Long idDatiRiferimento;

	private Long idDettaglioLinea;

	public Long getIdRiferimentoLinea() {
		return idRiferimentoLinea;
	}

	public void setIdRiferimentoLinea(Long idRiferimentoLinea) {
		this.idRiferimentoLinea = idRiferimentoLinea;
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

	public Long getIdDatiDdt() {
		return idDatiDdt;
	}

	public void setIdDatiDdt(Long idDatiDdt) {
		this.idDatiDdt = idDatiDdt;
	}

	public Long getIdDatiRiferimento() {
		return idDatiRiferimento;
	}

	public void setIdDatiRiferimento(Long idDatiRiferimento) {
		this.idDatiRiferimento = idDatiRiferimento;
	}

	public Long getIdDettaglioLinea() {
		return idDettaglioLinea;
	}

	public void setIdDettaglioLinea(Long idDettaglioLinea) {
		this.idDettaglioLinea = idDettaglioLinea;
	}
	
	@Override
	public String getPKDescription() {
		return this.idRiferimentoLinea.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}

}