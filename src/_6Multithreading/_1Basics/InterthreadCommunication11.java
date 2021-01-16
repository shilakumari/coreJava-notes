package _6Multithreading._1Basics;

public class InterthreadCommunication11 {
	public static void main(String[] args) throws InterruptedException {
		ThreadB b = new ThreadB();
		b.start();
		//Thread.sleep(10000); // o/p:5050
		//b.join();
		 //b.wait();//RTE,IllegalMonitorStateException
		System.out.println(b.total);	
	}
}
class ThreadB extends Thread {
	int total = 0;
	public void run() {
		for (int i = 1; i <= 100; i++)// n*(n+1)/2
		{
			total = total + i;
		}	
		//this.notify();//RTE,IllegalMonitorStateException
		//1 carores of lines of code
	}
}


