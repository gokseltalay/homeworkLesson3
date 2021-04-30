package homework3;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setUserName("Göksel");
		student1.setPassword("123456");
		student1.setAge(22);
		student1.setHomeworkDoneNumber(2);
		student1.setCourses("Java & React");
		
		Instructor instructor1 = new Instructor();
		instructor1.setEmail("engin demiroð mail");
		instructor1.setPassword("doðum tarihi");
		instructor1.setAge(30);
		instructor1.setCourses("Java & React");
		instructor1.setExpertise("software");
		
		StudentManager studentManager = new StudentManager();
		studentManager.learnAge(student1);
		
		InstructorManager instructorManager= new InstructorManager();
		instructorManager.addToCourses(instructor1);
	}

}
