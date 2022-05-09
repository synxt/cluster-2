package in.synxt.oop;

import in.synxt.oop.types.Student;

public class StudentCreator {
	public static void main(String[] args) {
		Student student = new Student();
		student.age = 10;
		student.name = "Vedha";
		System.out.println(student); 
	}
}
