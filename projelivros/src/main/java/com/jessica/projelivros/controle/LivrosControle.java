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
		L.setCategoria("Fic��o Ci�nt�fica");
		L.setEditora("Novo S�culo");
		L.setEdicao("1�");
		L.setPaginas("280");
		L.setIdioma("Portugu�s");
		L.setLancamento("2014");
		

		Livros Lv = new Livros();
			
		Lv.setTitulo("O jeito HARVARD de ser feliz");
		Lv.setAutor("Shawn Achor");
		Lv.setCategoria("Autoajuda");
		Lv.setEditora("Saraiva");
		Lv.setEdicao("1�");
		Lv.setPaginas("216");
		Lv.setIdioma("Portugu�s");
		Lv.setLancamento("2012");
		
	    ArrayList<Livros> Livros = new ArrayList<>();
		
	    Livros.add(L);
	    Livros.add(Lv);
	    
	    return Livros;
	}
}
