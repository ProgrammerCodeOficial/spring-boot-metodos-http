package com.diegomoura.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // A anotacao mostra para o SB que está classe atende URLs
public class HelloController {
	
	@GetMapping("/teste") // na url /teste, ela vai retornar o resultado da execucao deste metodo
	public String digaOla() {
		return "Olá Mundo! Meu primeiro projeto no SpringBoot";
	}

}
