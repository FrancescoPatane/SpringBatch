package it.pccube.batchmigration.source.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;



public class FeIpa implements ModelEntity{
	
	public static final String TABLE_NAME = "FE_IPA";
	
	private Date dataVerificaCfFe;
	
	private String descrizione;
	
	private String descrizioneCompleta;

	private Long idIpa;

	private Date tmstInserimento;

	private Date tmstUltimoAggiornamento;

	private String useridInserimento;

	private String useridUltimoAggiornamento;
	
	private Long idIpaPadre;
	
	private String regione;
	
	private String comune;
	
	private String indirizzo;
	
	private String cap;
	
	private String provincia;
	
	private String codiceFiscaleFe;
	
	private String codiceIpa;
	
	private Date dataAvvioFe;
	
	private Short flagUfficioCentraleFe;
	
	private Long idDizTipoElementoIpa;

	public Date getDataVerificaCfFe() {
		return dataVerificaCfFe;
	}

	public void setDataVerificaCfFe(Date dataVerificaCfFe) {
		this.dataVerificaCfFe = dataVerificaCfFe;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getDescrizioneCompleta() {
		return descrizioneCompleta;
	}

	public void setDescrizioneCompleta(String descrizioneCompleta) {
		this.descrizioneCompleta = descrizioneCompleta;
	}

	public Long getIdIpa() {
		return idIpa;
	}

	public void setIdIpa(Long idIpa) {
		this.idIpa = idIpa;
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

	
	public Long getIdIpaPadre() {
		return idIpaPadre;
	}

	public void setIdIpaPadre(Long idIpaPadre) {
		this.idIpaPadre = idIpaPadre;
	}

	public String getRegione() {
		return regione;
	}

	public void setRegione(String regione) {
		this.regione = regione;
	}

	public String getComune() {
		return comune;
	}

	public void setComune(String comune) {
		this.comune = comune;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getCodiceFiscaleFe() {
		return codiceFiscaleFe;
	}

	public void setCodiceFiscaleFe(String codiceFiscaleFe) {
		this.codiceFiscaleFe = codiceFiscaleFe;
	}

	public String getCodiceIpa() {
		return codiceIpa;
	}

	public void setCodiceIpa(String codiceIpa) {
		this.codiceIpa = codiceIpa;
	}

	public Date getDataAvvioFe() {
		return dataAvvioFe;
	}

	public void setDataAvvioFe(Date dataAvvioFe) {
		this.dataAvvioFe = dataAvvioFe;
	}

	public Short getFlagUfficioCentraleFe() {
		return flagUfficioCentraleFe;
	}

	public void setFlagUfficioCentraleFe(Short flagUfficioCentraleFe) {
		this.flagUfficioCentraleFe = flagUfficioCentraleFe;
	}

	public Long getIdDizTipoElementoIpa() {
		return idDizTipoElementoIpa;
	}

	public void setIdDizTipoElementoIpa(Long idDizTipoElementoIpa) {
		this.idDizTipoElementoIpa = idDizTipoElementoIpa;
	}

	@Override
	public String getPKDescription() {
		return this.idIpa.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	


}