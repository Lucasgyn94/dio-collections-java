package exercioSeriesFavoritas;

import java.util.Objects;

public class Series implements Comparable<Series> {
	
	private String nome;
	private String genero;
	private Integer tempoEpisodio;
	
	public Series() {
		// construtor vazio
	}
	
	public Series(String nome, String genero, Integer tempoEpisodio) {
		this.nome = nome;
		this.genero = genero;
		this.tempoEpisodio = tempoEpisodio;
	}
	
	public String getNome() {
		return nome;
	}
	public String getGenero() {
		return genero;
	}
	public Integer getTempoEpisodio() {
		return tempoEpisodio;
	}
	
	@Override
	public String toString() {
		String 	s = "";
				s+= "Nome: " + this.nome + "\n" +
					"Genêro: " + this.genero + "\n" +
					"Tempo de Episódio: " + this.tempoEpisodio + "\n";
		return s;
	}
	
	@Override
	public boolean equals(Object objeto) {
		if (this == objeto) {
			return true;
		}
		if (objeto == null || getClass() != objeto.getClass()) {
			return false;
		}
		Series serie = (Series) objeto;
		return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome, genero, tempoEpisodio);
	}
	
	@Override 
	public int compareTo(Series serie) {
		int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), this.getTempoEpisodio()); 
		
		if (tempoEpisodio != 0) {
			return tempoEpisodio;
		}
		return this.getGenero().compareTo(serie.getGenero());
		
	}
	
}
