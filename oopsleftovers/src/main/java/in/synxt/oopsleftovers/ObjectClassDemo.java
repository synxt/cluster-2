package in.synxt.oopsleftovers;

public class ObjectClassDemo {
	public static void main(String[] args) {
		Employee emp = new Employee(1);
		emp.setEmpName("Geetha");
		emp.setEmpSalary(150000);
		emp.setGender(Gender.MALE);
		
		Employee empTwo = new Employee(1);
		empTwo.setEmpName("Seetha");
		empTwo.setEmpSalary(150000);
		
		
		if(emp.equals(empTwo)) {
			System.out.println("Both are equal");
		}else {
			System.out.println("Both are not equal");
		}
		System.out.println(emp);
		System.out.println(empTwo.getClass());
		
		System.out.println(emp.getGender().canMarry(18));
		
		Gender obj = Enum.valueOf(Gender.class,"MALE");
		Gender nobj= Gender.MALE;
		System.out.println(obj==nobj);
		
	}
}
