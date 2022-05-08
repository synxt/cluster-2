package in.synxt.infbasedprogramming;

import in.synxt.infbasedprogramming.io.EmployeeIO;

public class App {
	public static void main(String[] args) {
		EmployeeIO io = new EmployeeIO();
		Employee[] emps = io.readEmployee();
		io.printTaxes(emps);
	}
}
