package in.synxt.typesnobjects.entities;

public class Payment {
	private String status;
	private double amount;	
	private int pin;
	public Payment(double amount) {
		super();
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getAmount() {
		return amount;
	}		
}
