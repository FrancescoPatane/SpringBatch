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
				.add(flowLotto(), flowFattura(), flowAdesione(), flowAllegato(), flowAltroDatoGestionale(), flowArchivio(), flowLogReport(),
						flowArticolo(), flowCompilazioneSezione(), flowTabelleStato(), flowCompilazioneConfig(), flowDatiDettagli(), flowDatiConfig())
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
				.next(this.stepFactory.migrateFeConservazAutoreLotto())
				.next(this.stepFactory.migrateFeLottoRichiestaEstrUff())
				.build();
	}

	public Flow flowFattura() {
		return new FlowBuilder<SimpleFlow>("flowFattura")
				.start(this.stepFactory.migrateFeFattura())
				.next(this.stepFactory.migrateFeFatturaStorico())
				.next(this.stepFactory.migrateFeCausaleFattura())
				.next(this.stepFactory.migrateFeCausaleFatturaStorico())
				.next(this.stepFactory.migrateFeExcelFattura())
				.next(this.stepFactory.migrateFeExcelFailValidazione())
				.build();
	}

	public Flow flowArchivio() {
		return new FlowBuilder<SimpleFlow>("flowArchivio")
				.start(this.stepFactory.migrateFeArchivio())
				.build();
	}

	public Flow flowArticolo() {
		return new FlowBuilder<SimpleFlow>("flowArticolo")
				.start(this.stepFactory.migrateFeArticolo())
				.next(this.stepFactory.migrateFeArticoloStorico())
				.build();
	}

	public Flow flowTabelleStato() {
		return new FlowBuilder<SimpleFlow>("flowTabelleStato")
				.start(this.stepFactory.migrateFeStatoAdesione())
				.next(this.stepFactory.migrateFeStatoArchivio())
				.build();
	}

	public Flow flowCompilazioneSezione() {
		return new FlowBuilder<SimpleFlow>("flowCompilazioneSezione")
				.start(this.stepFactory.migrateFeCompilazioneSezione())
				.next(this.stepFactory.migrateFeCompilazioneSezioneStorico())
				.build();
	}


	public Flow flowCompilazioneConfig() {
		return new FlowBuilder<SimpleFlow>("flowCompilazioneConfig")
				.start(this.stepFactory.migrateFeConfigEsitoVerifFirma())
				.next(this.stepFactory.migrateFeConfigFoglioStile())
				.next(this.stepFactory.migrateFeConfigGenerale())
				.next(this.stepFactory.migrateFeConfigMacrosezApp())
				.next(this.stepFactory.migrateFeConfigXsdSezione())
				.next(this.stepFactory.migrateFeConfigXsdCampo())
				.build();
	}

	public Flow flowDatiConfig() {
		return new FlowBuilder<SimpleFlow>("flowDatiConfig")
				.start(this.stepFactory.migrateFeDatiCassaPrevidenziale())
				.next(this.stepFactory.migrateFeDatiCassaPrevStorico())
				.next(this.stepFactory.migrateFeDatiDdt())
				.next(this.stepFactory.migrateFeDatiDdtStorico())
				.next(this.stepFactory.migrateFeDatiPagamento())
				.next(this.stepFactory.migrateFeDatiPagamentoStorico())
				.next(this.stepFactory.migrateFeDatiRiepilogo())
				.next(this.stepFactory.migrateFeDatiRiepilogoStorico())
				.next(this.stepFactory.migrateFeDatiRiferimento())
				.next(this.stepFactory.migrateFeDatiRiferimentoStorico())
				.next(this.stepFactory.migrateFeDatiSal())
				.next(this.stepFactory.migrateFeDatiSalStorico())
				.build();
	}
	
	public Flow flowDatiDettagli() {
		return new FlowBuilder<SimpleFlow>("flowDatiDettagli")
				.start(this.stepFactory.migrateFeDettaglioLinea())
				.next(this.stepFactory.migrateFeDettaglioLineaStorico())
				.next(this.stepFactory.migrateFeDettaglioPagamento())
				.next(this.stepFactory.migrateFeDettaglioPagStorico())
				.build();
	}
	
	
	public Flow flowMinor() {
		return new FlowBuilder<SimpleFlow>("flowMinor")
				.start(this.stepFactory.migrateFeErroreNotifica())
				.next(this.stepFactory.migrateFeImpreseCollegAssoc())
				.next(this.stepFactory.migrateFeIpa())
				.next(this.stepFactory.migrateFeMail())
				.build();
	}
	
	public Flow flowFtp() {
		return new FlowBuilder<SimpleFlow>("flowFtp")
				.start(this.stepFactory.migrateFeEsitoFtp())
				.next(this.stepFactory.migrateFeLottoSupportoFtp())
				.build();
	}
	
	public Flow flowLogReport() {
		return new FlowBuilder<SimpleFlow>("flowLogReport")
				.start(this.stepFactory.migrateFeLogApplicativo())
				.next(this.stepFactory.migrateFeLogErroreBatchDb())
				.next(this.stepFactory.migrateFeLogEsecuzioneBatchDb())
				.next(this.stepFactory.migrateFeMonitoraggioInvioSdi())
				.build();
	}
}