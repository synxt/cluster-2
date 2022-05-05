package in.synxt.typesnobjects.entities;

public class Product {
	private int id;
	private String name;
	private double mrp;
	private String expDate;
	private int stockInHand;
	private String mfd;
	private double salePrice;
	private double purchasePrice;
	
	public Product(int id, double mrp, String expDate, String mfd) {
		super();
		this.id = id;
		this.mrp = mrp;
		this.expDate = expDate;
		this.mfd = mfd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStockInHand() {
		return stockInHand;
	}
	public void setStockInHand(int stockInHand) {
		this.stockInHand = stockInHand;
	}
	public double getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
	public double getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public int getId() {
		return id;
	}
	public double getMrp() {
		return mrp;
	}
	public String getExpDate() {
		return expDate;
	}
	public String getMfd() {
		return mfd;
	}	
	
}
