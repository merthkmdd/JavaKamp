package javaOdev3;

public class StudentManager extends userManager{
	public void addUser(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " added successfully");
	}
}
