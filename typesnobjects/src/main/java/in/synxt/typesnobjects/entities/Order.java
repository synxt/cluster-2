package in.synxt.typesnobjects.entities;

public class Order {
	private int orderNo;
	private String orderDate;
	private double totalPrice;
	private String deliveryMode;
	private OrderItem[] items = new OrderItem[10];
	private int noOfItems = 0;
	public Order(int orderNo, String orderDate) {
		super();
		this.orderNo = orderNo;
		this.orderDate = orderDate;
	}
	public String getDeliveryMode() {
		return deliveryMode;
	}
	public void setDeliveryMode(String deliveryMode) {
		this.deliveryMode = deliveryMode;
	}
	public int getOrderNo() {
		return orderNo;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public OrderItem[] getItems() {
		return items;
	}
	public void setItems(OrderItem[] items) {
		this.items = items;
	}
	
}
