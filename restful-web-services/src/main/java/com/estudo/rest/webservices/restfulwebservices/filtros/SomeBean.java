package com.estudo.rest.webservices.restfulwebservices.filtros;

import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("FiltroDeValores")
public class SomeBean {
	
	private String filtro1;
	private String filtro2;
	
//	@JsonIgnore
	private String filtro3;

	public SomeBean(String filtro1, String filtro2, String filtro3) {
		super();
		this.filtro1 = filtro1;
		this.filtro2 = filtro2;
		this.filtro3 = filtro3;
	}
	@Override
	public String toString() {
		return "SomeBean [filtro1=" + filtro1 + ", filtro2=" + filtro2 + ", filtro3=" + filtro3 + "]";
	}
	public String getFiltro1() {
		return filtro1;
	}
	public void setFiltro1(String filtro1) {
		this.filtro1 = filtro1;
	}
	public String getFiltro2() {
		return filtro2;
	}
	public void setFiltro2(String filtro2) {
		this.filtro2 = filtro2;
	}
	public String getFiltro3() {
		return filtro3;
	}
	public void setFiltro3(String filtro3) {
		this.filtro3 = filtro3;
	}
	
	

}
