package com.StackQueues;

public class Queues {
	int Queue[] = new int[5];
	int size;
	int front;
	int rear;

	public void enQueue(int data) {
		if (isFull()) {
			System.out.println("The Queue is full");
		} else {
			Queue[rear] = data;
			rear = rear + 1;
			size = size + 1;
		}
	}

	public int deQueue() {
		int data = Queue[front];
		if (isEmpty()) {
			System.out.println("The Queue is empty");
		} else {
			front = front + 1;
			size = size + 1;
		}
		return data;
	}

	public boolean isFull() {
		return getSize() == 5;
	}

	public boolean isEmpty() {
		return getSize() == 0;
	}

	public int getSize() {
		return size;
	}

	public void print() {
		System.out.print("Queue Element :");
		for (int i = 0; i < size; i++) {
			System.out.print(Queue[(front + i) %5] + " -> ");
		}
		System.out.println();
		for (int n : Queue) {
			System.out.print(n + " ");
		}
	}

}