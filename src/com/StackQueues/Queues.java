package com.StackQueues;

public class Queues {
	int Queue[]=new int[5];
	int size;
	int front;
	int rear;
	
	public void enQueue(int data) {
		Queue[rear]=data;
		rear=rear+1;
		size=size+1;
	}
	
	public void print() {
		System.out.print("Queue Element :");
		for (int i = 0; i < size; i++) {
			System.out.print(Queue[i]+" -> ");
		}
	}

}
