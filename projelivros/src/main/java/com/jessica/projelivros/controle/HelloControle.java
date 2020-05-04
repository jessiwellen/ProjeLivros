package com.jessica.projelivros.controle;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloControle {

	@GetMapping("/")
	public String getMensagem() {
		return "Óla, Bem Vindo(a)!";
	}
	
	
}
