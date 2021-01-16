package _1LanguageFundamental._4Array;

import java.util.Arrays;

public class CopyOneArrayFromAnotherArray {

	public static void main(String[] args) {
		int[] original = { 1, 2, 3, 4, 5 };
		// System.out.println(Arrays.toString(original));
		int[][] array = { { 1, 2 }, { 3, 4 }, { 5, 6, 7 } };
		// System.out.println(Arrays.deepToString(array));
		// m1();
		// m2();
		//m3();
		m4();
	}

	private static void m1() {
		Integer[] original = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(original));

		Integer[] copied = new Integer[original.length];
		for (int i = 0; i < original.length; i++) {
			copied[i] = original[i] + 1;
		}
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copied));
		copied = new Integer[original.length];
		int i = 0;
		for (int element : original) {
			copied[i++] = ++element;
		}
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copied));
	}

	private static void m2() {
		Integer[] original = { 1, 2, 3, 4, 5 };
		Integer[] copied = original.clone();
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copied));

		int[] original2 = { 1, 2, 3, 4, 5 };
		int[] copied2 = original2.clone();
		System.out.println(Arrays.toString(original2));
		System.out.println(Arrays.toString(copied2));
	}

	private static void m3() {

		Integer[] original = { 1, 2, 3, 4, 5 };
		Integer[] copied = Arrays.copyOf(original, original.length);
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copied));

		int[] original2 = { 1, 2, 3, 4, 5 };
		int[] copied2 = Arrays.copyOf(original2, original2.length);
		System.out.println(Arrays.toString(original2));
		System.out.println(Arrays.toString(copied2));

	}
	
	private static void m4() {

		Integer[] original = { 1, 2, 3, 4, 5 };
		Integer[] copied = new Integer[original.length];
		System.arraycopy(original,0,copied,0,original.length);
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copied));

		int[] original2 = { 1, 2, 3, 4, 5 };
		int[] copied2 = new int[original2.length];
		System.arraycopy(original2,0,copied2,0,original2.length);
		System.out.println(Arrays.toString(original2));
		System.out.println(Arrays.toString(copied2));

	}

}
