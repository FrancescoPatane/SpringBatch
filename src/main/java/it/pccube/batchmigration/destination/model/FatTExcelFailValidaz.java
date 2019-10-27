package it.pccube.batchmigration.destination.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;

public class FatTExcelFailValidaz implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_T_EXCEL_FAIL_VALIDAZ";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_EXCEL_FAIL_VALIDAZ ( CD_COLONNA_CELLA, CD_RIGA_CELLA, ID_DIZ_TIPO_VALIDAZIONE, ID_EXCEL_FAIL_VALIDAZIONE, ID_EXCEL_FATTURA, ID_REGOLA_VALIDAZIONE, NM_NOME_SHEET, NM_UTENTE_INSERIMENTO, NM_UTENTE_ULTIMA_MODIFICA, TS_INSERIMENTO, TS_ULTIMA_MODIFICA ) VALUES ( :cdColonnaCella, :cdRigaCella, :idDizTipoValidazione, :idExcelFailValidazione, :idExcelFattura, :idRegolaValidazione, :nmNomeSheet, :nmUtenteInserimento, :nmUtenteUltimaModifica, :tsInserimento, :tsUltimaModifica )";

	private Long idExcelFailValidazione;

	private String cdColonnaCella;

	private String cdRigaCella;

	private Long idDizTipoValidazione;

	private Long idRegolaValidazione;

	private String nmNomeSheet;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idExcelFattura;

	public Long getIdExcelFailValidazione() {
		return idExcelFailValidazione;
	}

	public void setIdExcelFailValidazione(Long idExcelFailValidazione) {
		this.idExcelFailValidazione = idExcelFailValidazione;
	}

	public String getCdColonnaCella() {
		return cdColonnaCella;
	}

	public void setCdColonnaCella(String cdColonnaCella) {
		this.cdColonnaCella = cdColonnaCella;
	}

	public String getCdRigaCella() {
		return cdRigaCella;
	}

	public void setCdRigaCella(String cdRigaCella) {
		this.cdRigaCella = cdRigaCella;
	}

	public Long getIdDizTipoValidazione() {
		return idDizTipoValidazione;
	}

	public void setIdDizTipoValidazione(Long idDizTipoValidazione) {
		this.idDizTipoValidazione = idDizTipoValidazione;
	}

	public Long getIdRegolaValidazione() {
		return idRegolaValidazione;
	}

	public void setIdRegolaValidazione(Long idRegolaValidazione) {
		this.idRegolaValidazione = idRegolaValidazione;
	}

	public String getNmNomeSheet() {
		return nmNomeSheet;
	}

	public void setNmNomeSheet(String nmNomeSheet) {
		this.nmNomeSheet = nmNomeSheet;
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

	public Long getIdExcelFattura() {
		return idExcelFattura;
	}

	public void setIdExcelFattura(Long idExcelFattura) {
		this.idExcelFattura = idExcelFattura;
	}

	@Override
	public String getPKDescription() {
		return this.idExcelFailValidazione.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	

}