package in.synxt.collections;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		Employee[] emps = new Employee[5];
		
		ArrayList<Employee> list = new ArrayList<Employee>(); 
		
		
		emps[0] = new Employee(1,"Yudhistir",15800000.0);
		emps[1] = new Employee(2,"Arjun",25800000.0);
		emps[2] = new Employee(3,"Bhim",55800000.3);
		emps[3] = new Employee(4,"Nakul",45800000.3);
		emps[4] = new Employee(5,"Sahadev",35800000.3);
		
		list.add(new Employee(1,"Yudhistir",15800000.0));
		list.add(new Employee(2,"Arjun",25800000.0));
		list.add(new Employee(3,"Bhim",55800000.3));
		list.add(new Employee(4,"Nakul",45800000.3));
		list.add(new Employee(5,"Sahadev",35800000.3));
		
		System.out.println(emps[3]);
		
		System.out.println(list.get(3));
		
		Employee key = new Employee(5,"Sahadev",35800000.3);
		int index = -1;
		for(int i=0;i<emps.length;i++) {
			if(key.equals(emps[i])) {
				index = i;
				break;
			}
		}
		if(index!=-1) {
			System.out.println("Employee found @"+(index+1));
		}else {
			System.out.println("Employee Not Found");
		}
		
		index = list.indexOf(key);
		if(index!=-1) {
			System.out.println("Employee found @"+(index+1));
		}else {
			System.out.println("Employee Not Found");
		}
		
	}
}
