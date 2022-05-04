package in.synxt.typesnobjects;

public class App {
	public static void main(String[] args) {
		Shop shop = new Shop();
		
		shop.name = "SVMart";
		shop.phoneNumber = "9966996696";
		shop.gstNo="GSTIN000111221210";
		shop.ownerName="Venkat";
		shop.space=1500;
		
		Product productOne = new Product();
		productOne.id = 1;
		productOne.name="Lux Soap";
		productOne.purchasePrice=32;
		productOne.salePrice=32;
		productOne.mrp=33;
		productOne.expDate="15-Mar-2023";
		productOne.stockInHand=100;
		
		
		Product productTwo = new Product();
		productOne.id = 2;
		productTwo.name="Five Star";
		productTwo.purchasePrice=20;
		productTwo.salePrice=20;
		productTwo.mrp=20;
		productTwo.expDate="15-Dec-2022";
		productTwo.stockInHand=200;
		
		Product productThree = new Product();
		productOne.id = 3;
		productThree.name="3Roses";
		productThree.purchasePrice=75;
		productThree.salePrice=75;
		productThree.mrp=76;
		productThree.expDate="30-Mar-2023";
		productThree.stockInHand=10;
		
		shop.products[0] = productOne;
		shop.products[1] = productTwo;
		shop.products[2] = productThree;
		
		Employee empOne = new Employee();
		empOne.employeeNo = 1;
		empOne.employeeName = "Latha";
		empOne.address = "Naidupet";
		empOne.designation = "Manager";
		empOne.salary = 20000;
		empOne.phoneNumber = "9966556540";
		
		Employee empTwo = new Employee();
		empTwo.employeeNo = 2;
		empTwo.employeeName = "Seetha";
		empTwo.address = "Naidupet";
		empTwo.designation = "Manager";
		empTwo.salary = 15000;
		empTwo.phoneNumber = "9440556540";
		
		shop.employees[0] = empOne;
		shop.employees[1] = empTwo;
		
		Order orderOne = new Order();
		orderOne.orderNo = 1;
		orderOne.orderDate = "01-Apr-2022";
		
		OrderItem itemOne = new OrderItem();
		itemOne.productId = 1;
		itemOne.quantity = 4;
		
		OrderItem itemTwo = new OrderItem();
		itemOne.productId = 3;
		itemOne.quantity = 1;
		
		orderOne.items[0] = itemOne;
		orderOne.items[1] = itemTwo;
		
		
		Order orderTwo = new Order();
		orderTwo.orderNo = 2;
		orderTwo.orderDate = "02-Apr-2022";
		
		OrderItem itemThree = new OrderItem();
		itemThree.productId = 1;
		itemThree.quantity = 5;
		
		OrderItem itemFour = new OrderItem();
		itemFour.productId = 2;
		itemFour.quantity = 2;
		
		orderTwo.items[0] = itemThree;
		orderTwo.items[1] = itemFour;
		
		
		shop.orders[0] = orderOne;
		shop.orders[1] = orderTwo;
		double totalOrderValue = 0;
		for(OrderItem item:orderTwo.items) {
			if(item!=null) {
				totalOrderValue+=shop.products[item.productId-1].salePrice*item.quantity;
			}
		}
		System.out.println(totalOrderValue);
		
	}
}
