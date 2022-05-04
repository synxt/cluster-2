package in.synxt.typesnobjects;

public class Order {
	int orderNo;
	String orderDate;
	double totalPrice;
	String deliveryMode;
	OrderItem[] items = new OrderItem[10];
}
