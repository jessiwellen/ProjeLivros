package com.jessica.projelivros.modelo;

import lombok.*;

@ToString 
@AllArgsConstructor
@NoArgsConstructor 
public class Livros {

	@Getter @Setter
	private String titulo;
	@Getter @Setter
	private String autor;
	@Getter @Setter
	private String categoria;
	@Getter @Setter
	private String editora;
	@Getter @Setter
	private String edicao;
	@Getter @Setter
	private String paginas;
	@Getter @Setter
	private String idioma;
	@Getter @Setter
	private String lancamento;
}
