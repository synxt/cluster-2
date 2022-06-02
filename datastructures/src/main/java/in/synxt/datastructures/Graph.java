package in.synxt.datastructures;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph {
	private List<GraphNode> nodes = new ArrayList<>();
	public void add(GraphNode node) {
		if(!nodes.contains(node)) {
			nodes.add(node);
		}
	}
	public void add(GraphNode node, GraphNode connectedNode) {
		if(!nodes.contains(node)) {
			nodes.add(node);
		}		
		if(nodes.contains(connectedNode)) {
			nodes.get(nodes.indexOf(connectedNode)).adjList.add(node);
		}else {
			System.err.println("Node to relate is not found");
		}
	}
	public void printConnections(int key) {
		for(GraphNode node:nodes) {
			if(node.content == key) {
				System.out.println(node.toString());
				break;
			}
		}
	}
	public void printPath(int from, int to) {
		Queue<GraphNode> queue = new LinkedList<GraphNode>();
		GraphNode fromNode = getNode(from);
		GraphNode toNode = getNode(to);
		queue.add(fromNode);
		GraphNode keyNode = null;
		while(!queue.isEmpty()) {
			keyNode = queue.poll();
			System.out.print("-->"+keyNode.content);
			if(keyNode.equals(toNode)) {
				return;
			}else {
				if(keyNode.adjList.contains(toNode)) {
					System.out.print("-->"+toNode.content);
					return;
				}else {
					for(GraphNode node: keyNode.adjList) {
						if(!queue.contains(node)) {
							queue.add(node);
						}
					}
					
				}
			}
		}
		
	}
	
	public void printPathDfs(int from, int to) {
		Deque<GraphNode> stack = new LinkedList<GraphNode>();
		GraphNode fromNode = getNode(from);
		GraphNode toNode = getNode(to);
		stack.addLast(fromNode);
		GraphNode keyNode = null;
		while(!stack.isEmpty()) {
			keyNode = stack.removeLast();
			System.out.print("-->"+keyNode.content);
			if(keyNode.equals(toNode)) {
				return;
			}else {
				if(keyNode.adjList.contains(toNode)) {
					System.out.print("-->"+toNode.content);
					return;
				}else {
					for(GraphNode node: keyNode.adjList) {
						if(!stack.contains(node)) {
							stack.add(node);
						}
					}
					
				}
			}
		}
		
	}
	
	
	private GraphNode getNode(int content) {
		GraphNode node = new GraphNode(content);
		return nodes.get(nodes.indexOf(node));
	}
	
	@Override
	public String toString() {
		return "Graph [nodes=" + nodes + "]";
	}
	
}
