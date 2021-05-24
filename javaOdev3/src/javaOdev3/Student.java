package javaOdev3;


public class Student extends userJava{
	private String coursePercent;
	public Student(int id, String firstName, String lastName, String email, String password, String coursePercent) {
		super(id, firstName, lastName, email, password);
	}
	public String getCoursePercent() {
		return coursePercent;
	}

}
