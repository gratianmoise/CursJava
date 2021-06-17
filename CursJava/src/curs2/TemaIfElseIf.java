package curs2;

import java.util.Scanner;

public class TemaIfElseIf {

	public static void main(String[] args) {
		/*
		 * Scriem un program care intreaba utilizatorul ce varsta are;
		 * Daca utilizatorul introduce o valoare sub 18, printeaza "Esti minor";
		 * Daca utilizatorul introduce o valoare intre 18 si 65, printeaza "Esti adult"(conditii multiple deci folosim If((cinditie1)&&(conditie2)));
		 * Daca utilizatorul introduce o valoare peste 65, printeaza "Esti batran".
		 */
		
		System.out.println("Introduceti varsta dumneavoastra: ");
		
		Scanner scan = new Scanner(System.in);
		int varsta = scan.nextInt();
		scan.close();
		
		if(varsta < 18) {
		    System.out.println("Esti minor!");
		}
		else if((varsta >= 18) && (varsta <= 65)) {
		    System.out.println("Esti adult!");
		}
		else {
			System.out.println("Esti batran!");
		}
		
		
	}

}
