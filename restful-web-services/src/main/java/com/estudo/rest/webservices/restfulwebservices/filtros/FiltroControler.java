package com.estudo.rest.webservices.restfulwebservices.filtros;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController									
public class FiltroControler {

	
	@GetMapping("/filtros")
	public MappingJacksonValue retornaAlgunsValores() {
		
		 SomeBean valores =  new SomeBean("valor 1","valor 2","valor 3");
		 
		 SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("filtro3","filtro2");
		
		 FilterProvider filtros = new SimpleFilterProvider().addFilter("FiltroDeValores", filter);

		 MappingJacksonValue mapping = new MappingJacksonValue(valores);
		 mapping.setFilters(filtros);
		 
		 return mapping;
	}


	@GetMapping("/filtros-lista")
	public MappingJacksonValue retornaListaDeAlgunsValores() {
		
		List<SomeBean> asList = Arrays.asList(new SomeBean("valor 11","valor 21","valor 31"),new SomeBean("valor 21","valor 22","valor 23"));
		
		
		 SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("filtro1","filtro2");
			
		 FilterProvider filtros = new SimpleFilterProvider().addFilter("FiltroDeValores", filter);

		 MappingJacksonValue mapping = new MappingJacksonValue(asList);
		 mapping.setFilters(filtros);
			
		
		return mapping;
	}
}
