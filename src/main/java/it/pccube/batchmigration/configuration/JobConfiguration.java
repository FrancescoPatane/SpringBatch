package it.pccube.batchmigration.configuration;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JobConfiguration {
	
	
	@Autowired
	private  JobBuilderFactory jobBuilderFactory;
	
	
	@Autowired
	StepFactory stepFactory;
	
	@Autowired
	private FlowConfiguration flowProvider;

	
    @Bean
    public Job migration() {
        return jobBuilderFactory.get("migration")
        		.start(this.stepFactory.migrateFeImpreseCollegAssoc())
//				.next(this.stepFactory.migrateFeDettaglioPagStorico())
                .build();
//        return jobBuilderFactory.get("migration")
//                .start(flowProvider.splitFlow())
//                .build()
//                .build();
    }
    
    


}
