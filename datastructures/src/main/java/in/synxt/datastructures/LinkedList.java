package in.synxt.datastructures;

public class LinkedList {
	Node head;

	public void add(int content) {
		Node newNode = new Node(content);
		Node temp = null;
		if (head == null) {
			head = newNode;
		} else {
			temp = head;
			while (temp.nextNode != null) {
				temp = temp.nextNode;
			}
			temp.nextNode = newNode;
		}
	}
	
	public void add(int content,int index) {
		Node newNode = new Node(content);
		Node temp = null;
		if (head == null) {
			head = newNode;
		} else {
			temp = head;
			for(int i=1;i<index;i++) {
				temp = temp.nextNode;
			}
			newNode.nextNode = temp.nextNode;
			temp.nextNode = newNode;			 
		}
	}

	public void display() {
		Node temp = head;
		if (temp != null) {
			System.out.println(temp.content);
			while (temp.nextNode != null) {
				System.out.println(temp.nextNode.content);
				temp = temp.nextNode;
			}
		}
	}
}
