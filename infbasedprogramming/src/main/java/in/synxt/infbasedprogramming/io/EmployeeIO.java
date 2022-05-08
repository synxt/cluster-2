package in.synxt.infbasedprogramming.io;

import java.util.Scanner;

import in.synxt.infbasedprogramming.Employee;
import in.synxt.infbasedprogramming.service.NewRealmTaxCalculator;
import in.synxt.infbasedprogramming.service.TaxCalculator;
import in.synxt.infbasedprogramming.service.TaxInf;

public class EmployeeIO {
	public Employee[] readEmployee() {
		System.out.println("Enter numer of employees");
		Scanner sc = new Scanner(System.in);
		int numberOfEmployees = Integer.parseInt(sc.nextLine());		
		Employee[] emps = new Employee[numberOfEmployees];
		
		for(int i=0;i<numberOfEmployees;i++) {
			emps[i] = new Employee();
			System.out.print("Enter employee name");
			emps[i].setEmpName(sc.nextLine());
			System.out.print("Enter employee id");
			emps[i].setEmpId(Integer.parseInt(sc.nextLine()));
			System.out.println("Enter total salary");
			emps[i].setTotalSalary(Double.parseDouble(sc.nextLine()));
		}		
		return emps;
	}
	public void printTaxes(Employee[] emps) {
		TaxInf calculator = new NewRealmTaxCalculator() ; 
		
		for(int i=0;i<emps.length;i++) {
			System.out.println("Total tax of employee "+(i+1)+":"+calculator.calculateTax(emps[i]));
		}
	}
}
