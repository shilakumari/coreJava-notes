package _6Multithreading._2enhancement;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
	public static void main(String[] args) {
		// m1();
		// m2();
		// m3();
		// m4();
		// m5();
		//m6();
		 m7();
	}

	private static void m7() {
		Display d = new Display();
		MyThread4 t1 = new MyThread4(d, "Dhoni");
		MyThread4 t2 = new MyThread4(d, "Sachin");
		t1.start();
		t2.start();
	}

	private static void m6() {
		Display d = new Display();
		MyThread3 t1 = new MyThread3(d, "Dhoni");
		MyThread3 t2 = new MyThread3(d, "Sachin");
		t1.start();
		t2.start();
	}

	private static void m5() {
		Display d = new Display();
		MyThread2 t1 = new MyThread2(d, "Dhoni");
		MyThread2 t2 = new MyThread2(d, "Sachin");
		t1.start();
		t2.start();
	}

	private static void m4() {
		Display d = new Display();
		MyThread t1 = new MyThread(d, "Dhoni");
		MyThread t2 = new MyThread(d, "Sachin");
		t1.start();
		t2.start();
	}

	private static void m3() {
		Display d = new Display();
		MyThread t1 = new MyThread(d, "Dhoni");
		t1.start();
		System.out.println("End of main");
	}

	private static void m2() {
		Display d = new Display();
		d.wish("Dhoni");
	}

	private static void m1() {
		ReentrantLock l = new ReentrantLock();
		l.lock();
		l.lock();
		System.out.println(l.getHoldCount());// 2

		System.out.println(l.isLocked());// true
		System.out.println(l.isHeldByCurrentThread());// true
		System.out.println(l.getQueueLength());// 0
		l.unlock();
		System.out.println(l.getHoldCount());// 1
		System.out.println(l.isLocked());// true
		l.unlock();
		System.out.println(l.isLocked());// false
		System.out.println(l.isFair());// false

	}

	static class MyThread extends Thread {
		Display d;
		String name;

		MyThread(Display d, String name) {
			this.d = d;
			this.name = name;
		}

		public void run() {
			d.wish(name);
		}
	}

	static class MyThread2 extends Thread {
		Display d;
		String name;

		MyThread2(Display d, String name) {
			this.d = d;
			this.name = name;
		}

		public void run() {
			d.wish2(name);
		}
	}

	static class MyThread3 extends Thread {
		Display d;
		String name;

		MyThread3(Display d, String name) {
			this.d = d;
			this.name = name;
		}

		public void run() {
			d.wish3(name);
		}
	}

	static class MyThread4 extends Thread {
		Display d;
		String name;

		MyThread4(Display d, String name) {
			this.d = d;
			this.name = name;
		}

		public void run() {
			d.wish4(name);
		}
	}
}