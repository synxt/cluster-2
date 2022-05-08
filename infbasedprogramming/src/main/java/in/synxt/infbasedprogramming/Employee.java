package in.synxt.infbasedprogramming;

public class Employee {
	private int empId;
	private String empName;
	private double totalSalary;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public double getTotalSalary() {
		return totalSalary;
	}
	public void setTotalSalary(double totalSalary) {
		this.totalSalary = totalSalary;
	}
	public Employee(int empId, String empName, double totalSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.totalSalary = totalSalary;
	}
	public Employee() {
		super();
	}
	
}
