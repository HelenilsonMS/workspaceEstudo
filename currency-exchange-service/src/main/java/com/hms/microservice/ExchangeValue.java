package com.hms.microservice;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {

	@Id
	private Long id;
	
	@Column(name="moeda_de")
	private String from;
	
	@Column(name="moeda_para")
	private String to;
	
	
	private BigDecimal conversaoMultiplos;
	
	private int port;
	

	public ExchangeValue() {
		
	}
	
	
	public ExchangeValue(Long id, String from, String to, BigDecimal conversaoMultiplos) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversaoMultiplos = conversaoMultiplos;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConversaoMultiplos() {
		return conversaoMultiplos;
	}
	public void setConversaoMultiplos(BigDecimal conversaoMultiplos) {
		this.conversaoMultiplos = conversaoMultiplos;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}	
}
