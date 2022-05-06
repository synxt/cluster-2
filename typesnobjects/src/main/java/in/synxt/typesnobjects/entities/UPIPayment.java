package in.synxt.typesnobjects.entities;

public class UPIPayment extends Payment{
	private String upiID;
	public UPIPayment(String upiID,double amount) {
		super(amount);
		this.upiID = upiID;
	}	
	public String getUpiID() {
		return upiID;
	}
}
