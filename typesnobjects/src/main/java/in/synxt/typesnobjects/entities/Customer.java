package in.synxt.typesnobjects.entities;

public class Customer {
	private int customerNo;
	private String customerName;
	private String phoneNumber;
	private String address;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCustomerNo() {
		return customerNo;
	}

	public String getCustomerName() {
		return customerName;
	}

}
