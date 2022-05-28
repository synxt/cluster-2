package in.synxt.datastructures;

public class BinarySearchTree {
	BSTNode root;
	public void add(int content) {
		if(root==null) {
			root = new BSTNode(content);
		}else {
			root.add(content);
		}
	}
	public boolean contains(int key) {
		if(root==null) {
			return false;
		}else {
			return this.root.contains(key);
		}
	}
	@Override
	public String toString() {
		return "BinarySearchTree [root=" + root + "]";
	}
	
}
