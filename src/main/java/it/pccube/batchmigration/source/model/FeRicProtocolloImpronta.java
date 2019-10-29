package it.pccube.batchmigration.source.model;

import it.pccube.batchmigration.model.ModelEntity;

import java.util.Date;


public class FeRicProtocolloImpronta implements ModelEntity {

	public static final String TABLE_NAME = "FE_RIC_PROTOCOLLO_IMPRONTA";


	private Long idRicProtocolloImpronta;

	private Date dataProtocolloComunic;

	private String numeroProtocolloComunic;

	private Date dataOraInvioProtocolloNcs;

	private Short esitoRichiestaNcs;

	private String codErrRichiestaNcs;

	private String descrErrRichiestaNcs;

	private Long idRicImprontaArchivio;

	private Long idUtenteAziendaRichiesta;

	private Short flagAttuale;

	private String useridInserimento;

	private Date tmstInserimento;

	private String useridUltimoAggiornamento;

	private Date tmstUltimoAggiornamento;

	public Long getIdRicProtocolloImpronta() {
		return idRicProtocolloImpronta;
	}

	public void setIdRicProtocolloImpronta(Long idRicProtocolloImpronta) {
		this.idRicProtocolloImpronta = idRicProtocolloImpronta;
	}

	public Date getDataProtocolloComunic() {
		return dataProtocolloComunic;
	}

	public void setDataProtocolloComunic(Date dataProtocolloComunic) {
		this.dataProtocolloComunic = dataProtocolloComunic;
	}

	public String getNumeroProtocolloComunic() {
		return numeroProtocolloComunic;
	}

	public void setNumeroProtocolloComunic(String numeroProtocolloComunic) {
		this.numeroProtocolloComunic = numeroProtocolloComunic;
	}

	public Date getDataOraInvioProtocolloNcs() {
		return dataOraInvioProtocolloNcs;
	}

	public void setDataOraInvioProtocolloNcs(Date dataOraInvioProtocolloNcs) {
		this.dataOraInvioProtocolloNcs = dataOraInvioProtocolloNcs;
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

	public Long getIdRicImprontaArchivio() {
		return idRicImprontaArchivio;
	}

	public void setIdRicImprontaArchivio(Long idRicImprontaArchivio) {
		this.idRicImprontaArchivio = idRicImprontaArchivio;
	}

	public Long getIdUtenteAziendaRichiesta() {
		return idUtenteAziendaRichiesta;
	}

	public void setIdUtenteAziendaRichiesta(Long idUtenteAziendaRichiesta) {
		this.idUtenteAziendaRichiesta = idUtenteAziendaRichiesta;
	}

	public Short getFlagAttuale() {
		return flagAttuale;
	}

	public void setFlagAttuale(Short flagAttuale) {
		this.flagAttuale = flagAttuale;
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

	@Override
	public String getPKDescription() {
		return this.idRicProtocolloImpronta.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	


}