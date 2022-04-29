package in.synxt.arrays;

import java.util.Scanner;

public class TwoDArrays {
	public static void main(String[] args) {
		int noOfStudents;
		int noOfSubjects;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Students");
		noOfStudents = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Number Of Subjects");
		noOfSubjects = Integer.parseInt(sc.nextLine());
		int[][] marks = new int[noOfStudents][noOfSubjects];
		
		for(int i=0;i<noOfStudents;i++) {
			System.out.printf("Enter Student %d Details%n",(i+1));
			for(int j=0;j<noOfSubjects;j++) {
				System.out.printf("Enter Subject %d Marks%n",(j+1));
				marks[i][j] = Integer.parseInt(sc.nextLine());
			}
		}
		int total = 0;
		for(int i=0;i<noOfStudents;i++) {
			total = 0;
			for(int j=0;j<noOfSubjects;j++) {
				total += marks[i][j]; 
			}
			System.out.printf("Total Marks Of Student: %d %n",total); 
		}
		
	}
}
