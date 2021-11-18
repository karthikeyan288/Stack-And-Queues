package com.StackQueues;

public class Main {
	public static void main(String[] args) {
		Queues value = new Queues();
		value.enQueue(56);
		value.enQueue(30);
		value.enQueue(70);
		value.enQueue(56);
		value.enQueue(30);
		value.enQueue(70);

		value.deQueue();
		value.deQueue();

		value.print();

	}

}