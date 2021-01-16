package _6Multithreading._4udemy._1ThreadCreation;

import java.util.ArrayList;
import java.util.List;

public class MultiExecutor {
	List<Runnable> tasks;
	// Add any necessary member variables here

	/*
	 * @param tasks to executed concurrently
	 */
	public MultiExecutor(List<Runnable> tasks) {
		this.tasks = tasks;
	}

	/**
	 * Starts and executes all the tasks concurrently
	 */
	public void executeAll2() {
		Thread thread = null;
		for (Runnable runnable : tasks) {
			thread = (Thread) runnable;
			thread.start();
		}
	}

	public void executeAll() {
		Thread thread = null;
		for (Runnable runnable : tasks) {
			thread = new Thread(runnable);
			thread.start();
		}
	}

	public void executeAll3() {
		List<Thread> threads = new ArrayList<>(tasks.size());
		for (Runnable task : tasks) {
			Thread thread = new Thread(task);
			threads.add(thread);
		}
		for (Thread thread : threads) {
			thread.start();
		}
	}

	public static void main(String[] args) {
		List<Runnable> tasks = new ArrayList<>();
		Thread thread = null;
		for (int i = 1; i <= 5; i++) {
			thread = new Thread(new Runnable() {
				@Override
				public void run() {
					System.out.println(Thread.currentThread().getName());
				}
			});
			tasks.add(thread);
		}
		MultiExecutor multiExecutor = new MultiExecutor(tasks);
		multiExecutor.executeAll();
	}
}