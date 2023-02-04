package main;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class Main {

	public static void main(String[] args) {
		System.out.println("=== LISTA DE CARROS E CONSUMOS ===");
		Map<String, Double> carros = new HashMap<>() {{
			put("Gol", 14.4);
			put("Uno", 15.6);
			put("Mobi", 16.1);
			put("HB20", 14.5);
			put("Kwid", 15.6);
		}};
		
		System.out.println(carros.toString());
		
		// substituindo o consumo do gol para 15,2 km/l
		System.out.println("=== ALTERANDO VALOR DE CONSUMO GOL ===");
		carros.put("Gol", 15.2);
		System.out.println(carros.toString());
		// VERIFICAR SE TUCSON ESTA NO DICIONARIO
		System.out.println("Tucson est� no dicion�rio: " + carros.containsKey("Tucson"));
		
		// exibir o consumo do uno
		System.out.println("Consumo do uno = " + carros.get("Uno"));
		
		// exibir os modelos
		System.out.println("=== MODELOS ===");
		Set<String> modelos = carros.keySet(); // um keySet retorna um set
		System.out.println(modelos.toString());
		
		// exiba o consumo dos carros
		System.out.println("=== CONSUMO DOS CARROS ===");
		Collection<Double> consumos = carros.values();
		System.out.println(consumos.toString());
		
		// exibir o carro mais economico e seu consume
		System.out.println("=== MODELO MAIS ECON�MICO ===");
		Double consumoMaisEficiente = Collections.max(carros.values());
		Set<Map.Entry<String, Double>> entries = carros.entrySet();
		String modeloMaisEficiente = "";
		
		for (Map.Entry<String, Double> entry : entries) {
			if(entry.getValue().equals(consumoMaisEficiente)) {
				modeloMaisEficiente = entry.getKey();
			}
		}
		System.out.println("Modelo mais eficiente = " + modeloMaisEficiente.toString() + " - " + consumoMaisEficiente);
		
		// modelo menos economico
		System.out.println("=== MODELO MENOS EFICIENTE ===");
		
		Double consumoMenosEficiente = Collections.min(carros.values());
		String modeloMenosEficiente = "";
		
		for (Map.Entry<String, Double> entrada : carros.entrySet()) {
			if(entrada.getValue().equals(consumoMenosEficiente)) {
				modeloMenosEficiente = entrada.getKey();
			}
		}
		
		System.out.println(modeloMenosEficiente + " - " + consumoMenosEficiente);
		// soma dos consumos
		System.out.println("=== SOMA DOS CONSUMOS ===");
		Iterator<Double> iterator= carros.values().iterator();
		Double soma = 0d;
		
		while(iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
		System.out.println("Soma dos consumos = " + soma);
		
		// Exibir m�dia
		System.out.println("=== M�DIA DOS CONSUMOS ===");
		System.out.println("M�dia = " + soma / carros.size());
		
		// Remover os modelos com o consumo igual a 15,6km /l:
		System.out.println("=== REMO��O DE VE�CULOS IGUAL A 15.6 ===");
		System.out.println("Lista antes da remo��o");
		System.out.println(carros.toString());
		Iterator<Double> iterator1 = carros.values().iterator();
		
		while (iterator1.hasNext()) {
			if (iterator1.next().equals(15.6)) {
				iterator1.remove();
			}
		}
		System.out.println("Lista ap�s remo��o");
		System.out.println(carros.toString());
		
		// exibir na ordem em que foi informado
		//linked hash map = Mapa de hash vinculado 
		Map<String, Double> carros2 = new LinkedHashMap<>() {{
			put("Gol", 14.4);
			put("Uno", 15.6);
			put("Mobi", 16.1);
			put("HB20", 14.5);
			put("Kwid", 15.6);
		}};
		
		System.out.println(carros2.toString());
		// exibir em ordem alfabetica pelo modelo
		System.out.println("=== LISTA EM ORDEM ALFABETICA ===");
		Map<String, Double> carros3 = new TreeMap<>(carros2);
		System.out.println(carros3.toString());
		
		// apagar o dicionario de carros
		carros.clear();
		
		// verificar se est� vazio
		System.out.println("Vazio = " + carros.isEmpty());
		
	}

}