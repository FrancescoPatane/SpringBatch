package it.pccube.batchmigration.processor;

import java.math.BigDecimal;
import java.util.Base64;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

import it.pccube.batchmigration.client.doc.DocumentaleService;
import it.pccube.batchmigration.client.doc.OutputDocumentale;
import it.pccube.batchmigration.destination.model.FatTSupportoFtp;
import it.pccube.batchmigration.source.model.FeSupportoFtp;

public class FeSupportoFtpMapper implements ItemProcessor<FeSupportoFtp, FatTSupportoFtp>{

	public static final Logger logger = LoggerFactory.getLogger(FeSupportoFtpMapper.class);


	@Autowired
	private DocumentaleService docService;

	@Override
	public FatTSupportoFtp process(FeSupportoFtp source) throws Exception {
		FatTSupportoFtp destination = new FatTSupportoFtp();

		destination.setIdSupportoFtp(source.getIdSupportoFtp());
		if(source.getNumAttestazioneTrasmFattura()!=null)
			destination.setCdNumAttestazTrasmFattura(source.getNumAttestazioneTrasmFattura().toString());
		if(source.getNumDecorrenzaTermini() != null)
			destination.setCdNumDecorrenzaTermini(source.getNumDecorrenzaTermini().toString());
		if(source.getNumEsito() != null)
			destination.setCdNumEsito(source.getNumEsito().toString());
		if(source.getNumEsitoCommittente() != null)
			destination.setCdNumEsitoCommittente(source.getNumEsitoCommittente().toString());
		if(source.getNumFatture() != null)
			destination.setCdNumFatture(source.getNumFatture().toString());
		if(source.getNumMancataConsegna() != null)
			destination.setCdNumMancataConsegna(source.getNumMancataConsegna().toString());
		if(source.getNumMetadatiInvioFile() != null)
			destination.setCdNumMetadatiInvioFile(source.getNumMetadatiInvioFile().toString());
		if(source.getNumRicevutaConsegna() != null)
			destination.setCdNumRicevutaConsegna(source.getNumRicevutaConsegna().toString());
		if(source.getNumScarto() != null)
			destination.setCdNumScarto(source.getNumScarto().toString());
		if(source.getNumScartoEsitoCommittente() != null)
			destination.setCdNumScartoEsitCommittente(source.getNumScartoEsitoCommittente().toString());
		destination.setCdVersioneQuadratura(source.getVersioneQuadratura());
		destination.setDtDataOraCreazFileQuad(source.getDataOraCreazFileQuad());
		destination.setDtDataOraCreazioneSupporto(source.getDataOraCreazioneSupporto());
		destination.setDtDataOraInvio(source.getDataOraInvio());
		destination.setDtDataOraRicezioneSupporto(source.getDataOraRicezioneSupporto());
		destination.setFlErroreControlliFile(source.getFlagErroreControlliFile());
		destination.setFlErroreStato(source.getFlagErroreStato());
		destination.setFlVersoSdi(source.getFlagVersoSdi());
		destination.setNmIdentificativoNodo(source.getIdentificativoNodo());
		destination.setNmLogErroreControlliFile(source.getLogErroreControlliFile());
		destination.setNmNomeFileQuadratura(source.getNomeFileQuadratura());
		destination.setNmNomeFileSupporto(source.getNomeFileSupporto());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		if(source.getNumDatiFattura()!=null)
			destination.setNrNumDatiFattura(BigDecimal.valueOf(source.getNumDatiFattura()));
		if(source.getNumDatiFattura()!=null)
			destination.setNrNumEsitoDatiFattura(BigDecimal.valueOf(source.getNumEsitoDatiFattura()));

		if (source.getFileCifrato() != null){
			logger.info("Tentativo chiamata documentale per salvataggion documento FileCifrato tabella FeSupportoFtp con id: " + source.getIdSupportoFtp());
			String base64String = Base64.getEncoder().encodeToString(source.getFileCifrato());
			OutputDocumentale doc = docService.uploadDocumento(base64String, source.getNomeFileSupporto());
			destination.setIdFileCifrato(doc.getId());
		}

		if (source.getFileFirmato() != null){
			logger.info("Tentativo chiamata documentale per salvataggion documento FileFirmato tabella FeSupportoFtp con id: " + source.getIdSupportoFtp());
			String base64String = Base64.getEncoder().encodeToString(source.getFileFirmato());
			OutputDocumentale doc = docService.uploadDocumento(base64String, source.getNomeFileSupporto());
			destination.setIdFileFirmato(doc.getId());
		}


		if (source.getFileNonFirmato() != null){
			logger.info("Tentativo chiamata documentale per salvataggio documento FileNonFirmato tabella FeSupportoFtp con id: " + source.getIdSupportoFtp());
			String base64String = Base64.getEncoder().encodeToString(source.getFileNonFirmato());
			OutputDocumentale doc = docService.uploadDocumento(base64String, source.getNomeFileSupporto());
			destination.setIdFileCifrato(doc.getId());
		}


		if (source.getFileQuadratura() != null){
			logger.info("Tentativo chiamata documentale per salvataggio documento getFileQuadratura tabella FeSupportoFtp con id: " + source.getIdSupportoFtp());
			String base64String = Base64.getEncoder().encodeToString(source.getFileQuadratura());
			OutputDocumentale doc = docService.uploadDocumento(base64String, source.getNomeFileQuadratura());
			destination.setIdFileCifrato(doc.getId());
		}

		destination.setPgNumeroSequenziale(source.getNumeroSequenziale());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		destination.setIdDizStatoSupportoFtp(source.getStato());

		return destination;
	}

}
