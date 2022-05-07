package in.synxt.typesnobjects.entities;

public class CardPayment extends Payment{
	private String cardNo;
	private String cardType;
	private int pin;
	public CardPayment(String cardNo,String cardType,double amount) {
		super(amount);
		this.cardNo = cardNo;
		this.cardType = cardType;
	}
	public String getCardNo() {
		return cardNo;
	}
	public String getCardType() {
		return cardType;
	}
	
}
