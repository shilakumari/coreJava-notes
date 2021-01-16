package _7Collection._5Map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IndentityHashMapClassDemo {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		HashMap m = new HashMap();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		m.put(i1, "pawan");
		m.put(i2, "kalyan");
		System.out.println(m);//{10=kalyan}
		
		IdentityHashMap m2 = new IdentityHashMap();
		 i1 = new Integer(10);
		 i2 = new Integer(10);
		m2.put(i1, "pawan");
		m2.put(i2, "kalyan");
		System.out.println(m2);//{10=pawan, 10=kalyan}
	}
}
