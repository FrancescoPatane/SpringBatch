package it.pccube.batchmigration.processor;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTVerifFirmaNotifica;
import it.pccube.batchmigration.source.model.FeVerifFirmaNotifica;

public class FeVerifFirmaNotificaMapper implements ItemProcessor<FeVerifFirmaNotifica, FatTVerifFirmaNotifica>{

	@Override
	public FatTVerifFirmaNotifica process(FeVerifFirmaNotifica source) throws Exception {
		FatTVerifFirmaNotifica destination = new FatTVerifFirmaNotifica();
		
		if(source.getDataVerifica() != null)
			destination.setDtDataVerifica(new Timestamp(source.getDataVerifica().getTime()));
		if(source.getCheckHashDocumento() != null)
			destination.setFlCheckHashDocumento(BigDecimal.valueOf(source.getCheckHashDocumento()));
		destination.setIdDizRispostaCodFiscale(source.getIdDizRispostaCodFiscale());
		destination.setIdDizRispostaWsFirma(source.getIdDizRispostaWsFirma());
		destination.setIdNotifica(source.getIdNotifica());
		destination.setIdVerifFirmaNotifica(source.getIdVerifFirmaNotifica());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		
		return destination;
	}

}
