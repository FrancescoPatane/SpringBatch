package it.pccube.batchmigration.destination.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FatTRicImprontaArchivio implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_T_RIC_IMPRONTA_ARCHIVIO";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_RIC_IMPRONTA_ARCHIVIO ( CD_CAP_SEDE_TITOL_CONT, CD_CF_PIVA_INTERMED_TRASM, CD_CF_PIVA_SOGGETTO_TRASM, CD_CF_PIVA_TITOLARE_CONT, CD_COD_ERR_RICHIESTA_NCS, CD_CODICE_FORNITURA, CD_FATTURAZIONE_ELE_TITOL_CONT, CD_NUM_CIVICO_SEDE_TITOL_CONT, CD_PROTOCOLLO_DA_SOSTITUIRE, CD_RICHIESTA_NCS, CD_SESSO_TITOLARE_CONT, DS_DESCR_ERR_RICHIESTA_NCS, DT_DATA_IMPEGNO_TRASM, DT_DATA_NASC_TITOLARE_CONT, DT_DATA_ORA_INVIO_RIC_NCS, DT_DATA_RICEZIONE_XML_COMUNIC, FL_ESITO_RICHIESTA_NCS, ID_DIZ_IMPEGNO_TRASM, ID_DIZ_STATO_RICHIESTA, ID_DIZ_TIPO_COMUNICAZIONE, ID_RIC_IMPRONTA_ARCHIVIO, ID_SEDIA_RICHIESTA, ID_XML_COMUNICAZIONE, ID_XML_RICHIESTA, NM_COGNOME_TITOLARE_CONT, NM_COMUNESTATO_NASC_TITOL_CONT, NM_COMUNESTATO_SEDE_TITOL_CONT, NM_DENOMINAZIONE_TITOLARE_CONT, NM_INDIRIZZO_SEDE_TITOL_CONT, NM_NOME_TITOLARE_CONT, NM_NOME_XML_COMUNICAZIONE, NM_PROVINCIA_NASC_TITOL_CONT, NM_PROVINCIA_SEDE_TITOL_CONT, NM_UTENTE_INSERIMENTO, NM_UTENTE_ULTIMA_MODIFICA, NR_ALBO_CAF_INTERMED_TRASM, NR_PERIODO_IMPOSTA, TS_INSERIMENTO, TS_ULTIMA_MODIFICA ) VALUES ( :cdCapSedeTitolCont, :cdCfPivaIntermedTrasm, :cdCfPivaSoggettoTrasm, :cdCfPivaTitolareCont, :cdCodErrRichiestaNcs, :cdCodiceFornitura, :cdFatturazioneEleTitolCont, :cdNumCivicoSedeTitolCont, :cdProtocolloDaSostituire, :cdRichiestaNcs, :cdSessoTitolareCont, :dsDescrErrRichiestaNcs, :dtDataImpegnoTrasm, :dtDataNascTitolareCont, :dtDataOraInvioRicNcs, :dtDataRicezioneXmlComunic, :flEsitoRichiestaNcs, :idDizImpegnoTrasm, :idDizStatoRichiesta, :idDizTipoComunicazione, :idRicImprontaArchivio, :idSediaRichiesta, :idXmlComunicazione, :idXmlRichiesta, :nmCognomeTitolareCont, :nmComunestatoNascTitolCont, :nmComunestatoSedeTitolCont, :nmDenominazioneTitolareCont, :nmIndirizzoSedeTitolCont, :nmNomeTitolareCont, :nmNomeXmlComunicazione, :nmProvinciaNascTitolCont, :nmProvinciaSedeTitolCont, :nmUtenteInserimento, :nmUtenteUltimaModifica, :nrAlboCafIntermedTrasm, :nrPeriodoImposta, :tsInserimento, :tsUltimaModifica )";
	

	private Long idRicImprontaArchivio;

	private String cdCapSedeTitolCont;

	private String cdCfPivaIntermedTrasm;

	private String cdCfPivaSoggettoTrasm;

	private String cdCfPivaTitolareCont;

	private String cdCodErrRichiestaNcs;

	private String cdCodiceFornitura;

	private String cdFatturazioneEleTitolCont;

	private String cdNumCivicoSedeTitolCont;

	private String cdProtocolloDaSostituire;

	private String cdRichiestaNcs;

	private String cdSessoTitolareCont;

	private String dsDescrErrRichiestaNcs;

	private Date dtDataImpegnoTrasm;

	private Date dtDataNascTitolareCont;

	private Date dtDataOraInvioRicNcs;

	private Date dtDataRicezioneXmlComunic;

	private Short flEsitoRichiestaNcs;

	private Long idSediaRichiesta;

	private String nmCognomeTitolareCont;

	private String nmComunestatoNascTitolCont;

	private String nmComunestatoSedeTitolCont;

	private String nmDenominazioneTitolareCont;

	private String nmIndirizzoSedeTitolCont;

	private String nmNomeTitolareCont;

	private String nmNomeXmlComunicazione;

	private String nmProvinciaNascTitolCont;

	private String nmProvinciaSedeTitolCont;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private String nrAlboCafIntermedTrasm;

	private Long nrPeriodoImposta;
	
	private String idXmlComunicazione;

	private String idXmlRichiesta;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idDizStatoRichiesta;

	private Long idDizTipoComunicazione;

	private Long idDizImpegnoTrasm;

	public Long getIdRicImprontaArchivio() {
		return idRicImprontaArchivio;
	}

	public void setIdRicImprontaArchivio(Long idRicImprontaArchivio) {
		this.idRicImprontaArchivio = idRicImprontaArchivio;
	}

	public String getCdCapSedeTitolCont() {
		return cdCapSedeTitolCont;
	}

	public void setCdCapSedeTitolCont(String cdCapSedeTitolCont) {
		this.cdCapSedeTitolCont = cdCapSedeTitolCont;
	}

	public String getCdCfPivaIntermedTrasm() {
		return cdCfPivaIntermedTrasm;
	}

	public void setCdCfPivaIntermedTrasm(String cdCfPivaIntermedTrasm) {
		this.cdCfPivaIntermedTrasm = cdCfPivaIntermedTrasm;
	}

	public String getCdCfPivaSoggettoTrasm() {
		return cdCfPivaSoggettoTrasm;
	}

	public void setCdCfPivaSoggettoTrasm(String cdCfPivaSoggettoTrasm) {
		this.cdCfPivaSoggettoTrasm = cdCfPivaSoggettoTrasm;
	}

	public String getCdCfPivaTitolareCont() {
		return cdCfPivaTitolareCont;
	}

	public void setCdCfPivaTitolareCont(String cdCfPivaTitolareCont) {
		this.cdCfPivaTitolareCont = cdCfPivaTitolareCont;
	}

	public String getCdCodErrRichiestaNcs() {
		return cdCodErrRichiestaNcs;
	}

	public void setCdCodErrRichiestaNcs(String cdCodErrRichiestaNcs) {
		this.cdCodErrRichiestaNcs = cdCodErrRichiestaNcs;
	}

	public String getCdCodiceFornitura() {
		return cdCodiceFornitura;
	}

	public void setCdCodiceFornitura(String cdCodiceFornitura) {
		this.cdCodiceFornitura = cdCodiceFornitura;
	}

	public String getCdFatturazioneEleTitolCont() {
		return cdFatturazioneEleTitolCont;
	}

	public void setCdFatturazioneEleTitolCont(String cdFatturazioneEleTitolCont) {
		this.cdFatturazioneEleTitolCont = cdFatturazioneEleTitolCont;
	}

	public String getCdNumCivicoSedeTitolCont() {
		return cdNumCivicoSedeTitolCont;
	}

	public void setCdNumCivicoSedeTitolCont(String cdNumCivicoSedeTitolCont) {
		this.cdNumCivicoSedeTitolCont = cdNumCivicoSedeTitolCont;
	}

	public String getCdProtocolloDaSostituire() {
		return cdProtocolloDaSostituire;
	}

	public void setCdProtocolloDaSostituire(String cdProtocolloDaSostituire) {
		this.cdProtocolloDaSostituire = cdProtocolloDaSostituire;
	}

	public String getCdRichiestaNcs() {
		return cdRichiestaNcs;
	}

	public void setCdRichiestaNcs(String cdRichiestaNcs) {
		this.cdRichiestaNcs = cdRichiestaNcs;
	}

	public String getCdSessoTitolareCont() {
		return cdSessoTitolareCont;
	}

	public void setCdSessoTitolareCont(String cdSessoTitolareCont) {
		this.cdSessoTitolareCont = cdSessoTitolareCont;
	}

	public String getDsDescrErrRichiestaNcs() {
		return dsDescrErrRichiestaNcs;
	}

	public void setDsDescrErrRichiestaNcs(String dsDescrErrRichiestaNcs) {
		this.dsDescrErrRichiestaNcs = dsDescrErrRichiestaNcs;
	}

	public Date getDtDataImpegnoTrasm() {
		return dtDataImpegnoTrasm;
	}

	public void setDtDataImpegnoTrasm(Date dtDataImpegnoTrasm) {
		this.dtDataImpegnoTrasm = dtDataImpegnoTrasm;
	}

	public Date getDtDataNascTitolareCont() {
		return dtDataNascTitolareCont;
	}

	public void setDtDataNascTitolareCont(Date dtDataNascTitolareCont) {
		this.dtDataNascTitolareCont = dtDataNascTitolareCont;
	}

	public Date getDtDataOraInvioRicNcs() {
		return dtDataOraInvioRicNcs;
	}

	public void setDtDataOraInvioRicNcs(Date dtDataOraInvioRicNcs) {
		this.dtDataOraInvioRicNcs = dtDataOraInvioRicNcs;
	}

	public Date getDtDataRicezioneXmlComunic() {
		return dtDataRicezioneXmlComunic;
	}

	public void setDtDataRicezioneXmlComunic(Date dtDataRicezioneXmlComunic) {
		this.dtDataRicezioneXmlComunic = dtDataRicezioneXmlComunic;
	}

	public Short getFlEsitoRichiestaNcs() {
		return flEsitoRichiestaNcs;
	}

	public void setFlEsitoRichiestaNcs(Short flEsitoRichiestaNcs) {
		this.flEsitoRichiestaNcs = flEsitoRichiestaNcs;
	}

	public Long getIdSediaRichiesta() {
		return idSediaRichiesta;
	}

	public void setIdSediaRichiesta(Long idSediaRichiesta) {
		this.idSediaRichiesta = idSediaRichiesta;
	}

	public String getNmCognomeTitolareCont() {
		return nmCognomeTitolareCont;
	}

	public void setNmCognomeTitolareCont(String nmCognomeTitolareCont) {
		this.nmCognomeTitolareCont = nmCognomeTitolareCont;
	}

	public String getNmComunestatoNascTitolCont() {
		return nmComunestatoNascTitolCont;
	}

	public void setNmComunestatoNascTitolCont(String nmComunestatoNascTitolCont) {
		this.nmComunestatoNascTitolCont = nmComunestatoNascTitolCont;
	}

	public String getNmComunestatoSedeTitolCont() {
		return nmComunestatoSedeTitolCont;
	}

	public void setNmComunestatoSedeTitolCont(String nmComunestatoSedeTitolCont) {
		this.nmComunestatoSedeTitolCont = nmComunestatoSedeTitolCont;
	}

	public String getNmDenominazioneTitolareCont() {
		return nmDenominazioneTitolareCont;
	}

	public void setNmDenominazioneTitolareCont(String nmDenominazioneTitolareCont) {
		this.nmDenominazioneTitolareCont = nmDenominazioneTitolareCont;
	}

	public String getNmIndirizzoSedeTitolCont() {
		return nmIndirizzoSedeTitolCont;
	}

	public void setNmIndirizzoSedeTitolCont(String nmIndirizzoSedeTitolCont) {
		this.nmIndirizzoSedeTitolCont = nmIndirizzoSedeTitolCont;
	}

	public String getNmNomeTitolareCont() {
		return nmNomeTitolareCont;
	}

	public void setNmNomeTitolareCont(String nmNomeTitolareCont) {
		this.nmNomeTitolareCont = nmNomeTitolareCont;
	}

	public String getNmNomeXmlComunicazione() {
		return nmNomeXmlComunicazione;
	}

	public void setNmNomeXmlComunicazione(String nmNomeXmlComunicazione) {
		this.nmNomeXmlComunicazione = nmNomeXmlComunicazione;
	}

	public String getNmProvinciaNascTitolCont() {
		return nmProvinciaNascTitolCont;
	}

	public void setNmProvinciaNascTitolCont(String nmProvinciaNascTitolCont) {
		this.nmProvinciaNascTitolCont = nmProvinciaNascTitolCont;
	}

	public String getNmProvinciaSedeTitolCont() {
		return nmProvinciaSedeTitolCont;
	}

	public void setNmProvinciaSedeTitolCont(String nmProvinciaSedeTitolCont) {
		this.nmProvinciaSedeTitolCont = nmProvinciaSedeTitolCont;
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

	public String getNrAlboCafIntermedTrasm() {
		return nrAlboCafIntermedTrasm;
	}

	public void setNrAlboCafIntermedTrasm(String nrAlboCafIntermedTrasm) {
		this.nrAlboCafIntermedTrasm = nrAlboCafIntermedTrasm;
	}

	public Long getNrPeriodoImposta() {
		return nrPeriodoImposta;
	}

	public void setNrPeriodoImposta(Long nrPeriodoImposta) {
		this.nrPeriodoImposta = nrPeriodoImposta;
	}

	public String getIdXmlComunicazione() {
		return idXmlComunicazione;
	}

	public void setIdXmlComunicazione(String idXmlComunicazione) {
		this.idXmlComunicazione = idXmlComunicazione;
	}

	public String getIdXmlRichiesta() {
		return idXmlRichiesta;
	}

	public void setIdXmlRichiesta(String idXmlRichiesta) {
		this.idXmlRichiesta = idXmlRichiesta;
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

	public Long getIdDizStatoRichiesta() {
		return idDizStatoRichiesta;
	}

	public void setIdDizStatoRichiesta(Long idDizStatoRichiesta) {
		this.idDizStatoRichiesta = idDizStatoRichiesta;
	}

	public Long getIdDizTipoComunicazione() {
		return idDizTipoComunicazione;
	}

	public void setIdDizTipoComunicazione(Long idDizTipoComunicazione) {
		this.idDizTipoComunicazione = idDizTipoComunicazione;
	}

	

	public Long getIdDizImpegnoTrasm() {
		return idDizImpegnoTrasm;
	}

	public void setIdDizImpegnoTrasm(Long idDizImpegnoTrasm) {
		this.idDizImpegnoTrasm = idDizImpegnoTrasm;
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