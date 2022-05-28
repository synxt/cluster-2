package in.synxt.datastructures;

public class BSTNode {
	int content;
	BSTNode left;
	BSTNode right;
	public BSTNode(int content) {
		super();
		this.content = content;
	}
	public void add(int content) {		
		if(content>this.content) {
			if(this.right==null) {
				this.right = new BSTNode(content);
			}else {
				this.right.add(content);
			}
		}else {
			if(this.left==null) {
				this.left = new BSTNode(content);
			}else {
				this.left.add(content);
			}
		}
	}
	public boolean contains(int key) {
		if(this.content==key) {
			return true;
		}else if(this.content<key) {
			if(this.right ==null) {
				return false;
			}else {
				return this.right.contains(key);
			}
		}else {
			if(this.left ==null) {
				return false;
			}else {
				return this.left.contains(key);
			}
		}
	}
	@Override
	public String toString() {
		return "BSTNode [content=" + content + ", left=" + left + ", right=" + right + "]";
	}
	
}
