package curs2;

import java.util.Scanner;

public class TemaIfElse {

	public static void main(String[] args) {
		/*
		 * Scriem un program care intreaba utilizatorul punctajul unui test.
		 * Daca utilizatorul introduce o valoare intre 0 si 65 atunci printeaza "Ai picat.Mai incearca"
		 * Daca utilizatorul introduce o valoare intre mai mare sau egala cu 66 atunci printeaza "Felicitari, ai trecut!"
		 */

		
		int i = 66;
		
		System.out.println("Te rugam sa introduci punctajul obtinut: ");
		
		Scanner punctajObtinut = new Scanner(System.in);
		int punctaj = punctajObtinut.nextInt();
		punctajObtinut.close();
		
		if (punctaj >= i) {
			System.out.println("Felicitari, ai trecut!");
		}
		else {
			System.out.println("Ai picat, mai incearca!");
		}
	}

}
