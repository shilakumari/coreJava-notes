package _6Multithreading._1Basics;

public class Test2 {
	public static void main(String args[]) throws Exception {
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++)
			System.out.println("main() thread");
	}
}

class MyRunnable implements Runnable// defining a thread
{
	public void run()// job of a thread
	{
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread");
		}
	}
}
