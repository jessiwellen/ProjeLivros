package com.jessica.projelivros.controle;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import com.jessica.projelivros.modelo.Livros;

public class LivrosControle {

	@GetMapping("/")
	public String getMensagem() {
		return "Projeto com Spring Boot.";
	}
	
	@GetMapping("/Livros")
	public ArrayList<Livros> getLivros() {
		
		Livros L = new Livros();
		
		L.setTitulo("A Realidade de Madhu");
		L.setAutor("Melissa Tobias");
		L.setCategoria("Ficção Ciêntífica");
		L.setEditora("Novo Século");
		L.setEdicao("1ª");
		L.setPaginas("280");
		L.setIdioma("Português");
		L.setLancamento("2014");
		

		Livros Lv = new Livros();
			
		Lv.setTitulo("O jeito HARVARD de ser feliz");
		Lv.setAutor("Shawn Achor");
		Lv.setCategoria("Autoajuda");
		Lv.setEditora("Saraiva");
		Lv.setEdicao("1ª");
		Lv.setPaginas("216");
		Lv.setIdioma("Português");
		Lv.setLancamento("2012");
		
	    ArrayList<Livros> Livros = new ArrayList<>();
		
	    Livros.add(L);
	    Livros.add(Lv);
	    
	    return Livros;
	}
}
