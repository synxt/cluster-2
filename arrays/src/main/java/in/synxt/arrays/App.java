package in.synxt.arrays;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String stuOneName;		
		int stuOneSubOne;
		int stuOneSubTwo;
		int stuOneSubThree;
		int stuOneSubFour;
		int stuOneSubFive;
		System.out.println("Enter student one name");
		stuOneName = sc.nextLine();
		System.out.println("Enter student one subject one marks");
		stuOneSubOne = Integer.parseInt(sc.nextLine());
		System.out.println("Enter student one subject two marks");
		stuOneSubTwo = Integer.parseInt(sc.nextLine());
		System.out.println("Enter student one subject three marks");
		stuOneSubThree = Integer.parseInt(sc.nextLine());
		System.out.println("Enter student one subject four marks");
		stuOneSubFour = Integer.parseInt(sc.nextLine());
		System.out.println("Enter student one subject five marks");
		stuOneSubFive = Integer.parseInt(sc.nextLine());
		String stuTwoName;
		int stuTwoSubOne;
		int stuTwoSubTwo;
		int stuTwoSubThree;
		int stuTwoSubFour;
		int stuTwoSubFive;
		System.out.println("Enter student two name");
		stuTwoName = sc.nextLine();
		System.out.println("Enter student Two subject one marks");
		stuTwoSubOne = Integer.parseInt(sc.nextLine());
		System.out.println("Enter student Two subject two marks");
		stuTwoSubTwo = Integer.parseInt(sc.nextLine());
		System.out.println("Enter student Two subject three marks");
		stuTwoSubThree = Integer.parseInt(sc.nextLine());
		System.out.println("Enter student Two subject four marks");
		stuTwoSubFour = Integer.parseInt(sc.nextLine());
		System.out.println("Enter student Two subject five marks");
		stuTwoSubFive = Integer.parseInt(sc.nextLine());
		
		int stuThreeSubOne;
		int stuThreeSubTwo;
		int stuThreeSubThree;
		int stuThreeSubFour;
		int stuThreeSubFive;
		String stuThreeName;
		
		System.out.println("Enter student three name");
		stuThreeName = sc.nextLine();
		
		System.out.println("Enter student Three subject one marks");
		stuThreeSubOne = Integer.parseInt(sc.nextLine());
		System.out.println("Enter student Three subject two marks");
		stuThreeSubTwo = Integer.parseInt(sc.nextLine());
		System.out.println("Enter student Three subject three marks");
		stuThreeSubThree = Integer.parseInt(sc.nextLine());
		System.out.println("Enter student Thee subject four marks");
		stuThreeSubFour = Integer.parseInt(sc.nextLine());
		System.out.println("Enter student Three subject five marks");
		stuThreeSubFive = Integer.parseInt(sc.nextLine());
		
		int stuOneTotalMarks = stuOneSubOne+stuOneSubTwo+stuOneSubThree+stuOneSubFour+stuOneSubFive;
		int stuTwoTotalMarks = stuTwoSubOne+stuTwoSubTwo+stuTwoSubThree+stuTwoSubFour+stuTwoSubFive;
		int stuThreeTotalMarks = stuThreeSubOne+stuThreeSubTwo+stuThreeSubThree+stuThreeSubFour+stuThreeSubFive;
		System.out.println("Total marks of student one"+ stuOneTotalMarks);
		System.out.println("Total marks of student two"+ stuTwoTotalMarks);
		System.out.println("Total marks of student three"+ stuThreeTotalMarks);		
	}
}
