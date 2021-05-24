package javaOdev3;


public class Instructor extends userJava{
	private String courses;
	
	public Instructor(int id, String firstName, String lastName, String email, String password, String courses) {
		super(id, firstName, lastName, email, password);
		this.courses = courses;
		
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

}