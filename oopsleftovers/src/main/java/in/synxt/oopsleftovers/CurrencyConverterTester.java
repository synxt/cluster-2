package in.synxt.oopsleftovers;

import java.util.Scanner;

public class CurrencyConverterTester {
	public static void main(String[] args) {
		CurrencyConverter converter = null;
		String currency ="";
		System.out.println("Enter currency");
		Scanner sc = new Scanner(System.in);
		currency = sc.nextLine();
		switch(currency) {
		case "AUD":
			converter = new AUDConverter();
			break;
		case "EUR":
			converter = new EURConverter();
			break;
		case "USD":
			converter = new USDConverter();
			break;
		}
		
		System.out.println(converter.convert(1000));
				
	}
}
