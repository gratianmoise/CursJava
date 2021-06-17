package curs5collections;

import java.util.ArrayList;

public class ExempluArrayList {

	public static void main(String[] args) {

		
		ArrayList<String> obj = new ArrayList<String>();
		
		obj.add("Gratian");
		obj.add("Dragos");
		obj.add("Carla");
		obj.add("Dana");
		obj.add("Gabriel");
		
		//printam marimea arrayListului
		System.out.println("Marimea arrayList este: " + obj.size());
		System.out.println("ArrayList contine :");
		
		
		//printam continutul
		for(String str : obj) {
			System.out.println(str);
		}
		
				
		//adaugam un element nou la un index dat
		obj.add(0, "MarcelIures");
		
		System.out.println("Noul ArrayList contine :");

		//printam continutul
		for(String str : obj) {
			System.out.println(str);
		}
				
		//sterge un element
		obj.remove("Dana");
		
		System.out.println("Noul ArrayList fara Dana contine :");
		
		for(String str : obj) {
			System.out.println(str);
		}
		
			
	}
	

}
