package it.pccube.batchmigration.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;

public class ExecutionListener implements StepExecutionListener {
	
	public static final Logger logger = LoggerFactory.getLogger(ProcessListener.class);

	@Override
	public void beforeStep(StepExecution stepExecution) {
		logger.info("Begin step " + stepExecution.getStepName());
		
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		logger.info("End step " + stepExecution.getStepName() + " with exit status " + stepExecution.getStatus());
		return null;
	}

}
