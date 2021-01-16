package _15JavaApplicationPerformanceAndMemoryManagement._2JITCompliation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StringMain {

	public static void main(String[] args) {
		// m1();

		m2();
	}

	private static void m2() {

		Date start = new Date();

		List<String> strings = new ArrayList<String>();
		for (Integer i = 1; i < 10000000; i++) {
			String s = i.toString().intern();
			strings.add(s);
		}

		Date end = new Date();
		System.out.println("Elapsed time was " + (end.getTime() - start.getTime()) + " ms.");
	}

	private static void m1() {

		String s1 = "hello";
		String s2 = "hello";
		System.out.println(s1.equals(s2));// true
		System.out.println(s1 == s2);// true

		Integer i3 = 76;
		String s3 = i3.toString();
		String s4 = "76";
		System.out.println(s3.equals(s4));// true
		System.out.println(s3 == s4);// false, true if JVM optimizes

		Integer i5 = 76;
		String s5 = i5.toString().intern();
		String s6 = "76";
		System.out.println(s5.equals(s6));// true
		System.out.println(s5 == s6);// true
	}

}
