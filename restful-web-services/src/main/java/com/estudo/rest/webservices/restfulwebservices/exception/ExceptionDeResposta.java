package com.estudo.rest.webservices.restfulwebservices.exception;

import java.util.Date;

public class ExceptionDeResposta {

	private Date timestramp;
	private String message;
	private String detalhes;

	public ExceptionDeResposta(Date timestramp, String message, String detalhes) {
		super();
		this.timestramp = timestramp;
		this.message = message;
		this.detalhes = detalhes;
	}

	public Date getTimestramp() {
		return timestramp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetalhes() {
		return detalhes;
	}
	

	
}
