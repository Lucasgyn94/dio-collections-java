package exercioSeriesFavoritas;

import java.util.Comparator;

public class ComparatorNomeGeneroTempoEpisodio implements Comparator<Series> {
	
	@Override
	public int compare(Series serie1, Series serie2) {
		
		int nome = serie1.getNome().compareTo(serie2.getNome());
		if (nome != 0) {
			return nome;
		}
		
		int genero = serie1.getGenero().compareTo(serie2.getGenero());
		if (genero != 0) {
			return genero;
		}
		
		return Integer.compare(serie1.getTempoEpisodio(), serie1.getTempoEpisodio());
	} 
	
}
