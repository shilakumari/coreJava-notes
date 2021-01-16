package _2OOPs._9GarbageCollector;

import java.util.Date;

public class RuntimeClassDemo {
	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		System.out.println(r.totalMemory());//64487424
		System.out.println(r.freeMemory());//63480712

		for (int i = 0; i < 10000; i++) {
			Date d = new Date();
			d = null;
		}
		System.out.println(r.totalMemory());//64487424
		r.gc();
		System.out.println(r.freeMemory());//64190224
	}
}
