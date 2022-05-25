package in.synxt.datastructures;

public class QueueDemo {
	public static void main(String[] args) {
		Queue queue = new LinkedList();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		queue.display();
		System.out.println(queue.remove()+"Removed");
		System.out.println(queue.remove()+"Removed");
		System.out.println(queue.remove()+"Removed");
		queue.display();
	}
}
