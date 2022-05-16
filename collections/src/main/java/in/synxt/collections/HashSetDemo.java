package in.synxt.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<Warrior> warriors = new HashSet<Warrior>();
		warriors.add(new Warrior(1, "Sivaji Maharaj", 85000000.0));
		warriors.add(new Warrior(2, "Srikrishna Devaray", 185000000.0));
		warriors.add(new Warrior(3, "Sivaji Maharaj", 85000000.0));
		
	}
}
