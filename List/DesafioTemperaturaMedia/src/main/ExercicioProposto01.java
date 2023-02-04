package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto01 {

	/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
	Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
	e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
	*/

	public static void main(String[] args) {
		List<Double> listTemp = new ArrayList<>();
		
		Scanner entrada = new Scanner(System.in);
		
		// adicionando as temperaturas
		for(int i = 1; i <= 6; i++) {
			System.out.println("Digite a temperatura do mês " + i);
			Double temp = entrada.nextDouble();
			listTemp.add(temp);
		}
		System.out.println("=============================");
		
		// exibindo as temperaturas
		System.out.println("---\t Temperaturas Cadastradas\t ---");
		listTemp.forEach(t -> System.out.println(t + " "));
		
		// calculando as médias
		Iterator<Double> iterator = listTemp.iterator();
		double soma = 0.0;
		while(iterator.hasNext()) {
			double next = iterator.next();
			soma += next;
		}
		double media = soma / listTemp.size();
		System.out.println("---\t Média das temperaturas\t ---");
		System.out.println("Média das temperaturas = " + media);
		
		// exibindo as temperaturas acima da média
		System.out.println("--- \tTemperaturas acima da média\t --- ");
		listTemp.stream()
        .filter(t -> t > media)
        .forEach(t -> System.out.printf("%.1f ", t));
		
		// exibindo o mês das temperaturas acima da média
		System.out.println("\n\n\t--- MESES TEMPERATURAS ACIMA DA MÉDIA \t ---");
		
		Iterator<Double> iterator2 = listTemp.iterator();
		
		int count = 0;
		
		while(iterator2.hasNext()) {
			Double temp = iterator2.next();
			if (temp > media ) {
				switch (count) {
					case 0:
						System.out.printf("1- Janeiro: %.1f\n", temp);
						break;
					case 1:
						System.out.printf("2- Fevereiro: %.1f\n", temp);
						break;
					case 2:
						System.out.printf("3- Março: %.1f\n", temp);
						break;
					case 3:
						System.out.printf("4- Abril: %.1f\n", temp);
						break;
					case 4:
						System.out.printf("5- Maio: %.1f\n", temp);
						break;
					case 5:
						System.out.printf("6- Junho: %.1f\n", temp);
						break;
					default:
						System.out.println("Nenhuma temperatura foi acima da média. ");
			
				}
			}
			count++;
		}
			
		
		entrada.close();

	}

}
