package it.pccube.batchmigration.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ItemProcessListener;

import it.pccube.batchmigration.model.ModelEntity;

public class ProcessListener implements ItemProcessListener<ModelEntity, ModelEntity> {

	public static final Logger logger = LoggerFactory.getLogger(ProcessListener.class);
	
	@Override
	public void beforeProcess(ModelEntity item) {
		logger.info("About to map entity " + item.getTableName() + " with PK: " + item.getPKDescription());
	}

	@Override
	public void afterProcess(ModelEntity item, ModelEntity result) {
		logger.info("Mapping into " + item.getClass().getSimpleName() + " completed successfully");
	}

	@Override
	public void onProcessError(ModelEntity item, Exception e) {
		logger.error("Error mapping entity "  + item.getTableName() + " with PK: " + item.getPKDescription());
		logger.error(e.getMessage(), e);
		
	}



}
