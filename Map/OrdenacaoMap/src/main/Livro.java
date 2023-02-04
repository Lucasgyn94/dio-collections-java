package main;

import java.util.Objects;

public class Livro {
	
	private String nome;
	private Integer paginas;
	
	public Livro() {
		// construtor vazio
	}
	public Livro(String nome, Integer paginas) {
		this.nome = nome;
		this.paginas = paginas;
	}
	public String getNome() {
		return nome;
	}
	public Integer getPaginas() {
		return paginas;
	}
	
	@Override
	public boolean equals(Object objeto) {
		if (this == objeto) {
			return true;
		}
		if (objeto == null || getClass() != objeto.getClass()) {
			return false;
		}
		Livro livro = (Livro) objeto;
		return this.nome.equals(livro.nome) && this.paginas.equals(livro.paginas);
	}
	@Override
	public int hashCode() {
		return Objects.hash(nome, paginas);
	}
	
	@Override
	public String toString() {
		String 	s = "";
				s+=	"Nome: " + this.nome + "\n" +
					"Páginas: " + this.paginas + "\n";
		return s;
	}
	
}
