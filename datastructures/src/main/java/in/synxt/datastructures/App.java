package in.synxt.datastructures;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(7,1);
		list.add(15,1);
		list.add(20,2);
		
		list.display();
	}
}
