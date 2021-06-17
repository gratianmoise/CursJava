package curs4.Array;

import java.util.Random;

public class ArrayExample2 {
	
	private static final int LUNGIME = 6;
	private static final int NUMERE_MAXIME = 10;

	public static void main(String[] args) {
		
		printeazaNumerele(genereazaNr());

	}
	
	//cautare secventiala in array
	public static boolean cautaNr(int array[], int numarCautat) {
		
		
		for(int value: array) {
			if(value == numarCautat) {
				return true;
			}
		}
		return false;
	}
	
	//genereaza numere random pana la 10 si le tine intr-un array.
	public static int[] genereazaNr() {
		
		int[] numere = new int[LUNGIME];
		Random random = new Random();
		
		for (int i = 0; i<LUNGIME; i++) {
			
			int nrRandom;
			
			do {
				nrRandom = random.nextInt(NUMERE_MAXIME);

			}while(cautaNr(numere, nrRandom));
			
			numere[i] = nrRandom;
		}
		
	    return numere;
	}
	
	
	//printeaza numerele
	public static void printeazaNumerele(int numere[]) {
		
		for(int i = 0; i<LUNGIME; i++) {
			
			System.out.print(numere[i] + " | ");
			
		}
	}
}
