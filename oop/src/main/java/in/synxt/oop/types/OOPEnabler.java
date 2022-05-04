package in.synxt.oop.types;

import java.util.Scanner;

public class OOPEnabler {
	public static void initializeStudents(Student[] students) {
		for(int i=0;i<students.length;i++) {
			students[i] = new Student();
		}
	}
	public static void main(String[] args) {		
		int noOfStudents;		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students");
		noOfStudents = Integer.parseInt(sc.nextLine());
		Student[] students = new Student[noOfStudents];
		initializeStudents(students);
		for(int i=0;i<noOfStudents;i++) {
			System.out.println("Enter student name");
			students[i].name = sc.nextLine();
			System.out.println("Enter students age");
			students[i].age = Integer.parseInt(sc.nextLine());
			System.out.println("Enter subject 1 marks");
			students[i].subjectOneMarks = Integer.parseInt(sc.nextLine());
			System.out.println("Enter subject 2 marks");
			students[i].subjectTwoMarks = Integer.parseInt(sc.nextLine());
			System.out.println("Enter subject 3 marks");
			students[i].subjectThreeMarks = Integer.parseInt(sc.nextLine());
		}
		System.out.println("Enter student name");
		String studentName = sc.nextLine();
		for(int i=0;i<students.length;i++) {
			if(students[i].name.equals(studentName)) {
				System.out.println("Name:"+students[i].name);
				System.out.println("Age:"+students[i].age);
				System.out.println("Subject 1"+students[i].subjectOneMarks);
				System.out.println("Subject 2"+students[i].subjectTwoMarks);
				System.out.println("Subject 3"+students[i].subjectThreeMarks);
				System.out.println("Total Marks"+(students[i].subjectOneMarks+students[i].subjectTwoMarks+students[i].subjectThreeMarks));
			}
		}
		System.out.println("Simple Change");
	}
}
