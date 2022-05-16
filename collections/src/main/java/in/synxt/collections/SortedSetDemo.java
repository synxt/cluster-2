package in.synxt.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
	public static void main(String[] args) {
		SortedSet<Warrior> warriors = new TreeSet<Warrior>();
		warriors.add(new Warrior(1, "Sivaji Maharaj", 85000000.0));
		warriors.add(new Warrior(2, "Srikrishna Devaray", 185000000.0));
		warriors.add(new Warrior(3, "Sivaji Maharaj", 85000000.0));
		System.out.println(warriors);
				
	}
}
