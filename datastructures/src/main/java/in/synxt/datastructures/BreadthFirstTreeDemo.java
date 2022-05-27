package in.synxt.datastructures;

public class BreadthFirstTreeDemo {
	public static void main(String[] args) {
		BreadthFirstTree tree = new BreadthFirstTree();
		tree.add(10, null);
		tree.add(20, 10);
		tree.add(30, 10);
		tree.add(15, 20);
		tree.add(16, 20);
		tree.add(17, 20);
		tree.add(18, 20);
		tree.add(40, 30);
		tree.add(50, 40);
		tree.add(60, 80);
		System.out.println(tree);
	}
}
