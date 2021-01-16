package _6Multithreading._1Basics;

public class ThreadPriority4 {
	public static void main(String args[]) throws Exception {
		System.out.println("\n" + Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		System.out.println(Thread.currentThread().getPriority());

		MyThread4 t = new MyThread4();
		System.out.println(t.getPriority());//
		t.setPriority(6);
		System.out.println(t.getPriority());//

		t.start();
	}
}

class MyThread4 extends Thread {
	public void run() {
		System.out.println("\n" + Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(8);
		System.out.println(Thread.currentThread().getPriority());
	}
}
