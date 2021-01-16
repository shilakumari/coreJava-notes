package _7Collection._1Introduction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsClassDemo {
	public static void main(String[] args) {
		
		//naturalSortingOfArrayList();
		// customizedSortingOfArrayList2();
		// searchingInArrayList();
		// customizedSearchingInArrayList();
		reverseElementOfArrayList();
		//reverseElementOfArrayList2();
		//m1();
	}

	private static void m1() {
		ArrayList l = new ArrayList();
		l.add(15);
		l.add(0);
		l.add(20);
		l.add(10);
		
		Object[] arr1=l.toArray();
		System.out.println(arr1[0]);
		
		Integer[] arr=new Integer[0];
		Integer[] arr2=(Integer[]) l.toArray(arr);
		
		System.out.println(arr2[0]);
	}

	private static void reverseElementOfArrayList2() {
		ArrayList l = new ArrayList();
		l.add(15);
		l.add(0);
		l.add(20);
		l.add(10);
		// l.add(new Integer(10));
		// l.add(null);
		System.out.println(l);
		Collections.sort(l, new ArrayListComparatorForAscending());
		Comparator descendingComparator = Collections.reverseOrder(new ArrayListComparatorForAscending());
		Collections.sort(l, descendingComparator);

		System.out.println(l);
	}

	private static void reverseElementOfArrayList() {
		ArrayList l = new ArrayList();
		l.add(15);
		l.add(0);
		l.add(20);
		l.add(10);
		l.add(new Integer(10));
		// l.add(null);
		System.out.println(l);
		Collections.reverse(l);// RTE,  NullPointerException
		System.out.println(l);
	}

	private static void customizedSearchingInArrayList() {
		ArrayList l = new ArrayList();
		l.add(15);
		l.add(0);
		l.add(20);
		l.add(10);
		 l.add(new Integer(10));
		// l.add(null);
		System.out.println(l);
		Collections.sort(l, new IntegerTypeArrayListComparator());// RTE,NullPointerException
		System.out.println(l);
		System.out.println(Collections.binarySearch(l, 10, new IntegerTypeArrayListComparator()));
		System.out.println(Collections.binarySearch(l, 13, new IntegerTypeArrayListComparator()));
		System.out.println(Collections.binarySearch(l, 17));
	}

	private static void searchingInArrayList() {
		ArrayList l = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("N");
		// l.add(new Integer(10));
		// l.add(null);
		System.out.println(l);
		Collections.sort(l);// RTE, ClassCastException or NullPointerException
		System.out.println(l);
		System.out.println(Collections.binarySearch(l, "Z"));
		System.out.println(Collections.binarySearch(l, "J"));
	}

	private static void customizedSortingOfArrayList2() {
		ArrayList l = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("N");
		// l.add(new Integer(10));
		// l.add(null);
		System.out.println("Before sorting: " + l);
		Collections.sort(l, new ArrayListComparator());//// RTE,
														//// ClassCastException
														//// or
														//// NullPointerException
		System.out.println("After sorting: " + l);
	}

	private static void naturalSortingOfArrayList() {
		ArrayList l = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("N");
		 l.add(new Integer(10));
		 l.add(null);
		System.out.println("Before sorting: " + l);
		Collections.sort(l);// RTE, ClassCastException or NullPointerException
		System.out.println("After sorting: " + l);
	}
}

class IntegerTypeArrayListComparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		Integer I1 = (Integer) o1;
		Integer I2 = (Integer) o2;
		return I2.compareTo(I1);
	}
}

class ArrayListComparatorForAscending implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		Integer I1 = (Integer) o1;
		Integer I2 = (Integer) o2;
		return I1.compareTo(I2);
	}
}

class ArrayListComparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String) o1;
		String s2 = o2.toString();
		return s2.compareTo(s1);
	}
}