package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.stereotype.Component;

import it.pccube.batchmigration.exception.NoProcessorFoundException;
import it.pccube.batchmigration.source.model.FeCompilazioneSezione;

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
		case "FeArticolo":
			FeArticoloMapper feArticoloMapper =  new FeArticoloMapper();
			mapper =  feArticoloMapper;
			break;
		case "FeArticoloStorico":
			FeArticoloStoricoMapper feArticoloStoricoMapper =  new FeArticoloStoricoMapper();
			mapper =  feArticoloStoricoMapper;
			break;
		case "FeStatoAdesione":
			FeStatoAdesioneMapper feStatoAdesioneMapper =  new FeStatoAdesioneMapper();
			mapper =  feStatoAdesioneMapper;
			break;
		case "FeStatoArchivio":
			FeStatoArchivioMapper feStatoArchivioMapper =  new FeStatoArchivioMapper();
			mapper =  feStatoArchivioMapper;
			break;
		case "FeCompilazioneSezione":
			FeCompilazioneSezioneMapper feCompilazioneSezioneMapper =  new FeCompilazioneSezioneMapper();
			mapper =  feCompilazioneSezioneMapper;
			break;
		case "FeCompSezioneStorico":
			FeCompSezioneStoricoMapper feCompSezioneStoricoMapper =  new FeCompSezioneStoricoMapper();
			mapper =  feCompSezioneStoricoMapper;
			break;
		case "FeConfigFoglioStile":
			FeConfigFoglioStileMapper feConfigFoglioStileMapper =  new FeConfigFoglioStileMapper();
			mapper =  feConfigFoglioStileMapper;
			break;
		case "FeConfigEsitoVerifFirma":
			FeConfigEsitoVerifFirmaMapper feConfigEsitoVerifFirmaMapper =  new FeConfigEsitoVerifFirmaMapper();
			this.beanFactory.autowireBean(feConfigEsitoVerifFirmaMapper);
			mapper =  feConfigEsitoVerifFirmaMapper;
			break;
		case "FeConfigGenerale":
			FeConfigGeneraleMapper feConfigGeneraleMapper =  new FeConfigGeneraleMapper();
			this.beanFactory.autowireBean(feConfigGeneraleMapper);
			mapper =  feConfigGeneraleMapper;
			break;		
		case "FeConfigMacrosezApp":
			FeConfigMacrosezAppMapper feConfigMacrosezAppMapper =  new FeConfigMacrosezAppMapper();
			mapper =  feConfigMacrosezAppMapper;
			break;
		case "FeConfigXsdSezione":
			FeConfigXsdSezioneMapper feConfigXsdSezioneMapper =  new FeConfigXsdSezioneMapper();
			mapper =  feConfigXsdSezioneMapper;
			break;
		case "FeConfigXsdCampo":
			FeConfigXsdCampoMapper feConfigXsdCampoMapper =  new FeConfigXsdCampoMapper();
			mapper =  feConfigXsdCampoMapper;
			break;
		case "FeConservazAutoreLotto":
			FeConservazAutoreLottoMapper feConservazAutoreLottoMapper =  new FeConservazAutoreLottoMapper();
			mapper =  feConservazAutoreLottoMapper;
			break;
		case "FeDatiCassaPrevidenziale":
			FeDatiCassaPrevidenzialeMapper feDatiCassaPrevidenzialeMapper =  new FeDatiCassaPrevidenzialeMapper();
			mapper =  feDatiCassaPrevidenzialeMapper;
			break;
		case "FeDatiCassaPrevStorico":
			FeDatiCassaPrevStoricoMapper feDatiCassaPrevStoricoMapper =  new FeDatiCassaPrevStoricoMapper();
			mapper =  feDatiCassaPrevStoricoMapper;
			break;
		case "FeDatiDdt":
			FeDatiDdtMapper feDatiDdtMapper =  new FeDatiDdtMapper();
			mapper =  feDatiDdtMapper;
			break;
		case "FeDatiDdtStorico":
			FeDatiDdtStoricoMapper feDatiDdtStoricoMapper =  new FeDatiDdtStoricoMapper();
			mapper =  feDatiDdtStoricoMapper;
			break;
		case "FeDatiPagamento":
			FeDatiPagamentoMapper feDatiPagamentoMapper =  new FeDatiPagamentoMapper();
			mapper =  feDatiPagamentoMapper;
			break;
		case "FeDatiPagamentoStorico":
			FeDatiPagamentoStoricoMapper feDatiPagamentoStoricoMapper =  new FeDatiPagamentoStoricoMapper();
			mapper =  feDatiPagamentoStoricoMapper;
			break;
		case "FeDatiRiepilogo":
			FeDatiRiepilogoMapper feDatiRiepilogoMapper =  new FeDatiRiepilogoMapper();
			mapper =  feDatiRiepilogoMapper;
			break;
		case "FeDatiRiepilogoStorico":
			FeDatiRiepilogoStoricoMapper feDatiRiepilogoStoricoMapper =  new FeDatiRiepilogoStoricoMapper();
			mapper =  feDatiRiepilogoStoricoMapper;
			break;
		case "FeDatiRiferimento":
			FeDatiRiferimentoMapper feDatiRiferimentoMapper =  new FeDatiRiferimentoMapper();
			mapper =  feDatiRiferimentoMapper;
			break;
		case "FeDatiRiferimentoStorico":
			FeDatiRiferimentoStoricoMapper feDatiRiferimentoStoricoMapper =  new FeDatiRiferimentoStoricoMapper();
			mapper =  feDatiRiferimentoStoricoMapper;
			break;
		case "FeDatiSal":
			FeDatiSalMapper feDatiSalMapper =  new FeDatiSalMapper();
			mapper =  feDatiSalMapper;
			break;
		case "FeDatiSalStorico":
			FeDatiSalStoricoMapper feDatiSalStoricoMapper =  new FeDatiSalStoricoMapper();
			mapper =  feDatiSalStoricoMapper;
			break;
		case "FeDettaglioLinea":
			FeDettaglioLineaMapper feDettaglioLineaMapper =  new FeDettaglioLineaMapper();
			mapper =  feDettaglioLineaMapper;
			break;
		case "FeDettaglioLineaStorico":
			FeTDettaglioLineaStoricoMapper feTDettaglioLineaStoricoMapper =  new FeTDettaglioLineaStoricoMapper();
			mapper =  feTDettaglioLineaStoricoMapper;
			break;
		case "FeDettaglioPagamento":
			FeDettaglioPagamentoMapper feDettaglioPagamentoMapper =  new FeDettaglioPagamentoMapper();
			mapper =  feDettaglioPagamentoMapper;
			break;
		case "FeDettaglioPagStorico":
			FeDettaglioPagStoricoMapper feDettaglioPagStoricoMapper =  new FeDettaglioPagStoricoMapper();
			mapper =  feDettaglioPagStoricoMapper;
			break;
		case "FeErroreNotifica":
			FeErroreNotificaMapper feErroreNotificaMapper =  new FeErroreNotificaMapper();
			mapper =  feErroreNotificaMapper;
			break;
		case "FeEsitoFtp":
			FeEsitoFtpMapper feEsitoFtpMapper =  new FeEsitoFtpMapper();
			mapper =  feEsitoFtpMapper;
			break;
		default:
			throw new NoProcessorFoundException("No processor found for entity " + srcModelClassName);
		}
		return mapper;
	}


}
