package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class ProcessorFactory {

	private final AutowireCapableBeanFactory beanFactory;

	@Autowired
	public ProcessorFactory(AutowireCapableBeanFactory beanFactory){
		this.beanFactory = beanFactory;
	}
	
	@SuppressWarnings("rawtypes")
	public  ItemProcessor getProcessor(Class sourceClass) {
		ItemProcessor  mapper= null;
		String srcModelClassName = sourceClass.getSimpleName();
		switch(srcModelClassName) {
		case "FeLotto":
			FeLottoMapper feLottoMapper =  new FeLottoMapper();
			this.beanFactory.autowireBean(feLottoMapper);
			mapper =  feLottoMapper;
			break;
		case "FeLottoStorico":
			FeLottoStoricoMapper feLottoStoricoMapper =  new FeLottoStoricoMapper();
			this.beanFactory.autowireBean(feLottoStoricoMapper);
			mapper =  feLottoStoricoMapper;
			break;
		case "FeFattura":
			FeFatturaMapper feFatturaMapper =  new FeFatturaMapper();
			this.beanFactory.autowireBean(feFatturaMapper);
			mapper =  feFatturaMapper;
			break;
		case "FeFatturaStorico":
			FeFatturaStoricoMapper feFatturaStoricoMapper =  new FeFatturaStoricoMapper();
			this.beanFactory.autowireBean(feFatturaStoricoMapper);
			mapper =  feFatturaStoricoMapper;
			break;
		case "FeCausaleFattura":
			FeCausaleFatturaMapper feCausaleFatturaMapper =  new FeCausaleFatturaMapper();
			mapper =  feCausaleFatturaMapper;
			break;
		case "FeCausaleFatturaStorico":
			FeCausaleFatturaStoricoMapper fecausaleFatturaStoricoMapper =  new FeCausaleFatturaStoricoMapper();
			mapper =  fecausaleFatturaStoricoMapper;
			break;
			
		}
		return mapper;
	}



}
