package it.pccube.batchmigration.destination.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;

public class FatARifLineaStor implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_A_RIF_LINEA_STOR";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_A_RIF_LINEA_STOR ( ID_DATI_DDT, ID_DATI_DDT_STOR, ID_DATI_RIFERIMENTO, ID_DATI_RIFERIMENTO_STOR, ID_DETTAGLIO_LINEA, ID_DETTAGLIO_LINEA_STOR, ID_RIFERIMENTO_LINEA, ID_RIFERIMENTO_LINEA_STOR, NM_UTENTE_INSERIMENTO, NM_UTENTE_ULTIMA_MODIFICA, TS_INSERIMENTO, TS_ULTIMA_MODIFICA ) VALUES ( :idDatiDdt, :idDatiDdtStor, :idDatiRiferimento, :idDatiRiferimentoStor, :idDettaglioLinea, :idDettaglioLineaStor, :idRiferimentoLinea, :idRiferimentoLineaStor, :nmUtenteInserimento, :nmUtenteUltimaModifica, :tsInserimento, :tsUltimaModifica )";
	
	private Long idRiferimentoLineaStor;

	private Long idDatiDdt;

	private Long idDatiRiferimento;

	private Long idDettaglioLinea;

	private Long idRiferimentoLinea;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idDettaglioLineaStor;

	private Long idDatiDdtStor;

	private Long idDatiRiferimentoStor;

	public Long getIdRiferimentoLineaStor() {
		return idRiferimentoLineaStor;
	}

	public void setIdRiferimentoLineaStor(Long idRiferimentoLineaStor) {
		this.idRiferimentoLineaStor = idRiferimentoLineaStor;
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

	public Long getIdDettaglioLineaStor() {
		return idDettaglioLineaStor;
	}

	public void setIdDettaglioLineaStor(Long idDettaglioLineaStor) {
		this.idDettaglioLineaStor = idDettaglioLineaStor;
	}

	public Long getIdDatiDdtStor() {
		return idDatiDdtStor;
	}

	public void setIdDatiDdtStor(Long idDatiDdtStor) {
		this.idDatiDdtStor = idDatiDdtStor;
	}

	public Long getIdDatiRiferimentoStor() {
		return idDatiRiferimentoStor;
	}

	public void setIdDatiRiferimentoStor(Long idDatiRiferimentoStor) {
		this.idDatiRiferimentoStor = idDatiRiferimentoStor;
	}
	
	@Override
	public String getPKDescription() {
		return this.idRiferimentoLineaStor.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	

	

}