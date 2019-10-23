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
	        .add(flowLotto(), flowFattura(), flowAdesione(), flowAllegato(), flowAltroDatoGestionale(), flowArchivio())
	        .build();
	}
	
	public Flow flowAllegato() {
	    return new FlowBuilder<SimpleFlow>("flowAllegato")
	        .start(this.stepFactory.migrateFeAllegato())
	        .next(this.stepFactory.migrateFeAllegatoStorico())
	        .build();
	}
	
	public Flow flowAltroDatoGestionale() {
	    return new FlowBuilder<SimpleFlow>("flowAltroDatoGestionale")
	        .start(this.stepFactory.migrateFeAltroDatoGestionale())
	        .next(this.stepFactory.migrateFeAltroDatoGestStorico())
	        .build();
	}
	
	
	public Flow flowAdesione() {
	    return new FlowBuilder<SimpleFlow>("flowAdesione")
	        .start(this.stepFactory.migrateFeAdesione())
	        .next(this.stepFactory.migrateFeAdesioneNotifica())
	        .build();
	}
	
	
	public Flow flowLotto() {
	    return new FlowBuilder<SimpleFlow>("flowLotto")
	        .start(this.stepFactory.migrateFeLotto())
	        .next(this.stepFactory.migrateFeLottoStorico())
	        .build();
	}
	
	public Flow flowFattura() {
	    return new FlowBuilder<SimpleFlow>("flowFattura")
	        .start(this.stepFactory.migrateFeFattura())
	        .next(this.stepFactory.migrateFeFatturaStorico())
	        .next(this.stepFactory.migrateFeCausaleFattura())
	        .next(this.stepFactory.migrateFeCausaleFatturaStorico())
	        .build();
	}
	
	public Flow flowArchivio() {
	    return new FlowBuilder<SimpleFlow>("flowArchivio")
	        .start(this.stepFactory.migrateFeArchivio())
	        .build();
	}
	

}
