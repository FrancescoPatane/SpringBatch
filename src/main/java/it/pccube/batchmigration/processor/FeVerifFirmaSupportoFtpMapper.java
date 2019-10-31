package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTVerifFirmaSuppFtp;
import it.pccube.batchmigration.source.model.FeVerifFirmaSupportoFtp;

public class FeVerifFirmaSupportoFtpMapper implements ItemProcessor<FeVerifFirmaSupportoFtp, FatTVerifFirmaSuppFtp>{

	@Override
	public FatTVerifFirmaSuppFtp process(FeVerifFirmaSupportoFtp source) throws Exception {
		FatTVerifFirmaSuppFtp destination = new FatTVerifFirmaSuppFtp();
		
		destination.setIdVerifFirmaSupportoFtp(source.getIdVerifFirmaSupportoFtp());
		destination.setFlCheckHashDocumento(source.getCheckHashDocumento());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setTsDataVerifica(source.getDataVerifica());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		destination.setIdSupportoFtp(source.getIdSupportoFtp());
		destination.setIdDizRispostaCodFiscale(source.getIdDizRispostaCodFiscale());
		destination.setIdDizRispostaWsFirma(source.getIdDizRispostaWsFirma());
		
		return destination;
	}

}
