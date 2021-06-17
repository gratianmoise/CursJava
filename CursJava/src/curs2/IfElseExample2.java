package curs2;

import java.util.Scanner;

public class IfElseExample2 {

	public static void main(String[] args) {

		/**
		 * Facem un program care printeaza doua mesaje in functie de o conditie.
		 * Conditia este un nr. de buguri.
		 * Daca atinge sau depaseste norma ii spunem : Felicitari!
		 * Daca nu atinge norma, ii spunem: Mai incearca :))!
		 * Avem un nr. de buguri ca si norma care este egal cu 10.
		 * Dupa care intrebam utilizatorul cate buguri a introdus.
		 * In functie de cate buguri a introdus printam daca a atins norma sau nu.
		 */
		
		//ce stim?
		int nrDeBuguri = 10;
		
		//ce nu stim?
		
		System.out.println("Te rog sa introduci numarul de buguri gasit :");
		Scanner sc = new Scanner(System.in);
		int buguriGasite = sc.nextInt();
		
		sc.close();
		
		//conditia
		if(buguriGasite >= nrDeBuguri) {
			
			System.out.println("Felicitari!");
			
		}else {
			int buguriLipsa = nrDeBuguri - buguriGasite;
			System.out.println("Mai incearca :)), iti lipsesc"
					+ " " + buguriLipsa + "!");
		}
		
	}

}
