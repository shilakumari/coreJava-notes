package _6Multithreading._3udemy._8ForkJoinFramework;

import java.util.concurrent.ForkJoinPool;

public class RecursiveActionDemo2 {

	public static void main(String[] args) {

		SimpleRecursiveAction2 simpleRecursiveAction2 = new SimpleRecursiveAction2(200);
		System.out.println(new ForkJoinPool(Runtime.getRuntime().availableProcessors()).invoke(simpleRecursiveAction2));

	}
}
