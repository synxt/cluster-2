package in.synxt.strings;

import java.util.Scanner;

public class ChangeCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Sentence");
		String inputStr = sc.nextLine();		
		inputStr = inputStr.toLowerCase();
		System.out.println(inputStr);
	}
}
