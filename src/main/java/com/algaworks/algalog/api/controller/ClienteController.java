package com.algaworks.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		Cliente c1 = new Cliente();
		c1.setId(1L);
		c1.setNome("Ana");
		c1.setEmail("ana@gmail.com");
		c1.setTelefone("36049670");
		
		Cliente c2 = new Cliente();
		c2.setId(2L);
		c2.setNome("Bob");
		c2.setEmail("bob@gmail.com");
		c2.setTelefone("36049693");
				
		return Arrays.asList(c1, c2);
	}

}
