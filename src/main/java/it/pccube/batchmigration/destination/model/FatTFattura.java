package it.pccube.batchmigration.destination.model;

import java.math.BigDecimal;
import java.util.Date;


public class FatTFattura implements ModelEntity {
	
	
	private final String tableName = "FAT_T_LOTTO";

	private Long idFattura;

	
	
	private String cdBolloVirtuale;

	
	
	private String cdCapResa;

	
	
	private String cdCodEoriVettore;

	
	
	private String cdCodiceFiscaleVettore;

	
	
	private String cdCodiceVettore;

	
	
	private String cdNormaDiRiferimento;

	
	
	private String cdNumLicenzaGuidaVettore;

	private String cdNumero;

	private String cdNumeroBollo;
	
	
	private String cdNumeroCivicoResa;
	
	private String cdNumeroFatturaPrincipale;

	private String cdUnitaMisuraPeso;

	private String dsCausale;

	private String dsCausaleTrasporto;

	private String dsDescrizione;

	private Date dtData;

	private Date dtDataFatturaPrincipale;

	private Date dtDataImmatVeicolo;

	private Date dtDataInizioTrasporto;

	private Date dtDataOraConsegna;

	private Date dtDataOraRitiro;
	
	private Long idComuneResa;
	
	private Long idNazioneResa;
	
	private Long idPaeseVettore;

	private Long idProvinciaResa;
	
	private Long idRegioneResa;

	
	
	private BigDecimal imArrotondamento;

	
	
	private BigDecimal imImportoBollo;

	
	
	private BigDecimal imImportoRitenuta;

	
	
	private BigDecimal imImportoTotaleDocumento;

	
	
	private String nmCognomeVettore;

	
	
	private String nmComuneResaEst;

	
	
	private String nmDenominazioneVettore;

	
	
	private String nmIndirizzoResa;

	
	
	private String nmMezzoTrasporto;

	
	
	private String nmNomeVettore;

	
	
	private String nmTitoloVettore;

	
	
	private String nmUtenteInserimento;

	
	
	private String nmUtenteUltimaModifica;

	
	
	private BigDecimal pcAliquotaRitenuta;

	
	
	private BigDecimal pgVersioneLottoFatRifiut;

	
	
	private BigDecimal qtNumeroColli;

	
	
	private BigDecimal qtPesoLordo;

	
	
	private BigDecimal qtPesoNetto;

	
	
	private String qtTotalePercorsoVeicolo;

	
	
	private String idXmlEuUploaded;

	
	
	private String idXmlEuGenerated;

	
	
	private String nmXmlEuUploadedName;

	
	
	private String nmXmlEuGeneratedName;

	
	
	
	private Date tsInserimento;

	
	
	
	private Date tsUltimaModifica;


	private Long idDizCausalePagamento;

	private Long idDizDivisa;

	private Long idDizArt73;

	private Long idDizTipoResa;

	private Long idDizTipoRitenuta;

	private Long idDizTipoDocumento;

	private Long idFatturaPrincipale;

	private Long idFatturaRifiutata;

	private Long idLotto;

	private Long idLottoFatRifiutata;

	public Long getIdFattura() {
		return idFattura;
	}

	public void setIdFattura(Long idFattura) {
		this.idFattura = idFattura;
	}

	public String getCdBolloVirtuale() {
		return cdBolloVirtuale;
	}

	public void setCdBolloVirtuale(String cdBolloVirtuale) {
		this.cdBolloVirtuale = cdBolloVirtuale;
	}

	public String getCdCapResa() {
		return cdCapResa;
	}

	public void setCdCapResa(String cdCapResa) {
		this.cdCapResa = cdCapResa;
	}

	public String getCdCodEoriVettore() {
		return cdCodEoriVettore;
	}

	public void setCdCodEoriVettore(String cdCodEoriVettore) {
		this.cdCodEoriVettore = cdCodEoriVettore;
	}

	public String getCdCodiceFiscaleVettore() {
		return cdCodiceFiscaleVettore;
	}

