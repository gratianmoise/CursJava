package curs3.inheritance;

public class Tester extends Angajat{
	
	private String departament;
	private String seniority;
	
	public void setDepartament(String departament) {
		this.departament = departament;
	}
	
	public void setSeniority(String seniority) {
		this.seniority = seniority;
	}
	
    public String getDepartament() {
	   return departament;
    }
    
    public String getSeniority() {
	   return seniority;
    }

}
