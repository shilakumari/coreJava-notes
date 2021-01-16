package _6Multithreading._3udemy._3BasicMultithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Processor2 implements Callable<String> {

	private int id;

	public Processor2(int id) {
		this.id = id;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Id: " + this.id;
	}
}

public class CallableAndFuture1 {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(2);
		List<Future<String>> list = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			Future<String> future = executorService.submit(new Processor2(i + 1));
			list.add(future);
		}

		for (Future<String> future : list) {
			try {
				System.out.println(future.get());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		executorService.shutdown();

	}
}
