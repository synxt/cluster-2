package in.synxt.infbasedprogramming.service;

import in.synxt.infbasedprogramming.Employee;

public class NewRealmTaxCalculator implements TaxInf{
	public double calculateNewTax(double totalSalary) {
		if(totalSalary < 500000) {
			return totalSalary*0.05;			
		}else if (totalSalary>=500000 && totalSalary <1000000) {
			return totalSalary*0.1;			
		}else if (totalSalary>=1000000 && totalSalary <1500000) {
			return totalSalary*0.15;			
		}else if (totalSalary>=1500000 && totalSalary <2000000) {
			return totalSalary*0.2;			
		}else {
			return totalSalary*0.3;
		}
	}

	@Override
	public double calculateTax(Employee emp) {
		double totalSalary = emp.getTotalSalary(); 
		return calculateNewTax(totalSalary);
	}
}
