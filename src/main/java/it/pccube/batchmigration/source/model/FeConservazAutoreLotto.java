package it.pccube.batchmigration.source.model;



import java.sql.Timestamp;

import it.pccube.batchmigration.model.ModelEntity;



public class FeConservazAutoreLotto implements ModelEntity {
	
	public static final String TABLE_NAME = "FE_CONSERVAZ_AUTORE_LOTTO";


	private Long idConservazAutoreLotto;
	
	private Long idLotto;
	
	private Long versioneLotto;
	
	private Long idUtenteAutore;
	
	private String nome;
	
	private String cognome;
	
	private String codiceFiscale;
	
	private String useridInserimento;
	
	private Timestamp tmstInserimento;
	
	private String useridUltimoAggiornamento;
	
	private Timestamp tmstUltimoAggiornamento;

	public Long getIdConservazAutoreLotto() {
		return idConservazAutoreLotto;
	}

	public void setIdConservazAutoreLotto(Long idConservazAutoreLotto) {
		this.idConservazAutoreLotto = idConservazAutoreLotto;
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

	public Long getIdUtenteAutore() {
		return idUtenteAutore;
	}

	public void setIdUtenteAutore(Long idUtenteAutore) {
		this.idUtenteAutore = idUtenteAutore;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getUseridInserimento() {
		return useridInserimento;
	}

	public void setUseridInserimento(String useridInserimento) {
		this.useridInserimento = useridInserimento;
	}

	public Timestamp getTmstInserimento() {
		return tmstInserimento;
	}

	public void setTmstInserimento(Timestamp tmstInserimento) {
		this.tmstInserimento = tmstInserimento;
	}

	public String getUseridUltimoAggiornamento() {
		return useridUltimoAggiornamento;
	}

	public void setUseridUltimoAggiornamento(String useridUltimoAggiornamento) {
		this.useridUltimoAggiornamento = useridUltimoAggiornamento;
	}

	public Timestamp getTmstUltimoAggiornamento() {
		return tmstUltimoAggiornamento;
	}

	public void setTmstUltimoAggiornamento(Timestamp tmstUltimoAggiornamento) {
		this.tmstUltimoAggiornamento = tmstUltimoAggiornamento;
	}

	@Override
	public String getPKDescription() {
		return this.idConservazAutoreLotto.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}

	
	
}
