package it.pccube.batchmigration.destination.model;

import java.math.BigDecimal;
import java.util.Date;

import it.pccube.batchmigration.model.ModelEntity;


public class FatTDatiRiepilogoStor implements ModelEntity {
	
	public static final String TABLE_NAME = "FAT_T_DATI_RIEPILOGO_STOR";
	
	public static final String INSERT_QUERY = "INSERT INTO FAT_T_DATI_RIEPILOGO_STOR (id_dati_riepilogo_stor, id_fattura_stor, ds_riferimento_normativo, id_dati_riepilogo, id_diz_esigibilita_iva, id_diz_natura, id_fattura, im_arrotondamento, im_imponibile_importo, im_spese_accessorie, nm_utente_inserimento, nm_utente_ultima_modifica, pc_aliquota_iva, pc_imposta, ts_inserimento, ts_ultima_modifica )VALUES( :idDatiRiepilogoStor, :idFatturaStor, :dsRiferimentoNormativo, :idDatiRiepilogo, :idDizEsigibilitaIva, :idDizNatura, :idFattura, :imArrotondamento, :imImponibileImporto, :imSpeseAccessorie, :nmUtenteInserimento, :nmUtenteUltimaModifica, :pcAliquotaIva, :pcImposta, :tsInserimento, :tsUltimaModifica )";


	private Long idDatiRiepilogoStor;

	private String dsRiferimentoNormativo;

	private Long idDatiRiepilogo;

	private Long idFattura;

	private BigDecimal imArrotondamento;

	private BigDecimal imImponibileImporto;

	private BigDecimal imSpeseAccessorie;

	private String nmUtenteInserimento;

	private String nmUtenteUltimaModifica;

	private BigDecimal pcAliquotaIva;

	private BigDecimal pcImposta;

	private Date tsInserimento;

	private Date tsUltimaModifica;

	private Long idDizNatura;

	private Long idFatturaStor;

	private Long idDizEsigibilitaIva;

	public Long getIdDatiRiepilogoStor() {
		return idDatiRiepilogoStor;
	}

	public void setIdDatiRiepilogoStor(Long idDatiRiepilogoStor) {
		this.idDatiRiepilogoStor = idDatiRiepilogoStor;
	}

	public String getDsRiferimentoNormativo() {
		return dsRiferimentoNormativo;
	}

	public void setDsRiferimentoNormativo(String dsRiferimentoNormativo) {
		this.dsRiferimentoNormativo = dsRiferimentoNormativo;
	}

	public Long getIdDatiRiepilogo() {
		return idDatiRiepilogo;
	}

	public void setIdDatiRiepilogo(Long idDatiRiepilogo) {
		this.idDatiRiepilogo = idDatiRiepilogo;
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

	public Long getIdDizNatura() {
		return idDizNatura;
	}

	public void setIdDizNatura(Long idDizNatura) {
		this.idDizNatura = idDizNatura;
	}

	public Long getIdFatturaStor() {
		return idFatturaStor;
	}

	public void setIdFatturaStor(Long idFatturaStor) {
		this.idFatturaStor = idFatturaStor;
	}

	public Long getIdDizEsigibilitaIva() {
		return idDizEsigibilitaIva;
	}

	public void setIdDizEsigibilitaIva(Long idDizEsigibilitaIva) {
		this.idDizEsigibilitaIva = idDizEsigibilitaIva;
	}

	@Override
	public String getPKDescription() {
		return this.idDatiRiepilogoStor.toString();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}
	
	
	
	
	

}