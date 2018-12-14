package br.com.demetriobhs.despesa.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "despesas")
public class DespesaResource {
	
	@GetMapping
	public String teste() {
		
		return "Funcionando!";
	}

}
