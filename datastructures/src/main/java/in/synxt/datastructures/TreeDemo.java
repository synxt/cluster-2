package in.synxt.datastructures;

public class TreeDemo {
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.add(10, null);
		tree.add(20, 10);
		tree.add(30, 10);
		tree.add(40, 20);
		tree.add(50, 20);
		tree.add(60, 50);
		System.out.println(tree);
	}
}
