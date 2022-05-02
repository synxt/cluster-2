package in.synxt.strings;

import java.util.Scanner;

public class ChangeCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Sentence");
		String inputStr = sc.nextLine();
		System.out.println("1)Lower Case \n 2)Uppercase");
		int choice = Integer.parseInt(sc.nextLine());
		if(choice == 1) { 
			if(!inputStr.toLowerCase().equals(inputStr)){				
				inputStr = inputStr.toLowerCase();
			}
		}else {
			if(!inputStr.toUpperCase().equals(inputStr)){
				inputStr = inputStr.toUpperCase();
			}
		}
		System.out.println(inputStr);
		System.out.println("THE END");
	}
}
