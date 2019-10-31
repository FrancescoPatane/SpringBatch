package it.pccube.batchmigration.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.stereotype.Component;

import it.pccube.batchmigration.destination.model.FeLogApplicativoMapper;
import it.pccube.batchmigration.exception.NoProcessorFoundException;

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
			FeDettaglioLineaStoricoMapper feTDettaglioLineaStoricoMapper =  new FeDettaglioLineaStoricoMapper();
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
		case "FeExcelFailValidazione":
			FeExcelFailValidazioneMapper feExcelFailValidazioneMapper =  new FeExcelFailValidazioneMapper();
			mapper =  feExcelFailValidazioneMapper;
			break;
		case "FeExcelFattura":
			FeExcelFatturaMapper feExcelFatturaMapper =  new FeExcelFatturaMapper();
			mapper =  feExcelFatturaMapper;
			break;
		case "FeImpreseCollegAssoc":
			FeImpreseCollegAssocMapper feImpreseCollegAssocMapper =  new FeImpreseCollegAssocMapper();
			mapper =  feImpreseCollegAssocMapper;
			break;
		case "FeIpa":
			FeIpaMapper feIpaMapper =  new FeIpaMapper();
			mapper =  feIpaMapper;
			break;
		case "FeLogApplicativo":
			FeLogApplicativoMapper feLogApplicativoMapper =  new FeLogApplicativoMapper();
			mapper =  feLogApplicativoMapper;
			break;
		case "FeLogErroreBatchDb":
			FeLogErroreBatchDbMapper feLogErroreBatchDbMapper =  new FeLogErroreBatchDbMapper();
			mapper =  feLogErroreBatchDbMapper;
			break;
		case "FeLogEsecuzioneBatchDb":
			FeLogEsecuzioneBatchDbMapper feLogEsecuzioneBatchDbMapper =  new FeLogEsecuzioneBatchDbMapper();
			mapper =  feLogEsecuzioneBatchDbMapper;
			break;
		case "FeLottoRichiestaEstrUff":
			FeLottoRichiestaEstrUffMapper feLottoRichiestaEstrUffMapper =  new FeLottoRichiestaEstrUffMapper();
			mapper =  feLottoRichiestaEstrUffMapper;
			break;	
		case "FeLottoSupportoFtp":
			FeLottoSupportoFtpMapper feLottoSupportoFtpMapper =  new FeLottoSupportoFtpMapper();
			mapper =  feLottoSupportoFtpMapper;
			break;		
		case "FeMail":
			FeMailMapper feMailMapper =  new FeMailMapper();
			mapper =  feMailMapper;
			break;	
		case "FeMonitoraggioInvioSdi":
			FeMonitoraggioInvioSdiMapper feMonitoraggioInvioSdiMapper =  new FeMonitoraggioInvioSdiMapper();
			mapper =  feMonitoraggioInvioSdiMapper;
			break;
		case "FeNotifica":
			FeNotificaMapper feNotificaMapper =  new FeNotificaMapper();
			mapper =  feNotificaMapper;
			break;	
		case "FeNotificaSupportoFtp":
			FeNotificaSupportoFtpMapper feNotificaSupportoFtpMapper =  new FeNotificaSupportoFtpMapper();
			mapper =  feNotificaSupportoFtpMapper;
			break;		
		case "FeReportSdi":
			FeReportSdiMapper feReportSdiMapper =  new FeReportSdiMapper();
			mapper =  feReportSdiMapper;
			break;	
		case "FeReportSsaInviiSdi":
			FeReportSsaInviiSdiMapper feReportSsaInviiSdiMapper =  new FeReportSsaInviiSdiMapper();
			mapper =  feReportSsaInviiSdiMapper;
			break;	
		case "FeReportSsaStatoAde":
			FeReportSsaStatoAdeMapper feReportSsaStatoAdeMapper =  new FeReportSsaStatoAdeMapper();
			mapper =  feReportSsaStatoAdeMapper;
			break;	
		case "FeRicImprontaArchivio":
			FeRicImprontaArchivioMapper feRicImprontaArchivioMapper =  new FeRicImprontaArchivioMapper();
			mapper =  feRicImprontaArchivioMapper;
			break;	
		case "FeRicProtocolloImpronta":
			FeRicProtocolloImprontaMapper feRicProtocolloImprontaMapper =  new FeRicProtocolloImprontaMapper();
			mapper =  feRicProtocolloImprontaMapper;
			break;	
		case "FeRiferimentoLinea":
			FeRiferimentoLineaMapper feRiferimentoLineaMapper =  new FeRiferimentoLineaMapper();
			mapper =  feRiferimentoLineaMapper;
			break;	
		case "FeRiferimentoLineaStorico":
			FeRiferimentoLineaStoricoMapper feRiferimentoLineaStoricoMapper =  new FeRiferimentoLineaStoricoMapper();
			mapper =  feRiferimentoLineaStoricoMapper;
			break;	
		case "FeScontoMaggiorazione":
			FeScontoMaggiorazioneMapper feScontoMaggiorazioneMapper =  new FeScontoMaggiorazioneMapper();
			mapper =  feScontoMaggiorazioneMapper;
			break;	
		case "FeScontoMagStorico":
			FeScontoMagStoricoMapper feScontoMagStoricoMapper =  new FeScontoMagStoricoMapper();
			mapper =  feScontoMagStoricoMapper;
			break;	
		case "FeFatturaInz":
			FeFatturaInzMapper feFatturaInzMapper =  new FeFatturaInzMapper();
			mapper =  feFatturaInzMapper;
			break;	
		case "FeFatturaInzStorico":
			FeFatturaInzStoricoMapper feFatturaInzStoricoMapper =  new FeFatturaInzStoricoMapper();
			mapper =  feFatturaInzStoricoMapper;
			break;	
		case "FeStatoExcelFattura":
			FeStatoExcelFatturaMapper feStatoExcelFatturaMapper =  new FeStatoExcelFatturaMapper();
			mapper =  feStatoExcelFatturaMapper;
			break;
		case "FeStatoEsitoFtp":
			FeStatoEsitoFtpMapper feStatoEsitoFtpMapper =  new FeStatoEsitoFtpMapper();
			mapper =  feStatoEsitoFtpMapper;
			break;
		case "FeStatoSupportoFtp":
			FeStatoSupportoFtpMapper feStatoSupportoFtpMapper =  new FeStatoSupportoFtpMapper();
			mapper =  feStatoSupportoFtpMapper;
			break;
		case "FeStatoLottoFattura":
			FeStatoLottoFatturaMapper feStatoLottoFatturaMapper =  new FeStatoLottoFatturaMapper();
			mapper =  feStatoLottoFatturaMapper;
			break;
		case "FeVerifFirmaAde":
			FeVerifFirmaAdeMapper feVerifFirmaAdeMapper =  new FeVerifFirmaAdeMapper();
			mapper =  feVerifFirmaAdeMapper;
			break;
		case "FeSupportoFtp":
			FeSupportoFtpMapper feSupportoFtpMapper =  new FeSupportoFtpMapper();
			mapper =  feSupportoFtpMapper;
			break;
		case "FeVerifFirmaEsitoFtp":
			FeVerifFirmaEsitoFtpMapper fFeVerifFirmaEsitoFtpMapper =  new FeVerifFirmaEsitoFtpMapper();
			mapper =  fFeVerifFirmaEsitoFtpMapper;
			break;
		case "FeVerifFirmaLotto":
			FeVerifFirmaLottoMapper feVerifFirmaLottoMapper =  new FeVerifFirmaLottoMapper();
			mapper =  feVerifFirmaLottoMapper;
			break;
		case "FeVerifFirmaNotifica":
			FeVerifFirmaNotificaMapper feVerifFirmaNotificaMapper =  new FeVerifFirmaNotificaMapper();
			mapper =  feVerifFirmaNotificaMapper;
			break;
		case "FeVerifFirmaServiceEsiFtp":
			FeVerifFirmaServiceEsiFtpMapper feVerifFirmaServiceEsiFtpMapper =  new FeVerifFirmaServiceEsiFtpMapper();
			mapper =  feVerifFirmaServiceEsiFtpMapper;
			break;
		case "FeVerifFirmaServiceAde":
			FeVerifFirmaServiceAdeMapper feVerifFirmaServiceAdeMapper =  new FeVerifFirmaServiceAdeMapper();
			mapper =  feVerifFirmaServiceAdeMapper;
			break;
		default:
			throw new NoProcessorFoundException("No processor found for entity " + srcModelClassName);
		}
		return mapper;
	}


}
