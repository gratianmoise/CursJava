package curs6Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsExample {

	public static void main(String[] args) {

		System.out.println("Introdu 2 numere: ");
		
		Scanner scan = new Scanner(System.in);
		 
		
		try {
			
			int a1 = scan.nextInt();
			int a2 = scan.nextInt();
			
			System.out.println(a1 + "/" + a2 + " = " + (a1/a2));
		}
		catch(InputMismatchException err) {
			
			System.out.println("Ai folosit alt data type in afara de int. Nu este persmis!");
			err.printStackTrace();
		}
        catch(ArithmeticException err) {
			
			System.out.println("Ai impartit la 0. Nu este permis!");
			err.printStackTrace();
		
		
	    }
        catch(Exception err) {
			
			System.out.println("Ai facut ceva gresit!");
			err.printStackTrace();
			}
	}
}


