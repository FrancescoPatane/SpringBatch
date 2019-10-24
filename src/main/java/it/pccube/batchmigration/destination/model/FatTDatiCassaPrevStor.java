package it.pccube.batchmigration.destination.model;

import java.math.BigDecimal;
import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FatTDatiCassaPrevStor implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_T_DATI_CASSA_PREV_STOR";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_DATI_CASSA_PREV_STOR (ID_DATI_CASSA_PREV_STOR, CD_RIFERIMENTO_AMMINISTRAZIONE,ID_DATI_CASSA_PREVIDENZIALE,ID_DIZ_ESIGIBILITA_IVA,ID_DIZ_NATURA,ID_DIZ_RITENUTA,ID_DIZ_TIPO_CASSA,ID_FATTURA,ID_FATTURA_STOR,IM_ARROTONDAMENTO,IM_IMPONIBILE_CASSA,IM_IMPORTO_CONTRIBUTO_CASSA,NM_NUMERO_SEZIONE,NM_UTENTE_INSERIMENTO,NM_UTENTE_ULTIMA_MODIFICA,PC_AL_CASSA,PC_ALIQUOTA_IVA,TS_INSERIMENTO,TS_ULTIMA_MODIFICA) VALUES (:idDatiCassaPrevStor, :cdRiferimentoAmministrazione, :idDatiCassaPrevidenziale, :idDizEsigibilitaIva, :idDizNatura, :idDizRitenuta, :idDizTipoCassa, :idFattura, :idFatturaStor, :imArrotondamento, :imImponibileCassa, :imImportoContributoCassa, :nmNumeroSezione, :nmUtenteInserimento, :nmUtenteUltimaModifica, :pcAlCassa, :pcAliquotaIva, :tsInserimento, :tsUltimaModifica)";

	private Long idDatiCassaPrevStor;

	private String cdRiferimentoAmministrazione;

	private Long idDatiCassaPrevidenziale;

	private Long idFattura;

	private BigDecimal imArrotondamento;

	private BigDecimal imImponibileCassa;

	private BigDecimal imImportoContributoCassa;

	private BigDecimal nmNumeroSezione;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private BigDecimal pcAlCassa;

	private BigDecimal pcAliquotaIva;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idDizTipoCassa;

	private Long idDizNatura;

	private Long idDizRitenuta;

	private Long idDizEsigibilitaIva;

	private Long idFatturaStor;

	public Long getIdDatiCassaPrevStor() {
		return idDatiCassaPrevStor;
	}

	public void setIdDatiCassaPrevStor(Long idDatiCassaPrevStor) {
		this.idDatiCassaPrevStor = idDatiCassaPrevStor;
	}

	public String getCdRiferimentoAmministrazione() {
		return cdRiferimentoAmministrazione;
	}

	public void setCdRiferimentoAmministrazione(String cdRiferimentoAmministrazione) {
		this.cdRiferimentoAmministrazione = cdRiferimentoAmministrazione;
	}

	public Long getIdDatiCassaPrevidenziale() {
		return idDatiCassaPrevidenziale;
	}

	public void setIdDatiCassaPrevidenziale(Long idDatiCassaPrevidenziale) {
		this.idDatiCassaPrevidenziale = idDatiCassaPrevidenziale;
	}

	public Long getIdFattura() {
		return idFattura;
	}

	public void setIdFattura(Long idFattura) {
		this.idFattura = idFattura;
	}

	public BigDecimal getImArrotondamento() {
		return imArrotondamento;
	}

	public void setImArrotondamento(BigDecimal imArrotondamento) {
		this.imArrotondamento = imArrotondamento;
	}

	public BigDecimal getImImponibileCassa() {
		return imImponibileCassa;
	}

	public void setImImponibileCassa(BigDecimal imImponibileCassa) {
		this.imImponibileCassa = imImponibileCassa;
	}

	public BigDecimal getImImportoContributoCassa() {
		return imImportoContributoCassa;
	}

	public void setImImportoContributoCassa(BigDecimal imImportoContributoCassa) {
		this.imImportoContributoCassa = imImportoContributoCassa;
	}

	public BigDecimal getNmNumeroSezione() {
		return nmNumeroSezione;
	}

	public void setNmNumeroSezione(BigDecimal nmNumeroSezione) {
		this.nmNumeroSezione = nmNumeroSezione;
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

	public BigDecimal getPcAlCassa() {
		return pcAlCassa;
	}

	public void setPcAlCassa(BigDecimal pcAlCassa) {
		this.pcAlCassa = pcAlCassa;
	}

	public BigDecimal getPcAliquotaIva() {
		return pcAliquotaIva;
	}

	public void setPcAliquotaIva(BigDecimal pcAliquotaIva) {
		this.pcAliquotaIva = pcAliquotaIva;
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

	public Long getIdDizTipoCassa() {
		return idDizTipoCassa;
	}

	public void setIdDizTipoCassa(Long idDizTipoCassa) {
		this.idDizTipoCassa = idDizTipoCassa;
	}

	public Long getIdDizNatura() {
		return idDizNatura;
	}

	public void setIdDizNatura(Long idDizNatura) {
		this.idDizNatura = idDizNatura;
	}

	public Long getIdDizRitenuta() {
		return idDizRitenuta;
	}

	public void setIdDizRitenuta(Long idDizRitenuta) {
		this.idDizRitenuta = idDizRitenuta;
	}

	public Long getIdDizEsigibilitaIva() {
		return idDizEsigibilitaIva;
	}

	public void setIdDizEsigibilitaIva(Long idDizEsigibilitaIva) {
		this.idDizEsigibilitaIva = idDizEsigibilitaIva;
	}

	public Long getIdFatturaStor() {
		return idFatturaStor;
	}

	public void setIdFatturaStor(Long idFatturaStor) {
		this.idFatturaStor = idFatturaStor;
	}

	@Override
	public String getPKDescription() {
		return this.idDatiCassaPrevStor.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}

	
	

}