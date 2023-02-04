package main;

import java.util.Objects;

public class LinguagemFavorita implements Comparable<LinguagemFavorita>{

	private String nome;
	private Integer anoDeCriacao;
	private String IDE;
	
	public LinguagemFavorita() {
		//construtor vazio
	}
	
	public LinguagemFavorita(String nome, Integer anoDeCriacao, String IDE) {
		this.nome = nome;
		this.anoDeCriacao  = anoDeCriacao;
		this.IDE = IDE;
	}
	
	public String getNome() {
		return nome;
	}
	public Integer getAnoDeCriacao() {
		return anoDeCriacao;
	}
	public String getIDE() {
		return IDE;
	}
	
	@Override
	public String toString() {
		String s = 	"";
				s+= "Nome: " + this.nome + "\n" +
					"Ano de Criação: " + this.anoDeCriacao + "\n" +
					"IDE: " + this.IDE + "\n" +
					"============================"
					;
		return s;
	}
	
	@Override
	public int compareTo(LinguagemFavorita linguagemFavorita) {
		return this.nome.compareTo(linguagemFavorita.nome);
	}
	
	@Override
	public boolean equals(Object objeto) {
		if (this == objeto) {
			return true;
		}
		if (objeto == null || getClass() != objeto.getClass()) {
			return false;
		}
		LinguagemFavorita qual = (LinguagemFavorita) objeto;
		return nome.equals(qual.nome);
	} 
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}
}
