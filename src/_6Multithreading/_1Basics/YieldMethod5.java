package _6Multithreading._1Basics;

public class YieldMethod5 {

	public static void main(String args[]) throws Exception {
		MyThread5 t = new MyThread5();
		t.start();
		for (int i = 0; i < 100; i++) {
			System.out.println("main- thread");//
		}
	}
}

class MyThread5 extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("child thread-1");
			Thread.yield();// line 1
			System.out.println("child thread-2");
		}
	}
}
