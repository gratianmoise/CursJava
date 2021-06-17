package curs3.inheritance;

public class TesterInheritance {

	public static void main(String[] args) {

		TesterAutomat tester1 = new TesterAutomat();
		
		tester1.setlimbajProgramare("Java");
		tester1.setSeniority("Junior");
		tester1.setDepartament("QA");
		tester1.setName("Gratian");
		tester1.setEmail("gm@gmail.com");
		
		
		System.out.println("Numele angajatului este " + tester1.getName() + ", el lucreaza in departamentul de " +
		tester1.getDepartament() + ", este de nivel " + tester1.getSeniority() + " si foloseste " + 
		tester1.getLimbajProgramare() + " ca sa scrie teste! ");
		
	}

}
