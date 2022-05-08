package in.synxt.infbasedprogramming.service;

import in.synxt.infbasedprogramming.Employee;

public class TaxCalculator implements TaxInf {
	public double calculateTax(Employee emp) {
		double empSalary = emp.getTotalSalary();
		if(empSalary<500000) {
			return emp.getTotalSalary()*0.05;
		}else if(empSalary>500000 && empSalary<1000000) {
			return emp.getTotalSalary()*0.2;
		}else {
			return emp.getTotalSalary()*0.3;
		}
	}
}
