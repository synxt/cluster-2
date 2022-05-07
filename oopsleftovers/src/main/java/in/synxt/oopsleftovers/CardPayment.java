package in.synxt.oopsleftovers;

public class CardPayment implements Payment{
	String level = "UPI Card";
	@Override
	public boolean pay(String cardNumber,double amount, int pin) {
		System.out.println(amount + "is paid through CARD");
		return true;
	}
}
