package _6Multithreading._3udemy._8ForkJoinFramework;

import java.util.concurrent.ForkJoinPool;

public class RecursiveActionDemo {

	public static void main(String[] args) {
		SimpleRecursiveAction simpleRecursiveAction = new SimpleRecursiveAction(400);

		new ForkJoinPool(Runtime.getRuntime().availableProcessors()).invoke(simpleRecursiveAction);

	}
}
