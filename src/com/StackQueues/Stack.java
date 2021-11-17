package com.StackQueues;

public class Stack {

	int stack[] = new int[5];
	int top = 0;

	public void push(int data) {
		if (size() >= 5) {
			System.out.println("The stack is overflow.Not able to add value");
		} else {
			stack[top] = data;
			top++;
		}
	}

	public int pop() {
		int data = 0;
		if (isEmpty()) {
			System.out.println("The stack is underflow.The stack is empty");
		} else {
			top--;
			data = stack[top];
			stack[top] = 0;
		}
		return data;
	}
	
	public int size() {
		return top;
	}

	
	public boolean isEmpty() {
		return top <= 0;
	}


	public void print() {
		for (int n : stack) {
			System.out.print(n + " -> ");

		}
	}

}
