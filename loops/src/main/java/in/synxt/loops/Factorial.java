package in.synxt.loops;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int input;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");		
		input = Integer.parseInt(sc.nextLine());
		int result = 1;
		int i =1;
		
		assert input>=0 :"Number can not be lesser than zero";
		
		while(input>0&&i<=input) {
			result = result*i;
			i=i+1;
		}			
		
		System.out.printf("Factorial of %d is = %d\n",input,result);
		
	}
}
//5