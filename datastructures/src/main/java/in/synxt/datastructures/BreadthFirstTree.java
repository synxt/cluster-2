package in.synxt.datastructures;

import java.util.Queue;
import java.util.LinkedList;
public class BreadthFirstTree {
	TreeNode root;
	public void add(Integer content, Integer parent) {
		if(root==null) {
			root = new TreeNode(content);
		}else {
			TreeNode keyNode =  findNodeInChildren(root,parent);
			if(keyNode!=null) {
				keyNode.children.add(new TreeNode(content));
			}else {
				System.err.println("Parent node"+parent+"not found");
			}
		}
	}
	public TreeNode findNodeInChildren(TreeNode node,Integer content) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		TreeNode keyNode; 
		queue.add(node);
		do {
			keyNode = queue.poll();
			if(keyNode.content.equals(content)) {
				return keyNode;
			}
			queue.addAll(keyNode.children);			
		}while(!queue.isEmpty());
		return null;

	}

	@Override
	public String toString() {
		return "Tree [root=" + root + "]";
	}
	
}
