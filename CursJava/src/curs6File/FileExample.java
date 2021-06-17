package curs6File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileExample {

	public static void main(String[] args) {

		//scriemFisier();
		//citimFisier();
		stergemFisier();
		
	}

	public static void scriemFisier() {
		
		try {
			FileWriter fisier = new FileWriter("fisier.txt");
			fisier.write("Am creat un fisier!");
			fisier.close();
            System.out.println("OK!");

		} catch (IOException e) {
            System.out.println("ceva error");
			e.printStackTrace();
		} 
		
	}
	
	public static void citimFisier() {
		
		
		try {
			
			File objFisier = new File("fisier.txt");
			Scanner scan = new Scanner(objFisier);
			
			while(scan.hasNextLine()) {
				String data = scan.nextLine();
				System.out.println("Ce scrie in fisier ? : " + data);
			}
			scan.close();
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Orice eroare!");
			e.printStackTrace();
		}
		
	}
	
	public static void stergemFisier() {
		
		File objFisier = new File("fisier.txt");
		if(objFisier.delete()) {
			System.out.println("Am sters fisierul creat " + objFisier.getName());
		}else {
			System.out.println("Nu am reusit sa sterg fisierul!");
		}
		
	}
	
}
