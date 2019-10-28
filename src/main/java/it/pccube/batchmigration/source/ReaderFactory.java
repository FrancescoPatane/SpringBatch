package it.pccube.batchmigration.source;

import javax.sql.DataSource;

import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.database.builder.JdbcCursorItemReaderBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Component;

import it.pccube.batchmigration.costant.Constants;
import it.pccube.batchmigration.source.model.FeLogErroreBatchDb;
import it.pccube.batchmigration.source.model.FeLogEsecuzioneBatchDb;

@Component
public class ReaderFactory {
	
	@Autowired
	@Qualifier("dbSource")
	private  DataSource dataSource;
	
	
    public JdbcCursorItemReader<FeLogErroreBatchDb> getFeLogErroreBatchDbReader() {
        return new JdbcCursorItemReaderBuilder<FeLogErroreBatchDb>()
                .name("FeLogErroreBatchDbReader")
                .dataSource(this.dataSource)
                .sql(Constants.SELECT_FE_LOG_ERRORE_BATCH_DB)
                .rowMapper(new  BeanPropertyRowMapper<FeLogErroreBatchDb>(FeLogErroreBatchDb.class))
                .build();
    }
    
    public JdbcCursorItemReader<FeLogEsecuzioneBatchDb> getFeLogEsecuzioneBatchDbReader() {
        return new JdbcCursorItemReaderBuilder<FeLogEsecuzioneBatchDb>()
                .name("FeLogEsecuzioneBatchDbReader")
                .dataSource(this.dataSource)
                .sql(Constants.SELECT_FE_LOG_ESECUZIONE_BATCH_DB)
                .rowMapper(new  BeanPropertyRowMapper<FeLogEsecuzioneBatchDb>(FeLogEsecuzioneBatchDb.class))
                .build();
    }

}
