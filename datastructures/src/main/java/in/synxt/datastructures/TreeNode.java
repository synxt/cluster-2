package in.synxt.datastructures;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
	public Integer content;
	public List<TreeNode> children = new ArrayList<TreeNode>();
	public TreeNode(Integer content) {
		super();
		this.content = content;
	}
	@Override
	public String toString() {
		return "TreeNode [content=" + content + ", children=" + children + "]";
	}  
	
}
