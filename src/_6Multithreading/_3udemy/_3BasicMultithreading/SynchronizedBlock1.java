package _6Multithreading._3udemy._3BasicMultithreading;

public class SynchronizedBlock1 {
	private static int count1 = 0;
	private static int count2 = 0;

	static Object lock1 = new Object();
	static Object lock2 = new Object();

	static void increament1() {
		synchronized (lock1) {
			count1++;
		}
	}

	static void increament2() {
		synchronized (lock2) {
			count2++;
		}
	}

	static void compute() {
		for (int i = 1; i <= 1000; i++) {
			increament1();
			increament2();
		}
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				compute();
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				compute();
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
		System.out.println("count1: " + count1 + " count2: " + count2);
	}

}
