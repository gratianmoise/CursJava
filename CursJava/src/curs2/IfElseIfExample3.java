package curs2;

import java.util.Scanner;

public class IfElseIfExample3 {

	public static void main(String[] args) {

		/**
		 * Pe baza unui punctaj vom atribui o nota.
		 * Punctajul este de la 0-100.
		 * Daca obtii <=90, B
		 * Daca obtii <=80, C
		 * Daca obtii <=70, D
		 * Daca obtii <=60, E
		 * Punctajul il aflam de la utilizator.
		 * printam nota.
		 */
		
		System.out.println("Introdu punctajul obtinut: ");
		
		Scanner scan = new Scanner(System.in);
		double punctaj = scan.nextDouble();
		scan.close();
		
		char nota;
		
		if(punctaj<=60) {
			nota = 'E';
		}
		else if(punctaj<=70) {
			nota = 'D';
		}
		else if(punctaj<=80) {
			nota = 'C';
		}
		else if(punctaj<=90) {
			nota = 'B';
		}
		else {
			nota = 'A';
		}
		System.out.println("Nota obtinuta de tine este :" + nota);
	}

}
