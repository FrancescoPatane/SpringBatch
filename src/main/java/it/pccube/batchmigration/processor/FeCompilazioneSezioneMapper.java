package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTCompilazioneSezione;
import it.pccube.batchmigration.source.model.FeCompilazioneSezione;

public class FeCompilazioneSezioneMapper implements ItemProcessor<FeCompilazioneSezione, FatTCompilazioneSezione>{

	@Override
	public FatTCompilazioneSezione process(FeCompilazioneSezione source) throws Exception {
		FatTCompilazioneSezione destination = new FatTCompilazioneSezione();
		destination.setIdCompilazioneSezione(source.getIdCompilazioneSezione());
		destination.setIdConfigMacrosezApp(source.getIdConfigMacrosezApp());
		destination.setIdDettaglioLinea(source.getIdDettaglioLinea());
		destination.setIdDizStatoCompilazione(source.getStatoCompilazione());
		destination.setIdFattura(source.getIdFattura());
		destination.setIdLotto(source.getIdLotto());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		return destination;
	}
	
	

}
