package it.pccube.batchmigration.source.model;

import java.math.BigDecimal;
import java.util.Date;

public class FeFatturaStorico {
	
	public static final String TABLE_NAME = "FE_FATTURA_STORICO";

	
	private Date dataOraRitiro;
	 
	private Date data;

	private Date dataFatturaPrincipale;
	 
	private Date dataInizioTrasporto;
	 
	private Date dataImmatVeicolo;
	 
	private Date dataOraConsegna;
	 
	private Long art73;
	 
	private Long tipoRitenuta;
	 
	private Long nazioneResa;
	 
	private Long regioneResa;

	private Long comuneResa;

	private Long provinciaResa;

	private Long idPaeseVettore;
	 
	private BigDecimal importoBollo;
	 
	private BigDecimal importoRitenuta;

	private BigDecimal arrotondamento;
	 
	private BigDecimal importoTotaleDocumento;

	private Long idLotto;
	 
	private Long versioneLotto;
	 
	private Long idFatturaStorico;
	 
	private Long idFattura;
	 
	private Long tipoResa;

	private Long causalePagamento;
	 
	private Long divisa;
	 
	private Long tipoDocumento;

	private Long numeroColli;

	private BigDecimal aliquotaRitenuta;
	 
	private BigDecimal pesoLordo;

	private BigDecimal pesoNetto;

	private Date tmstUltimoAggiornamento;
	 
	private String useridUltimoAggiornamento;

	private Date tmstInserimento;

	private String unitaMisuraPeso;
	 
	private String titoloVettore;
	 
	private String normaDiRiferimento;

	private String descrizione;

	private String causaleTrasporto;

	private String totalePercorsoVeicolo;
	 
	private String codiceFiscaleVettore;
	 
	private String codEoriVettore;

	private String numLicenzaGuidaVettore;

	private String numero;

	private String numeroFatturaPrincipale;

	private String causale;

	private String idCodiceVettore;
	 
	private String useridInserimento;

	private String numeroBollo;
	
	private String bolloVirtuale;

	private String capResa;
	 
	private String nomeVettore;
	 
	private String cognomeVettore;

	private String indirizzoResa;
	 
	private String comuneResaEst;

	private String numeroCivicoResa;
	
	private String mezzoTrasporto;

	private String denominazioneVettore;
	
	/**CAMPI MANCANTI NELLA ENTITY FE**/
	
	private Long idLottoFatRifiutata;
	
	private String  useridXmlEuGenerated;
	
	private String  useridXmlEuUploaded;
	
	private Long versioneLottoFatRifiutata;
	
	private byte[] xmlEuGenerated;
	
	private String  xmlEuGeneratedName;
	
	private byte[]  xmlEuUploaded;
	
	private String xmlEuUploadedName;
	
	private Date tmstXmlEuGenerated;
	
	private Date  tmstXmlEuUploaded;
	
	private Long idFatturaPrincipale;
	
	private Long idFatturaRifiutata;

	public Date getDataOraRitiro() {
		return dataOraRitiro;
	}

