package it.pccube.batchmigration.destination.model;

import java.io.Serializable;
import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FatAFatturaInzStor implements ModelEntity{
	
	public static final String TABLE_NAME = "FAT_A_FATTURA_INZ_STOR";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_A_FATTURA_INZ_STOR (ID_FATTURA_STOR, ID_DIZ_TIPO_INIZIATIVA, ID_FATTURA, ID_IDT, NM_UTENTE_INSERIMENTO, NM_UTENTE_ULTIMA_MODIFICA, TS_INSERIMENTO, TS_ULTIMA_MODIFICA ) VALUES (:idFatturaStor, :idDizTipoIniziativa, :idFattura, :idIdt, :nmUtenteInserimento, :nmUtenteUltimaModifica, :tsInserimento, :tsUltimaModifica )";

	private Long idFatturaStor;

	private Long idIdt;

	private Long idFattura;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idDizTipoIniziativa;

	public Long getIdFatturaStor() {
		return idFatturaStor;
	}

	public void setIdFatturaStor(Long idFatturaStor) {
		this.idFatturaStor = idFatturaStor;
	}

	public Long getIdIdt() {
		return idIdt;
	}

	public void setIdIdt(Long idIdt) {
		this.idIdt = idIdt;
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

	public Long getIdDizTipoIniziativa() {
		return idDizTipoIniziativa;
	}

	public void setIdDizTipoIniziativa(Long idDizTipoIniziativa) {
		this.idDizTipoIniziativa = idDizTipoIniziativa;
	}
	
	@Override
	public String getPKDescription() {
		return this.idFatturaStor.toString()+";"+this.idIdt.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}


}