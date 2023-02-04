package desafio01_ordenacao_elementos;

import java.util.Comparator;

public class ComparatorCor implements Comparator<Gatos> {
	
	@Override
	public int compare(Gatos g1, Gatos g2) {
		// TODO Auto-generated method stub
		return g1.getCor().compareToIgnoreCase(g2.getCor());
	}
	
}
