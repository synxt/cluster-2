package in.synxt.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GraphNode {
	int content;
	List<GraphNode> adjList;
	public GraphNode(int content) {
		super();
		this.content = content;
		this.adjList = new ArrayList<GraphNode>();
	}
	
	public void add(GraphNode adjNode) {
		adjList.add(adjNode);
	}

	@Override
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		builder.append(content+":");
		for(GraphNode node:adjList) {
			builder.append("-->"+node.content);
		}
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(content);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GraphNode other = (GraphNode) obj;
		return content == other.content;
	}
	
	
}
