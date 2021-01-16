package _6Multithreading._1Basics;

public class InterthreadCommunication12 {

	public static void main(String[] args) throws InterruptedException {
		ThreadC b = new ThreadC();
		b.start();

		//Thread.sleep(10000);//It will cause notify() call first and then wait() call and hence wait() will always wait for notification
		synchronized (b) {
			System.out.println("Main thread is going to try to call wait() method");// 1
			b.wait();// 2
		}
		System.out.println("main thread got notification call");// 5
		System.out.println(b.total);// 6
	}
}

class ThreadC extends Thread {
	int total = 0;

	public void run() {

		System.out.println("Child thread started calculation");// 3
		for (int i = 1; i <= 100; i++)// n*(n+1)/2
		{
			total = total + i;
		}
		synchronized (this) {
			System.out.println("Child thread trying to give notification");
			this.notify();// 4
		}
		// 1 carore lines of code
	}
}
