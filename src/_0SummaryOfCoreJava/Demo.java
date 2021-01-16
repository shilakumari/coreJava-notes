package _0SummaryOfCoreJava;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 2, 9, 6, 4 };
		int k = 3;
		int x = kthLargestNumberInArray(arr, k);
		System.out.println(x);
	}

	private static int kthLargestNumberInArray(int[] arr, int k) {
		// int kthLargest = 0;
		// List<Integer> list =
		// Arrays.stream(arr).sorted().distinct()..collect(Collectors.toList());

		Arrays.sort(arr);

		return arr[arr.length - k];
	}

}
