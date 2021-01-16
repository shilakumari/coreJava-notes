package _11javaUtilPackage._2RegularExpression;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class PatternClassSplitMethodDemo {

	public static void main(String[] args) {
		// m1();
		m2();
	}

	private static void m2() {
		String str = "Durga Software Solutions";
		String[] s2 = str.split("\\s");
		for (String s1 : s2) {
			System.out.println(s1);
		}
		System.out.println();

		StringTokenizer st = new StringTokenizer("Durga Software Solutions");
		st = new StringTokenizer("19-09-2014", "-");
		while (st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}

	}

	private static void m1() {
		Pattern p = Pattern.compile("\\s");
		p = Pattern.compile("\\s");
		p = Pattern.compile("a");
		p = Pattern.compile("o");
		String[] s = p.split("Durga Software Solutions");
		for (String s1 : s) {
			System.out.println(s1);
		}
		System.out.println();

		p = Pattern.compile(".");// No output
		p = Pattern.compile("\\.");// or "[.]"
		s = p.split("www.durgajobs.com");
		for (String s2 : s) {
			System.out.println(s2);
		}
	}
}
