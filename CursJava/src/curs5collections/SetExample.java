package curs5collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {

		
		//cream un obiect generic de tip SET
		Set <String> se = new HashSet<String>();
		
		boolean verificaSet = se.isEmpty();
		System.out.println("Verifica daca setul este gol sau nu: " + verificaSet);
		
		se.add("RealMadrid");
		
		boolean verificaSet2 = se.isEmpty();
		System.out.println("Verifica daca setul este gol sau nu: " + verificaSet2);
		System.out.println("Nr elemente in set :" + se.size());
		
		se.add("RealMadrid");
		se.add("PSG");
		System.out.println("Noul nr de elemente in set :" + se.size());
		
		se.remove("PSG");
		System.out.println("Ultimul nr de elemente in set :" + se.size());
		
		System.out.println(se);

	}

}
