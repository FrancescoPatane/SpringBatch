package it.pccube.batchmigration.processor;

import java.math.BigDecimal;
import java.util.Base64;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

import it.pccube.batchmigration.client.doc.DocumentaleService;
import it.pccube.batchmigration.client.doc.OutputDocumentale;
import it.pccube.batchmigration.destination.model.FatTNotifica;
import it.pccube.batchmigration.source.model.FeNotifica;

public class FeNotificaMapper implements ItemProcessor<FeNotifica, FatTNotifica>{

	public static final Logger logger = LoggerFactory.getLogger(FeNotificaMapper.class);


	@Autowired
	private DocumentaleService docService;

	@Override
	public FatTNotifica process(FeNotifica source) throws Exception {
		FatTNotifica destination = new FatTNotifica();


		destination.setIdNotifica(source.getIdNotifica());

		destination.setCdCodiceDestinatario(source.getCodiceDestinatario());

		destination.setCdEsito(source.getEsito());

		destination.setCdHashFileOriginale(source.getHashFileOriginale());

		if(source.getIdentificativoSdiArchivio() != null)
			destination.setCdIdentificativoSdiArchivio(source.getIdentificativoSdiArchivio().toString());

		if(source.getIdentificativoSdiLotto() != null)
			destination.setCdIdentificativoSdiLotto(source.getIdentificativoSdiLotto().toString());

		if(source.getIdentificativoSdiNotifica() != null)
			destination.setCdIdentificativoSdiNotifica(source.getIdentificativoSdiNotifica().toString());

		destination.setCdNumeroFatturaEsito(source.getNumeroFatturaEsito());

		destination.setCdVersioneNotifica(source.getVersioneNotifica());

		destination.setCdVersioneNotificaEsito(source.getVersioneNotificaEsito());

		destination.setDsDescrizioneDestinatario(source.getDescrizioneDestinatario());

		destination.setDsDescrizioneNotifica(source.getDescrizioneNotifica());

		destination.setCdMessageIdCommittente(source.getMessageIdCommittente());

		destination.setDtDataOraConsegna(source.getDataOraConsegna());

		destination.setDtDataOraRicezione(source.getDataOraRicezione());

		destination.setFlErrore(source.getFlagErrore());

		destination.setIdSdiEsitoCommittente(source.getIdSdiEsitoCommittente());

		destination.setNmIntermediarioDupliceRuolo(source.getIntermediarioDupliceRuolo());

		destination.setCdMessageId(source.getMessageId());

		destination.setNmNomeFileArchivio(source.getNomeFileArchivio());

		destination.setNmNomeFileLotto(source.getNomeFileLotto());

		destination.setNmNomeFileNotifica(source.getNomeFileNotifica());

		destination.setNmPecMessageId(source.getPecMessageId());

		destination.setNmTicketConservazione(source.getTicketConservazione());

		destination.setNmUtenteInserimento(source.getUseridInserimento());

		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());

		if(source.getAnnoFatturaEsito() != null)
			destination.setNrAnnoFatturaEsito(BigDecimal.valueOf(source.getAnnoFatturaEsito()));

		if(source.getPosizioneFatturaEsito() != null)
			destination.setNrPosizioneFatturaEsito(BigDecimal.valueOf(source.getPosizioneFatturaEsito()));

		destination.setOjLogEccezioni(source.getLogEccezioni());


		if (source.getXmlNotifica() != null){
			String base64String = Base64.getEncoder().encodeToString(source.getXmlNotifica());
			logger.info("Tentativo chiamata documentale per salvataggion documento XmlNotifica tabella FeNotifica con id: " + source.getIdNotifica());
			OutputDocumentale doc = docService.uploadDocumento(base64String, source.getNomeFileNotifica());
			destination.setIdXmlNotifica(doc.getId());
		}

		if (source.getZipNotifica() != null){
			String base64String = Base64.getEncoder().encodeToString(source.getZipNotifica());
			logger.info("Tentativo chiamata documentale per salvataggion documento ZipNotifica tabella FeNotifica con id: " + source.getIdNotifica());
			OutputDocumentale doc = docService.uploadDocumento(base64String, source.getNomeFileNotifica());
			destination.setIdZipNotifica(doc.getId());
		}

		if(source.getVersioneLotto() != null)
			destination.setPgVersioneLotto(BigDecimal.valueOf(source.getVersioneLotto()));

		destination.setTsInserimento(source.getTmstInserimento());

		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());

		destination.setTxNote(source.getNote());

		destination.setIdDizTipoNotifica(source.getTipoNotifica());

		destination.setIdArchivio(source.getIdArchivio());

		destination.setIdFattura(source.getIdFattura());

		destination.setIdLotto(source.getIdLotto());


		return destination;
	}


}
