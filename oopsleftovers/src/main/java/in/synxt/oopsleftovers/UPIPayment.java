package in.synxt.oopsleftovers;

public class UPIPayment implements Payment{
	String level = "UPI Sub";
	@Override
	public boolean pay(String upiID,double amount, int pin) {
		System.out.println(amount+"is paid through UPI");
		return true;
	}	
}