	public void setCdCodiceFiscaleVettore(String cdCodiceFiscaleVettore) {
		this.cdCodiceFiscaleVettore = cdCodiceFiscaleVettore;
	}

	public String getCdCodiceVettore() {
		return cdCodiceVettore;
	}

	public void setCdCodiceVettore(String cdCodiceVettore) {
		this.cdCodiceVettore = cdCodiceVettore;
	}

	public String getCdNormaDiRiferimento() {
		return cdNormaDiRiferimento;
	}

	public void setCdNormaDiRiferimento(String cdNormaDiRiferimento) {
		this.cdNormaDiRiferimento = cdNormaDiRiferimento;
	}

	public String getCdNumLicenzaGuidaVettore() {
		return cdNumLicenzaGuidaVettore;
	}

	public void setCdNumLicenzaGuidaVettore(String cdNumLicenzaGuidaVettore) {
		this.cdNumLicenzaGuidaVettore = cdNumLicenzaGuidaVettore;
	}

	public String getCdNumero() {
		return cdNumero;
	}

	public void setCdNumero(String cdNumero) {
		this.cdNumero = cdNumero;
	}

	public String getCdNumeroBollo() {
		return cdNumeroBollo;
	}

	public void setCdNumeroBollo(String cdNumeroBollo) {
		this.cdNumeroBollo = cdNumeroBollo;
	}

	public String getCdNumeroCivicoResa() {
		return cdNumeroCivicoResa;
	}

	public void setCdNumeroCivicoResa(String cdNumeroCivicoResa) {
		this.cdNumeroCivicoResa = cdNumeroCivicoResa;
	}

	public String getCdNumeroFatturaPrincipale() {
		return cdNumeroFatturaPrincipale;
	}

	public void setCdNumeroFatturaPrincipale(String cdNumeroFatturaPrincipale) {
		this.cdNumeroFatturaPrincipale = cdNumeroFatturaPrincipale;
	}

	public String getCdUnitaMisuraPeso() {
		return cdUnitaMisuraPeso;
	}

	public void setCdUnitaMisuraPeso(String cdUnitaMisuraPeso) {
		this.cdUnitaMisuraPeso = cdUnitaMisuraPeso;
	}

	public String getDsCausale() {
		return dsCausale;
	}

	public void setDsCausale(String dsCausale) {
		this.dsCausale = dsCausale;
	}

	public String getDsCausaleTrasporto() {
		return dsCausaleTrasporto;
	}

	public void setDsCausaleTrasporto(String dsCausaleTrasporto) {
		this.dsCausaleTrasporto = dsCausaleTrasporto;
	}

	public String getDsDescrizione() {
		return dsDescrizione;
	}

	public void setDsDescrizione(String dsDescrizione) {
		this.dsDescrizione = dsDescrizione;
	}

	public Date getDtData() {
		return dtData;
	}

	public void setDtData(Date dtData) {
		this.dtData = dtData;
	}

	public Date getDtDataFatturaPrincipale() {
		return dtDataFatturaPrincipale;
	}

	public void setDtDataFatturaPrincipale(Date dtDataFatturaPrincipale) {
		this.dtDataFatturaPrincipale = dtDataFatturaPrincipale;
	}

	public Date getDtDataImmatVeicolo() {
		return dtDataImmatVeicolo;
	}

	public void setDtDataImmatVeicolo(Date dtDataImmatVeicolo) {
		this.dtDataImmatVeicolo = dtDataImmatVeicolo;
	}

	public Date getDtDataInizioTrasporto() {
		return dtDataInizioTrasporto;
	}

	public void setDtDataInizioTrasporto(Date dtDataInizioTrasporto) {
		this.dtDataInizioTrasporto = dtDataInizioTrasporto;
	}

	public Date getDtDataOraConsegna() {
		return dtDataOraConsegna;
	}

	public void setDtDataOraConsegna(Date dtDataOraConsegna) {
		this.dtDataOraConsegna = dtDataOraConsegna;
	}

	public Date getDtDataOraRitiro() {
		return dtDataOraRitiro;
	}

