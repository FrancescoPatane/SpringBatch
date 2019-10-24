package it.pccube.batchmigration.destination;

import javax.sql.DataSource;

import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import it.pccube.batchmigration.destination.model.FatAStatoAdesione;
import it.pccube.batchmigration.destination.model.FatAStatoArchivio;
import it.pccube.batchmigration.destination.model.FatTAdesione;
import it.pccube.batchmigration.destination.model.FatTAdesioneNotifica;
import it.pccube.batchmigration.destination.model.FatTAllegato;
import it.pccube.batchmigration.destination.model.FatTAllegatoStor;
import it.pccube.batchmigration.destination.model.FatTAltroDatoGestStor;
import it.pccube.batchmigration.destination.model.FatTAltroDatoGestionale;
import it.pccube.batchmigration.destination.model.FatTArchivio;
import it.pccube.batchmigration.destination.model.FatTArticolo;
import it.pccube.batchmigration.destination.model.FatTArticoloStor;
import it.pccube.batchmigration.destination.model.FatTCausaleFattura;
import it.pccube.batchmigration.destination.model.FatTCausaleFatturaStor;
import it.pccube.batchmigration.destination.model.FatTCompSezioneStor;
import it.pccube.batchmigration.destination.model.FatTCompilazioneSezione;
import it.pccube.batchmigration.destination.model.FatTConservAutoreLotto;
import it.pccube.batchmigration.destination.model.FatTDatiCassaPrevStor;
import it.pccube.batchmigration.destination.model.FatTDatiCassaPrevidenz;
import it.pccube.batchmigration.destination.model.FatTEsitoVerifFirmaCfg;
import it.pccube.batchmigration.destination.model.FatTFattura;
import it.pccube.batchmigration.destination.model.FatTFatturaStor;
import it.pccube.batchmigration.destination.model.FatTFoglioStileCfg;
import it.pccube.batchmigration.destination.model.FatTGeneraleCfg;
import it.pccube.batchmigration.destination.model.FatTLotto;
import it.pccube.batchmigration.destination.model.FatTLottoStor;
import it.pccube.batchmigration.destination.model.FatTMacrosezAppCfg;
import it.pccube.batchmigration.destination.model.FatTXsdCampoCfg;
import it.pccube.batchmigration.destination.model.FatTXsdSezioneCfg;
import it.pccube.batchmigration.exception.NoWriterFoundException;

@Component
public class WriterFactory {

	@Autowired
	@Qualifier("dbDestination")
	private  DataSource dbDestination;

	public <T> JdbcBatchItemWriter<T> getWriter(Class<T> clazz){
		JdbcBatchItemWriter<T> writer = new JdbcBatchItemWriter<>();
		writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<T>());
		writer.setSql(this.getQuery(clazz));
		writer.setDataSource(this.dbDestination);
		writer.afterPropertiesSet();
		return writer;
	}


	private <T> String getQuery(Class<T> clazz) {
		String query = null;
		String modelClassName = clazz.getSimpleName();
		switch(modelClassName) {
		case "FatTAdesione":
			query = FatTAdesione.INSERT_QUERY;
			break;
		case "FatTAdesioneNotifica":
			query = FatTAdesioneNotifica.INSERT_QUERY;
			break;
		case "FatTAllegato":
			query = FatTAllegato.INSERT_QUERY;
			break;
		case "FatTAllegatoStor":
			query = FatTAllegatoStor.INSERT_QUERY;
			break;
		case "FatTAltroDatoGestionale":
			query = FatTAltroDatoGestionale.INSERT_QUERY;
			break;
		case "FatTAltroDatoGestStor":
			query = FatTAltroDatoGestStor.INSERT_QUERY;
			break;
		case "FatTLotto":
			query = FatTLotto.INSERT_QUERY;
			break;
		case "FatTLottoStor":
			query = FatTLottoStor.INSERT_QUERY;
			break;
		case "FatTFattura":
			query = FatTFattura.INSERT_QUERY;
			break;
		case "FatTFatturaStor":
			query = FatTFatturaStor.INSERT_QUERY;
			break;	
		case "FatTCausaleFattura":
			query = FatTCausaleFattura.INSERT_QUERY;
			break;
		case "FatTCausaleFatturaStor":
			query = FatTCausaleFatturaStor.INSERT_QUERY;
			break;
		case "FatTArchivio":
			query = FatTArchivio.INSERT_QUERY;
			break;
		case "FatTArticolo":
			query = FatTArticolo.INSERT_QUERY;
			break;
		case "FatTArticoloStor":
			query = FatTArticoloStor.INSERT_QUERY;
			break;
		case "FatAStatoAdesione":
			query = FatAStatoAdesione.INSERT_QUERY;
			break;
		case "FatAStatoArchivio":
			query = FatAStatoArchivio.INSERT_QUERY;
			break;
		case "FatTCompilazioneSezione":
			query = FatTCompilazioneSezione.INSERT_QUERY;
			break;
		case "FatTCompSezioneStor":
			query = FatTCompSezioneStor.INSERT_QUERY;
			break;
		case "FatTEsitoVerifFirmaCfg":
			query = FatTEsitoVerifFirmaCfg.INSERT_QUERY;
			break;
		case "FatTFoglioStileCfg":
			query = FatTFoglioStileCfg.INSERT_QUERY;
			break;
		case "FatTGeneraleCfg":
			query = FatTGeneraleCfg.INSERT_QUERY;
			break;
		case "FatTMacrosezAppCfg":
			query = FatTMacrosezAppCfg.INSERT_QUERY;
			break;
		case "FatTXsdSezioneCfg":
			query = FatTXsdSezioneCfg.INSERT_QUERY;
			break;
		case "FatTXsdCampoCfg":
			query = FatTXsdCampoCfg.INSERT_QUERY;
			break;
		case "FatTConservAutoreLotto":
			query = FatTConservAutoreLotto.INSERT_QUERY;
			break;
		case "FatTDatiCassaPrevidenz":
			query = FatTDatiCassaPrevidenz.INSERT_QUERY;
			break;
		case "FatTDatiCassaPrevStor":
			query = FatTDatiCassaPrevStor.INSERT_QUERY;
			break;
		default:
			throw new NoWriterFoundException("No writer found for entity " + modelClassName);
		}
		return query;
	}
}


