package com.diegomoura.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diegomoura.hello.model.Produto;

@RestController
public class ProdutoController {
	
	@GetMapping("/produto")
	public Produto exibirProduto() {
		Produto p = new Produto();
		p.setId(12345);
		p.setNome("Computador i7");
		p.setPreco(3990.00);
		p.setQdtEstoque(5);
		return p;
	}

}
