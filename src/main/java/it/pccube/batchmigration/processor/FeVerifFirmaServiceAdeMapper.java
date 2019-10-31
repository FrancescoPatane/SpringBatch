package it.pccube.batchmigration.processor;

import java.math.BigDecimal;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTVerifFirmaServAde;
import it.pccube.batchmigration.source.model.FeVerifFirmaServiceAde;

public class FeVerifFirmaServiceAdeMapper implements ItemProcessor<FeVerifFirmaServiceAde, FatTVerifFirmaServAde> {

	@Override
	public FatTVerifFirmaServAde process(FeVerifFirmaServiceAde source) throws Exception {
		FatTVerifFirmaServAde destination = new FatTVerifFirmaServAde();
		
		destination.setIdVerifFirmaServiceAde(source.getIdVerifFirmaServiceAde());
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
		destination.setIdVerifFirmaAde(source.getIdVerificaFirmaAde());
		destination.setIdDizTipologiaFirma(source.getTipologiaFirma());
		
		return destination;
	}
	
	

}
