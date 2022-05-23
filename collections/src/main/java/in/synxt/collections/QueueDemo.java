package in.synxt.collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
	public static void main(String[] args) {
		/*
		 * Queue<Integer> numbers = new ArrayBlockingQueue<Integer>(5); numbers.add(10);
		 * numbers.add(20); numbers.add(15); numbers.add(16); numbers.add(30);
		 * numbers.add(80); System.out.println(numbers);
		 * System.out.println(numbers.remove()); System.out.println(numbers);
		 * System.out.println(numbers.remove()); System.out.println(numbers);
		 * System.out.println(numbers.remove()); System.out.println(numbers);
		 * System.out.println(numbers.remove()); System.out.println(numbers);
		 * System.out.println(numbers.remove()); System.out.println(numbers);
		 */
		Queue<Integer> numbers = new ArrayBlockingQueue<Integer>(5);
		numbers.offer(10);
		numbers.offer(20);
		numbers.offer(15);
		numbers.offer(16);
		System.out.println(numbers.offer(30));
		numbers.offer(80);
		
		System.out.println(numbers);
		System.out.println(numbers.poll());
		System.out.println(numbers);
		System.out.println(numbers.poll());
		System.out.println(numbers);
		System.out.println(numbers.poll());
		System.out.println(numbers);
		System.out.println(numbers.poll());
		System.out.println(numbers);
		System.out.println(numbers.poll());
		System.out.println(numbers);
	}
}
