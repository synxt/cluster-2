package in.synxt.datastructures;

public class Tree {
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
		TreeNode found = null;
		if(node.content.equals(content)) {
			return node;
		}else {
			for(TreeNode child:node.children) {
				 found = findNodeInChildren(child,content);
				 if(found!=null) {
					 return found;
				 }
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "Tree [root=" + root + "]";
	}
	
}
