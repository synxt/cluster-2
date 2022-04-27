package in.synxt.loops;

import java.util.Scanner;

public class Piramids {
	public static void main(String[] args) {
		int input;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");		
		input = Integer.parseInt(sc.nextLine());
		if(input <= 0) {
			System.out.println("Input can not be lesser than zero");
			System.exit(0);
		}
		for(int j=1;j<=input;j++) {
			for(int i=1;i<=j;i++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int j=1;j<=input;j++) {
			for(int i=1;i<=input-j;i++) {
				System.out.print(" ");
			}
			for(int i=1;i<=j;i++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}	
}
