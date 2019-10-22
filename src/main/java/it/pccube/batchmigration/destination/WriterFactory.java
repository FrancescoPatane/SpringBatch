package it.pccube.batchmigration.destination;

import javax.sql.DataSource;

import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import it.pccube.batchmigration.destination.model.FatTAdesione;
import it.pccube.batchmigration.destination.model.FatTCausaleFattura;
import it.pccube.batchmigration.destination.model.FatTCausaleFatturaStor;
import it.pccube.batchmigration.destination.model.FatTFattura;
import it.pccube.batchmigration.destination.model.FatTFatturaStor;
import it.pccube.batchmigration.destination.model.FatTLotto;
import it.pccube.batchmigration.destination.model.FatTLottoStor;
import it.pccube.batchmigration.source.model.FeAdesione;

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
		}
		return query;
	}
}


