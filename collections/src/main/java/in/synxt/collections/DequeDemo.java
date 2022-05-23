package in.synxt.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
	public static void main(String[] args) {
		Deque<Integer> ages = new ArrayDeque<Integer>(5);
		ages.addLast(10);
		ages.addLast(20);
		ages.addLast(30);
		System.out.println(ages);
		System.out.println(ages.removeLast());
		System.out.println(ages.removeLast());
		System.out.println(ages.removeLast());
	}
}
