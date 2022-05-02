package in.synxt.strings;

import java.util.Scanner;

public class ChangeCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Sentence");
		String inputStr = sc.nextLine();
		System.out.println("1)Lower Case \n 2)Uppercase \n3)Title Case");
		int choice = Integer.parseInt(sc.nextLine());

		if(choice == 1) {
			if(!inputStr.toLowerCase().equals(inputStr)){				
				inputStr = inputStr.toLowerCase();
			}
		}else if(choice == 2){
			if(!inputStr.toUpperCase().equals(inputStr)){
				inputStr = inputStr.toUpperCase();
			}
		}else {
			String[] words = inputStr.split(" ");
			StringBuilder titleCaseStr = new StringBuilder();
			for(String word:words) {
				titleCaseStr.append(Character.toUpperCase(word.charAt(0)))
							.append(word.substring(1))
							.append(" ");
			}
			inputStr = titleCaseStr.toString();
		}
		System.out.println(inputStr);
		System.out.println("THE END");
	}
}
