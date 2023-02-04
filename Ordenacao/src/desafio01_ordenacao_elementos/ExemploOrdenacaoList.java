package desafio01_ordenacao_elementos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 	Dados as seguintes informações sobre meus gatos, crie uma lista
 	e ordene esta lista exibindo:
 	(name - idade - cor)
 	Gato 1 = name: Jon, idade: 18 meses, cor: preta
 	Gato 2 = name: Simba, idade: 6 meses, cor: tigrado
 	Gato 3 = name: Jon, idade: 12 meses, cor: amarela
 * */

public class ExemploOrdenacaoList {
	public static void main(String[] args) {
		
		List<Gatos> myCats = new ArrayList<>() {{
			add(new Gatos("Jon", 18, "Preto"));
			add(new Gatos("Simba", 6, "Tigrado"));
			add(new Gatos("Jon", 12, "Amarelo"));
		}};
		
		// gatos em ordem de inserção
		System.out.println(myCats);
		
		// gatos em ordem aleatória
		Collections.shuffle(myCats);
		System.out.println(myCats.toString());
		
		// gatos em ordem natural
		System.out.println("--\tOrdem Natural (Nome) \t---");
		Collections.sort(myCats);
		System.out.println(myCats);
		
		// ordem de idade
		System.out.println("--\tOrdem Idade \t---");
		//Collections.sort(myCats, new ComparatorIdade());
		myCats.sort(new ComparatorIdade());
		System.out.println(myCats.toString());
		
		// comparação por cor
		System.out.println("--\tOrdem Cor \t---");
		myCats.sort(new ComparatorCor());
		System.out.println(myCats);
		
		// comparação por nome, cor, idade
		System.out.println("--- \tOrdem Nome/Cor/Idade \t---");
		myCats.sort(new ComparatorNomeCorIdade());
		System.out.println(myCats);
	}
}
