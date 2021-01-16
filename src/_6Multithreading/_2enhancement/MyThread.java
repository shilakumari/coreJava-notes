package _6Multithreading._2enhancement;

public class MyThread extends Thread {

	public MyThread(ThreadGroup tg, String name) {
		super(tg, name);
	}

	public void run() {
		System.out.println("Child Thread");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
	}
}
