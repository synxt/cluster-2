package in.synxt.datastructures;

public class LinkedList implements Queue,Stack{
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
	public int remove() {
		int content = head.content;
		head = head.nextNode;
		return content;
	}
	
	public void add(int content,int index) {
		Node newNode = new Node(content);
		if(head == null) {
			head = newNode;
		}else {
			
			if(index==0) {
				newNode.nextNode = head;	
				head = newNode;
			}else {
				Node temp = head;
				for(int i=1;i<index;i++) {
					temp = temp.nextNode;
				}
				newNode.nextNode = temp.nextNode;
				temp.nextNode = newNode;
				
			}
		}
	}
	
	public void delete(int index) {		
		if(head == null) {
			return;
		}else {			
			if(index==0) {
				head = head.nextNode;
			} else {
				Node temp = head;
				for(int i=1;i<index;i++) {
					temp = temp.nextNode;
				}
				temp.nextNode = temp.nextNode!=null?temp.nextNode.nextNode:null;				
			}
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
	@Override
	public void push(int content) {
		add(content);		
	}
	@Override
	public int pop() {
		Node temp = head;
		Node previous = temp;
		int content;
		if(head == null) {
			System.out.println("Stack is empty");			
		}else {
			while(temp.nextNode!=null) {
				previous = temp;
				temp = temp.nextNode;					
			}
			content = temp.content;
			previous.nextNode = null;
			return content;			
		}
		
		return 0;
	}
}
