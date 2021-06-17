package curs4.String;

public class StringExample {

	public static void main(String[] args) {

		//inverseazaUnCuvant("gratian");
		paLindrome("ava");
		
	}

	/**
	 * Metoda care scrie un cuvant invers.
	 * @param cuvant
	 */
	public static void inverseazaUnCuvant(String cuvant) {
		
		for (int i=cuvant.length()-1; i>=0; i--) {
			System.out.print(cuvant.charAt(i));
		}
	}
	
	/**
	 * Verifica daca un string este palindrome
	 * @param cuvant
	 */
	public static void paLindrome(String cuvant) {
		
		String cuvantIntors = "";
		
		for (int i = cuvant.length()-1; i>=0; i--) {
			
			cuvantIntors = cuvantIntors + cuvant.charAt(i);
			}
		if (cuvantIntors.equals(cuvant)) {
			
			System.out.println("Cuvantul este polindrome");
			
		}else {
			
			System.out.println("Cuvantul nu este polindrome");
		}
		
	}
	
	
}
