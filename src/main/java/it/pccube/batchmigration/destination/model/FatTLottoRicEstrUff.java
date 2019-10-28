package it.pccube.batchmigration.destination.model;

import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FatTLottoRicEstrUff implements ModelEntity{
	
	public static final String TABLE_NAME = "FAT_T_LOTTO_RIC_ESTR_UFF";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_LOTTO_RIC_ESTR_UFF ( CD_STATO, ID_LOTTO, ID_LOTTO_RICHIESTA_ESTR_UFF, ID_RIC_ESTRAZIONE_UFFICIALE, ID_SEDIA_RIC, NM_UTENTE_INSERIMENTO, NM_UTENTE_ULTIMA_MODIFICA, PG_VERSIONE_LOTTO, TS_INSERIMENTO, TS_ULTIMA_MODIFICA )VALUES( :cdStato, :idLotto, :idLottoRichiestaEstrUff, :idRicEstrazioneUfficiale, :idSediaRic, :nmUtenteInserimento, :nmUtenteUltimaModifica, :pgVersioneLotto, :tsInserimento, :tsUltimaModifica )";
	
	
	private Long idLottoRichiestaEstrUff;

	private String cdStato;

	private Long idRicEstrazioneUfficiale;

	private Long idSediaRic;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private Long pgVersioneLotto;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idLotto;

	public Long getIdLottoRichiestaEstrUff() {
		return idLottoRichiestaEstrUff;
	}

	public void setIdLottoRichiestaEstrUff(Long idLottoRichiestaEstrUff) {
		this.idLottoRichiestaEstrUff = idLottoRichiestaEstrUff;
	}

	public String getCdStato() {
		return cdStato;
	}

	public void setCdStato(String cdStato) {
		this.cdStato = cdStato;
	}

	public Long getIdRicEstrazioneUfficiale() {
		return idRicEstrazioneUfficiale;
	}

	public void setIdRicEstrazioneUfficiale(Long idRicEstrazioneUfficiale) {
		this.idRicEstrazioneUfficiale = idRicEstrazioneUfficiale;
	}

	public Long getIdSediaRic() {
		return idSediaRic;
	}

	public void setIdSediaRic(Long idSediaRic) {
		this.idSediaRic = idSediaRic;
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

	public Long getPgVersioneLotto() {
		return pgVersioneLotto;
	}

	public void setPgVersioneLotto(Long pgVersioneLotto) {
		this.pgVersioneLotto = pgVersioneLotto;
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

	public Long getIdLotto() {
		return idLotto;
	}

	public void setIdLotto(Long idLotto) {
		this.idLotto = idLotto;
	}

	@Override
	public String getPKDescription() {
		return this.idLottoRichiestaEstrUff.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	

}