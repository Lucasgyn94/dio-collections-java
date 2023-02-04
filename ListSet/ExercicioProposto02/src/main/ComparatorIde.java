package main;

import java.util.Comparator;

public class ComparatorIde implements Comparator<LinguagemFavorita> {
	
	@Override
	public int compare(LinguagemFavorita lang1, LinguagemFavorita lang2) {
		return lang1.getIDE().compareTo(lang2.getIDE());
	}
	
}
