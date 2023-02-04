package main;

import java.util.Comparator;
import java.util.Map;

public class ComparatorOrdemNome implements Comparator<Map.Entry<Integer, Contato>> {
	@Override
	public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
		return cont1.getValue().getNome().compareTo(cont2.getValue().getNome());
	}
}
