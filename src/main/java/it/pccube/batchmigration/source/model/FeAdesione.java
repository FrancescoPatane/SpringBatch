package it.pccube.batchmigration.source.model;

import java.math.BigDecimal;
import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;

public class FeAdesione implements ModelEntity {

	public static final String TABLE_NAME = "FE_ADESIONE";

	
	private Long idAdesione;
	
	private Long idUtenteAzienda;
	
	private String ragioneSociale;
	
	private Long tipologiaSocietaria;
	
	private Long idPaese;
	
	private String idCodice;
	
	private String codiceFiscale;
	
	private Long regioneSede;
	 
	private String regioneSedeEst;
	
	private Long regioneStabile;
	
	private Long comuneSede;
	
	private String comuneSedeEst;
	
	private String capSede;
	
	private String indirizzoSede;
	
	private String telefonoSede;
	
	private String faxSede;
	
	private String indirizzoStabile;
	
	private String numeroCivicoStabile;
	
	private String numeroCivicoSede;
	
	private String capStabile;
	
	private Long comuneStabile;
	
	private Long provinciaStabile;
	
	private Long provinciaSede;

	private String comuneStabileEst;
	
	private Long nazioneStabile;
	
	private String telefonoStabile;
	
	private String faxStabile;
	
	private String alboProfessionale;
	
	private Long provinciaAlbo;
	
	private String numeroIscrizioneAlbo;
	
	private Date dataIscrizioneAlbo;
	
	private Long regimeFiscale;
	
	private Long ufficioRea;
	
	private String numeroRea;
	
	private BigDecimal capitaleSociale;
	
	private Long socioUnico;
	
	private Long statoLiquidazione;
	
	private String riferimentoAmministrazione;
	
	private String nomeFileNonFirmato;
	
	private String nomeFileFirmato;
	
	private Date dataInizioValidita;
	
	private Date dataFineValidita;
	
	private Short flagAttuale;
	
	private Short flagPmiRaccomandazione;
	
	private Short flagPmiDipendenti;
	
	private Short flagPmiUltimoBilancio;
	
	private Short flagPmiTotaleBilancio;
	
	private Long stato;
	
	private Long adesionePrec;
	
	private String useridInserimento;
	
	private Date tmstInserimento;
	
	private String useridUltimoAggiornamento;
	
	private Date tmstUltimoAggiornamento;
	
	private String email;
	
	private Long numGiorniCatalogoDisattivato;
	
	private Date dataSospensioneAde;
	
	private Date dataDecadenzaAde;
	
	private String contentTypeFileFirmato;
	
	private Long sizeFileFirmato;
	
	private String hashFileFirmato;
	
	private Long regioneAlbo;
	
	private Long regioneRea;
    
    private Long idComuneStabile;
    
    private Long idProvinciaStabile;
    
    private Long idRegioneStabile;
    
	private Short flagVerificaFirma;
	
	private byte[] fileFirmato;
	
	private byte[] fileNonFirmato;
	
	
	public Long getIdAdesione() {
		return idAdesione;
	}

	public void setIdAdesione(Long idAdesione) {
		this.idAdesione = idAdesione;
	}

	public Long getIdUtenteAzienda() {
		return idUtenteAzienda;
	}

