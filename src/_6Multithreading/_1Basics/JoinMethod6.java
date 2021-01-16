package _6Multithreading._1Basics;

public class JoinMethod6 {
	public static void main(String args[]) throws Exception {
		MyThread6 t = new MyThread6();
		t.start();
		//t.join();// line 1
		 t.join(4000);
		// t.join(10000,300);
		for (int i = 0; i < 5; i++) {
			System.out.println("main- thread");//
		}
	}
}

class MyThread6 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("child thread-1");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
			}
			System.out.println("child thread-2");
		}
	}
}

