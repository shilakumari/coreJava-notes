package _6Multithreading._1Basics;

public class JoinMethod7 {
	public static void main(String args[]) throws InterruptedException {
		MyThread7.mt = Thread.currentThread();
		
		MyThread7 t = new MyThread7();
		t.start();
		
		// t.join(); it will cause deadlock like situation
		
		for (int i = 0; i < 5; i++) {
			System.out.println("main- thread");
			Thread.sleep(2000);
		}
	}
}

class MyThread7 extends Thread {
	static Thread mt;
	public void run() {
		try {
			mt.join(); // child thread calls join method on main thread object.
		} catch (InterruptedException e) {
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("child thread");
		}
	}
}