package it.pccube.batchmigration.source.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FeRicImprontaArchivio implements ModelEntity {

	public static final String TABLE_NAME = "FE_RIC_IMPRONTA_ARCHIVIO";

	private Long idRicImprontaArchivio;

	private Long statoRichiesta;

	private Date dataRicezioneXmlComunic;

	private Long idUtenteAziendaRichiesta;

	private String useridInserimento;

	private Date tmstInserimento;

	private String useridUltimoAggiornamento;

	private Date tmstUltimoAggiornamento;

	private Date dataOraInvioRichiestaNcs;

	private Long periodoImposta;

	private String codiceFornitura;

	private Long tipoComunicazione;

	private String protocolloDaSostituire;

	private String cfPivaTitolareCont;

	private String denominazioneTitolareCont;

	private String cognomeTitolareCont;

	private String nomeTitolareCont;

	private String sessoTitolareCont;

	private String comunestatoNascTitolareCont;

	private String provinciaNascTitolareCont;

	private Date dataNascTitolareCont;

	private String comunestatoSedeTitolareCont;

	private String provinciaSedeTitolareCont;

	private String indirizzoSedeTitolareCont;

	private String numCivicoSedeTitolareCont;

	private String capSedeTitolareCont;

	private String cfPivaSoggettoTrasmissione;

	private String fatturazioneEleTitolareCont;

	private String cfPivaIntermediarioTrasm;

	private String nAlboCafIntermediarioTrasm;

	private Long impegnoTrasm;

	private Date dataImpegnoTrasm;

	private String idRichiestaNcs;

	private Short esitoRichiestaNcs;

	private String codErrRichiestaNcs;

	private String descrErrRichiestaNcs;

	private String nomeXmlComunicazione;
	
	private byte[] xmlComunicazione;

	private byte[] xmlRichiesta;

	public Long getIdRicImprontaArchivio() {
		return idRicImprontaArchivio;
	}

	public void setIdRicImprontaArchivio(Long idRicImprontaArchivio) {
		this.idRicImprontaArchivio = idRicImprontaArchivio;
	}

	public Long getStatoRichiesta() {
		return statoRichiesta;
	}

	public void setStatoRichiesta(Long statoRichiesta) {
		this.statoRichiesta = statoRichiesta;
	}

	public Date getDataRicezioneXmlComunic() {
		return dataRicezioneXmlComunic;
	}

	public void setDataRicezioneXmlComunic(Date dataRicezioneXmlComunic) {
		this.dataRicezioneXmlComunic = dataRicezioneXmlComunic;
	}

	public Long getIdUtenteAziendaRichiesta() {
		return idUtenteAziendaRichiesta;
	}

	public void setIdUtenteAziendaRichiesta(Long idUtenteAziendaRichiesta) {
		this.idUtenteAziendaRichiesta = idUtenteAziendaRichiesta;
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

	public Date getDataOraInvioRichiestaNcs() {
		return dataOraInvioRichiestaNcs;
	}

	public void setDataOraInvioRichiestaNcs(Date dataOraInvioRichiestaNcs) {
		this.dataOraInvioRichiestaNcs = dataOraInvioRichiestaNcs;
	}

	public Long getPeriodoImposta() {
		return periodoImposta;
	}

	public void setPeriodoImposta(Long periodoImposta) {
		this.periodoImposta = periodoImposta;
	}

	public String getCodiceFornitura() {
		return codiceFornitura;
	}

	public void setCodiceFornitura(String codiceFornitura) {
		this.codiceFornitura = codiceFornitura;
	}

	public Long getTipoComunicazione() {
		return tipoComunicazione;
	}

	public void setTipoComunicazione(Long tipoComunicazione) {
		this.tipoComunicazione = tipoComunicazione;
	}

	public String getProtocolloDaSostituire() {
		return protocolloDaSostituire;
	}

	public void setProtocolloDaSostituire(String protocolloDaSostituire) {
		this.protocolloDaSostituire = protocolloDaSostituire;
	}

	public String getCfPivaTitolareCont() {
		return cfPivaTitolareCont;
	}

	public void setCfPivaTitolareCont(String cfPivaTitolareCont) {
		this.cfPivaTitolareCont = cfPivaTitolareCont;
	}

	public String getDenominazioneTitolareCont() {
		return denominazioneTitolareCont;
	}

	public void setDenominazioneTitolareCont(String denominazioneTitolareCont) {
		this.denominazioneTitolareCont = denominazioneTitolareCont;
	}

	public String getCognomeTitolareCont() {
		return cognomeTitolareCont;
	}

	public void setCognomeTitolareCont(String cognomeTitolareCont) {
		this.cognomeTitolareCont = cognomeTitolareCont;
	}

	public String getNomeTitolareCont() {
		return nomeTitolareCont;
	}

	public void setNomeTitolareCont(String nomeTitolareCont) {
		this.nomeTitolareCont = nomeTitolareCont;
	}

	public String getSessoTitolareCont() {
		return sessoTitolareCont;
	}

	public void setSessoTitolareCont(String sessoTitolareCont) {
		this.sessoTitolareCont = sessoTitolareCont;
	}

	public String getComunestatoNascTitolareCont() {
		return comunestatoNascTitolareCont;
	}

	public void setComunestatoNascTitolareCont(String comunestatoNascTitolareCont) {
		this.comunestatoNascTitolareCont = comunestatoNascTitolareCont;
	}

	public String getProvinciaNascTitolareCont() {
		return provinciaNascTitolareCont;
	}

	public void setProvinciaNascTitolareCont(String provinciaNascTitolareCont) {
		this.provinciaNascTitolareCont = provinciaNascTitolareCont;
	}

	public Date getDataNascTitolareCont() {
		return dataNascTitolareCont;
	}

	public void setDataNascTitolareCont(Date dataNascTitolareCont) {
		this.dataNascTitolareCont = dataNascTitolareCont;
	}

	public String getComunestatoSedeTitolareCont() {
		return comunestatoSedeTitolareCont;
	}

	public void setComunestatoSedeTitolareCont(String comunestatoSedeTitolareCont) {
		this.comunestatoSedeTitolareCont = comunestatoSedeTitolareCont;
	}

	public String getProvinciaSedeTitolareCont() {
		return provinciaSedeTitolareCont;
	}

	public void setProvinciaSedeTitolareCont(String provinciaSedeTitolareCont) {
		this.provinciaSedeTitolareCont = provinciaSedeTitolareCont;
	}

	public String getIndirizzoSedeTitolareCont() {
		return indirizzoSedeTitolareCont;
	}

	public void setIndirizzoSedeTitolareCont(String indirizzoSedeTitolareCont) {
		this.indirizzoSedeTitolareCont = indirizzoSedeTitolareCont;
	}

	public String getNumCivicoSedeTitolareCont() {
		return numCivicoSedeTitolareCont;
	}

	public void setNumCivicoSedeTitolareCont(String numCivicoSedeTitolareCont) {
		this.numCivicoSedeTitolareCont = numCivicoSedeTitolareCont;
	}

	public String getCapSedeTitolareCont() {
		return capSedeTitolareCont;
	}

	public void setCapSedeTitolareCont(String capSedeTitolareCont) {
		this.capSedeTitolareCont = capSedeTitolareCont;
	}

	public String getCfPivaSoggettoTrasmissione() {
		return cfPivaSoggettoTrasmissione;
	}

	public void setCfPivaSoggettoTrasmissione(String cfPivaSoggettoTrasmissione) {
		this.cfPivaSoggettoTrasmissione = cfPivaSoggettoTrasmissione;
	}

	public String getFatturazioneEleTitolareCont() {
		return fatturazioneEleTitolareCont;
	}

	public void setFatturazioneEleTitolareCont(String fatturazioneEleTitolareCont) {
		this.fatturazioneEleTitolareCont = fatturazioneEleTitolareCont;
	}

	public String getCfPivaIntermediarioTrasm() {
		return cfPivaIntermediarioTrasm;
	}

	public void setCfPivaIntermediarioTrasm(String cfPivaIntermediarioTrasm) {
		this.cfPivaIntermediarioTrasm = cfPivaIntermediarioTrasm;
	}

	public String getnAlboCafIntermediarioTrasm() {
		return nAlboCafIntermediarioTrasm;
	}

	public void setnAlboCafIntermediarioTrasm(String nAlboCafIntermediarioTrasm) {
		this.nAlboCafIntermediarioTrasm = nAlboCafIntermediarioTrasm;
	}

	public Long getImpegnoTrasm() {
		return impegnoTrasm;
	}

	public void setImpegnoTrasm(Long impegnoTrasm) {
		this.impegnoTrasm = impegnoTrasm;
	}

	public Date getDataImpegnoTrasm() {
		return dataImpegnoTrasm;
	}

	public void setDataImpegnoTrasm(Date dataImpegnoTrasm) {
		this.dataImpegnoTrasm = dataImpegnoTrasm;
	}

	public String getIdRichiestaNcs() {
		return idRichiestaNcs;
	}

	public void setIdRichiestaNcs(String idRichiestaNcs) {
		this.idRichiestaNcs = idRichiestaNcs;
	}

	public Short getEsitoRichiestaNcs() {
		return esitoRichiestaNcs;
	}

	public void setEsitoRichiestaNcs(Short esitoRichiestaNcs) {
		this.esitoRichiestaNcs = esitoRichiestaNcs;
	}

	public String getCodErrRichiestaNcs() {
		return codErrRichiestaNcs;
	}

	public void setCodErrRichiestaNcs(String codErrRichiestaNcs) {
		this.codErrRichiestaNcs = codErrRichiestaNcs;
	}

	public String getDescrErrRichiestaNcs() {
		return descrErrRichiestaNcs;
	}

	public void setDescrErrRichiestaNcs(String descrErrRichiestaNcs) {
		this.descrErrRichiestaNcs = descrErrRichiestaNcs;
	}

	public String getNomeXmlComunicazione() {
		return nomeXmlComunicazione;
	}

	public void setNomeXmlComunicazione(String nomeXmlComunicazione) {
		this.nomeXmlComunicazione = nomeXmlComunicazione;
	}

	public byte[] getXmlComunicazione() {
		return xmlComunicazione;
	}

	public void setXmlComunicazione(byte[] xmlComunicazione) {
		this.xmlComunicazione = xmlComunicazione;
	}

	public byte[] getXmlRichiesta() {
		return xmlRichiesta;
	}

	public void setXmlRichiesta(byte[] xmlRichiesta) {
		this.xmlRichiesta = xmlRichiesta;
	}

	@Override
	public String getPKDescription() {
		return this.idRicImprontaArchivio.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	
	


}