package it.pccube.batchmigration.destination.sql;

public class InsertQuery {
	
	public static final String INSERT_FAT_T_LOTTO = "INSERT INTO FAT_T_LOTTO (cd_cap_sede_cedente, cd_cap_sede_cessionario, cd_cap_stabile_cedente, cd_cap_stabile_cessionario, cd_cf_cedente, cd_civico_stabile_cessionario, cd_cod_eori_cedente, cd_cod_eori_cessionario, cd_cod_eori_rap_fiscale, cd_cod_eori_terzo_int, cd_codice_cedente, cd_codice_cessionario, cd_codice_destinatario, cd_codice_fiscale_cessionario, cd_codice_fiscale_rap_fiscale, cd_codice_fiscale_terzo_int, cd_codice_rap_fiscale, cd_codice_terzo_int, cd_codice_trasmittente, cd_cod_rap_fiscale_ces, cd_fax_cedente, cd_formato_trasmissione, cd_hash_xml_firmato, cd_identificativo_sdi_lotto, cd_num_civico_sede_cessionario, cd_num_civico_stabile_cedente, cd_numero_civico_sede_cedente, cd_numero_rea_cedente, cd_num_iscrizione_albo_cedente, cd_paese_trasmittente, cd_progressivo_invio, cd_rif_amministrazione_cedente, cd_telefono_cedente, cd_telefono_trasmittente, dt_data_iscr_albo_cedente, dt_data_ora_prima_creazione, dt_data_ora_ricezione, dt_data_ora_ultima_modifica, dt_data_ora_ultimo_invio_sdi, fl_da_storicizzare, fl_esito_verifica_firma, fl_ftp, fl_lotto_eu, fl_verifica_firma, id_adesione, id_comune_sede_cedente, id_comune_sede_cessionario, id_comune_stabile_cedente, id_comune_stabile_cessionario, id_diz_socio_unico_cedente, id_diz_soggetto_emittente, id_diz_stato_liquidaz_cedente, id_diz_stato_lotto_fattura, id_diz_tipologia_destinatario, id_esito_invio, id_lotto, id_nazione_sede_cedente, id_nazione_sede_cessionario, id_nazione_stabile_cedente, id_nazione_stabile_cessionario, id_paese_cedente, id_paese_cessionario, id_paese_rap_fiscale, id_paese_rap_fiscale_ces, id_paese_terzo_int, id_provincia_albo_cedente, id_provincia_sede_cedente, id_provincia_sede_cessionario, id_provincia_stabile_cedente, id_provincia_stabile_ces, id_regime_fiscale_cedente, id_regione_albo_cedente, id_regione_rea_cedente, id_regione_sede_cedente, id_regione_sede_cessionario, id_regione_stabile_cedente, id_regione_stabile_cessionario, id_sedia_assegnatario, id_sedia_creatore, id_sedia_ultima_mod, id_ufficio_rea_cedente, id_xml_firmato, id_xml_non_firmato, im_capitale_sociale_cedente, nm_albo_professionale_cedente, nm_cognome_cedente, nm_cognome_cessionario, nm_cognome_rap_fiscale, nm_cognome_rap_fiscale_ces, nm_cognome_terzo_int, nm_comune_sede_cedente_est, nm_comune_sede_cessionario_est, nm_comune_stabile_cedente_est, nm_comune_stabile_ces_est, nm_content_type_xml_firmato, nm_denominazione_cedente, nm_denominazione_cessionario, nm_denominazione_rap_fiscale, nm_denominazione_rap_fisc_ces, nm_denominazione_terzo_int, nm_email_cedente, nm_email_trasmittente, nm_indiriz_stabile_cessionario, nm_indirizzo_sede_cedente, nm_indirizzo_sede_cessionario, nm_indirizzo_stabile_cedente, nm_nome_cedente, nm_nome_cessionario, nm_nome_rap_fiscale, nm_nome_rap_fiscale_ces, nm_nome_terzo_int, nm_nome_xml_firmato, nm_nome_xml_non_firmato, nm_pec_destinatario, nm_ticket_conservazione, nm_titolo_cedente, nm_titolo_cessionario, nm_titolo_rap_fiscale, nm_titolo_terzo_int, nm_utente_inserimento, nm_utente_ultima_modifica, pg_versione_lotto, qt_size_xml_firmato, ts_inserimento, ts_ultima_modifica) VALUES (:cdCapSedeCedente, :cdCapSedeCessionario, :cdCapStabileCedente, :cdCapStabileCessionario, :cdCfCedente, :cdCivicoStabileCessionario, :cdCodEoriCedente, :cdCodEoriCessionario, :cdCodEoriRapFiscale, :cdCodEoriTerzoInt, :cdCodiceCedente, :cdCodiceCessionario, :cdCodiceDestinatario, :cdCodiceFiscaleCessionario, :cdCodiceFiscaleRapFiscale, :cdCodiceFiscaleTerzoInt, :cdCodiceRapFiscale, :cdCodiceTerzoInt, :cdCodiceTrasmittente, :cdCodRapFiscaleCes, :cdFaxCedente, :cdFormatoTrasmissione, :cdHashXmlFirmato, :cdIdentificativoSdiLotto, :cdNumCivicoSedeCessionario, :cdNumCivicoStabileCedente, :cdNumeroCivicoSedeCedente, :cdNumeroReaCedente, :cdNumIscrizioneAlboCedente, :cdPaeseTrasmittente, :cdProgressivoInvio, :cdRifAmministrazioneCedente, :cdTelefonoCedente, :cdTelefonoTrasmittente, :dtDataIscrAlboCedente, :dtDataOraPrimaCreazione, :dtDataOraRicezione, :dtDataOraUltimaModifica, :dtDataOraUltimoInvioSdi, :flDaStoricizzare, :flEsitoVerificaFirma, :flFtp, :flLottoEu, :flVerificaFirma, :idAdesione, :idComuneSedeCedente, :idComuneSedeCessionario, :idComuneStabileCedente, :idComuneStabileCessionario, :idDizSocioUnicoCedente, :idDizSoggettoEmittente, :idDizStatoLiquidazCedente, :idDizStatoLottoFattura, :idDizTipologiaDestinatario, :idEsitoInvio, :idLotto, :idNazioneSedeCedente, :idNazioneSedeCessionario, :idNazioneStabileCedente, :idNazioneStabileCessionario, :idPaeseCedente, :idPaeseCessionario, :idPaeseRapFiscale, :idPaeseRapFiscaleCes, :idPaeseTerzoInt, :idProvinciaAlboCedente, :idProvinciaSedeCedente, :idProvinciaSedeCessionario, :idProvinciaStabileCedente, :idProvinciaStabileCes, :idRegimeFiscaleCedente, :idRegioneAlboCedente, :idRegioneReaCedente, :idRegioneSedeCedente, :idRegioneSedeCessionario, :idRegioneStabileCedente, :idRegioneStabileCessionario, :idSediaAssegnatario, :idSediaCreatore, :idSediaUltimaMod, :idUfficioReaCedente, :idXmlFirmato, :idXmlNonFirmato, :imCapitaleSocialeCedente, :nmAlboProfessionaleCedente, :nmCognomeCedente, :nmCognomeCessionario, :nmCognomeRapFiscale, :nmCognomeRapFiscaleCes, :nmCognomeTerzoInt, :nmComuneSedeCedenteEst, :nmComuneSedeCessionarioEst, :nmComuneStabileCedenteEst, :nmComuneStabileCesEst, :nmContentTypeXmlFirmato, :nmDenominazioneCedente, :nmDenominazioneCessionario, :nmDenominazioneRapFiscale, :nmDenominazioneRapFiscCes, :nmDenominazioneTerzoInt, :nmEmailCedente, :nmEmailTrasmittente, :nmIndirizStabileCessionario, :nmIndirizzoSedeCedente, :nmIndirizzoSedeCessionario, :nmIndirizzoStabileCedente, :nmNomeCedente, :nmNomeCessionario, :nmNomeRapFiscale, :nmNomeRapFiscaleCes, :nmNomeTerzoInt, :nmNomeXmlFirmato, :nmNomeXmlNonFirmato, :nmPecDestinatario, :nmTicketConservazione, :nmTitoloCedente, :nmTitoloCessionario, :nmTitoloRapFiscale, :nmTitoloTerzoInt, :nmUtenteInserimento, :nmUtenteUltimaModifica, :pgVersioneLotto, :qtSizeXmlFirmato, :tsInserimento, :tsUltimaModifica)";

