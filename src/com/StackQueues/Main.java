package com.StackQueues;

public class Main {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(56);
		stack.push(30);
		stack.push(70);
		stack.push(88);
		stack.push(76);
		stack.push(51);
		
		System.out.println(stack.peek());

		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();


		stack.pop();


		stack.print();

	}

}