	public void setDtDataOraRitiro(Date dtDataOraRitiro) {
		this.dtDataOraRitiro = dtDataOraRitiro;
	}

	public Long getIdComuneResa() {
		return idComuneResa;
	}

	public void setIdComuneResa(Long idComuneResa) {
		this.idComuneResa = idComuneResa;
	}

	public Long getIdNazioneResa() {
		return idNazioneResa;
	}

	public void setIdNazioneResa(Long idNazioneResa) {
		this.idNazioneResa = idNazioneResa;
	}

	public Long getIdPaeseVettore() {
		return idPaeseVettore;
	}

	public void setIdPaeseVettore(Long idPaeseVettore) {
		this.idPaeseVettore = idPaeseVettore;
	}

	public Long getIdProvinciaResa() {
		return idProvinciaResa;
	}

	public void setIdProvinciaResa(Long idProvinciaResa) {
		this.idProvinciaResa = idProvinciaResa;
	}

	public Long getIdRegioneResa() {
		return idRegioneResa;
	}

	public void setIdRegioneResa(Long idRegioneResa) {
		this.idRegioneResa = idRegioneResa;
	}

	public BigDecimal getImArrotondamento() {
		return imArrotondamento;
	}

	public void setImArrotondamento(BigDecimal imArrotondamento) {
		this.imArrotondamento = imArrotondamento;
	}

	public BigDecimal getImImportoBollo() {
		return imImportoBollo;
	}

	public void setImImportoBollo(BigDecimal imImportoBollo) {
		this.imImportoBollo = imImportoBollo;
	}

	public BigDecimal getImImportoRitenuta() {
		return imImportoRitenuta;
	}

	public void setImImportoRitenuta(BigDecimal imImportoRitenuta) {
		this.imImportoRitenuta = imImportoRitenuta;
	}

	public BigDecimal getImImportoTotaleDocumento() {
		return imImportoTotaleDocumento;
	}

	public void setImImportoTotaleDocumento(BigDecimal imImportoTotaleDocumento) {
		this.imImportoTotaleDocumento = imImportoTotaleDocumento;
	}

	public String getNmCognomeVettore() {
		return nmCognomeVettore;
	}

	public void setNmCognomeVettore(String nmCognomeVettore) {
		this.nmCognomeVettore = nmCognomeVettore;
	}

	public String getNmComuneResaEst() {
		return nmComuneResaEst;
	}

	public void setNmComuneResaEst(String nmComuneResaEst) {
		this.nmComuneResaEst = nmComuneResaEst;
	}

	public String getNmDenominazioneVettore() {
		return nmDenominazioneVettore;
	}

	public void setNmDenominazioneVettore(String nmDenominazioneVettore) {
		this.nmDenominazioneVettore = nmDenominazioneVettore;
	}

	public String getNmIndirizzoResa() {
		return nmIndirizzoResa;
	}

	public void setNmIndirizzoResa(String nmIndirizzoResa) {
		this.nmIndirizzoResa = nmIndirizzoResa;
	}

	public String getNmMezzoTrasporto() {
		return nmMezzoTrasporto;
	}

	public void setNmMezzoTrasporto(String nmMezzoTrasporto) {
		this.nmMezzoTrasporto = nmMezzoTrasporto;
	}

	public String getNmNomeVettore() {
		return nmNomeVettore;
	}

	public void setNmNomeVettore(String nmNomeVettore) {
		this.nmNomeVettore = nmNomeVettore;
	}

	public String getNmTitoloVettore() {
		return nmTitoloVettore;
	}

