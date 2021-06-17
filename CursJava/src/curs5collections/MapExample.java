package curs5collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {

		Map<Integer, String> mapa = new HashMap();
		
		boolean verificaMap = mapa.isEmpty();
		System.out.println("Verifica daca mapul este gol sau nu: " + verificaMap);
		
		mapa.put(9, "RealMadrid");
		
		boolean verificaMap2 = mapa.isEmpty();
		System.out.println("Verifica daca mapul este gol sau nu: " + verificaMap2);
		
		boolean verificaValoare = mapa.containsValue("RealMadrid");
		boolean verificaKey = mapa.containsKey(9);
		System.out.println(verificaKey);
		
	}

}
