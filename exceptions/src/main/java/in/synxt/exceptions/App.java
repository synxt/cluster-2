package in.synxt.exceptions;

import java.util.Scanner;

public class App {
	public static void validateInput(int input) throws InvalidInputException{
		if(input==0) {
			throw new InvalidInputException("Invalid Input"); 
		}
	}
	public static void main(String[] args){
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number for division");
		a = sc.nextInt();
		b = sc.nextInt();		
		try {
			validateInput(b);
			System.out.println(a/b);			
		}catch(InvalidInputException ex) {
			System.out.println("Invalid Input");			
		}finally {
			System.out.println("Thank you");
		}
		
		PicUser user = new PicUser();
		try {
			user.showProfile(0);
		} catch (ProfileCanNotBeLoaded e) {
			e.printStackTrace();
		}
	}
}
