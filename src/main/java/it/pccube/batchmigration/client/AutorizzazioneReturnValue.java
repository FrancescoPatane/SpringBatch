package it.pccube.batchmigration.client;

import java.io.Serializable;

public class AutorizzazioneReturnValue implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ResultBean result;
	
	private PayloadBean payload;

	public ResultBean getResult() {
		return result;
	}

	public void setResult(ResultBean result) {
		this.result = result;
	}

	public PayloadBean getPayload() {
		return payload;
	}

	public void setPayload(PayloadBean payload) {
		this.payload = payload;
	}
	
	
	
	

}
