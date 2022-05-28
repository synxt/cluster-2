package in.synxt.datastructures;

public class BSTDemo {
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.add(10);
		bst.add(20);
		bst.add(5);
		bst.add(25);
		bst.add(7);
		System.out.println(bst.contains(50));
		System.out.println(bst);
	}
}
