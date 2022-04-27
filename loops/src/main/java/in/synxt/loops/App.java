package in.synxt.loops;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		int number = 0;
		int i = 11;
		int result = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		number = sc.nextInt();

		/*
		 * while (i <= 10) { result = number * i; System.out.println(number + "x" + i +
		 * "=" + result); i++; }
		 */

		/*
		 * for(;i<=10;i++) { result = number * i;
		 * System.out.println(number+"x"+i+"="+result); }
		 */

		do {
			result = number * i;
			System.out.println(number + "x" + i + "=" + result);
			i = i + 1;
		} while (i < 10);

		/*
		 * result = number * 2; System.out.println(number+"x"+2+"="+result);
		 * 
		 * result = number * 3; System.out.println(number+"x"+3+"="+result);
		 * 
		 * result = number * 4; System.out.println(number+"x"+4+"="+result);
		 * 
		 * result = number * 5; System.out.println(number+"x"+5+"="+result);
		 * 
		 * result = number * 6; System.out.println(number+"x"+6+"="+result);
		 * 
		 * result = number * 7; System.out.println(number+"x"+7+"="+result);
		 * 
		 * result = number * 8; System.out.println(number+"x"+8+"="+result);
		 * 
		 * result = number * 9; System.out.println(number+"x"+9+"="+result);
		 * 
		 * result = number * 10; System.out.println(number+"x"+10+"="+result);
		 */
	}
}
