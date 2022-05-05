package in.synxt.typesnobjects.entities;

public class Shop {
	private String name;
	private String phoneNumber;
	private String address;
	private int space;
	private String ownerName;
	private String gstNo;
	private Product[] products = new Product[100];
	private Employee[] employees = new Employee[100];
	private Order[] orders = new Order[100];
	public Shop() {
		
	}
	public Shop(String name,String ownerName,String gstNo) {
		this.name = name;
		this.ownerName = ownerName;
		this.gstNo = gstNo;				
	}
	
	public String getName() {
		return name;
	}

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

	public int getSpace() {
		return space;
	}

	public void setSpace(int space) {
		this.space = space;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getGstNo() {
		return gstNo;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}

	public Order[] getOrders() {
		return orders;
	}

	public void setOrders(Order[] orders) {
		this.orders = orders;
	}
	public static void display(String wish) {
		System.out.println(wish);
	}
}
