package it.pccube.batchmigration.processor;

import java.math.BigDecimal;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTVerifFirmServLotto;
import it.pccube.batchmigration.source.model.FeVerifFirmaServiceLotto;

public class FeVerifFirmaServiceLottoMapper implements ItemProcessor<FeVerifFirmaServiceLotto, FatTVerifFirmServLotto>{

	@Override
	public FatTVerifFirmServLotto process(FeVerifFirmaServiceLotto source) throws Exception {
		FatTVerifFirmServLotto destination = new FatTVerifFirmServLotto();
		
		destination.setIdVerifFirmaServiceLotto(source.getIdVerifFirmaServiceLotto());
		destination.setCdCertSerialNumber(source.getCertSerialNumber());
		if(source.getCertStatus() != null) 
			destination.setCdCertStatus(source.getCertStatus().toString());
		if(source.getCertStatusCode() != null) 
			destination.setCdCertStatusCode(source.getCertStatusCode().toString());
		destination.setCdCrlNumber(source.getCrlNumber());
		destination.setDsCertStatusInfo(source.getCertStatusInfo());
		destination.setDtCertEndDate(source.getCertEndDate());
		destination.setDtCertStartDate(source.getCertStartDate());
		destination.setDtCrlEmissionDate(source.getCrlEmissionDate());
		destination.setNmIssuerDn(source.getIssuerDn());
		destination.setNmSubjectDn(source.getSubjectDn());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		if(source.getCertLevel() != null) 
			destination.setNrCertLevel(BigDecimal.valueOf(source.getCertLevel()));
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		destination.setIdDizTipologiaFirma(source.getTipologiaFirma());
		destination.setIdVerifFirmaLotto(source.getIdVerifFirmaServiceLotto());
		
		return destination;
	}

}
