package com.hms.microservice.bean;

public class LimitesConfiguracao {

	private int maximo;
	private int inteiro;

	public LimitesConfiguracao() {
	}
	
	
	public LimitesConfiguracao(int maximo, int inteiro) {
		super();
		this.maximo = maximo;
		this.inteiro = inteiro;
	}
	public int getMaximo() {
		return maximo;
	}
	public void setMaximo(int maximo) {
		this.maximo = maximo;
	}
	public int getInteiro() {
		return inteiro;
	}
	public void setInteiro(int inteiro) {
		this.inteiro = inteiro;
	}
	
	
	
}



