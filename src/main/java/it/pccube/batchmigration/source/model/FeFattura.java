package it.pccube.batchmigration.source.model;


import java.math.BigDecimal;
import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FeFattura  implements ModelEntity{
	
	public static final String TABLE_NAME = "FE_FATTURA";


	private Date dataOraConsegna;

	private Date dataFatturaPrincipale;

	private Date dataImmatVeicolo;

	private Date dataInizioTrasporto;

	private Date dataOraRitiro;

	private Date data;

	private Long tipoRitenuta;

	private Long art73;

	private Long nazioneResa;

	private Long paeseVettore;

	private Long provinciaResa;

	private Long regioneResa;

	private Long comuneResa;

	private BigDecimal arrotondamento;

	private BigDecimal importoBollo;

	private BigDecimal importoRitenuta;

	private BigDecimal importoTotaleDocumento;

	private Long idFattura;

	private Long idLotto;

	private Long causalePagamento;

	private Long tipoResa;

	private Long divisa;

	private Long lastStatoFattura;

	private Long tipoDocumento;

	private Long numeroColli;

	private BigDecimal aliquotaRitenuta;

	private BigDecimal pesoLordo;

	private BigDecimal pesoNetto;

	private Date tmstInserimento;

	private Date tmstUltimoAggiornamento;

	private String useridUltimoAggiornamento;

	private String titoloVettore;

	private String unitaMisuraPeso;

	private String descrizione;

	private String causaleTrasporto;

	private String normaDiRiferimento;

	private String totalePercorsoVeicolo;

	private String codiceFiscaleVettore;

	private String codEoriVettore;

	private String numero;

	private String numLicenzaGuidaVettore;

	private String numeroFatturaPrincipale;

	private String idCodiceVettore;

	private String useridInserimento;

	private String numeroBollo;
	
	private String bolloVirtuale;

	private String capResa;

	private String comuneResaEst;

	private String indirizzoResa;

	private String nomeVettore;

	private String cognomeVettore;

	private String numeroCivicoResa;

	private String mezzoTrasporto;

	private String denominazioneVettore;

	private Long idFatturaPrincipale;

	private Long idFatturaRifiutata;

	private Long idLottoFatturaRifiutata;

	private Long versioneLottoFatturaRifiutata;
	
	private byte[] xmlEuUploaded;
	
	private String xmlEuUploadedName;
	
	private String userIdXmlEuUploaded;
	
	private Date tmstXmlEuUploaded;
	
	private byte[] xmlEuGenerated;
	
	private String xmlEuGeneratedName;
	
	private String userIdXmlEuGenerated;
	
	private Date tmstXmlEuGenerated;
	
	private String causale;

	public Date getDataOraConsegna() {
		return dataOraConsegna;
	}

	public void setDataOraConsegna(Date dataOraConsegna) {
		this.dataOraConsegna = dataOraConsegna;
	}

	public Date getDataFatturaPrincipale() {
		return dataFatturaPrincipale;
	}

	public void setDataFatturaPrincipale(Date dataFatturaPrincipale) {
		this.dataFatturaPrincipale = dataFatturaPrincipale;
	}

	public Date getDataImmatVeicolo() {
		return dataImmatVeicolo;
	}

	public void setDataImmatVeicolo(Date dataImmatVeicolo) {
		this.dataImmatVeicolo = dataImmatVeicolo;
	}

	public Date getDataInizioTrasporto() {
		return dataInizioTrasporto;
	}

	public void setDataInizioTrasporto(Date dataInizioTrasporto) {
		this.dataInizioTrasporto = dataInizioTrasporto;
	}

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

	public Long getTipoRitenuta() {
		return tipoRitenuta;
	}

	public void setTipoRitenuta(Long tipoRitenuta) {
		this.tipoRitenuta = tipoRitenuta;
	}

	public Long getArt73() {
		return art73;
	}

	public void setArt73(Long art73) {
		this.art73 = art73;
	}

	public Long getNazioneResa() {
		return nazioneResa;
	}

	public void setNazioneResa(Long nazioneResa) {
		this.nazioneResa = nazioneResa;
	}

	public Long getPaeseVettore() {
		return paeseVettore;
	}

	public void setPaeseVettore(Long paeseVettore) {
		this.paeseVettore = paeseVettore;
	}

	public Long getProvinciaResa() {
		return provinciaResa;
	}

	public void setProvinciaResa(Long provinciaResa) {
		this.provinciaResa = provinciaResa;
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

	public BigDecimal getArrotondamento() {
		return arrotondamento;
	}

	public void setArrotondamento(BigDecimal arrotondamento) {
		this.arrotondamento = arrotondamento;
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

	public BigDecimal getImportoTotaleDocumento() {
		return importoTotaleDocumento;
	}

	public void setImportoTotaleDocumento(BigDecimal importoTotaleDocumento) {
		this.importoTotaleDocumento = importoTotaleDocumento;
	}

	public Long getIdFattura() {
		return idFattura;
	}

	public void setIdFattura(Long idFattura) {
		this.idFattura = idFattura;
	}

	public Long getIdLotto() {
		return idLotto;
	}

	public void setIdLotto(Long idLotto) {
		this.idLotto = idLotto;
	}

	public Long getCausalePagamento() {
		return causalePagamento;
	}

	public void setCausalePagamento(Long causalePagamento) {
		this.causalePagamento = causalePagamento;
	}

	public Long getTipoResa() {
		return tipoResa;
	}

	public void setTipoResa(Long tipoResa) {
		this.tipoResa = tipoResa;
	}

	public Long getDivisa() {
		return divisa;
	}

	public void setDivisa(Long divisa) {
		this.divisa = divisa;
	}

	public Long getLastStatoFattura() {
		return lastStatoFattura;
	}

	public void setLastStatoFattura(Long lastStatoFattura) {
		this.lastStatoFattura = lastStatoFattura;
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

	public String getUseridUltimoAggiornamento() {
		return useridUltimoAggiornamento;
	}

	public void setUseridUltimoAggiornamento(String useridUltimoAggiornamento) {
		this.useridUltimoAggiornamento = useridUltimoAggiornamento;
	}

	public String getTitoloVettore() {
		return titoloVettore;
	}

	public void setTitoloVettore(String titoloVettore) {
		this.titoloVettore = titoloVettore;
	}

	public String getUnitaMisuraPeso() {
		return unitaMisuraPeso;
	}

	public void setUnitaMisuraPeso(String unitaMisuraPeso) {
		this.unitaMisuraPeso = unitaMisuraPeso;
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

	public String getNormaDiRiferimento() {
		return normaDiRiferimento;
	}

	public void setNormaDiRiferimento(String normaDiRiferimento) {
		this.normaDiRiferimento = normaDiRiferimento;
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

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNumLicenzaGuidaVettore() {
		return numLicenzaGuidaVettore;
	}

	public void setNumLicenzaGuidaVettore(String numLicenzaGuidaVettore) {
		this.numLicenzaGuidaVettore = numLicenzaGuidaVettore;
	}

	public String getNumeroFatturaPrincipale() {
		return numeroFatturaPrincipale;
	}

	public void setNumeroFatturaPrincipale(String numeroFatturaPrincipale) {
		this.numeroFatturaPrincipale = numeroFatturaPrincipale;
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

	public String getComuneResaEst() {
		return comuneResaEst;
	}

	public void setComuneResaEst(String comuneResaEst) {
		this.comuneResaEst = comuneResaEst;
	}

	public String getIndirizzoResa() {
		return indirizzoResa;
	}

	public void setIndirizzoResa(String indirizzoResa) {
		this.indirizzoResa = indirizzoResa;
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

	public Long getIdLottoFatturaRifiutata() {
		return idLottoFatturaRifiutata;
	}

	public void setIdLottoFatturaRifiutata(Long idLottoFatturaRifiutata) {
		this.idLottoFatturaRifiutata = idLottoFatturaRifiutata;
	}

	public Long getVersioneLottoFatturaRifiutata() {
		return versioneLottoFatturaRifiutata;
	}

	public void setVersioneLottoFatturaRifiutata(Long versioneLottoFatturaRifiutata) {
		this.versioneLottoFatturaRifiutata = versioneLottoFatturaRifiutata;
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

	public String getUserIdXmlEuUploaded() {
		return userIdXmlEuUploaded;
	}

	public void setUserIdXmlEuUploaded(String userIdXmlEuUploaded) {
		this.userIdXmlEuUploaded = userIdXmlEuUploaded;
	}

	public Date getTmstXmlEuUploaded() {
		return tmstXmlEuUploaded;
	}

	public void setTmstXmlEuUploaded(Date tmstXmlEuUploaded) {
		this.tmstXmlEuUploaded = tmstXmlEuUploaded;
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

	public String getUserIdXmlEuGenerated() {
		return userIdXmlEuGenerated;
	}

	public void setUserIdXmlEuGenerated(String userIdXmlEuGenerated) {
		this.userIdXmlEuGenerated = userIdXmlEuGenerated;
	}

	public Date getTmstXmlEuGenerated() {
		return tmstXmlEuGenerated;
	}

	public void setTmstXmlEuGenerated(Date tmstXmlEuGenerated) {
		this.tmstXmlEuGenerated = tmstXmlEuGenerated;
	}

	public String getCausale() {
		return causale;
	}

	public void setCausale(String causale) {
		this.causale = causale;
	}

	@Override
	public String getPKDescription() {
		return this.idFattura.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	






	
}