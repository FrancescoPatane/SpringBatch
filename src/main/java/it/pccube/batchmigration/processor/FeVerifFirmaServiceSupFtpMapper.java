package it.pccube.batchmigration.processor;

import java.math.BigDecimal;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTVerFirmServSupFtp;
import it.pccube.batchmigration.source.model.FeVerifFirmaServiceSupFtp;

public class FeVerifFirmaServiceSupFtpMapper implements ItemProcessor<FeVerifFirmaServiceSupFtp, FatTVerFirmServSupFtp>{

	@Override
	public FatTVerFirmServSupFtp process(FeVerifFirmaServiceSupFtp source) throws Exception {
		FatTVerFirmServSupFtp destination = new FatTVerFirmServSupFtp();
		
		destination.setIdVerifFirmaServiceSupFtp(source.getIdVerifFirmaServiceSupFtp());
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
		destination.setIdVerifFirmaSupportoFtp(source.getIdVerifFirmaSupportoFtp());
		destination.setNmIssuerDn(source.getIssuerDn());
		destination.setNmSubjectDn(source.getSubjectDn());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		if(source.getCertLevel() != null)
			destination.setNrCertLevel(BigDecimal.valueOf(source.getCertLevel()));
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		destination.setIdDizTipologiaFirma(source.getTipologiaFirma());
		
		return destination;
	}

}
