package it.pccube.batchmigration.destination.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;



public class FatTDatiRiferimentoStor implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_T_DATI_RIFERIMENTO_STOR";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_DATI_RIFERIMENTO_STOR ( CD_CODICE_CIG, CD_CODICE_COMMESSA_CONVENZIONE, CD_CODICE_CUP, CD_DOCUMENTO, CD_NUM_ITEM, DT_DATA, FL_EPROC, ID_DATI_RIFERIMENTO, ID_DATI_RIFERIMENTO_STOR, ID_DIZ_TIPO_DATI_RIFERIMENTO, ID_DIZ_TIPO_INIZIATIVA, ID_FATTURA, ID_FATTURA_STOR, ID_FATTURA_COLLEGATA, ID_IDT, ID_ORDINE_ACQUISTO, ID_TRATTATIVA, NM_UTENTE_INSERIMENTO, NM_UTENTE_ULTIMA_MODIFICA, TS_INSERIMENTO, TS_ULTIMA_MODIFICA )VALUES( :cdCodiceCig, :cdCodiceCommessaConvenzione, :cdCodiceCup, :cdDocumento, :cdNumItem, :dtData, :flEproc, :idDatiRiferimento, :idDatiRiferimentoStor, :idDizTipoDatiRiferimento, :idDizTipoIniziativa, :idFattura, :idFatturaStor, :idFatturaCollegata, :idIdt, :idOrdineAcquisto, :idTrattativa, :nmUtenteInserimento, :nmUtenteUltimaModifica, :tsInserimento, :tsUltimaModifica)";


	private Long idDatiRiferimentoStor;

	private String cdCodiceCig;

	private String cdCodiceCommessaConvenzione;

	private String cdCodiceCup;

	private String cdDocumento;

	private String cdNumItem;

	private Date dtData;

	private Short flEproc;

	private Long idDatiRiferimento;

	private Long idFattura;

	private Long idFatturaCollegata;

	private Long idIdt;

	private Long idOrdineAcquisto;

	private Long idTrattativa;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idDizTipoIniziativa;

	private Long idFatturaStor;

	private Long idDizTipoDatiRiferimento;

	public Long getIdDatiRiferimentoStor() {
		return idDatiRiferimentoStor;
	}

	public void setIdDatiRiferimentoStor(Long idDatiRiferimentoStor) {
		this.idDatiRiferimentoStor = idDatiRiferimentoStor;
	}

	public String getCdCodiceCig() {
		return cdCodiceCig;
	}

	public void setCdCodiceCig(String cdCodiceCig) {
		this.cdCodiceCig = cdCodiceCig;
	}

	public String getCdCodiceCommessaConvenzione() {
		return cdCodiceCommessaConvenzione;
	}

	public void setCdCodiceCommessaConvenzione(String cdCodiceCommessaConvenzione) {
		this.cdCodiceCommessaConvenzione = cdCodiceCommessaConvenzione;
	}

	public String getCdCodiceCup() {
		return cdCodiceCup;
	}

	public void setCdCodiceCup(String cdCodiceCup) {
		this.cdCodiceCup = cdCodiceCup;
	}

	public String getCdDocumento() {
		return cdDocumento;
	}

	public void setCdDocumento(String cdDocumento) {
		this.cdDocumento = cdDocumento;
	}

	public String getCdNumItem() {
		return cdNumItem;
	}

	public void setCdNumItem(String cdNumItem) {
		this.cdNumItem = cdNumItem;
	}

	public Date getDtData() {
		return dtData;
	}

	public void setDtData(Date dtData) {
		this.dtData = dtData;
	}

	public Short getFlEproc() {
		return flEproc;
	}

	public void setFlEproc(Short flEproc) {
		this.flEproc = flEproc;
	}

	public Long getIdDatiRiferimento() {
		return idDatiRiferimento;
	}

	public void setIdDatiRiferimento(Long idDatiRiferimento) {
		this.idDatiRiferimento = idDatiRiferimento;
	}

	public Long getIdFattura() {
		return idFattura;
	}

	public void setIdFattura(Long idFattura) {
		this.idFattura = idFattura;
	}

	public Long getIdFatturaCollegata() {
		return idFatturaCollegata;
	}

	public void setIdFatturaCollegata(Long idFatturaCollegata) {
		this.idFatturaCollegata = idFatturaCollegata;
	}

	public Long getIdIdt() {
		return idIdt;
	}

	public void setIdIdt(Long idIdt) {
		this.idIdt = idIdt;
	}

	public Long getIdOrdineAcquisto() {
		return idOrdineAcquisto;
	}

	public void setIdOrdineAcquisto(Long idOrdineAcquisto) {
		this.idOrdineAcquisto = idOrdineAcquisto;
	}

	public Long getIdTrattativa() {
		return idTrattativa;
	}

	public void setIdTrattativa(Long idTrattativa) {
		this.idTrattativa = idTrattativa;
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

	public Long getIdFatturaStor() {
		return idFatturaStor;
	}

	public void setIdFatturaStor(Long idFatturaStor) {
		this.idFatturaStor = idFatturaStor;
	}

	
	public Long getIdDizTipoDatiRiferimento() {
		return idDizTipoDatiRiferimento;
	}

	public void setIdDizTipoDatiRiferimento(Long idDizTipoDatiRiferimento) {
		this.idDizTipoDatiRiferimento = idDizTipoDatiRiferimento;
	}

	@Override
	public String getPKDescription() {
		return this.idDatiRiferimentoStor.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	

}