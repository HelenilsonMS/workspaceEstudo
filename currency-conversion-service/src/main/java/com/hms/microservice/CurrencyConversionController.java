package com.hms.microservice;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {

	@Autowired
	private CurrencyExchangeServiceProxy proxy;
	
	
	//Sem Feign
	@GetMapping("currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrency(@PathVariable String from,
			@PathVariable String to,
			@PathVariable BigDecimal quantity) {
		
		Map<String, String> uriVariable = new HashMap<>();
		uriVariable.put("from", from);
		uriVariable.put("to", to); 
		ResponseEntity<CurrencyConversionBean> responseEntity = new RestTemplate().getForEntity(
				"http://localhost:8000//currency-change/from/{from}/to/{to}",
				CurrencyConversionBean.class,
				uriVariable);
		
		CurrencyConversionBean response = responseEntity.getBody();
		
		return new CurrencyConversionBean(response.getId(),from,to,response.getConversaoMultiplos(), quantity, quantity.multiply(response.getConversaoMultiplos()), response.getPort());
	}
	
	
	//Com feign
	@GetMapping("currency-converter-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrencyFeign(@PathVariable String from,
			@PathVariable String to,
			@PathVariable BigDecimal quantity) {
				
		CurrencyConversionBean response = proxy.retornaTrocaDeValor(from, to);
		
		return new CurrencyConversionBean(response.getId(),from,to,response.getConversaoMultiplos(), quantity, quantity.multiply(response.getConversaoMultiplos()), response.getPort());
	}
}
