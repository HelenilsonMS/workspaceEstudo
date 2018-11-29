package com.hms.microservice;

import java.math.BigDecimal;

public class CurrencyConversionBean {
	
	
	private Long id;
	private String from;
	private String to;
	private BigDecimal conversaoMultiplos;
	private BigDecimal quantity;
	private BigDecimal totalCalculatedAmont;
	private int port;
	
	public CurrencyConversionBean() {
		
	}
	
	public CurrencyConversionBean(Long id, String from, String to, BigDecimal conversaoMultiplos, BigDecimal quantity,
			BigDecimal totalCalculatedAmont, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversaoMultiplos = conversaoMultiplos;
		this.quantity = quantity;
		this.totalCalculatedAmont = totalCalculatedAmont;
		this.port = port;
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
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getTotalCalculatedAmont() {
		return totalCalculatedAmont;
	}
	public void setTotalCalculatedAmont(BigDecimal totalCalculatedAmont) {
		this.totalCalculatedAmont = totalCalculatedAmont;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	

}
