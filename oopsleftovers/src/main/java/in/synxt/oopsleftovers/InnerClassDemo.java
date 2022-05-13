package in.synxt.oopsleftovers;

import in.synxt.oopsleftovers.Employee.Policy;

public class InnerClassDemo {
	public static void main(String[] args) {
		/*
		 * Employee emp = new Employee(1); emp.setEmpName("Kamala");
		 * emp.setEmpSalary(250000); emp.setGender(Gender.FEMALE); emp.addPolicy(1,
		 * "ICICI Lombord", 5000000, 15000); emp.addPolicy(2, "Star Health", 10000000,
		 * 20000);
		 * 
		 * Employee.Policy[] policies = emp.getPolicies();
		 * System.out.println(policies[0].getInsuredAmount());
		 */
		/*
		 * Employee empOne = new Employee(1); Employee.Policy empOnePolicy = emp.new
		 * Policy();
		 * 
		 * Employee empTwo = new Employee(2); Employee.Policy empTwoPolicy = empTwo.new
		 * Policy();
		 * 
		 */
		Employee.Policy policy = new Employee.Policy();
		System.out.println(Employee.timings);
		Employee emp = new Employee(1);
		Employee empTwo = new Employee(2);
		
		System.out.println(emp.timings);
		System.out.println(empTwo.timings);
		
		Employee.timings = "9:30AM-5:30PM";
		
		System.out.println(Employee.timings);
		System.out.println(emp.timings);
		System.out.println(empTwo.timings);
		emp.setEmpName("Krishna");
		System.out.println(emp.getEmpName());
		System.out.println(empTwo.getEmpName());
		
	
		Policy p = new Policy();
	}
}
