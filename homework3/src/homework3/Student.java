package homework3;

public class Student extends User {
	String courses;
	int homeworkDoneNumber;
	
	public Student() {
		
	}

	public Student(String courses, int homeworkDoneNumber) {
		super();
		this.courses = courses;
		this.homeworkDoneNumber = homeworkDoneNumber;
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

	public int getHomeworkDoneNumber() {
		return homeworkDoneNumber;
	}

	public void setHomeworkDoneNumber(int homeworkDoneNumber) {
		this.homeworkDoneNumber = homeworkDoneNumber;
	}
	
}
