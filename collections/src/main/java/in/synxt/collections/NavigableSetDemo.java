package in.synxt.collections;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {
	public static void main(String[] args) {
		NavigableSet<Integer> ages = new TreeSet<Integer>();
		ages.add(15);
		ages.add(18);
		ages.add(10);
		ages.add(12);
		ages.add(26);
		ages.add(7);
		ages.add(52);
		ages.add(36);
		ages.add(40);
		ages.add(62);
		ages.add(76);

		System.out.println(ages.subSet(15,false,36,false));
		System.out.println(ages.ceiling(11));
		System.out.println(ages.floor(11));
	}
}
