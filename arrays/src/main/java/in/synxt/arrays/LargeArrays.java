package in.synxt.arrays;

import java.util.Scanner;

public class LargeArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Enter number of subjects");		
		int noOfSubjects = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter number of students");
		int noOfStudents = Integer.parseInt(sc.nextLine());
		
		String[] stuNames = new String[noOfStudents];
		int[] marks = new int[noOfStudents*noOfSubjects];
		int[] totalMarks = new int[noOfStudents];
		
		for(int j=0;j<noOfStudents;j++) {//j=0
			System.out.println("Enter student "+(j+1)+" name");
			stuNames[j] = sc.nextLine();
			for (int i = noOfSubjects*j,k=0; k < noOfSubjects; i++,k++) {
				System.out.println("Enter student "+(j+1)+" subject " + (k + 1) + " marks");
				marks[i] = Integer.parseInt(sc.nextLine());
				totalMarks[j]=totalMarks[j]+marks[i];
			}			
		}
		
		
		final String msg = "Total marks of ";
		for(int i=0;i<noOfStudents;i++) {
			System.out.println(msg+ stuNames[i] + totalMarks[i]);
		}
		
	}
}
