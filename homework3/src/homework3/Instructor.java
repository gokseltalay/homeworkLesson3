package homework3;

public class Instructor extends User {
	String lessons;
	String expertise;
	
	public Instructor() {
		
	}

	public Instructor(String lessons, String expertise) {
		super();
		this.lessons = lessons;
		this.expertise = expertise;
	}

	public String getLessons() {
		return lessons;
	}

	public void setLessons(String lessons) {
		this.lessons = lessons;
	}

	public String getExpertise() {
		return expertise;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}
	
}
