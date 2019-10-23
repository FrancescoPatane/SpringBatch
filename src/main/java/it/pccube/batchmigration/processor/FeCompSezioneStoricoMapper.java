package it.pccube.batchmigration.processor;

import java.math.BigDecimal;

import org.springframework.batch.item.ItemProcessor;

import it.pccube.batchmigration.destination.model.FatTCompSezioneStor;
import it.pccube.batchmigration.source.model.FeCompSezioneStorico;

public class FeCompSezioneStoricoMapper implements ItemProcessor<FeCompSezioneStorico, FatTCompSezioneStor>{

	@Override
	public FatTCompSezioneStor process(FeCompSezioneStorico source) throws Exception {
		FatTCompSezioneStor destination = new FatTCompSezioneStor();
		destination.setIdCompSezioneStor(source.getIdCompSezioneStorico());
		destination.setIdCompilazioneSezione(source.getIdCompilazioneSezione());
		destination.setIdConfigMacrosezApp(source.getIdConfigMacroSezApp());
		destination.setIdDettaglioLinea(source.getIdDettaglioLinea());
		destination.setIdDettaglioLineaStor(source.getIdDettaglioLineaStorico());
		destination.setIdDizStatoCompilazione(source.getStatoCompilazione());
		destination.setIdFattura(source.getIdFattura());
		destination.setIdFatturaStor(source.getIdFatturaStorico());
		destination.setIdLotto(source.getIdLotto());
		destination.setNmUtenteInserimento(source.getUseridInserimento());
		destination.setNmUtenteUltimaModifica(source.getUseridUltimoAggiornamento());
		destination.setTsInserimento(source.getTmstInserimento());
		destination.setTsUltimaModifica(source.getTmstUltimoAggiornamento());
		if(source.getVersioneLotto()!=null)
			destination.setPgVersioneLotto(BigDecimal.valueOf(source.getVersioneLotto()));
		return destination;
	}
}
