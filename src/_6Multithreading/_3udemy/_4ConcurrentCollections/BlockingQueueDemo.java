package _6Multithreading._3udemy._4ConcurrentCollections;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * 
 * BlockingQueue -> an interface that represents a queue that is thread safe Put
 * items or take items from it ...
 * 
 * For example: one thread putting items into the queue and another thread
 * taking items from it at the same time !!! We can do it with producer-consumer
 * pattern !!!
 * 
 * put() putting items to the queue take() taking items from the queue
 * 
 */

class FirstWorker implements Runnable {

	private BlockingQueue<Integer> blockingQueue;
	private int i = 0;

	public FirstWorker(BlockingQueue<Integer> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		try {
			while (true) {
				System.out.println("Putting ");
				blockingQueue.put(i++);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class SecondWorker implements Runnable {

	private BlockingQueue<Integer> blockingQueue;

	public SecondWorker(BlockingQueue<Integer> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		try {
			while (true) {
				System.out.println("Getting" + blockingQueue.take());
				System.out.println("Getting" + blockingQueue.take());
				System.out.println("Getting" + blockingQueue.take());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class BlockingQueueDemo {
	public static void main(String[] args) {
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
		FirstWorker firstWorker = new FirstWorker(queue);
		SecondWorker secondWorker = new SecondWorker(queue);
		new Thread(firstWorker).start();
		new Thread(secondWorker).start();
	}
}
