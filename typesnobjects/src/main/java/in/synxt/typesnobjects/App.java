package in.synxt.typesnobjects;

import in.synxt.typesnobjects.entities.Employee;
import in.synxt.typesnobjects.entities.Order;
import in.synxt.typesnobjects.entities.OrderItem;
import in.synxt.typesnobjects.entities.Product;
import in.synxt.typesnobjects.entities.Shop;

public class App {
	public static void main(String[] args) {
		Shop shop = new Shop();

		shop.setPhoneNumber("9966996696");
		shop.setSpace(1500);
		
		
		Product productOne = new Product(1,33,"15-Mar-2023","15-Mar-2022");
		
		productOne.setName("Lux Soap");
		productOne.setPurchasePrice(32);
		productOne.setSalePrice(32);		
		productOne.setStockInHand(100);

		Product productTwo = new Product(2,20,"15-Dec-2022","15-Dec-2021");
		productTwo.setName("Five Star");
		productTwo.setPurchasePrice(20);
		productTwo.setSalePrice(20);		
		productTwo.setStockInHand(200);

		Product productThree = new Product(3,75,"30-Mar-2023","30-Mar-2022");
		productThree.setName("3Roses");
		productThree.setPurchasePrice(75);
		productThree.setSalePrice(75);
		productThree.setStockInHand(10);

		shop.getProducts()[0] = productOne;
		shop.getProducts()[1] = productTwo;
		shop.getProducts()[2] = productThree;

		Employee empOne = new Employee(1);
		empOne.setEmployeeName("Latha");
		empOne.setAddress("Naidupet");
		empOne.setDesignation("Manager");
		empOne.setSalary(20000);
		empOne.setPhoneNumber("9966556540");

		Employee empTwo = new Employee(2);
		empTwo.setEmployeeName("Seetha");
		empTwo.setAddress("Naidupet");
		empTwo.setDesignation("Manager");
		empTwo.setSalary(15000);
		empTwo.setPhoneNumber("9440556540");

		shop.getEmployees()[0] = empOne;
		shop.getEmployees()[1] = empTwo;

		Order orderOne = new Order(1,"01-Apr-2022");

		OrderItem itemOne = new OrderItem();
		itemOne.setProductId(1);
		itemOne.setQuantity(4);

		OrderItem itemTwo = new OrderItem();
		itemOne.setProductId(3);
		itemOne.setQuantity(1);

		orderOne.getItems()[0] = itemOne;
		orderOne.getItems()[1] = itemTwo;

		Order orderTwo = new Order(2,"02-Apr-2022");

		OrderItem itemThree = new OrderItem();
		itemThree.setProductId(1);
		itemThree.setQuantity(5);

		OrderItem itemFour = new OrderItem();
		itemFour.setProductId(2);
		itemFour.setQuantity(2);

		orderTwo.getItems()[0] = itemThree;
		orderTwo.getItems()[1] = itemFour;

		shop.getOrders()[0] = orderOne;
		shop.getOrders()[1] = orderTwo;
		double totalOrderValue = 0;
		for (OrderItem item : orderTwo.getItems()) {
			if (item != null) {
				totalOrderValue += shop.getProducts()[item.getProductId() - 1].getSalePrice() * item.getQuantity();
			}
		}
		System.out.println(totalOrderValue);

	}
}
