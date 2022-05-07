package in.synxt.oopsleftovers;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class App {
	public static void main(String[] args) {
		Payment payment = null;

		System.out.println("Enter Payment Mode:\nU)UPI \nC)Card");
		Scanner sc = new Scanner(System.in);

		String paymentMode = sc.nextLine();

		System.out.println("Enter amount:");
		double amount = Double.parseDouble(sc.nextLine());

		System.out.println("Enter pin");
		int pin = Integer.parseInt(sc.nextLine());

		String payString = "";

		switch (paymentMode) {
		case "U":
			payment = new UPIPayment();

			System.out.println("Enter UPI ID");
			payString = sc.nextLine();

			break;
		case "C":
			payment = new CardPayment();

			System.out.println("Enter Card Number");
			payString = sc.nextLine();

			break;		
		}


		payment.pay(payString, amount, pin);

	}
}
