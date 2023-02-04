package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExemploList {

	public static void main(String[] args) {
		// Faça uma lista com 7 notas de um aluno (7, 8.5, 9.3, 5, 7, 0, 3, 6, faça criar uma lista e adicionar 7 notas
		
		List<Double> notas = new ArrayList<>();
		notas.add(7d);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5d);
		notas.add(7d);
		notas.add(0d);
		notas.add(3d);
		notas.add(6d);
		
		System.out.println(notas.toString());
		
		//imprimindo o número da posição 3
		System.out.println("Exiba a posição da nota 5.0 = " + notas.indexOf(5d));
		
		// adicionando na lista a nota 8 na posicao 4
		notas.add(4, 8d);
		System.out.println(notas);
		
		// substituindo nota 5 pela nota 6
		notas.set(notas.indexOf(5d), 6d);
		System.out.println("Nota substituida com sucesso!");
		System.out.println(notas);
		
		// conferindo se o 5 está na lista
		System.out.println("Na lista = " + notas.contains(5d));
		
		// imprimindo todas as notas abaixo com for
		System.out.println("\nImprimindo com for");
		for (Double nota : notas) {
			System.out.println(nota);
		}
		
		System.out.println();
		
		// exibindo a nota da posicao 3
		System.out.println("Nota da posicao 3 = " + notas.get(3));
		System.out.println(notas.toString());
		
		// exibindo a menor nota
		System.out.println("Menor nota = " + Collections.min(notas));
		
		// exibindo a maior nota
		System.out.println("Maior nota = " + Collections.max(notas));
		
		// exibindo a soma das notas
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0d;
		
		while(iterator.hasNext()) {
			double next = iterator.next();
			soma += next;
		}
		System.out.println("Soma das notas = " + soma);
		
		// exibindo a média das notas
		System.out.println("Médias das notas = " + (soma / notas.size()));
		
		// removendo a nota 0
		System.out.println("Antes da remoção do 0");
		System.out.println(notas);
		System.out.println("Após remoção do 0");
		notas.remove(6);
		System.out.println(notas.toString());
		
		// removendo as notas menores que 7
		System.out.println("Removendo notas menores que 7 na seguinte lista");
		System.out.println(notas);
		
		Iterator<Double> iterator1 = notas.iterator(); // iterator() Retorna um iterador sobre os elementos desta lista na sequência adequada.
		
		
		//Um iterador sobre uma coleção. O Iterator substitui a Enumeração no Java Collections Framework. Os iteradores diferem das enumerações de duas maneiras:
		//• Os iteradores permitem que o chamador remova elementos da coleção subjacente durante a iteração com semântica bem definida.
		List<Double> notasAntesRemocao = new ArrayList<>();
		notasAntesRemocao.addAll(notas);
		System.out.println("Notas antes remoção: ");
		System.out.println(notasAntesRemocao);
		
		while(iterator1.hasNext()) {
			Double next = iterator1.next();
			
			if (next <= 7) {
				iterator1.remove();
			}
		}
		System.out.println("Notas menores que 7 removidas com sucesso!");
		System.out.println(notas);
		
		System.out.println("Apagando restante da lista");
		notas.clear();
		System.out.println("Lista apagada com sucesso! ");
		System.out.println("Lista vazia = " + notas.isEmpty());
		
		System.out.println("===============================");
		System.out.println("Criando Lista de notas 2");
		List<Double> notas2 = new LinkedList<>();
		notas2.addAll(notasAntesRemocao);
		
		System.out.println(notas2.toString());
		
		// removendo primeira nota da lista 2
		System.out.println("Primeira nota da lista 2 = " + notas2.get(0));
		System.out.println("Removendo a primeira nota");
		notas2.remove(0);
		System.out.println("Nota removida com sucesso!");
		System.out.println(notas2.toString());
	}

}
