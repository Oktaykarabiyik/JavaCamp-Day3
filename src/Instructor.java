public class Instructor extends User {
private String experienceYear;

public Instructor () {
	
}

public Instructor(String experienceYear) {
	
	this.experienceYear = experienceYear;
}

public String getExperienceYear() {
	return experienceYear;
}

public void setExperienceYear(String experienceYear) {
	this.experienceYear = experienceYear;
}
}