	public void setNmTitoloVettore(String nmTitoloVettore) {
		this.nmTitoloVettore = nmTitoloVettore;
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

	public BigDecimal getPcAliquotaRitenuta() {
		return pcAliquotaRitenuta;
	}

	public void setPcAliquotaRitenuta(BigDecimal pcAliquotaRitenuta) {
		this.pcAliquotaRitenuta = pcAliquotaRitenuta;
	}

	public BigDecimal getPgVersioneLottoFatRifiut() {
		return pgVersioneLottoFatRifiut;
	}

	public void setPgVersioneLottoFatRifiut(BigDecimal pgVersioneLottoFatRifiut) {
		this.pgVersioneLottoFatRifiut = pgVersioneLottoFatRifiut;
	}

	public BigDecimal getQtNumeroColli() {
		return qtNumeroColli;
	}

	public void setQtNumeroColli(BigDecimal qtNumeroColli) {
		this.qtNumeroColli = qtNumeroColli;
	}

	public BigDecimal getQtPesoLordo() {
		return qtPesoLordo;
	}

	public void setQtPesoLordo(BigDecimal qtPesoLordo) {
		this.qtPesoLordo = qtPesoLordo;
	}

	public BigDecimal getQtPesoNetto() {
		return qtPesoNetto;
	}

	public void setQtPesoNetto(BigDecimal qtPesoNetto) {
		this.qtPesoNetto = qtPesoNetto;
	}

	public String getQtTotalePercorsoVeicolo() {
		return qtTotalePercorsoVeicolo;
	}

	public void setQtTotalePercorsoVeicolo(String qtTotalePercorsoVeicolo) {
		this.qtTotalePercorsoVeicolo = qtTotalePercorsoVeicolo;
	}

	public String getIdXmlEuUploaded() {
		return idXmlEuUploaded;
	}

	public void setIdXmlEuUploaded(String idXmlEuUploaded) {
		this.idXmlEuUploaded = idXmlEuUploaded;
	}

	public String getIdXmlEuGenerated() {
		return idXmlEuGenerated;
	}

	public void setIdXmlEuGenerated(String idXmlEuGenerated) {
		this.idXmlEuGenerated = idXmlEuGenerated;
	}

	public String getNmXmlEuUploadedName() {
		return nmXmlEuUploadedName;
	}

	public void setNmXmlEuUploadedName(String nmXmlEuUploadedName) {
		this.nmXmlEuUploadedName = nmXmlEuUploadedName;
	}

	public String getNmXmlEuGeneratedName() {
		return nmXmlEuGeneratedName;
	}

	public void setNmXmlEuGeneratedName(String nmXmlEuGeneratedName) {
		this.nmXmlEuGeneratedName = nmXmlEuGeneratedName;
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

	public Long getIdDizCausalePagamento() {
		return idDizCausalePagamento;
	}

	public void setIdDizCausalePagamento(Long idDizCausalePagamento) {
		this.idDizCausalePagamento = idDizCausalePagamento;
	}

	public Long getIdDizDivisa() {
		return idDizDivisa;
	}

	public void setIdDizDivisa(Long idDizDivisa) {
		this.idDizDivisa = idDizDivisa;
	}

	public Long getIdDizArt73() {
		return idDizArt73;
	}

	public void setIdDizArt73(Long idDizArt73) {
		this.idDizArt73 = idDizArt73;
	}

	public Long getIdDizTipoResa() {
		return idDizTipoResa;
	}

	public void setIdDizTipoResa(Long idDizTipoResa) {
		this.idDizTipoResa = idDizTipoResa;
	}

	public Long getIdDizTipoRitenuta() {
		return idDizTipoRitenuta;
	}

	public void setIdDizTipoRitenuta(Long idDizTipoRitenuta) {
		this.idDizTipoRitenuta = idDizTipoRitenuta;
	}

	public Long getIdDizTipoDocumento() {
		return idDizTipoDocumento;
	}

	public void setIdDizTipoDocumento(Long idDizTipoDocumento) {
		this.idDizTipoDocumento = idDizTipoDocumento;
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

	public Long getIdLotto() {
		return idLotto;
	}

	public void setIdLotto(Long idLotto) {
		this.idLotto = idLotto;
	}

	public Long getIdLottoFatRifiutata() {
		return idLottoFatRifiutata;
	}

	public void setIdLottoFatRifiutata(Long idLottoFatRifiutata) {
		this.idLottoFatRifiutata = idLottoFatRifiutata;
	}

	@Override
	public String getPKDescription() {
		return this.idFattura.toString();
	}

	@Override
	public String getTableName() {
		return this.tableName;
	}

	
	


}