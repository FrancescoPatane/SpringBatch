package it.pccube.batchmigration.destination.model;

import java.util.Date;



public class FatTCausaleFatturaStor implements ModelEntity {

	private static final String TABLENAME = "FAT_T_CAUSALE_FATTURA_STOR";

	public static final String INSERT_QUERY = "INSERT INTO FAT_T_CAUSALE_FATTURA_STOR (id_causale_fattura_stor, id_causale_fattura, ds_causale, id_fattura, nm_utente_inserimento, ts_inserimento, nm_utente_ultima_modifica, ts_ultima_modifica, id_fattura_stor) VALUES (:idCausaleFatturaStor, :idCausaleFattura, :dsCausale, :idFattura, :nmUtenteInserimento, :tsInserimento, :nmUtenteUltimaModifica, :tsUltimaModifica, :idFatturaStor)";

	private Long idCausaleFatturaStor;

	private String dsCausale;

	private Long idCausaleFattura;

	private Long idFattura;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idFatturaStor;

	public Long getIdCausaleFatturaStor() {
		return idCausaleFatturaStor;
	}

	public void setIdCausaleFatturaStor(Long idCausaleFatturaStor) {
		this.idCausaleFatturaStor = idCausaleFatturaStor;
	}

	public String getDsCausale() {
		return dsCausale;
	}

	public void setDsCausale(String dsCausale) {
		this.dsCausale = dsCausale;
	}

	public Long getIdCausaleFattura() {
		return idCausaleFattura;
	}

	public void setIdCausaleFattura(Long idCausaleFattura) {
		this.idCausaleFattura = idCausaleFattura;
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
		return this.idCausaleFatturaStor.toString();
	}

	@Override
	public String getTableName() {
		return TABLENAME;
	}

}