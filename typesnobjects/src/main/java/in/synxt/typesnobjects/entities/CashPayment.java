package in.synxt.typesnobjects.entities;

public class CashPayment extends Payment{
	
	private String denomination;	
	
	public CashPayment(String denomination,double amount) {
		super(amount);
		this.denomination = denomination;
	}
	public String getDenomination() {
		return denomination;
	}
	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}
	
}
