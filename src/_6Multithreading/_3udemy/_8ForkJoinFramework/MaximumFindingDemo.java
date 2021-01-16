package _6Multithreading._3udemy._8ForkJoinFramework;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class MaximumFindingDemo {

	public static int THREASHOLD = 0;

	public static void main(String[] args) {

		long[] nums = initializeNums(30000000);
		THREASHOLD = nums.length / Runtime.getRuntime().availableProcessors();

		SequentialMaxFind normalMaxFind = new SequentialMaxFind();

		long start = System.currentTimeMillis();
		System.out.println("Max: " + normalMaxFind.sequentialMaxFinding(nums, nums.length));
		System.out.println("Time taken: " + (System.currentTimeMillis() - start) + "ms");

		System.out.println();

		ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
		MaximumFindTask findTask = new MaximumFindTask(nums, 0, nums.length);

		start = System.currentTimeMillis();
		System.out.println("Max: " + forkJoinPool.invoke(findTask));
		System.out.println("Time taken: " + (System.currentTimeMillis() - start) + "ms");
	}

	private static long[] initializeNums(int length) {

		Random random = new Random();

		long[] nums = new long[length];

		for (int i = 0; i < length; ++i)
			nums[i] = random.nextInt(100);

		return nums;
	}
}