	public void setIdUtenteAzienda(Long idUtenteAzienda) {
		this.idUtenteAzienda = idUtenteAzienda;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public Long getTipologiaSocietaria() {
		return tipologiaSocietaria;
	}

	public void setTipologiaSocietaria(Long tipologiaSocietaria) {
		this.tipologiaSocietaria = tipologiaSocietaria;
	}

	public Long getIdPaese() {
		return idPaese;
	}

	public void setIdPaese(Long idPaese) {
		this.idPaese = idPaese;
	}

	public String getIdCodice() {
		return idCodice;
	}

	public void setIdCodice(String idCodice) {
		this.idCodice = idCodice;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getRegioneSedeEst() {
		return regioneSedeEst;
	}

	public void setRegioneSedeEst(String regioneSedeEst) {
		this.regioneSedeEst = regioneSedeEst;
	}

	public Long getComuneSede() {
		return comuneSede;
	}

	public void setComuneSede(Long comuneSede) {
		this.comuneSede = comuneSede;
	}

	public String getComuneSedeEst() {
		return comuneSedeEst;
	}

	public void setComuneSedeEst(String comuneSedeEst) {
		this.comuneSedeEst = comuneSedeEst;
	}

	public String getCapSede() {
		return capSede;
	}

	public void setCapSede(String capSede) {
		this.capSede = capSede;
	}

	public String getIndirizzoSede() {
		return indirizzoSede;
	}

	public void setIndirizzoSede(String indirizzoSede) {
		this.indirizzoSede = indirizzoSede;
	}

	public String getTelefonoSede() {
		return telefonoSede;
	}

	public void setTelefonoSede(String telefonoSede) {
		this.telefonoSede = telefonoSede;
	}

	public String getFaxSede() {
		return faxSede;
	}

	public void setFaxSede(String faxSede) {
		this.faxSede = faxSede;
	}

	public String getIndirizzoStabile() {
		return indirizzoStabile;
	}

	public void setIndirizzoStabile(String indirizzoStabile) {
		this.indirizzoStabile = indirizzoStabile;
	}

	public String getNumeroCivicoStabile() {
		return numeroCivicoStabile;
	}

	public void setNumeroCivicoStabile(String numeroCivicoStabile) {
		this.numeroCivicoStabile = numeroCivicoStabile;
	}

	public String getNumeroCivicoSede() {
		return numeroCivicoSede;
	}

	public void setNumeroCivicoSede(String numeroCivicoSede) {
		this.numeroCivicoSede = numeroCivicoSede;
	}

	public String getCapStabile() {
		return capStabile;
	}

	public void setCapStabile(String capStabile) {
		this.capStabile = capStabile;
	}

	public Long getComuneStabile() {
		return comuneStabile;
	}

	public void setComuneStabile(Long comuneStabile) {
		this.comuneStabile = comuneStabile;
	}

	public Long getProvinciaStabile() {
		return provinciaStabile;
	}

	public void setProvinciaStabile(Long provinciaStabile) {
		this.provinciaStabile = provinciaStabile;
	}

	public String getComuneStabileEst() {
		return comuneStabileEst;
	}

	public void setComuneStabileEst(String comuneStabileEst) {
		this.comuneStabileEst = comuneStabileEst;
	}

	public Long getNazioneStabile() {
		return nazioneStabile;
	}

	public void setNazioneStabile(Long nazioneStabile) {
		this.nazioneStabile = nazioneStabile;
	}

	public String getTelefonoStabile() {
		return telefonoStabile;
	}

	public void setTelefonoStabile(String telefonoStabile) {
		this.telefonoStabile = telefonoStabile;
	}

	public String getFaxStabile() {
		return faxStabile;
	}

	public void setFaxStabile(String faxStabile) {
		this.faxStabile = faxStabile;
	}

	public String getAlboProfessionale() {
		return alboProfessionale;
	}

	public void setAlboProfessionale(String alboProfessionale) {
		this.alboProfessionale = alboProfessionale;
	}

	public Long getProvinciaAlbo() {
		return provinciaAlbo;
	}

	public void setProvinciaAlbo(Long provinciaAlbo) {
		this.provinciaAlbo = provinciaAlbo;
	}

	public String getNumeroIscrizioneAlbo() {
		return numeroIscrizioneAlbo;
	}

	public void setNumeroIscrizioneAlbo(String numeroIscrizioneAlbo) {
		this.numeroIscrizioneAlbo = numeroIscrizioneAlbo;
	}

	public Date getDataIscrizioneAlbo() {
		return dataIscrizioneAlbo;
	}

	public void setDataIscrizioneAlbo(Date dataIscrizioneAlbo) {
		this.dataIscrizioneAlbo = dataIscrizioneAlbo;
	}

	public Long getRegimeFiscale() {
		return regimeFiscale;
	}

	public void setRegimeFiscale(Long regimeFiscale) {
		this.regimeFiscale = regimeFiscale;
	}

	public Long getUfficioRea() {
		return ufficioRea;
	}

	public void setUfficioRea(Long ufficioRea) {
		this.ufficioRea = ufficioRea;
	}

	public String getNumeroRea() {
		return numeroRea;
	}

	public void setNumeroRea(String numeroRea) {
		this.numeroRea = numeroRea;
	}

	public BigDecimal getCapitaleSociale() {
		return capitaleSociale;
	}

	public void setCapitaleSociale(BigDecimal capitaleSociale) {
		this.capitaleSociale = capitaleSociale;
	}

	public Long getSocioUnico() {
		return socioUnico;
	}

	public void setSocioUnico(Long socioUnico) {
		this.socioUnico = socioUnico;
	}

	public Long getStatoLiquidazione() {
		return statoLiquidazione;
	}

	public void setStatoLiquidazione(Long statoLiquidazione) {
		this.statoLiquidazione = statoLiquidazione;
	}

	public String getRiferimentoAmministrazione() {
		return riferimentoAmministrazione;
	}

	public void setRiferimentoAmministrazione(String riferimentoAmministrazione) {
		this.riferimentoAmministrazione = riferimentoAmministrazione;
	}

	public String getNomeFileNonFirmato() {
		return nomeFileNonFirmato;
	}

	public void setNomeFileNonFirmato(String nomeFileNonFirmato) {
		this.nomeFileNonFirmato = nomeFileNonFirmato;
	}

	public String getNomeFileFirmato() {
		return nomeFileFirmato;
	}

	public void setNomeFileFirmato(String nomeFileFirmato) {
		this.nomeFileFirmato = nomeFileFirmato;
	}

	public Date getDataInizioValidita() {
		return dataInizioValidita;
	}

	public void setDataInizioValidita(Date dataInizioValidita) {
		this.dataInizioValidita = dataInizioValidita;
	}

	public Date getDataFineValidita() {
		return dataFineValidita;
	}

	public void setDataFineValidita(Date dataFineValidita) {
		this.dataFineValidita = dataFineValidita;
	}

	public Short getFlagAttuale() {
		return flagAttuale;
	}

	public void setFlagAttuale(Short flagAttuale) {
		this.flagAttuale = flagAttuale;
	}

	public Short getFlagPmiRaccomandazione() {
		return flagPmiRaccomandazione;
	}

	public void setFlagPmiRaccomandazione(Short flagPmiRaccomandazione) {
		this.flagPmiRaccomandazione = flagPmiRaccomandazione;
	}

	public Short getFlagPmiDipendenti() {
		return flagPmiDipendenti;
	}

	public void setFlagPmiDipendenti(Short flagPmiDipendenti) {
		this.flagPmiDipendenti = flagPmiDipendenti;
	}

	public Short getFlagPmiUltimoBilancio() {
		return flagPmiUltimoBilancio;
	}

	public void setFlagPmiUltimoBilancio(Short flagPmiUltimoBilancio) {
		this.flagPmiUltimoBilancio = flagPmiUltimoBilancio;
	}

	public Short getFlagPmiTotaleBilancio() {
		return flagPmiTotaleBilancio;
	}

	public void setFlagPmiTotaleBilancio(Short flagPmiTotaleBilancio) {
		this.flagPmiTotaleBilancio = flagPmiTotaleBilancio;
	}

	public Long getStato() {
		return stato;
	}

	public void setStato(Long stato) {
		this.stato = stato;
	}

	public Long getAdesionePrec() {
		return adesionePrec;
	}

	public void setAdesionePrec(Long adesionePrec) {
		this.adesionePrec = adesionePrec;
	}

	public String getUseridInserimento() {
		return useridInserimento;
	}

	public void setUseridInserimento(String useridInserimento) {
		this.useridInserimento = useridInserimento;
	}

	public Date getTmstInserimento() {
		return tmstInserimento;
	}

	public void setTmstInserimento(Date tmstInserimento) {
		this.tmstInserimento = tmstInserimento;
	}

	public String getUseridUltimoAggiornamento() {
		return useridUltimoAggiornamento;
	}

	public void setUseridUltimoAggiornamento(String useridUltimoAggiornamento) {
		this.useridUltimoAggiornamento = useridUltimoAggiornamento;
	}

	public Date getTmstUltimoAggiornamento() {
		return tmstUltimoAggiornamento;
	}

	public void setTmstUltimoAggiornamento(Date tmstUltimoAggiornamento) {
		this.tmstUltimoAggiornamento = tmstUltimoAggiornamento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getNumGiorniCatalogoDisattivato() {
		return numGiorniCatalogoDisattivato;
	}

	public void setNumGiorniCatalogoDisattivato(Long numGiorniCatalogoDisattivato) {
		this.numGiorniCatalogoDisattivato = numGiorniCatalogoDisattivato;
	}

	public Date getDataSospensioneAde() {
		return dataSospensioneAde;
	}

	public void setDataSospensioneAde(Date dataSospensioneAde) {
		this.dataSospensioneAde = dataSospensioneAde;
	}

	public Date getDataDecadenzaAde() {
		return dataDecadenzaAde;
	}

	public void setDataDecadenzaAde(Date dataDecadenzaAde) {
		this.dataDecadenzaAde = dataDecadenzaAde;
	}

	public String getContentTypeFileFirmato() {
		return contentTypeFileFirmato;
	}

	public void setContentTypeFileFirmato(String contentTypeFileFirmato) {
		this.contentTypeFileFirmato = contentTypeFileFirmato;
	}

	public Long getSizeFileFirmato() {
		return sizeFileFirmato;
	}

	public void setSizeFileFirmato(Long sizeFileFirmato) {
		this.sizeFileFirmato = sizeFileFirmato;
	}

	public String getHashFileFirmato() {
		return hashFileFirmato;
	}

	public void setHashFileFirmato(String hashFileFirmato) {
		this.hashFileFirmato = hashFileFirmato;
	}

	public Long getRegioneAlbo() {
		return regioneAlbo;
	}

	public void setRegioneAlbo(Long regioneAlbo) {
		this.regioneAlbo = regioneAlbo;
	}

	public Long getRegioneRea() {
		return regioneRea;
	}

	public void setRegioneRea(Long regioneRea) {
		this.regioneRea = regioneRea;
	}

	public Long getIdComuneStabile() {
		return idComuneStabile;
	}

	public void setIdComuneStabile(Long idComuneStabile) {
		this.idComuneStabile = idComuneStabile;
	}

	public Long getIdProvinciaStabile() {
		return idProvinciaStabile;
	}

	public void setIdProvinciaStabile(Long idProvinciaStabile) {
		this.idProvinciaStabile = idProvinciaStabile;
	}

	public Long getIdRegioneStabile() {
		return idRegioneStabile;
	}

	public void setIdRegioneStabile(Long idRegioneStabile) {
		this.idRegioneStabile = idRegioneStabile;
	}

	public Short getFlagVerificaFirma() {
		return flagVerificaFirma;
	}

	public void setFlagVerificaFirma(Short flagVerificaFirma) {
		this.flagVerificaFirma = flagVerificaFirma;
	}

	public byte[] getFileFirmato() {
		return fileFirmato;
	}

	public void setFileFirmato(byte[] fileFirmato) {
		this.fileFirmato = fileFirmato;
	}

	public byte[] getFileNonFirmato() {
		return fileNonFirmato;
	}

	public void setFileNonFirmato(byte[] fileNonFirmato) {
		this.fileNonFirmato = fileNonFirmato;
	}
	
	public Long getProvinciaSede() {
		return provinciaSede;
	}

	public void setProvinciaSede(Long provinciaSede) {
		this.provinciaSede = provinciaSede;
	}
	
	public Long getRegioneSede() {
		return regioneSede;
	}

	public void setRegioneSede(Long regioneSede) {
		this.regioneSede = regioneSede;
	}
	

	public Long getRegioneStabile() {
		return regioneStabile;
	}

	public void setRegioneStabile(Long regioneStabile) {
		this.regioneStabile = regioneStabile;
	}

	@Override
	public String getPKDescription() {
		return this.idAdesione.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
}
