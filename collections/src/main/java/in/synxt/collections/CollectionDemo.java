package in.synxt.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionDemo {
	public static void main(String[] args) {
		Collection<Employee> pandavasons = new ArrayList<Employee>(); 				
		pandavasons.add(new Employee(1,"Yudhistir",15800000.0));
		pandavasons.add(new Employee(2,"Arjun",25800000.0));
		pandavasons.add(new Employee(3,"Bhim",55800000.3));
		pandavasons.add(new Employee(4,"Nakul",45800000.3));
		pandavasons.add(new Employee(5,"Sahadev",35800000.3));		
		pandavasons.add(new Employee(6,"Karna",8800000.0));
		
		Collection<Employee>  pandavas= new ArrayList<Employee>(); 				
		pandavas.add(new Employee(1,"Draupadhi",8800000.0));
		pandavas.add(new Employee(2,"Pandu",58800000.0));
		pandavas.add(new Employee(3,"Krishna",8800000.0));

		Collection<Employee>  kowravas= new ArrayList<Employee>(); 				
		kowravas.add(new Employee(1,"Duryodhana",8800000.0));
		kowravas.add(new Employee(2,"Drutharasta",58800000.0));
		kowravas.add(new Employee(3,"Kunthi",8800000.0));
		kowravas.add(new Employee(4,"Karna",8800000.0));
		
	//	pandavas.addAll(pandavasons);
		
//		pandavasons.retainAll(kowravas);
		
		System.out.println(pandavasons);
		
		pandavasons.remove(new Employee(5, "Karna", null));
		
		System.out.println(pandavasons);
		
		Iterator<Employee> emp = pandavasons.iterator();
		while(emp.hasNext()) {
			System.out.println(emp.next());
		}					
	}
}
