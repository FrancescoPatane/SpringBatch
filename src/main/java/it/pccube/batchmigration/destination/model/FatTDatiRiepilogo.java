package it.pccube.batchmigration.destination.model;

import java.math.BigDecimal;
import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FatTDatiRiepilogo implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_T_DATI_RIEPILOGO";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_DATI_RIEPILOGO ( ds_riferimento_normativo, id_dati_riepilogo, id_diz_esigibilita_iva, id_diz_natura, id_fattura, im_arrotondamento, im_imponibile_importo, im_spese_accessorie, nm_utente_inserimento, nm_utente_ultima_modifica, pc_aliquota_iva, pc_imposta, ts_inserimento, ts_ultima_modifica )VALUES( :dsRiferimentoNormativo, :idDatiRiepilogo, :idDizEsigibilitaIva, :idDizNatura, :idFattura, :imArrotondamento, :imImponibileImporto, :imSpeseAccessorie, :nmUtenteInserimento, :nmUtenteUltimaModifica, :pcAliquotaIva, :pcImposta, :tsInserimento, :tsUltimaModifica )";

	private Long idDatiRiepilogo;

	private String dsRiferimentoNormativo;

	private BigDecimal imArrotondamento;

	private BigDecimal imImponibileImporto;

	private BigDecimal imSpeseAccessorie;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private BigDecimal pcAliquotaIva;

	private BigDecimal pcImposta;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idDizEsigibilitaIva;

	private Long idDizNatura;

	private Long idFattura;

	public Long getIdDatiRiepilogo() {
		return idDatiRiepilogo;
	}

	public void setIdDatiRiepilogo(Long idDatiRiepilogo) {
		this.idDatiRiepilogo = idDatiRiepilogo;
	}

	public String getDsRiferimentoNormativo() {
		return dsRiferimentoNormativo;
	}

	public void setDsRiferimentoNormativo(String dsRiferimentoNormativo) {
		this.dsRiferimentoNormativo = dsRiferimentoNormativo;
	}

	public BigDecimal getImArrotondamento() {
		return imArrotondamento;
	}

	public void setImArrotondamento(BigDecimal imArrotondamento) {
		this.imArrotondamento = imArrotondamento;
	}

	public BigDecimal getImImponibileImporto() {
		return imImponibileImporto;
	}

	public void setImImponibileImporto(BigDecimal imImponibileImporto) {
		this.imImponibileImporto = imImponibileImporto;
	}

	public BigDecimal getImSpeseAccessorie() {
		return imSpeseAccessorie;
	}

	public void setImSpeseAccessorie(BigDecimal imSpeseAccessorie) {
		this.imSpeseAccessorie = imSpeseAccessorie;
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

	public BigDecimal getPcAliquotaIva() {
		return pcAliquotaIva;
	}

	public void setPcAliquotaIva(BigDecimal pcAliquotaIva) {
		this.pcAliquotaIva = pcAliquotaIva;
	}

	public BigDecimal getPcImposta() {
		return pcImposta;
	}

	public void setPcImposta(BigDecimal pcImposta) {
		this.pcImposta = pcImposta;
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

	public Long getIdDizEsigibilitaIva() {
		return idDizEsigibilitaIva;
	}

	public void setIdDizEsigibilitaIva(Long idDizEsigibilitaIva) {
		this.idDizEsigibilitaIva = idDizEsigibilitaIva;
	}

	public Long getIdDizNatura() {
		return idDizNatura;
	}

	public void setIdDizNatura(Long idDizNatura) {
		this.idDizNatura = idDizNatura;
	}

	public Long getIdFattura() {
		return idFattura;
	}

	public void setIdFattura(Long idFattura) {
		this.idFattura = idFattura;
	}

	
	@Override
	public String getPKDescription() {
		return this.idDatiRiepilogo.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	

}