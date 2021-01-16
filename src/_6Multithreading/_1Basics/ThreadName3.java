package _6Multithreading._1Basics;

public class ThreadName3 {
	public static void main(String args[]) throws Exception {
		System.out.println(Thread.currentThread().getName());// main
		Thread.currentThread().setName("Vinay");
		System.out.println(Thread.currentThread().getName());// Vinay

		MyThread2 t = new MyThread2();
		System.out.println(t.getName());// Thread-0
		t.setName("child thread");
		System.out.println(t.getName());// child thread

		// System.out.println(10/0);

		t.start();
	}
}

class MyThread2 extends Thread {
	public void run() {
		System.out.println("\n" + Thread.currentThread().getName());
		Thread.currentThread().setName("inside child thread");
		System.out.println(Thread.currentThread().getName());
	}
}