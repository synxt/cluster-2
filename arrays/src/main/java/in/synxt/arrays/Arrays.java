package in.synxt.arrays;

import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String stuOneName;

		int[] studentOneMarks = new int[5];

		System.out.println("Enter student one name");
		stuOneName = sc.nextLine();
		for (int i = 0; i < 5; i++) {

			System.out.println("Enter student one subject " + (i + 1) + " marks");
			studentOneMarks[i] = Integer.parseInt(sc.nextLine());
		}

		String stuTwoName;
		int[] studentTwoMarks = new int[5];

		System.out.println("Enter student two name");
		stuTwoName = sc.nextLine();

		for (int i = 0; i < 5; i++) {
			System.out.println("Enter student two subject " + (i + 1) + " marks");
			studentTwoMarks[i] = Integer.parseInt(sc.nextLine());
		}

		String stuThreeName;
		int[] studentThreeMarks = new int[5];

		System.out.println("Enter student three name");
		stuThreeName = sc.nextLine();

		for (int i = 0; i < 5; i++) {
			System.out.println("Enter student Three subject " + (i + 1) + " marks");
			studentThreeMarks[i] = Integer.parseInt(sc.nextLine());
		}

		int stuOneTotalMarks = studentOneMarks[0] + studentOneMarks[1] + studentOneMarks[2] + studentOneMarks[3]
				+ studentOneMarks[4];
		int stuTwoTotalMarks = studentTwoMarks[0] + studentTwoMarks[1] + studentTwoMarks[2] + studentTwoMarks[3]
				+ studentTwoMarks[4];
		int stuThreeTotalMarks = studentThreeMarks[0] + studentThreeMarks[1] + studentThreeMarks[2]
				+ studentThreeMarks[3] + studentThreeMarks[4];
		
		final String msg = "Total marks of";
		
		System.out.println(msg+ stuOneName + stuOneTotalMarks);
		System.out.println(msg+ stuTwoName +stuTwoTotalMarks);
		System.out.println(msg+ stuThreeName +stuThreeTotalMarks);
	}
}
