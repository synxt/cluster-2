package in.synxt.basics2;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		App obj = new App();
		obj.readAndDisplay();
		
	}
	
	public void display(String msg) {
		System.out.println(msg.toUpperCase());
	}
	
	public void readAndDisplay() {
		String msg = null;
		Scanner sc = new Scanner(System.in);
		msg = sc.nextLine();
		display(msg);		
	}
}
