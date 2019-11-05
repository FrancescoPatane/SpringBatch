package it.pccube.batchmigration.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

@Service
public class AutorizzazioneService {
	
	@Value("${clusters.autorizzazione}")
	private String baseUrl;
	
	@Autowired
	private CryptoServiceCustom cryptoService;
	
	@Autowired
	private RestfulClientB2BService restfulClient;
	
	public String getIdSediaFromIdUtenteAzienda(String idUtenteAzienda) {
		SediaInputBean requestBean = new SediaInputBean();
		requestBean.setIdUtenteAziendaAmministrazione(this.cryptoService.encrypt(idUtenteAzienda, null));
		requestBean.setTipoUtente(this.cryptoService.encrypt("1", null));
		AutorizzazioneReturnValue result = this.restfulClient.doGetDataAutorizzazione(this.baseUrl+"/autorizzazioneservices/getIdSediaFromIdUtenteAziendaAmministrazione", requestBean, new HttpHeaders()).getBody();
		String encrypted = result.getPayload().getIdSedia();
		String decrypted = this.cryptoService.decrypt(encrypted, null);
		return decrypted;
	}
	
	

}
