package in.synxt.store;

import java.util.ArrayList;
import java.util.List;

import in.synxt.models.Employee;

public class EmployeeStore {
	private List<Employee> emps = new ArrayList<Employee>();
	public EmployeeStore() {
		emps.add(new Employee(1,"Sujatha",150000,"9981852324"));
		emps.add(new Employee(2,"Kavitha",250000,"9981812345"));
		emps.add(new Employee(3,"Bhavitha",350000,"9966352324"));
		emps.add(new Employee(4,"Sabhtha",400000,"8523697410"));
		emps.add(new Employee(5,"Sunandha",550000,"8523652324"));
		emps.add(new Employee(6,"Latha",950000,"9966652324"));		
	}
	public List<Employee> getEmps() {
		return emps;
	}
	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	} 
	
}
