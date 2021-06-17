package curs1;

public class BugsCalculator {
	
	int oreLucrate = 40;

	public static void main(String[] args) {
		
		Tester obj = new Tester();
		obj.setNume("VanDamme");
		obj.setRatePerHour(50);
		obj.setAge(60);
		System.out.println(obj.getNume());
		
		BugsCalculator objCalc =new BugsCalculator();
		
		System.out.println("Salariul lui " + obj.getNume() +  " este :" + objCalc.calculateSalary(obj.getRatePerHour()) +"$");
		System.out.println(obj.getNume() + " are: "+ obj.getAge() + " ani!");
	}
	
	public int calculateSalary (int plataPeOra) {
		int salariu = oreLucrate * plataPeOra;
		return salariu;
	}

}
