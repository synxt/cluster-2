package in.synxt.jdbcbasics;

public class Account {
	private int accountNo;
	private String accountName;
	private double accountBalance;
	
	public Account(int accountNo, String accountName, double accountBalance) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
}
