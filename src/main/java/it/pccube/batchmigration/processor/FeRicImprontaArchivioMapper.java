package it.pccube.batchmigration.processor;

import java.util.Base64;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

import it.pccube.batchmigration.client.AutorizzazioneService;
import it.pccube.batchmigration.client.doc.DocumentaleService;
import it.pccube.batchmigration.client.doc.OutputDocumentale;
import it.pccube.batchmigration.destination.model.FatTRicImprontaArchivio;
import it.pccube.batchmigration.source.model.FeRicImprontaArchivio;

public class FeRicImprontaArchivioMapper implements ItemProcessor<FeRicImprontaArchivio, FatTRicImprontaArchivio>{

	public static final Logger logger = LoggerFactory.getLogger(FeRicImprontaArchivioMapper.class);

	@Autowired
	private AutorizzazioneService autorizzazioneService;

	@Autowired
	private DocumentaleService docService;


	@Override
	public FatTRicImprontaArchivio process(FeRicImprontaArchivio source) throws Exception {
		FatTRicImprontaArchivio destination = new FatTRicImprontaArchivio();


		destination.setIdRicImprontaArchivio(source.getIdRicImprontaArchivio());

		destination.setCdCapSedeTitolCont(source.getCapSedeTitolareCont());

		destination.setCdCfPivaIntermedTrasm(source.getCfPivaIntermediarioTrasm());

		destination.setCdCfPivaSoggettoTrasm(source.getCfPivaSoggettoTrasmissione());

		destination.setCdCfPivaTitolareCont(source.getCfPivaTitolareCont());

		destination.setCdCodErrRichiestaNcs(source.getCodErrRichiestaNcs());

		destination.setCdCodiceFornitura(source.getCodiceFornitura());

		destination.setCdFatturazioneEleTitolCont(source.getFatturazioneEleTitolareCont());

		destination.setCdNumCivicoSedeTitolCont(source.getNumCivicoSedeTitolareCont());

		destination.setCdProtocolloDaSostituire(source.getProtocolloDaSostituire());

		destination.setCdRichiestaNcs(source.getIdRichiestaNcs());

		destination.setCdSessoTitolareCont(source.getSessoTitolareCont());

		destination.setDsDescrErrRichiestaNcs(source.getDescrErrRichiestaNcs());

		destination.setDtDataImpegnoTrasm(source.getDataImpegnoTrasm());

		destination.setDtDataNascTitolareCont(source.getDataNascTitolareCont());

		destination.setDtDataOraInvioRicNcs(source.getDataOraInvioRichiestaNcs());

		destination.setDtDataRicezioneXmlComunic(source.getDataRicezioneXmlComunic());

		destination.setFlEsitoRichiestaNcs(source.getEsitoRichiestaNcs());
		
		if (source.getIdUtenteAziendaRichiesta() != null) {
			logger.info("Tentativo chiamata autorizzazione per recupero di sedia da IdUtenteAziendaRichiesta " + source.getIdUtenteAziendaRichiesta() + "dell'entity FeRicImprontaArchivio con id: " + source.getIdRicImprontaArchivio());
			String idSedia = this.autorizzazioneService.getIdSediaFromIdUtenteAzienda(source.getIdUtenteAziendaRichiesta().toString());
			destination.setIdSediaRichiesta(Long.valueOf(idSedia));
		}

		destination.setNmCognomeTitolareCont(source.getCognomeTitolareCont());

		destination.setNmComunestatoNascTitolCont(source.getComunestatoNascTitolareCont());

		destination.setNmComunestatoSedeTitolCont(source.getSessoTitolareCont());

		destination.setNmDenominazioneTitolareCont(source.getDenominazioneTitolareCont());

		destination.setNmIndirizzoSedeTitolCont(source.getIndirizzoSedeTitolareCont());

		destination.setNmNomeTitolareCont(source.getNomeTitolareCont());

		destination.setNmNomeXmlComunicazione(source.getNomeXmlComunicazione());

		destination.setNmProvinciaNascTitolCont(source.getProvinciaNascTitolareCont());

		destination.setNmProvinciaSedeTitolCont(source.getProvinciaSedeTitolareCont());

		destination.setNmUtenteInserimento(source.getUseridInserimento());

		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());

		destination.setNrAlboCafIntermedTrasm(source.getnAlboCafIntermediarioTrasm());

		destination.setNrPeriodoImposta(source.getPeriodoImposta());


		if (source.getXmlComunicazione() != null){
			String base64String = Base64.getEncoder().encodeToString(source.getXmlComunicazione());
			logger.info("Tentativo chiamata documentale per salvataggion documento XmlComunicazione tabella FeRicImprontaArchivio con id: " + source.getIdRicImprontaArchivio().toString());
			OutputDocumentale doc = docService.uploadDocumento(base64String, source.getNomeXmlComunicazione());
			destination.setIdXmlComunicazione(doc.getId());
		}

		if (source.getXmlRichiesta() != null){
			String base64String = Base64.getEncoder().encodeToString(source.getXmlRichiesta());
			logger.info("Tentativo chiamata documentale per salvataggion documento XmlRichiesta tabella FeRicImprontaArchivio con id: " + source.getIdRicImprontaArchivio().toString());
			OutputDocumentale doc = docService.uploadDocumento(base64String, source.getNomeXmlComunicazione());
			destination.setIdXmlRichiesta(doc.getId());
		}

		destination.setTsInserimento(source.getTmstInserimento());

		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());

		destination.setIdDizStatoRichiesta(source.getStatoRichiesta());

		destination.setIdDizTipoComunicazione(source.getTipoComunicazione());

		destination.setIdDizImpegnoTrasm(source.getImpegnoTrasm());

		return destination;
	}

}
