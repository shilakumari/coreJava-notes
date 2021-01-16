package _7Collection._5Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapInterfaceDemo {

	public static void main(String[] args) {
		//m1();
		// m2();
		m3();
	}

	private static void m3() {
		Map map = new HashMap();
		map.put("Amit", 100);
		map.put("Vijay", 101);
		map.put("Rahul", 102);
		System.out.println(map);//{Amit=100, Vijay=101, Rahul=102}
		System.out.println(map.put("shaurabh", 103));//null

		Set s = map.keySet();
		System.out.println(s);
		Collection c = map.values();
		System.out.println(c);
		Set s2 = map.entrySet();
		System.out.println(s2);

		Iterator itr = s2.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
			if ((entry.getKey()).equals("Vijay")) {
				entry.setValue(104);
			}
		}
		System.out.println(map);
	}

	private static void m2() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		// Elements can traverse in any order
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

	private static void m1() {
		Map map = new HashMap();
		String str = null;

		str = (String) map.put(1, "Anu");
		System.out.println(str);
		str = (String) map.put(2, "Anu");
		System.out.println(str);
		str = (String) map.put(1, "Anu");
		System.out.println(str);
		str = (String) map.put(3, "Rahul");
		System.out.println(str);
		str = (String) map.put(4, "Amit");
		System.out.println(str);
		str = (String) map.put(4, "Sumit");
		System.out.println(str);

		System.out.println();
		// Traversing Map
		Set set = map.entrySet();// Converting to Set so that we can traverse
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			// Converting to Map.Entry so that we can get key and value
			// separately
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		// for(Map.Entry entry:set)//CTE
		{
			// System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println();
		Set<Map.Entry> set2 = map.entrySet();
		for (Map.Entry entry : set2) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		System.out.println();
		System.out.println(map);
	}

}
