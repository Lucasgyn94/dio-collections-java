package desafio01_ordenacao_elementos;

import java.util.Comparator;

public class ComparatorIdade implements Comparator<Gatos> {

	@Override
	public int compare(Gatos g1, Gatos g2) {
		// TODO Auto-generated method stub
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}

}
