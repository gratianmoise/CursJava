package curs1.variabile;

public class ExempleVariabile {
	
	String prenume = " Moise";//instance variable
	static String greeting = "Numele meu este ";//static variable

	public static void main(String[] args) {
		
		ExempleVariabile obj = new ExempleVariabile();
		
		System.out.println(ExempleVariabile.greeting + obj.printeazaNume() + obj.prenume);
	}
	
	public String printeazaNume() {
		String nume = "Gratian";//local variable
		//System.out.println(nume);
        return nume;
	}

}
