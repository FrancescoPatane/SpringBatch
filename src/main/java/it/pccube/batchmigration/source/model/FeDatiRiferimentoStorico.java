package it.pccube.batchmigration.source.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;

public class FeDatiRiferimentoStorico implements ModelEntity {

	public static final String TABLE_NAME = "FE_DATI_RIFERIMENTO_STORICO";


	private String codiceCig;

	private String codiceCommessaConvenzione;

	private String codiceCup;

	private Date data;

	private Short flagEproc;
	
	private Long idDatiRiferimentoStorico;

	private Long idDatiRiferimento;

	private String idDocumento;

	private Long idFattura;
	
	private Long idFatturaStorico;

	private String numItem;

	private Long tipoDatiRiferimento;

	private Date tmstInserimento;

	private Date tmstUltimoAggiornamento;

	private String useridInserimento;

	private String useridUltimoAggiornamento;
	
	private Long idOrdineAcquisto;

	private Long idFatturaCollegata;
	
	private Long idTrattativa;

	private Long tipoIniziativa;
	
	private Long idt;

	public String getCodiceCig() {
		return codiceCig;
	}

	public void setCodiceCig(String codiceCig) {
		this.codiceCig = codiceCig;
	}

	public String getCodiceCommessaConvenzione() {
		return codiceCommessaConvenzione;
	}

	public void setCodiceCommessaConvenzione(String codiceCommessaConvenzione) {
		this.codiceCommessaConvenzione = codiceCommessaConvenzione;
	}

	public String getCodiceCup() {
		return codiceCup;
	}

	public void setCodiceCup(String codiceCup) {
		this.codiceCup = codiceCup;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	
	public Short getFlagEproc() {
		return flagEproc;
	}

	public void setFlagEproc(Short flagEproc) {
		this.flagEproc = flagEproc;
	}

	public Long getIdDatiRiferimentoStorico() {
		return idDatiRiferimentoStorico;
	}

	public void setIdDatiRiferimentoStorico(Long idDatiRiferimentoStorico) {
		this.idDatiRiferimentoStorico = idDatiRiferimentoStorico;
	}

	public Long getIdDatiRiferimento() {
		return idDatiRiferimento;
	}

	public void setIdDatiRiferimento(Long idDatiRiferimento) {
		this.idDatiRiferimento = idDatiRiferimento;
	}

	public String getIdDocumento() {
		return idDocumento;
	}

	public void setIdDocumento(String idDocumento) {
		this.idDocumento = idDocumento;
	}

	public Long getIdFattura() {
		return idFattura;
	}

	public void setIdFattura(Long idFattura) {
		this.idFattura = idFattura;
	}

	public Long getIdFatturaStorico() {
		return idFatturaStorico;
	}

	public void setIdFatturaStorico(Long idFatturaStorico) {
		this.idFatturaStorico = idFatturaStorico;
	}

	public String getNumItem() {
		return numItem;
	}

	public void setNumItem(String numItem) {
		this.numItem = numItem;
	}

	public Long getTipoDatiRiferimento() {
		return tipoDatiRiferimento;
	}

	public void setTipoDatiRiferimento(Long tipoDatiRiferimento) {
		this.tipoDatiRiferimento = tipoDatiRiferimento;
	}

	public Date getTmstInserimento() {
		return tmstInserimento;
	}

	public void setTmstInserimento(Date tmstInserimento) {
		this.tmstInserimento = tmstInserimento;
	}

	public Date getTmstUltimoAggiornamento() {
		return tmstUltimoAggiornamento;
	}

	public void setTmstUltimoAggiornamento(Date tmstUltimoAggiornamento) {
		this.tmstUltimoAggiornamento = tmstUltimoAggiornamento;
	}

	public String getUseridInserimento() {
		return useridInserimento;
	}

	public void setUseridInserimento(String useridInserimento) {
		this.useridInserimento = useridInserimento;
	}

	public String getUseridUltimoAggiornamento() {
		return useridUltimoAggiornamento;
	}

	public void setUseridUltimoAggiornamento(String useridUltimoAggiornamento) {
		this.useridUltimoAggiornamento = useridUltimoAggiornamento;
	}

	public Long getIdOrdineAcquisto() {
		return idOrdineAcquisto;
	}

	public void setIdOrdineAcquisto(Long idOrdineAcquisto) {
		this.idOrdineAcquisto = idOrdineAcquisto;
	}

	public Long getIdFatturaCollegata() {
		return idFatturaCollegata;
	}

	public void setIdFatturaCollegata(Long idFatturaCollegata) {
		this.idFatturaCollegata = idFatturaCollegata;
	}

	public Long getIdTrattativa() {
		return idTrattativa;
	}

	public void setIdTrattativa(Long idTrattativa) {
		this.idTrattativa = idTrattativa;
	}

	public Long getTipoIniziativa() {
		return tipoIniziativa;
	}

	public void setTipoIniziativa(Long tipoIniziativa) {
		this.tipoIniziativa = tipoIniziativa;
	}
	
	

	public Long getIdt() {
		return idt;
	}

	public void setIdt(Long idt) {
		this.idt = idt;
	}

	@Override
	public String getPKDescription() {
		return this.idDatiRiferimentoStorico.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	
	
	
}
