package _6Multithreading._3udemy._3BasicMultithreading;

import java.util.ArrayList;
import java.util.List;

class Processor1 {
	private List<Integer> list = new ArrayList();
	private final int MAX_ITEMS = 5;
	private final int MIN_ITEMS = 0;
	private int value = 0;

	Object lock = new Object();

	public void produce() throws InterruptedException {
		synchronized (lock) {

			while (true) {
				if (list.size() == MAX_ITEMS) {
					System.out.println("Waiting for removing items from the list...");
					this.wait();
				} else {
					System.out.println("Adding: " + value);
					list.add(value);
					value++;
					this.notify();
				}

				Thread.sleep(500);
			}

		}
	}

	public void consume() throws InterruptedException {
		synchronized (lock) {
			while (true) {
				if (list.size() == MIN_ITEMS) {
					System.out.println("Waiting for adding items to the list...");
					this.wait();
					System.out.println("Notified");
				} else {
					System.out.println("Removed: " + list.remove(--value));
					this.notify();
				}
				Thread.sleep(500);
			}
		}
	}
}

public class ProducerAndConsumer1 {

	public static void main(String[] args) {

		Processor1 processor1 = new Processor1();

		Thread t1 = new Thread(new Runnable() {
			public void run() {
				try {
					processor1.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				try {
					processor1.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}