	public static final String INSERT_FAT_T_FATTURA = "INSERT INTO FAT_T_FATTURA (id_fattura, id_diz_tipo_documento, id_divisa, dt_data, cd_numero, id_diz_tipo_ritenuta, im_importo_ritenuta, pc_aliquota_ritenuta, id_diz_causale_pagamento, cd_numero_bollo, im_importo_bollo, im_importo_totale_documento, im_arrotondamento, ds_causale, id_diz_art_73, id_paese_vettore, cd_codice_vettore, cd_codice_fiscale_vettore, nm_denominazione_vettore, nm_nome_vettore, nm_cognome_vettore, nm_titolo_vettore, cd_cod_eori_vettore, cd_num_licenza_guida_vettore, nm_mezzo_trasporto, ds_causale_trasporto, qt_numero_colli, ds_descrizione, cd_unita_misura_peso, qt_peso_lordo, qt_peso_netto, dt_data_ora_ritiro, dt_data_inizio_trasporto, id_diz_tipo_resa, nm_indirizzo_resa, cd_numero_civico_resa, cd_cap_resa, id_comune_resa, nm_comune_resa_est, id_provincia_resa, id_regione_resa, id_nazione_resa, dt_data_ora_consegna, cd_norma_di_riferimento, cd_numero_fattura_principale, dt_data_fattura_principale, id_fattura_principale, dt_data_immat_veicolo, qt_totale_percorso_veicolo, id_lotto, nm_utente_inserimento, ts_inserimento, nm_utente_ultima_modifica, ts_ultima_modifica, id_lotto_fat_rifiutata, pg_versione_lotto_fat_rifiut, id_fattura_rifiutata, cd_bollo_virtuale, id_xml_eu_uploaded, nm_xml_eu_uploaded_name, id_xml_eu_generated, nm_xml_eu_generated_name) VALUES (:idFattura, :idDizTipoDocumento, :idDivisa, :dtData, :cdNumero, :idDizTipoRitenuta, :imImportoRitenuta, :pcAliquotaRitenuta, :idDizCausalePagamento, :cdNumeroBollo, :imImportoBollo, :imImportoTotaleDocumento, :imArrotondamento, :dsCausale, :idDizArt73, :idPaeseVettore, :cdCodiceVettore, :cdCodiceFiscaleVettore, :nmDenominazioneVettore, :nmNomeVettore, :nmCognomeVettore, :nmTitoloVettore, :cdCodEoriVettore, :cdNumLicenzaGuidaVettore, :nmMezzoTrasporto, :dsCausaleTrasporto, :qtNumeroColli, :dsDescrizione, :cdUnitaMisuraPeso, :qtPesoLordo, :qtPesoNetto, :dtDataOraRitiro, :dtDataInizioTrasporto, :idDizTipoResa, :nmIndirizzoResa, :cdNumeroCivicoResa, :cdCapResa, :idComuneResa, :nmComuneResaEst, :idProvinciaResa, :idRegioneResa, :idNazioneResa, :dtDataOraConsegna, :cdNormaDiRiferimento, :cdNumeroFatturaPrincipale, :dtDataFatturaPrincipale, :idFatturaPrincipale, :dtDataImmatVeicolo, :qtTotalePercorsoVeicolo, :idLotto, :nmUtenteInserimento, :tsInserimento, :nmUtenteUltimaModifica, :tsUltimaModifica, :idLottoFatRifiutata, :pgVersioneLottoFatRifiut, :idFatturaRifiutata, :cdBolloVirtuale, :idXmlEuUploaded, :nmXmlEuUploadedName, :idXmlEuGenerated, :nmXmlEuGeneratedName)";

}
