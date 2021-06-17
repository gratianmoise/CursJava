package curs2;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {

		/**
		 * Un program care intreaba utilizatorul ce npta a obtinut.
		 * Pe baza notei ii intoarce un mesaj.
		 * Daca nota este A - Foarte bine.
		 * Daca nota este B - Destul de bine.
		 * Daca nota este C - Suficient de bine.
		 * Daca nota este D - Insuficient.
		 * Daca nu introduce niciuna din notele de mai sus - te rugam introdu o nota valida.
		 */
		
		System.out.println("Introdu nota primita: ");
		
		Scanner scan = new Scanner(System.in);
		String nota = scan.next();
		scan.close();
		
		switch(nota) {
		
		case "A":
			System.out.println("Foarte bine");
		break;	
		case "B":
			System.out.println("Destul de bine");
		break;
		case "C":
			System.out.println("Suficient de bine");
		break;
		case "D":
			System.out.println("Insuficient");
		break;
		default:
			System.out.println("Te rugam introdu o nota valida: ");
		break;
		
		}
	}

}
