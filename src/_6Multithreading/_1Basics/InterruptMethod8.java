package _6Multithreading._1Basics;

public class InterruptMethod8 {
	public static void main(String args[]) throws InterruptedException {
		MyThread8 t = new MyThread8();
		t.start();

		t.interrupt();// line1
		System.out.println("End of main");
	}
}

class MyThread8 extends Thread {
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("I am lazy thread "+i);
				if (i > 1) {
					Thread.sleep(5000);
				}
			}
		} catch (InterruptedException e) {
			System.out.println("I got interrupted");
		}
	}
}
