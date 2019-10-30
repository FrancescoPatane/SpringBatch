package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTVerifFirmaEsitoFtp;
import it.pccube.batchmigration.source.model.FeVerifFirmaEsitoFtp;

public class FeVerifFirmaEsitoFtpMapper implements ItemProcessor<FeVerifFirmaEsitoFtp, FatTVerifFirmaEsitoFtp>{


	@Override
	public FatTVerifFirmaEsitoFtp process(FeVerifFirmaEsitoFtp source) throws Exception {
		FatTVerifFirmaEsitoFtp destination = new FatTVerifFirmaEsitoFtp();

		destination.setDtDataVerifica(source.getDataVerifica());
		destination.setFlCheckHashDocumento(source.getCheckHashDocumento());
		destination.setIdDizRispostaCodFiscale(source.getIdDizRispostaCodFiscale());
		destination.setIdDizRispostaWsFirma(source.getIdDizRispostaWsFirma());
		destination.setIdEsitoFtp(source.getIdEsitoFtp());
		destination.setIdVerifFirmaEsitoFtp(source.getIdVerifFirmaEsitoFtp());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());

		return destination;
	}

}
