package _6Multithreading._1Basics;

public class InterruptMethod9 {
	public static void main(String args[]) throws InterruptedException {
		MyThread9 t = new MyThread9();
		t.start();
		t.interrupt();// line 1
		System.out.println("End of main");
	}
}

class MyThread9 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("I am lazy thread " + i);
		}
		System.out.println("I want to sleep");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			System.out.println("I got interrupted");
		}
	}
}