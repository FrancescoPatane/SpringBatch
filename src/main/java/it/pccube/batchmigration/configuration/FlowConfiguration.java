package it.pccube.batchmigration.configuration;

import org.springframework.batch.core.job.builder.FlowBuilder;
import org.springframework.batch.core.job.flow.Flow;
import org.springframework.batch.core.job.flow.support.SimpleFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Component;

@Component
public class FlowConfiguration {
	
	@Autowired
	StepFactory stepFactory;
	
	
	public TaskExecutor taskExecutor(){
	    return new SimpleAsyncTaskExecutor("spring_batch");
	}
	
	
	public Flow splitFlow() {
	    return new FlowBuilder<SimpleFlow>("splitFlow")
	        .split(taskExecutor())
	        .add(flowLotto(), flowFattura())
	        .build();
	}
	
	
	public Flow flowLotto() {
	    return new FlowBuilder<SimpleFlow>("flowLotto")
	        .start(this.stepFactory.migrateFeLotto())
	        .build();
	}
	
	public Flow flowFattura() {
	    return new FlowBuilder<SimpleFlow>("flowFattura")
	        .start(this.stepFactory.migrateFeFattura())
	        .next(this.stepFactory.migrateFeCausaleFattura())
	        .next(this.stepFactory.migrateFeCausaleFatturaStorico())
	        .build();
	}
	

}
