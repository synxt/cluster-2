package in.synxt.oop;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		int noOfStudents;
		int noOfSubjects;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students");
		noOfStudents = Integer.parseInt(sc.nextLine());
		System.out.println("Enter number of subjects");
		noOfSubjects = Integer.parseInt(sc.nextLine());
		
		String[] names = new String[noOfStudents];
		int[]  ages = new int[noOfStudents];
		int[][] marks = new int[noOfStudents][noOfSubjects];
		String[] clss = new String[noOfStudents];  
		for(int i=0;i<noOfStudents;i++) {
			System.out.println("Enter student name");			
			names[i] = sc.nextLine();			
			System.out.println("Enter the class name");			
			clss[i] = sc.nextLine();		
			System.out.println("Enter the age of student");
			ages[i] = Integer.parseInt(sc.nextLine());
			for(int j=0;j<noOfSubjects;j++) {
				System.out.printf("Enter subject %d marks",(j+1));
				marks[i][j] = Integer.parseInt(sc.nextLine());
			}
		}
		String studentName;
		int totalMarks=0;
		
		while(true) {		
			System.out.println("Enter student name");
			studentName = sc.nextLine();
			int matchFoundAt = -1;
			for(int i=0;i<names.length;i++) {
				if(names[i].equals(studentName)) {
					matchFoundAt = i;
					break;
				}
			}
			
			if(matchFoundAt == -1) {
				System.out.println("Student not found");
				continue;
			}else {
				System.out.println("Age:"+ages[matchFoundAt]);
				System.out.println("Class:"+clss[matchFoundAt]);
				
				for(int i=0;i<marks[matchFoundAt].length;i++) {
					totalMarks+=marks[matchFoundAt][i];
				}
				System.out.println("Total Marks:"+totalMarks);
				break;
			}
		}
	}
}

