package in.synxt.datastructures;

public class StackDemo {
	public static void main(String[] args) {
		Stack stack = new LinkedList();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.display();
		System.out.println(stack.pop()+"popd");
		System.out.println(stack.pop()+"popd");
		System.out.println(stack.pop()+"popd");
		stack.display();
	}
}
