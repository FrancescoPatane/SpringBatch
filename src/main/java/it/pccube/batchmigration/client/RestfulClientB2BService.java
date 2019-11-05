package it.pccube.batchmigration.client;

import java.nio.charset.Charset;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import it.pccube.batchmigration.client.doc.DocumentaleException;
import it.pccube.batchmigration.client.doc.FileResource;
import it.pccube.batchmigration.client.doc.OutputDeleteDocumentale;
import it.pccube.batchmigration.exception.ExternalCallException;



@Component
public class RestfulClientB2BService {


	private static final Logger logger = LoggerFactory.getLogger(RestfulClientB2BService.class);

	private RestTemplate restfulClient = null;
	private ObjectMapper jsonMapper = null;


	private static final int REST_CLIENT_CONN_TIMEOUT = 30000;

	private static final int REST_CLIENT_READ_TIMEOUT = 30000;

	private static final String ERR_MSG = "Errore chiamata esterna";

	private static final String ERR_MSG_DOC = "Errore chiamata documentale";


	public RestfulClientB2BService() {
		super();
	}

	@PostConstruct
	private void init() {
		SimpleClientHttpRequestFactory schrf = new SimpleClientHttpRequestFactory();
		schrf.setConnectTimeout(REST_CLIENT_CONN_TIMEOUT);
		schrf.setReadTimeout(REST_CLIENT_READ_TIMEOUT);
		this.restfulClient = new RestTemplate(schrf);
		this.restfulClient.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));

		for (HttpMessageConverter<?> converter : restfulClient.getMessageConverters()) {
			if (converter instanceof StringHttpMessageConverter) {
				((StringHttpMessageConverter) converter).setWriteAcceptCharset(false);
			}
		}

		this.jsonMapper = new ObjectMapper();
		this.jsonMapper.enable(com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		this.jsonMapper
		.disable(com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
		this.jsonMapper.setSerializationInclusion(Include.NON_NULL);

		logger.info("restful client successfully initialized");
	}



	public <T> T doPostUpload(String url, String filename, Class<T> responseType, byte[] data) {
		logger.info("doPostUpload " + url);

		HttpHeaders headers = new HttpHeaders();
		MultiValueMap<String, Object> multiValueMap = new LinkedMultiValueMap<>();

		FileResource fileResource = new FileResource(data);
		fileResource.setFilename(filename);
		multiValueMap.add("file", fileResource);

		headers.set("Content-Type", "multipart/form-data");

		T t = this.restfulClient.postForObject(url, new HttpEntity<>(multiValueMap, headers), responseType);
		logger.info("doPostUpload end " + t.toString() );
		return t;
	}

	public ResponseEntity<byte[]> doGetDownload(String url, HttpHeaders headers) {
		ResponseEntity<byte[]> response = this.restfulClient.exchange(url, HttpMethod.GET,
				new HttpEntity<>(null, headers), byte[].class);
		if (!HttpStatus.OK.equals(response.getStatusCode())) {
			logger.debug("status code: " + response.getStatusCode());
			throw new DocumentaleException(ERR_MSG_DOC);
		}
		return response;
	}

	//Documentale
	public ResponseEntity<OutputDeleteDocumentale> doGetDelete(String url, HttpHeaders headers) {
		ResponseEntity<OutputDeleteDocumentale> response = this.restfulClient.exchange(url, HttpMethod.GET,
				new HttpEntity<>(null, headers), OutputDeleteDocumentale.class);
		if (!HttpStatus.OK.equals(response.getStatusCode())) {
			logger.debug("status code: " + response.getStatusCode());
			throw new DocumentaleException(ERR_MSG_DOC);
		}
		return response;
	}

	public ResponseEntity<AutorizzazioneReturnValue> doGetDataAutorizzazione(String url, SediaInputBean requestBean, HttpHeaders headers) {
		String jsonRequest;
		try {
			jsonRequest = this.jsonMapper.writeValueAsString(requestBean);
			headers.setContentType(MediaType.APPLICATION_JSON);
			HttpEntity<String> entity = new HttpEntity<String>(jsonRequest, headers);
			ResponseEntity<AutorizzazioneReturnValue> response = this.restfulClient.exchange(url, HttpMethod.POST,
					entity, AutorizzazioneReturnValue.class);
			if (!HttpStatus.OK.equals(response.getStatusCode())) {
				logger.debug("status code: " + response.getStatusCode());
				throw new ExternalCallException(ERR_MSG);
			}
			return response;
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			throw new ExternalCallException("Error mapping request json " + requestBean.toString());
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new ExternalCallException(ERR_MSG);
		}
	}


}
