package _21javaVersions._8version;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionWithLembdaExpression {

	public static void main(String[] args) {
		// m1();
		// m2();
		m3();
	}

	private static void m3() {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();// Ascending
		tm.put(100, "Hunny");
		tm.put(105, "Bunny");
		tm.put(109, "Sunny");
		tm.put(108, "Chinny");
		tm.put(106, "Punny");
		tm.put(107, "Munny");
		System.out.println("Before sorting TreeSet: " + tm);
		tm = new TreeMap<Integer, String>((I1, I2) -> (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0);// Descending
		tm.put(100, "Hunny");
		tm.put(105, "Bunny");
		tm.put(109, "Sunny");
		tm.put(108, "Chinny");
		tm.put(106, "Punny");
		tm.put(107, "Munny");
		System.out.println("After sorting TreeSet: " + tm);
	}

	private static void m2() {
		TreeSet<Integer> al = new TreeSet<Integer>();// Ascending order
		al.add(10);
		al.add(0);
		al.add(15);
		al.add(5);
		al.add(20);
		System.out.println("Before sorting TreeSet: " + al);
		al = new TreeSet<Integer>((I1, I2) -> (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0);// Descending
		al.add(10);
		al.add(0);
		al.add(15);
		al.add(5);
		al.add(20);
		System.out.println("After sorting TreeSet: " + al);
	}

	private static void m1() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(0);
		al.add(15);
		al.add(5);
		al.add(20);
		System.out.println("Before sorting ArrayList: " + al);
		System.out.println();
		Collections.sort(al, (I1, I2) -> (I1 < I2) ? -1 : (I1 > I2) ? 1 : 0);// Ascending
																				// order
		System.out.println("After sorting ArrayList: " + al);
	}

}
