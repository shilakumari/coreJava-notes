package _6Multithreading._3udemy._7ParallelAlgorithm;

import java.util.Random;

public class MergeSortDemo {

	public static Random random = new Random();

	public static void main(String[] args) throws Throwable {
		int numOfThreads = Runtime.getRuntime().availableProcessors();
		System.out.println("Number of threads/cores: " + numOfThreads);
		int length = 9999999;
		int[] numbers = createRandomArray(length);
		// System.out.println("Array("+LENGTH+") elements before sort: ");
		// Print first 10 elements
		// printIntArray(a);

		MergeSort mergeSort = new MergeSort(numbers);

		long startTime1 = System.currentTimeMillis();
		mergeSort.parallelMergeSort(0, numbers.length - 1, numOfThreads);
		// mergeSort.showResult();
		long endTime1 = System.currentTimeMillis();
		System.out.printf("\nTime taken for 100 000 000 elements parallel =>  %6d ms \n", endTime1 - startTime1);
		// System.out.println("Array("+LENGTH+") elements after sort: ");
		// Print first 10 elements
		// printIntArray(a);

		startTime1 = System.currentTimeMillis();
		mergeSort.mergeSort(0, numbers.length - 1);
		// mergeSort.showResult();
		endTime1 = System.currentTimeMillis();
		System.out.printf("\nTime taken for 100 000 000 elements sequential =>  %6d ms \n", endTime1 - startTime1);
		// System.out.println("Array("+LENGTH+") elements after sort: ");
		// Print first 10 elements
		// printIntArray(a);
	}

	public static int[] createRandomArray(int length) {
		int[] a = new int[length];
		for (int i = 0; i < length; i++) {
			a[i] = random.nextInt(10000);
		}
		return a;
	}
}
