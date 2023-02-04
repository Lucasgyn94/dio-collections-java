package main;

import java.util.Comparator;

public class ComparatorAnoDeCriacaoENome implements Comparator<LinguagemFavorita>{
	@Override
	public int compare(LinguagemFavorita lang1, LinguagemFavorita lang2) {
		int anoDeCriacao = Integer.compare(lang1.getAnoDeCriacao(), lang2.getAnoDeCriacao());
		
		if (anoDeCriacao != 0) {
			return anoDeCriacao;
		}
		return lang1.getNome().compareToIgnoreCase(lang2.getNome());
	}
}
