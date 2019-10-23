package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.stereotype.Component;

import it.pccube.batchmigration.exception.NoProcessorFoundException;
import it.pccube.batchmigration.source.model.FeAltroDatoGestionale;

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
		case "FeAllegato":
			FeAllegatoMapper feAllegatoMapper =  new FeAllegatoMapper();
			this.beanFactory.autowireBean(feAllegatoMapper);
			mapper =  feAllegatoMapper;
			break;
		case "FeAllegatoStorico":
			FeAllegatoStoricoMapper feAllegatoStoricoMapper =  new FeAllegatoStoricoMapper();
			this.beanFactory.autowireBean(feAllegatoStoricoMapper);
			mapper =  feAllegatoStoricoMapper;
			break;
		case "FeAltroDatoGestionale":
			FeAltroDatoGestionaleMapper feAltroDatoGestionaleMapper =  new FeAltroDatoGestionaleMapper();
			mapper =  feAltroDatoGestionaleMapper;
			break;
		case "FeAdesione":
			FeAdesioneMapper fAdesioneMapper =  new FeAdesioneMapper();
			mapper =  fAdesioneMapper;
			break;
		case "FeAdesioneNotifica":
			FeAdesioneNotificaMapper feAdesioneNotificaMapper =  new FeAdesioneNotificaMapper();
			mapper =  feAdesioneNotificaMapper;
			break;
		case "FeAltroDatoGestStorico":
			FeAltroDatoGestionaleStoricoMapper feAltroDatoGestionaleStoricoMapper =  new FeAltroDatoGestionaleStoricoMapper();
			mapper =  feAltroDatoGestionaleStoricoMapper;
			break;
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
		case "FeArchivio":
			FeArchivioMapper feArchivioMapper =  new FeArchivioMapper();
			this.beanFactory.autowireBean(feArchivioMapper);
			mapper =  feArchivioMapper;
			break;
		default:
			throw new NoProcessorFoundException("No processor found for entity" + srcModelClassName);
		}
		return mapper;
	}



}