	public void setDataOraRitiro(Date dataOraRitiro) {
		this.dataOraRitiro = dataOraRitiro;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Date getDataFatturaPrincipale() {
		return dataFatturaPrincipale;
	}

	public void setDataFatturaPrincipale(Date dataFatturaPrincipale) {
		this.dataFatturaPrincipale = dataFatturaPrincipale;
	}

	public Date getDataInizioTrasporto() {
		return dataInizioTrasporto;
	}

	public void setDataInizioTrasporto(Date dataInizioTrasporto) {
		this.dataInizioTrasporto = dataInizioTrasporto;
	}

	public Date getDataImmatVeicolo() {
		return dataImmatVeicolo;
	}

	public void setDataImmatVeicolo(Date dataImmatVeicolo) {
		this.dataImmatVeicolo = dataImmatVeicolo;
	}

	public Date getDataOraConsegna() {
		return dataOraConsegna;
	}

	public void setDataOraConsegna(Date dataOraConsegna) {
		this.dataOraConsegna = dataOraConsegna;
	}

	public Long getArt73() {
		return art73;
	}

	public void setArt73(Long art73) {
		this.art73 = art73;
	}

	public Long getTipoRitenuta() {
		return tipoRitenuta;
	}

	public void setTipoRitenuta(Long tipoRitenuta) {
		this.tipoRitenuta = tipoRitenuta;
	}

	public Long getNazioneResa() {
		return nazioneResa;
	}

	public void setNazioneResa(Long nazioneResa) {
		this.nazioneResa = nazioneResa;
	}

	public Long getRegioneResa() {
		return regioneResa;
	}

	public void setRegioneResa(Long regioneResa) {
		this.regioneResa = regioneResa;
	}

	public Long getComuneResa() {
		return comuneResa;
	}

	public void setComuneResa(Long comuneResa) {
		this.comuneResa = comuneResa;
	}

	public Long getProvinciaResa() {
		return provinciaResa;
	}

	public void setProvinciaResa(Long provinciaResa) {
		this.provinciaResa = provinciaResa;
	}

	public Long getIdPaeseVettore() {
		return idPaeseVettore;
	}

	public void setIdPaeseVettore(Long idPaeseVettore) {
		this.idPaeseVettore = idPaeseVettore;
	}

	public BigDecimal getImportoBollo() {
		return importoBollo;
	}

	public void setImportoBollo(BigDecimal importoBollo) {
		this.importoBollo = importoBollo;
	}

	public BigDecimal getImportoRitenuta() {
		return importoRitenuta;
	}

	public void setImportoRitenuta(BigDecimal importoRitenuta) {
		this.importoRitenuta = importoRitenuta;
	}

	public BigDecimal getArrotondamento() {
		return arrotondamento;
	}

	public void setArrotondamento(BigDecimal arrotondamento) {
		this.arrotondamento = arrotondamento;
	}

	public BigDecimal getImportoTotaleDocumento() {
		return importoTotaleDocumento;
	}

	public void setImportoTotaleDocumento(BigDecimal importoTotaleDocumento) {
		this.importoTotaleDocumento = importoTotaleDocumento;
	}

	public Long getIdLotto() {
		return idLotto;
	}

	public void setIdLotto(Long idLotto) {
		this.idLotto = idLotto;
	}

	public Long getVersioneLotto() {
		return versioneLotto;
	}

	public void setVersioneLotto(Long versioneLotto) {
		this.versioneLotto = versioneLotto;
	}

	public Long getIdFatturaStorico() {
		return idFatturaStorico;
	}

	public void setIdFatturaStorico(Long idFatturaStorico) {
		this.idFatturaStorico = idFatturaStorico;
	}

	public Long getIdFattura() {
		return idFattura;
	}

	public void setIdFattura(Long idFattura) {
		this.idFattura = idFattura;
	}

	public Long getTipoResa() {
		return tipoResa;
	}

	public void setTipoResa(Long tipoResa) {
		this.tipoResa = tipoResa;
	}

	public Long getCausalePagamento() {
		return causalePagamento;
	}

	public void setCausalePagamento(Long causalePagamento) {
		this.causalePagamento = causalePagamento;
	}

	public Long getDivisa() {
		return divisa;
	}

	public void setDivisa(Long divisa) {
		this.divisa = divisa;
	}

	public Long getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(Long tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public Long getNumeroColli() {
		return numeroColli;
	}

	public void setNumeroColli(Long numeroColli) {
		this.numeroColli = numeroColli;
	}

	public BigDecimal getAliquotaRitenuta() {
		return aliquotaRitenuta;
	}

	public void setAliquotaRitenuta(BigDecimal aliquotaRitenuta) {
		this.aliquotaRitenuta = aliquotaRitenuta;
	}

	public BigDecimal getPesoLordo() {
		return pesoLordo;
	}

	public void setPesoLordo(BigDecimal pesoLordo) {
		this.pesoLordo = pesoLordo;
	}

	public BigDecimal getPesoNetto() {
		return pesoNetto;
	}

	public void setPesoNetto(BigDecimal pesoNetto) {
		this.pesoNetto = pesoNetto;
	}

	public Date getTmstUltimoAggiornamento() {
		return tmstUltimoAggiornamento;
	}

	public void setTmstUltimoAggiornamento(Date tmstUltimoAggiornamento) {
		this.tmstUltimoAggiornamento = tmstUltimoAggiornamento;
	}

	public String getUseridUltimoAggiornamento() {
		return useridUltimoAggiornamento;
	}

	public void setUseridUltimoAggiornamento(String useridUltimoAggiornamento) {
		this.useridUltimoAggiornamento = useridUltimoAggiornamento;
	}

	public Date getTmstInserimento() {
		return tmstInserimento;
	}

	public void setTmstInserimento(Date tmstInserimento) {
		this.tmstInserimento = tmstInserimento;
	}

	public String getUnitaMisuraPeso() {
		return unitaMisuraPeso;
	}

	public void setUnitaMisuraPeso(String unitaMisuraPeso) {
		this.unitaMisuraPeso = unitaMisuraPeso;
	}

	public String getTitoloVettore() {
		return titoloVettore;
	}

	public void setTitoloVettore(String titoloVettore) {
		this.titoloVettore = titoloVettore;
	}

	public String getNormaDiRiferimento() {
		return normaDiRiferimento;
	}

	public void setNormaDiRiferimento(String normaDiRiferimento) {
		this.normaDiRiferimento = normaDiRiferimento;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getCausaleTrasporto() {
		return causaleTrasporto;
	}

	public void setCausaleTrasporto(String causaleTrasporto) {
		this.causaleTrasporto = causaleTrasporto;
	}

	public String getTotalePercorsoVeicolo() {
		return totalePercorsoVeicolo;
	}

	public void setTotalePercorsoVeicolo(String totalePercorsoVeicolo) {
		this.totalePercorsoVeicolo = totalePercorsoVeicolo;
	}

	public String getCodiceFiscaleVettore() {
		return codiceFiscaleVettore;
	}

	public void setCodiceFiscaleVettore(String codiceFiscaleVettore) {
		this.codiceFiscaleVettore = codiceFiscaleVettore;
	}

	public String getCodEoriVettore() {
		return codEoriVettore;
	}

	public void setCodEoriVettore(String codEoriVettore) {
		this.codEoriVettore = codEoriVettore;
	}

	public String getNumLicenzaGuidaVettore() {
		return numLicenzaGuidaVettore;
	}

	public void setNumLicenzaGuidaVettore(String numLicenzaGuidaVettore) {
		this.numLicenzaGuidaVettore = numLicenzaGuidaVettore;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNumeroFatturaPrincipale() {
		return numeroFatturaPrincipale;
	}

	public void setNumeroFatturaPrincipale(String numeroFatturaPrincipale) {
		this.numeroFatturaPrincipale = numeroFatturaPrincipale;
	}

	public String getCausale() {
		return causale;
	}

	public void setCausale(String causale) {
		this.causale = causale;
	}

	public String getIdCodiceVettore() {
		return idCodiceVettore;
	}

	public void setIdCodiceVettore(String idCodiceVettore) {
		this.idCodiceVettore = idCodiceVettore;
	}

	public String getUseridInserimento() {
		return useridInserimento;
	}

	public void setUseridInserimento(String useridInserimento) {
		this.useridInserimento = useridInserimento;
	}

	public String getNumeroBollo() {
		return numeroBollo;
	}

	public void setNumeroBollo(String numeroBollo) {
		this.numeroBollo = numeroBollo;
	}

	public String getBolloVirtuale() {
		return bolloVirtuale;
	}

	public void setBolloVirtuale(String bolloVirtuale) {
		this.bolloVirtuale = bolloVirtuale;
	}

	public String getCapResa() {
		return capResa;
	}

	public void setCapResa(String capResa) {
		this.capResa = capResa;
	}

	public String getNomeVettore() {
		return nomeVettore;
	}

	public void setNomeVettore(String nomeVettore) {
		this.nomeVettore = nomeVettore;
	}

	public String getCognomeVettore() {
		return cognomeVettore;
	}

	public void setCognomeVettore(String cognomeVettore) {
		this.cognomeVettore = cognomeVettore;
	}

	public String getIndirizzoResa() {
		return indirizzoResa;
	}

	public void setIndirizzoResa(String indirizzoResa) {
		this.indirizzoResa = indirizzoResa;
	}

	public String getComuneResaEst() {
		return comuneResaEst;
	}

	public void setComuneResaEst(String comuneResaEst) {
		this.comuneResaEst = comuneResaEst;
	}

	public String getNumeroCivicoResa() {
		return numeroCivicoResa;
	}

	public void setNumeroCivicoResa(String numeroCivicoResa) {
		this.numeroCivicoResa = numeroCivicoResa;
	}

	public String getMezzoTrasporto() {
		return mezzoTrasporto;
	}

	public void setMezzoTrasporto(String mezzoTrasporto) {
		this.mezzoTrasporto = mezzoTrasporto;
	}

	public String getDenominazioneVettore() {
		return denominazioneVettore;
	}

	public void setDenominazioneVettore(String denominazioneVettore) {
		this.denominazioneVettore = denominazioneVettore;
	}

	public String getUseridXmlEuGenerated() {
		return useridXmlEuGenerated;
	}

	public void setUseridXmlEuGenerated(String useridXmlEuGenerated) {
		this.useridXmlEuGenerated = useridXmlEuGenerated;
	}

	public String getUseridXmlEuUploaded() {
		return useridXmlEuUploaded;
	}

	public void setUseridXmlEuUploaded(String useridXmlEuUploaded) {
		this.useridXmlEuUploaded = useridXmlEuUploaded;
	}

	public Long getVersioneLottoFatRifiutata() {
		return versioneLottoFatRifiutata;
	}

	public void setVersioneLottoFatRifiutata(Long versioneLottoFatRifiutata) {
		this.versioneLottoFatRifiutata = versioneLottoFatRifiutata;
	}

	public byte[] getXmlEuGenerated() {
		return xmlEuGenerated;
	}

	public void setXmlEuGenerated(byte[] xmlEuGenerated) {
		this.xmlEuGenerated = xmlEuGenerated;
	}

	public String getXmlEuGeneratedName() {
		return xmlEuGeneratedName;
	}

	public void setXmlEuGeneratedName(String xmlEuGeneratedName) {
		this.xmlEuGeneratedName = xmlEuGeneratedName;
	}

	public byte[] getXmlEuUploaded() {
		return xmlEuUploaded;
	}

	public void setXmlEuUploaded(byte[] xmlEuUploaded) {
		this.xmlEuUploaded = xmlEuUploaded;
	}

	public String getXmlEuUploadedName() {
		return xmlEuUploadedName;
	}

	public void setXmlEuUploadedName(String xmlEuUploadedName) {
		this.xmlEuUploadedName = xmlEuUploadedName;
	}

	public Date getTmstXmlEuGenerated() {
		return tmstXmlEuGenerated;
	}

	public void setTmstXmlEuGenerated(Date tmstXmlEuGenerated) {
		this.tmstXmlEuGenerated = tmstXmlEuGenerated;
	}

	public Date getTmstXmlEuUploaded() {
		return tmstXmlEuUploaded;
	}

	public void setTmstXmlEuUploaded(Date tmstXmlEuUploaded) {
		this.tmstXmlEuUploaded = tmstXmlEuUploaded;
	}

	public Long getIdFatturaPrincipale() {
		return idFatturaPrincipale;
	}

	public void setIdFatturaPrincipale(Long idFatturaPrincipale) {
		this.idFatturaPrincipale = idFatturaPrincipale;
	}

	public Long getIdFatturaRifiutata() {
		return idFatturaRifiutata;
	}

	public void setIdFatturaRifiutata(Long idFatturaRifiutata) {
		this.idFatturaRifiutata = idFatturaRifiutata;
	}

	public Long getIdLottoFatRifiutata() {
		return idLottoFatRifiutata;
	}

	public void setIdLottoFatRifiutata(Long idLottoFat_Rifiutata) {
		this.idLottoFatRifiutata = idLottoFat_Rifiutata;
	}



	/****/
	
	

}
