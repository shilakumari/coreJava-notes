package _3javaLangPackage._3WrapperClass.txt;

public class Test {

	public static void main(String[] args) {
		// m1();
		m2();
	}

	private static void m2() {
		System.out.println(Integer.toString(10)==new Integer(10).toString());
	}

	private static void m1() {
		Boolean x = new Boolean("yes");// false
		Boolean y = new Boolean("no");// false
		System.out.println(x.equals(y));// true

		Integer X = 10;
		Integer Y = 10;
		System.out.println(X == Y);// true

		Long l = new Long(10l);
		System.out.println("l: " + l);
		Long l1 = new Long("10");
		System.out.println("l1: " + l1);

		Float f = new Float("10.5f");
		System.out.println("f: " + f);
		Float f1 = new Float("10.5");// 10.5
		System.out.println("f1: " + f1);

		Integer i = new Integer("10");
		System.out.println(i);

		Integer I = new Integer(10);
		String s = I.toString();
		System.out.println(s);

		String s1 = Integer.toString(15, 2);// 1111
		System.out.println("s1: " + s1);

		String s2 = Integer.toBinaryString(10);// 1010
		String s3 = Integer.toOctalString(10);// 12
		String s4 = Integer.toHexString(10);// a
		System.out.println("s2: " + s2);
		System.out.println("s3: " + s3);
		System.out.println("s4: " + s4);

		Integer i3 = new Integer(10);
		Integer i4 = 10;
		System.out.println(i3 == i4);// false

		Integer i1 = 10;
		Integer i2 = 10;
		System.out.println(i1 == i2);// true

		Integer i5 = 10;
		Integer i6 = Integer.valueOf(10);
		System.out.println(i5 == i6);// true

		// Widening dominates autoboxing
		// Widening dominates var-arg
		int num = 10;
		m1(num);
	}

	public static void m1(long l) {
		System.out.println("Widening");
	}

	public static void m1(Integer I) {
		System.out.println("Autoboxing");
	}

	public static void m1(int... I) {
		System.out.println("Var-arg");
	}
}
