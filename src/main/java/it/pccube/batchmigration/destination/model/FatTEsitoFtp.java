package it.pccube.batchmigration.destination.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import it.pccube.batchmigration.model.ModelEntity;


public class FatTEsitoFtp implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_T_ESITO_FTP";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_ESITO_FTP (CD_ESITO, CD_IDENTIFICATIVO_NODO, CD_STATO, CD_TIPO_ESITO, DS_LOG_ERRORE_CONTROLLI_FILE, DT_DATA_ORA_ESITO, DT_DATA_ORA_RICEZIONE, FL_ATTUALE, FL_ERRORE_CONTROLLI_FILE, FL_ERRORE_STATO, FL_RIGENERATO, FL_VERSO_SDI, ID_ESITO_FTP, ID_FILE_CIFRATO, ID_FILE_FIRMATO, ID_FILE_NON_FIRMATO, ID_SUPPORTO_FTP, NM_NOME_FILE_ESITO, NM_NOME_SUPPORTO, NM_UTENTE_INSERIMENTO, NM_UTENTE_ULTIMA_MODIFICA, PG_VERSIONE_ESITO, TS_INSERIMENTO, TS_ULTIMA_MODIFICA) VALUES ( :cdEsito, :cdIdentificativoNodo, :cdStato, :cdTipoEsito, :dsLogErroreControlliFile, :dtDataOraEsito, :dtDataOraRicezione, :flAttuale, :flErroreControlliFile, :flErroreStato, :flRigenerato, :flVersoSdi, :idEsitoFtp, :idFileCifrato, :idFileFirmato, :idFileNonFirmato, :idSupportoFtp, :nmNomeFileEsito, :nmNomeSupporto, :nmUtenteInserimento, :nmUtenteUltimaModifica, :pgVersioneEsito, :tsInserimento, :tsUltimaModifica )";	

	private Long idEsitoFtp;

	private String cdEsito;

	private String cdIdentificativoNodo;

	private String cdStato;

	private String dsLogErroreControlliFile;

	private Date dtDataOraEsito;

	private Date dtDataOraRicezione;

	private Short flAttuale;

	private Short flErroreControlliFile;

	private Short flErroreStato;

	private Short flRigenerato;

	private Short flVersoSdi;

	private String nmNomeFileEsito;

	private String nmNomeSupporto;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private String cdTipoEsito;
	
	private String idFileCifrato;

	private String idFileFirmato;

	private String idFileNonFirmato;

	private String pgVersioneEsito;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idSupportoFtp;

	public Long getIdEsitoFtp() {
		return idEsitoFtp;
	}

	public void setIdEsitoFtp(Long idEsitoFtp) {
		this.idEsitoFtp = idEsitoFtp;
	}

	public String getCdEsito() {
		return cdEsito;
	}

	public void setCdEsito(String cdEsito) {
		this.cdEsito = cdEsito;
	}

	public String getCdIdentificativoNodo() {
		return cdIdentificativoNodo;
	}

	public void setCdIdentificativoNodo(String cdIdentificativoNodo) {
		this.cdIdentificativoNodo = cdIdentificativoNodo;
	}

	public String getCdStato() {
		return cdStato;
	}

	public void setCdStato(String cdStato) {
		this.cdStato = cdStato;
	}

	public String getDsLogErroreControlliFile() {
		return dsLogErroreControlliFile;
	}

	public void setDsLogErroreControlliFile(String dsLogErroreControlliFile) {
		this.dsLogErroreControlliFile = dsLogErroreControlliFile;
	}

	public Date getDtDataOraEsito() {
		return dtDataOraEsito;
	}

	public void setDtDataOraEsito(Date dtDataOraEsito) {
		this.dtDataOraEsito = dtDataOraEsito;
	}

	public Date getDtDataOraRicezione() {
		return dtDataOraRicezione;
	}

	public void setDtDataOraRicezione(Date dtDataOraRicezione) {
		this.dtDataOraRicezione = dtDataOraRicezione;
	}

	public Short getFlAttuale() {
		return flAttuale;
	}

	public void setFlAttuale(Short flAttuale) {
		this.flAttuale = flAttuale;
	}

	public Short getFlErroreControlliFile() {
		return flErroreControlliFile;
	}

	public void setFlErroreControlliFile(Short flErroreControlliFile) {
		this.flErroreControlliFile = flErroreControlliFile;
	}

	public Short getFlErroreStato() {
		return flErroreStato;
	}

	public void setFlErroreStato(Short flErroreStato) {
		this.flErroreStato = flErroreStato;
	}

	public Short getFlRigenerato() {
		return flRigenerato;
	}

	public void setFlRigenerato(Short flRigenerato) {
		this.flRigenerato = flRigenerato;
	}

	public Short getFlVersoSdi() {
		return flVersoSdi;
	}

	public void setFlVersoSdi(Short flVersoSdi) {
		this.flVersoSdi = flVersoSdi;
	}

	public String getNmNomeFileEsito() {
		return nmNomeFileEsito;
	}

	public void setNmNomeFileEsito(String nmNomeFileEsito) {
		this.nmNomeFileEsito = nmNomeFileEsito;
	}

	public String getNmNomeSupporto() {
		return nmNomeSupporto;
	}

	public void setNmNomeSupporto(String nmNomeSupporto) {
		this.nmNomeSupporto = nmNomeSupporto;
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

	public String getCdTipoEsito() {
		return cdTipoEsito;
	}

	public void setCdTipoEsito(String cdTipoEsito) {
		this.cdTipoEsito = cdTipoEsito;
	}

	public String getIdFileCifrato() {
		return idFileCifrato;
	}

	public void setIdFileCifrato(String idFileCifrato) {
		this.idFileCifrato = idFileCifrato;
	}

	public String getIdFileFirmato() {
		return idFileFirmato;
	}

	public void setIdFileFirmato(String idFileFirmato) {
		this.idFileFirmato = idFileFirmato;
	}

	public String getIdFileNonFirmato() {
		return idFileNonFirmato;
	}

	public void setIdFileNonFirmato(String idFileNonFirmato) {
		this.idFileNonFirmato = idFileNonFirmato;
	}

	public String getPgVersioneEsito() {
		return pgVersioneEsito;
	}

	public void setPgVersioneEsito(String pgVersioneEsito) {
		this.pgVersioneEsito = pgVersioneEsito;
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

	public Long getIdSupportoFtp() {
		return idSupportoFtp;
	}

	public void setIdSupportoFtp(Long idSupportoFtp) {
		this.idSupportoFtp = idSupportoFtp;
	}
	
	@Override
	public String getPKDescription() {
		return this.idEsitoFtp.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	

	
}