package in.synxt.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionDemo {
	public static void main(String[] args) {
		List<Warrior> pandavasons = new ArrayList<Warrior>(); 				
		pandavasons.add(new Warrior(1,"Yudhistir",15800000.0));
		pandavasons.add(new Warrior(2,"Arjun",25800000.0));
		pandavasons.add(new Warrior(3,"Bhim",55800000.3));
		pandavasons.add(new Warrior(4,"Nakul",45800000.3));
		pandavasons.add(new Warrior(5,"Sahadev",35800000.3));		
		pandavasons.add(new Warrior(6,"Karna",8800000.0));
		
		List<Warrior>  pandavas= new ArrayList<Warrior>(); 				
		pandavas.add(new Warrior(1,"Draupadhi",8800000.0));
		pandavas.add(new Warrior(2,"Pandu",58800000.0));
		pandavas.add(new Warrior(3,"Krishna",8800000.0));

		List<Warrior>  kowravas= new ArrayList<Warrior>(); 				
		kowravas.add(new Warrior(1,"Duryodhana",8800000.0));
		kowravas.add(new Warrior(2,"Drutharasta",58800000.0));
		kowravas.add(new Warrior(3,"Kunthi",8800000.0));
		kowravas.add(new Warrior(4,"Karna",8800000.0));
		
		/*
		 * // pandavas.addAll(pandavasons);
		 * 
		 * // pandavasons.retainAll(kowravas);
		 * 
		 * System.out.println(pandavasons);
		 * 
		 * pandavasons.remove(new Employee(5, "Karna", null));
		 * 
		 * System.out.println(pandavasons);
		 * 
		 * Iterator<Employee> emp = pandavasons.iterator(); while(emp.hasNext()) {
		 * System.out.println(emp.next()); }
		 */
		
		System.out.println("Using Enhanced Loop");
		for(Warrior emp:pandavasons) {
			System.out.println(emp);
		}
		
		System.out.println("Using Iterator");
		Iterator<Warrior> itr = pandavasons.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());			
		}
		
		System.out.println("Deletion using Iterator");
		itr = pandavasons.iterator();
		Warrior temp = null;
		while(itr.hasNext()) {
			temp = itr.next();
			if(temp.getName().equals("Karna")) {
				itr.remove();
			}
		}
		
		System.out.println("Using Iterator - after deletion");
		itr = pandavasons.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());			
		}
		
		System.out.println("Using Iterator");
		itr = pandavasons.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		System.out.println("Using index");
		int size = pandavasons.size();		
		for(int i=0;i<size;i++) {
			System.out.println(pandavasons.get(i));
		}
		
		System.out.println("Using List Iterator- Before Insert");
		ListIterator<Warrior> litr = pandavasons.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}		
		
		temp = null;
		boolean flag = false;
		litr = pandavasons.listIterator();
		while(litr.hasNext()) {
			temp = litr.next();
			if("Krishna".equals(temp.getName())) {
				flag = true;
				break;
			}
		}		
		if(!flag) {
			litr.add(new Warrior(15,"Krishna",185222223545.0));
		}
		
		
		System.out.println("Using List Iterator - After Insert");
		litr = pandavasons.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		
	}
}
