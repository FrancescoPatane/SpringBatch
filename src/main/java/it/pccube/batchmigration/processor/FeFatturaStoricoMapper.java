package it.pccube.batchmigration.processor;

import java.math.BigDecimal;
import java.util.Base64;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

import it.pccube.batchmigration.client.doc.DocumentaleService;
import it.pccube.batchmigration.client.doc.OutputDocumentale;
import it.pccube.batchmigration.destination.model.FatTFatturaStor;
import it.pccube.batchmigration.source.model.FeFatturaStorico;

public class FeFatturaStoricoMapper implements ItemProcessor<FeFatturaStorico, FatTFatturaStor >{

	private static final Logger logger = LoggerFactory.getLogger(FeFatturaStoricoMapper.class);

	@Autowired
	private DocumentaleService docService;
	
	
	@Override
	public FatTFatturaStor process(FeFatturaStorico source) throws Exception {
		logger.info("Mapping FeFatturaStorico with PK: " + source.getIdFatturaStorico());
		FatTFatturaStor destination = new FatTFatturaStor();
		destination.setIdFatturaStor(source.getIdFatturaStorico());
		destination.setPgVersioneLotto(source.getVersioneLotto());
		destination.setCdBolloVirtuale(source.getBolloVirtuale());
		destination.setCdCapResa(source.getCapResa());
		destination.setCdCodEoriVettore(source.getCodEoriVettore());
		destination.setCdCodiceFiscaleVettore(source.getCodiceFiscaleVettore());
		destination.setCdCodiceVettore(source.getIdCodiceVettore());
		destination.setCdNormaDiRiferimento(source.getNormaDiRiferimento());
		destination.setCdNumero(source.getNumero());
		destination.setCdNumeroBollo(source.getNumeroBollo());
		destination.setCdNumeroCivicoResa(source.getNumeroCivicoResa());
		destination.setCdNumeroFatturaPrincipale(source.getNumeroFatturaPrincipale());
		destination.setCdNumLicenzaGuidaVettore(source.getNumLicenzaGuidaVettore());
		destination.setCdUnitaMisuraPeso(source.getUnitaMisuraPeso());
		destination.setDsCausale(source.getCausale());
		destination.setDsCausaleTrasporto(source.getCausaleTrasporto());
		destination.setDsDescrizione(source.getDescrizione());
		destination.setDtData(source.getData());
		destination.setDtDataFatturaPrincipale(source.getDataFatturaPrincipale());
		destination.setDtDataImmatVeicolo(source.getDataImmatVeicolo());
		destination.setDtDataInizioTrasporto(source.getDataInizioTrasporto());
		destination.setDtDataOraConsegna(source.getDataOraConsegna());
		destination.setDtDataOraRitiro(source.getDataOraRitiro());
		destination.setIdComuneResa(source.getComuneResa());
		destination.setIdDizArt73(source.getArt73());
		destination.setIdDizCausalePagamento(source.getCausalePagamento());
		destination.setIdDivisa(source.getDivisa());
		destination.setIdDizTipoDocumento(source.getTipoDocumento());
		destination.setIdDizTipoResa(source.getTipoResa());
		destination.setIdDizTipoRitenuta(source.getTipoRitenuta());
		destination.setIdFattura(source.getIdFattura());
		destination.setIdFatturaPrincipale(source.getIdFatturaPrincipale());
		destination.setIdFatturaRifiutata(source.getIdFatturaRifiutata());
		destination.setIdLotto(source.getIdLotto());
		destination.setIdLottoFatRifiutata(source.getIdLottoFatRifiutata());
		destination.setIdNazioneResa(source.getNazioneResa());
		destination.setIdPaeseVettore(source.getIdPaeseVettore());
		destination.setIdProvinciaResa(source.getProvinciaResa());
		destination.setIdRegioneResa(source.getRegioneResa());
//		if (source.getXmlEuGenerated() != null){
//			String base64String = Base64.getEncoder().encodeToString(source.getXmlEuGenerated());
//			logger.info("Tentativo chiamata documentale per salvataggio documento XmlEuGenerated tabella FeFatturaStorico con id: " + source.getIdFatturaStorico());
//			OutputDocumentale doc = docService.uploadDocumento(base64String, source.getXmlEuGeneratedName());
//			destination.setIdXmlEuGenerated(doc.getId());
//		}
//		if (source.getXmlEuUploaded() != null){
//			String base64String = Base64.getEncoder().encodeToString(source.getXmlEuGenerated());
//			logger.info("Tentativo chiamata documentale per salvataggio documento XmlEuUploadedName tabella FeFatturaStorico con id: " + source.getIdFatturaStorico());
//			OutputDocumentale doc = docService.uploadDocumento(base64String, source.getXmlEuUploadedName());
//			destination.setIdXmlEuGenerated(doc.getId());
//		}
		destination.setImArrotondamento(source.getArrotondamento());
		destination.setImImportoBollo(source.getImportoBollo());
		destination.setImImportoRitenuta(source.getImportoRitenuta());
		destination.setImImportoTotaleDocumento(source.getImportoTotaleDocumento());
		destination.setNmCognomeVettore(source.getCognomeVettore());
		destination.setNmComuneResaEst(source.getComuneResaEst());
		destination.setNmDenominazioneVettore(source.getDenominazioneVettore());
		destination.setNmIndirizzoResa(source.getIndirizzoResa());
		destination.setNmMezzoTrasporto(source.getMezzoTrasporto());
		destination.setNmNomeVettore(source.getNomeVettore());
		destination.setNmTitoloVettore(source.getTitoloVettore());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setNmXmlEuGeneratedName(source.getXmlEuGeneratedName());
		destination.setNmXmlEuUploadedName(source.getXmlEuUploadedName());
		destination.setPcAliquotaRitenuta(source.getAliquotaRitenuta());
		if (source.getVersioneLottoFatRifiutata()!=null)
			destination.setPgVersioneLottoFatRifiut(BigDecimal.valueOf(source.getVersioneLottoFatRifiutata()));
		if (source.getNumeroColli()!=null)
			destination.setQtNumeroColli(BigDecimal.valueOf(source.getNumeroColli()));
		destination.setQtPesoLordo(destination.getQtPesoLordo());
		destination.setQtPesoNetto(destination.getQtPesoNetto());
		destination.setQtTotalePercorsoVeicolo(destination.getQtTotalePercorsoVeicolo());
		destination.setTsInserimento(destination.getTsInserimento());
		destination.setTsUltimaModifica(destination.getTsUltimaModifica());
		logger.info("Mapping complete");
		return destination;
	}
}
