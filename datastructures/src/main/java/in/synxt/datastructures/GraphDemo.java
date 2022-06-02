package in.synxt.datastructures;

public class GraphDemo {
	public static void main(String[] args) {
		GraphNode node10 = new GraphNode(10);
		GraphNode node20 = new GraphNode(20);
		GraphNode node30 = new GraphNode(30);
		GraphNode node40 = new GraphNode(40);
		GraphNode node60 = new GraphNode(60);
		GraphNode node70 = new GraphNode(70);
		GraphNode node80 = new GraphNode(80);

		Graph graph = new Graph();
		graph.add(node10);
		graph.add(node20);
		graph.add(node30);
		graph.add(node40);
		graph.add(node60);
		graph.add(node70);
		graph.add(node80);

		graph.add(node20, node10);
		graph.add(node30, node10);
		graph.add(node40, node10);
		graph.add(node80, node10);

		graph.add(node30, node20);

		graph.add(node70, node30);

		graph.add(node70, node60);

		graph.add(node10, node70);

		graph.add(node60, node80); 
		

		System.out.println(graph);
		
		graph.printConnections(60);
		graph.printPathDfs(10, 70);
	
		
	}
}
