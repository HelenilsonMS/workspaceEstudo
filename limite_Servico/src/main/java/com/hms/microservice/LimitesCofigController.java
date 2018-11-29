package com.hms.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.microservice.bean.LimitesConfiguracao;

@RestController
public class LimitesCofigController {

	@Autowired
	private Configuracao configuracao;
	
	@GetMapping("/limits")
	public LimitesConfiguracao retornoDeLimitesDeConfiguracao() {
		
		return new LimitesConfiguracao(configuracao.getMaximo(),configuracao.getMinimo());
	}
	
	
}
