package it.pccube.batchmigration.destination;

import javax.sql.DataSource;

import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import it.pccube.batchmigration.destination.sql.InsertQuery;

@Component
public class WriterFactory {
	
	@Autowired
	@Qualifier("dbDestination")
	private  DataSource dbDestination;
	
	public <T> JdbcBatchItemWriter<T> getWriter(Class<T> clazz){
		JdbcBatchItemWriter<T> writer = new JdbcBatchItemWriter<>();
		writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<T>());
		writer.setSql(InsertQuery.INSERT_FAT_T_LOTTO);
//		writer.setSql("INSERT INTO FAT_T_LOTTO (id_lotto, cd_codice_fiscale_terzo_int, cd_codice_rap_fiscale) VALUES (:idLotto, :cdCodiceFiscaleTerzoInt, :cdCodiceRapFiscale)");

		writer.setDataSource(this.dbDestination);
		writer.afterPropertiesSet();
		return writer;
	}
	
//	public  JdbcBatchItemWriter<FatTLotto> getWriter(){
//		return new JdbcBatchItemWriterBuilder<FatTLotto>()
//	            .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<FatTLotto>())
//	            .sql("INSERT INTO FAT_T_LOTTO (id_lotto) VALUES (:idLotto)")
//	            .dataSource(this.dbDestination)
//	            .build();
//		JdbcBatchItemWriter<FatTLotto> writer = new JdbcBatchItemWriter<>();
//		writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<FatTLotto>());
//		writer.setSql("INSERT INTO FAT_T_LOTTO (id_lotto) VALUES (:idLotto)");
//		writer.setDataSource(this.dbDestination);
//
//		writer.afterPropertiesSet();
//		return writer;
//	}

}
