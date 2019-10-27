package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTExcelFailValidaz;
import it.pccube.batchmigration.source.model.FeExcelFailValidazione;

public class FeExcelFailValidazioneMapper implements ItemProcessor<FeExcelFailValidazione, FatTExcelFailValidaz>{

	@Override
	public FatTExcelFailValidaz process(FeExcelFailValidazione source) throws Exception {
		FatTExcelFailValidaz destination = new FatTExcelFailValidaz();
		
		destination.setIdExcelFailValidazione(source.getIdExcelFailValidazione());

		destination.setCdColonnaCella(source.getColonnaCella());

		destination.setCdRigaCella(source.getRigaCella());

		destination.setIdDizTipoValidazione(source.getIdDizTipoValidazione());

		destination.setIdRegolaValidazione(source.getIdRegolaValidazione());

		destination.setNmNomeSheet(source.getNomeSheet());

		destination.setNmUtenteInserimento(source.getUseridInserimento());

		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());

		destination.setTsInserimento(source.getTmstInserimento());

		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());

		destination.setIdExcelFattura(source.getIdExcelFattura());
		
		return destination;
	}

}
