package homework3;

public class User {
	String email;
	String password;
	String userName;
	String courses;
	int age;
	
	public User() {
		
	}

	public User(String email, String password, String userName, String courses, int age) {
		super();
		this.email = email;
		this.password = password;
		this.userName = userName;
		this.courses = courses;
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
