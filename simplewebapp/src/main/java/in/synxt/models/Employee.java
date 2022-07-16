package in.synxt.models;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private String mobileNumber;
	
	public Employee() {
		super();
	}
	public Employee(int id, String name, double salary, String mobileNumber) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.mobileNumber = mobileNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", mobileNumber=" + mobileNumber + "]";
	}
}
