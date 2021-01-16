package _6Multithreading._2enhancement;

public class MyThreadJob implements Runnable {
	String name;

	public MyThreadJob(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name + "…Job started by Thread: " + Thread.currentThread().getName());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
		}
		System.out.println(name + "…Job completed by Thread: " + Thread.currentThread().getName());

	}

}
