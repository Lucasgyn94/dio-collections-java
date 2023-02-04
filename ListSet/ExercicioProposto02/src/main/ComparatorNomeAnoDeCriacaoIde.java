package main;

import java.util.Comparator;

public class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita> {
	@Override
	public int compare(LinguagemFavorita lang1, LinguagemFavorita lang2) {
		int nome = lang1.getNome().compareToIgnoreCase(lang2.getNome());
		int anoDeCriacao = Integer.compare(lang1.getAnoDeCriacao(), lang2.getAnoDeCriacao());
		
		if (nome != 0) {
			return nome;
		}
		if (anoDeCriacao != 0) {
			return anoDeCriacao;
		}
		return lang1.getIDE().compareTo(lang2.getIDE());
	}
}
