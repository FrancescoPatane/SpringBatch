package it.pccube.batchmigration.processor;

import java.util.Base64;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

import it.pccube.batchmigration.client.doc.DocumentaleService;
import it.pccube.batchmigration.client.doc.OutputDocumentale;
import it.pccube.batchmigration.destination.model.FatTExcelFattura;
import it.pccube.batchmigration.source.model.FeExcelFattura;

public class FeExcelFatturaMapper implements ItemProcessor<FeExcelFattura, FatTExcelFattura>{
	
	public static final Logger logger = LoggerFactory.getLogger(FeExcelFatturaMapper.class);


	@Autowired
	private DocumentaleService docService;

	@Override
	public FatTExcelFattura process(FeExcelFattura source) throws Exception {
		FatTExcelFattura destination = new FatTExcelFattura();
		
		destination.setIdExcelFattura(source.getIdExcelFattura());

		destination.setDsDescrizione(source.getDescrizione());

		destination.setDtDataOraCaricamento(source.getDataOraCaricamento());

		destination.setDtDataOraUltimaModifica(source.getDataOraUltimaModifica());

//TODO ID SEDIA		destination.setIdSedia(source.get);

		destination.setNmContentTypeExcelOrig(source.getContentTypeExcelOriginale());

		destination.setNmContentTypeExcelValidaz(source.getContentTypeExcelValidazione());

		destination.setNmNomeExcelOriginale(source.getNomeExcelOriginale());

		destination.setNmNomeExcelValidazioni(source.getNomeExcelValidazione());

		destination.setNmUtenteInserimento(source.getUseridInserimento());

		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());

		if (source.getFileExcelConValidazioni() != null){
			logger.info("Tentativo chiamata documentale per salvataggio documento FileExcelConValidazioni tabella FeExcelFattura con id: " + source.getIdExcelFattura());
			String base64String = Base64.getEncoder().encodeToString(source.getFileExcelConValidazioni());
			OutputDocumentale doc = docService.uploadDocumento(base64String, source.getNomeExcelValidazione());
			destination.setIdFileExcelConValidazioni(doc.getId());
		}

		if (source.getFileExcelOriginale() != null){
			logger.info("Tentativo chiamata documentale per salvataggio documento FileExcelOriginale tabella FeExcelFattura con id: " + source.getIdExcelFattura());
			String base64String = Base64.getEncoder().encodeToString(source.getFileExcelOriginale());
			OutputDocumentale doc = docService.uploadDocumento(base64String, source.getNomeExcelOriginale());
			destination.setIdFileExcelConValidazioni(doc.getId());
		}

		destination.setPgVersioneLotto(source.getVersioneLotto());

		destination.setTsInserimento(source.getTmstInserimento());

		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());

		destination.setIdFattura(source.getIdFattura());

		destination.setIdExcelFatturaSostituente(source.getIdExcelFatturaSostituente());

		destination.setIdLotto(source.getIdLotto());

		destination.setIdDizStatoExcelFattura(source.getStato());
		
		return destination;
	}

}
