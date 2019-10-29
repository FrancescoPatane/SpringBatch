package it.pccube.batchmigration.destination.model;

import java.math.BigDecimal;
import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FatTScontoMaggiorazione implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_T_SCONTO_MAGGIORAZIONE";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_SCONTO_MAGGIORAZIONE ( ID_DETTAGLIO_LINEA, ID_DIZ_TIPO_SCONTO_MAGG, ID_FATTURA, ID_SCONTO_MAGGIORAZIONE, IM_IMPORTO, NM_UTENTE_INSERIMENTO, NM_UTENTE_ULTIMA_MODIFICA, PC_PERCENTUALE, TS_INSERIMENTO, TS_ULTIMA_MODIFICA ) VALUES ( :idDettaglioLinea, :idDizTipoScontoMagg, :idFattura, :idScontoMaggiorazione, :imImporto, :nmUtenteInserimento, :nmUtenteUltimaModifica, :pcPercentuale, :tsInserimento, :tsUltimaModifica )";
	

	private Long idScontoMaggiorazione;

	private BigDecimal imImporto;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private BigDecimal pcPercentuale;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idDizTipoScontoMagg;

	private Long idDettaglioLinea;

	private Long idFattura;
	
	

	public Long getIdScontoMaggiorazione() {
		return idScontoMaggiorazione;
	}

	public void setIdScontoMaggiorazione(Long idScontoMaggiorazione) {
		this.idScontoMaggiorazione = idScontoMaggiorazione;
	}

	public BigDecimal getImImporto() {
		return imImporto;
	}

	public void setImImporto(BigDecimal imImporto) {
		this.imImporto = imImporto;
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

	public BigDecimal getPcPercentuale() {
		return pcPercentuale;
	}

	public void setPcPercentuale(BigDecimal pcPercentuale) {
		this.pcPercentuale = pcPercentuale;
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

	public Long getIdDizTipoScontoMagg() {
		return idDizTipoScontoMagg;
	}

	public void setIdDizTipoScontoMagg(Long idDizTipoScontoMagg) {
		this.idDizTipoScontoMagg = idDizTipoScontoMagg;
	}

	public Long getIdDettaglioLinea() {
		return idDettaglioLinea;
	}

	public void setIdDettaglioLinea(Long idDettaglioLinea) {
		this.idDettaglioLinea = idDettaglioLinea;
	}

	public Long getIdFattura() {
		return idFattura;
	}

	public void setIdFattura(Long idFattura) {
		this.idFattura = idFattura;
	}

	@Override
	public String getPKDescription() {
		return this.idScontoMaggiorazione.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}

}