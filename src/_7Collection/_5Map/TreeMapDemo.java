package _7Collection._5Map;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		m1();

	}

	private static void m1() {
		TreeMap tm = new TreeMap(new MyTreeComparator());
		tm.put(1, "one");
		tm.put("hi", "two");
		tm.put(1.0f, "three");
		System.out.println(tm);
	}
}
class MyTreeComparator implements Comparator<Object> {
	@Override
	public int compare(Object o1, Object o2) {
		if (o1.getClass().equals(o2.getClass())) {
			return ((Comparable) o1).compareTo((Comparable) o2);
		} else {
			if (o1.getClass().getCanonicalName().equals("java.lang.String")) {
				return 1;
			} else {
				return -1;
			}
		}
	}

}
