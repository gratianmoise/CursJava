package curs3.inheritance;

public class Qualification extends Teacher {
	
	public Qualification (int ExperienceYears, String classes, String schedule) {
		
		setClasses(classes);
		setExperienceYears(ExperienceYears);
		setSchedule(schedule);
		
	}
	
	public void verify() {
		
		if (getExperienceYears() > 3 && getClasses().equals("Java") && getSchedule().equals("Afternoon")){
		System.out.println("Te califici");
		
		}else {
		System.out.println("Nu te califici");
		}
	

	}	
}
