package in.synxt.datastructures;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(10,0);
		list.add(20,0);
		list.add(30,0);
		
		list.add(40,1);
		list.display();
		System.out.println("===========");
		list.delete(3);
		list.display();
	}
}
