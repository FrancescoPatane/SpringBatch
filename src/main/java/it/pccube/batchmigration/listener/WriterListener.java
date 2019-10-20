package it.pccube.batchmigration.listener;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ItemWriteListener;

import it.pccube.batchmigration.destination.model.ModelEntity;

public class WriterListener implements ItemWriteListener<ModelEntity>{
	
	public static final Logger logger = LoggerFactory.getLogger(WriterListener.class);

	@Override
	public void beforeWrite(List<? extends ModelEntity> items) {
		StringBuilder sb = new StringBuilder("Writing entities: [");
		for (ModelEntity e : items) {
			sb.append(e.getTableName());
			sb.append(" PK: ");
			sb.append(e.getPKDescription());
			sb.append(" ");
		}
		sb.append("]");
		logger.info(sb.toString());
	}

	@Override
	public void afterWrite(List<? extends ModelEntity> items) {
		StringBuilder sb = new StringBuilder("Persisted entities: [");
		for (ModelEntity e : items) {
			sb.append(e.getTableName());
			sb.append(" PK: ");
			sb.append(e.getPKDescription());
			sb.append(" ");
		}
		sb.append("]");
		logger.info(sb.toString());
	}

	@Override
	public void onWriteError(Exception exception, List<? extends ModelEntity> items) {
		// TODO Auto-generated method stub
		
	}

}
