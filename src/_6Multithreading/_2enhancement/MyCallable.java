package _6Multithreading._2enhancement;

import java.util.concurrent.Callable;

public class MyCallable<V> implements Callable<V> {

	int num;

	MyCallable(int num) {
		this.num = num;
	}

	public V call() throws Exception {
		
		Thread.sleep(1243);
		System.out.println(
				Thread.currentThread().getName() + " is … responsible to find sum of first " + num + "numbers");
		Integer sum = 0;
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		return (V) sum;
	}
}
