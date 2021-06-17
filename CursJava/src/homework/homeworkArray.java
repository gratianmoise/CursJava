package homework;

import java.util.Scanner;

public class homeworkArray {

	public static void main(String[] args) {
		
		

		
		String [] textArray = new String[12];
		
		textArray[0]  = "Ianuarie";
		textArray[1]  = "Februarie";
		textArray[2]  = "Martie";
		textArray[3]  = "Aprilie";
		textArray[4]  = "Mai";
		textArray[5]  = "Iunie";
		textArray[6]  = "Iulie";
		textArray[7]  = "August";
		textArray[8]  = "Septembrie";
		textArray[9]  = "Octombrie";
		textArray[10] = "Noiembrie";
		textArray[11] = "Decembrie";
		
		
		System.out.println("Te rugam sa introduci un numar: ");
		Scanner scan = new Scanner(System.in);
		String text = scan.next();
		scan.close();
		
		for(int i=textArray.length;;) {
			System.out.print("Luna reprezentata de acest numar este : " + textArray[i] + " ");
		}







		
		
	}

}
