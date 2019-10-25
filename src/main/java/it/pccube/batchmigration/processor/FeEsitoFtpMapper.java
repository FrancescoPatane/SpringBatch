package it.pccube.batchmigration.processor;

import java.util.Base64;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

import it.pccube.batchmigration.client.doc.DocumentaleService;
import it.pccube.batchmigration.client.doc.OutputDocumentale;
import it.pccube.batchmigration.destination.model.FatTEsitoFtp;
import it.pccube.batchmigration.source.model.FeEsitoFtp;

public class FeEsitoFtpMapper implements ItemProcessor<FeEsitoFtp, FatTEsitoFtp>{

	public static final Logger logger = LoggerFactory.getLogger(FeEsitoFtpMapper.class);


	@Autowired
	private DocumentaleService docService;

	@Override
	public FatTEsitoFtp process(FeEsitoFtp source) throws Exception {
		FatTEsitoFtp destination = new FatTEsitoFtp();


		destination.setIdEsitoFtp(source.getIdEsitoFtp());

		destination.setCdEsito(source.getEsito());

		destination.setCdIdentificativoNodo(source.getIdentificativoNodo());
		if(source.getStato()!=null)
			destination.setCdStato(source.getStato().toString());

		destination.setDsLogErroreControlliFile(source.getLogErroreControlliFile());

		destination.setDtDataOraEsito(source.getDataOraEsito());

		destination.setDtDataOraRicezione(source.getDataOraRicezione());

		destination.setFlAttuale(source.getFlagAttuale());

		destination.setFlErroreControlliFile(source.getFlagErroreControlliFile());

		destination.setFlErroreStato(source.getFlagErroreStato());

		destination.setFlRigenerato(source.getFlagRigenerato());

		destination.setFlVersoSdi(source.getFlagVersoSdi());

		destination.setNmNomeFileEsito(source.getNomeFileEsito());

		destination.setNmNomeSupporto(source.getNomeSupporto());

		destination.setNmUtenteInserimento(source.getUseridInserimento());

		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());

		destination.setCdTipoEsito(source.getTipoEsito());


		if (source.getFileCifrato() != null){
			logger.info("Tentativo chiamata documentale per salvataggio documento FileCifrato tabella FeEsitoFtp con id: " + source.getIdEsitoFtp());
			String base64String = Base64.getEncoder().encodeToString(source.getFileCifrato());
			OutputDocumentale doc = docService.uploadDocumento(base64String, source.getNomeFileEsito());
			destination.setIdFileCifrato(doc.getId());
		}

		
		if (source.getFileFirmato() != null){
			logger.info("Tentativo chiamata documentale per salvataggio documento FileFirmato tabella FeEsitoFtp con id: " + source.getIdEsitoFtp());
			String base64String = Base64.getEncoder().encodeToString(source.getFileFirmato());
			OutputDocumentale doc = docService.uploadDocumento(base64String, source.getNomeFileEsito());
			destination.setIdFileFirmato(doc.getId());
		}

		
		if (source.getFileNonFirmato() != null){
			logger.info("Tentativo chiamata documentale per salvataggio documento FileNonFirmato tabella FeEsitoFtp con id: " + source.getIdEsitoFtp());
			String base64String = Base64.getEncoder().encodeToString(source.getFileNonFirmato());
			OutputDocumentale doc = docService.uploadDocumento(base64String, source.getNomeFileEsito());
			destination.setIdFileNonFirmato(doc.getId());
		}

		destination.setPgVersioneEsito(source.getVersioneEsito());

		destination.setTsInserimento(source.getTmstInserimento());

		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());

		destination.setIdSupportoFtp(source.getIdSupportoFtp());

		return destination;
	}

}
