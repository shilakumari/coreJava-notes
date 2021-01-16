package _7Collection._1Introduction;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraysClassDemo {

	public static void main(String[] args) {
		arraySorting();
		//arraySearching();
		//arraySet();
	}

	private static void arraySet() {
		String[] s = {"A", "Z", "B"};
		List l = Arrays.asList(s);
		System.out.println(l);
		s[0]="K";
		System.out.println(l);
		l.set(1, "l");
		for(String s1:s)
			System.out.println(s1);
		//l.add("durga");//UsOE(UnsupportedOperationException)
		//l.remove(2);//UsOE
		//l.set(1, new Integer(10));//ASE
	}

	private static void arraySearching() {
		int[] a = { 10, 5, 20, 11, 6 };
		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a, 6));
		System.out.println(Arrays.binarySearch(a, 14));

		String[] s = { "A", "Z", "B" };
		Arrays.sort(s);
		System.out.println(Arrays.binarySearch(s, "Z"));
		System.out.println(Arrays.binarySearch(s, "S"));

		Arrays.sort(s, new MyArrayComparator());
		System.out.println(Arrays.binarySearch(s, "Z", new MyArrayComparator()));
		System.out.println(Arrays.binarySearch(s, "S", new MyArrayComparator()));
		System.out.println(Arrays.binarySearch(s, "N"));
	}

	private static void arraySorting() {
		int[] a = { 10, 5, 20, 11, 6 };
		System.out.print("Primitive array before sorting: ");
		for (int a1 : a) {
			System.out.print(a1+" ");
		}
		System.out.println();
		Arrays.sort(a);
		System.out.print("Primitive array after sorting: ");
		for (int a1 : a) {
			System.out.print(a1+" ");
		}
		System.out.println();
		String[] s = { "A", "Z", "B" };
		System.out.print("Object array before sorting: ");
		for (String a2 : s) {
			System.out.print(a2+" ");
		}
		System.out.println();
		Arrays.sort(s);
		System.out.print("Object array after sorting: ");
		for (String a1 : s) {
			System.out.print(a1+" ");
		}
		System.out.println();
		Arrays.sort(s, new MyArrayComparator());
		System.out.print("Object array after sorting by comparator: ");
		for (String a1 : s) {
			System.out.print(a1+" ");
		}
	}
}

class MyArrayComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s2.compareTo(s1);
	}
}