package it.pccube.batchmigration.destination.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FatTRicProtocolImpronta implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_T_RIC_PROTOCOL_IMPRONTA";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_RIC_PROTOCOL_IMPRONTA ( CD_COD_ERR_RICHIESTA_NCS, DS_DESCR_ERR_RICHIESTA_NCS, DT_DATA_ORA_INVIO_PROTOCOL_NCS, DT_DATA_PROTOCOLLO_COMUNIC, FL_ATTUALE, FL_ESITO_RICHIESTA_NCS, ID_RIC_IMPRONTA_ARCHIVIO, ID_RIC_PROTOCOLLO_IMPRONTA, ID_SEDIA_RICHIESTA, NM_UTENTE_INSERIMENTO, NM_UTENTE_ULTIMA_MODIFICA, NR_NUMERO_PROTOCOLLO_COMUNIC, TS_INSERIMENTO, TS_ULTIMA_MODIFICA ) VALUES ( :cdCodErrRichiestaNcs, :dsDescrErrRichiestaNcs, :dtDataOraInvioProtocolNcs, :dtDataProtocolloComunic, :flAttuale, :flEsitoRichiestaNcs, :idRicImprontaArchivio, :idRicProtocolloImpronta, :idSediaRichiesta, :nmUtenteInserimento, :nmUtenteUltimaModifica, :nrNumeroProtocolloComunic, :tsInserimento, :tsUltimaModifica )";
	
	
	private Long idRicProtocolloImpronta;

	private String cdCodErrRichiestaNcs;

	private String dsDescrErrRichiestaNcs;

	private Date dtDataOraInvioProtocolNcs;

	private Date dtDataProtocolloComunic;

	private Short flAttuale;

	private Short flEsitoRichiestaNcs;

	private Long idSediaRichiesta;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private String nrNumeroProtocolloComunic;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idRicImprontaArchivio;

	public Long getIdRicProtocolloImpronta() {
		return idRicProtocolloImpronta;
	}

	public void setIdRicProtocolloImpronta(Long idRicProtocolloImpronta) {
		this.idRicProtocolloImpronta = idRicProtocolloImpronta;
	}

	public String getCdCodErrRichiestaNcs() {
		return cdCodErrRichiestaNcs;
	}

	public void setCdCodErrRichiestaNcs(String cdCodErrRichiestaNcs) {
		this.cdCodErrRichiestaNcs = cdCodErrRichiestaNcs;
	}

	public String getDsDescrErrRichiestaNcs() {
		return dsDescrErrRichiestaNcs;
	}

	public void setDsDescrErrRichiestaNcs(String dsDescrErrRichiestaNcs) {
		this.dsDescrErrRichiestaNcs = dsDescrErrRichiestaNcs;
	}

	public Date getDtDataOraInvioProtocolNcs() {
		return dtDataOraInvioProtocolNcs;
	}

	public void setDtDataOraInvioProtocolNcs(Date dtDataOraInvioProtocolNcs) {
		this.dtDataOraInvioProtocolNcs = dtDataOraInvioProtocolNcs;
	}

	public Date getDtDataProtocolloComunic() {
		return dtDataProtocolloComunic;
	}

	public void setDtDataProtocolloComunic(Date dtDataProtocolloComunic) {
		this.dtDataProtocolloComunic = dtDataProtocolloComunic;
	}

	public Short getFlAttuale() {
		return flAttuale;
	}

	public void setFlAttuale(Short flAttuale) {
		this.flAttuale = flAttuale;
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

	public String getNrNumeroProtocolloComunic() {
		return nrNumeroProtocolloComunic;
	}

	public void setNrNumeroProtocolloComunic(String nrNumeroProtocolloComunic) {
		this.nrNumeroProtocolloComunic = nrNumeroProtocolloComunic;
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

	public Long getIdRicImprontaArchivio() {
		return idRicImprontaArchivio;
	}

	public void setIdRicImprontaArchivio(Long idRicImprontaArchivio) {
		this.idRicImprontaArchivio = idRicImprontaArchivio;
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