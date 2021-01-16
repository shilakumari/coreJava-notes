package _1LanguageFundamental._2ElementsOfJava._2operators;

/**
 * 
 * This is class for OpeartorDemo
 */
public class OpeartorDemo {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// m1();
		m2();

	}

	private static void m2() {
		OpeartorDemo x=new OpeartorDemo();
		System.out.println(x == null);
	}

	private static void m1() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		double d = 34.5;
		System.out.println("Infinity result? " + 0 / 0.0); // NaN
		System.out.println("Infinity result? " + 10 / 0.0); // Infinity
		System.out.println(++d);
		System.out.println(d);

		byte b = 10;
		// b=b+1;//CTE,Type mismatch: cannot convert from int to byte
		b = (byte) (b + 1);
		b++;

		// char a = 'a';
		// System.out.println(a / 0);

		double d1 = 10;
		System.out.println(d1 / 0);// Infinity

		// int i=0;
		// System.out.println(i/0);

		double d2 = 0;
		System.out.println(d2 / 0);

		System.out.println("Float.NaN: " + Float.NaN);// NaN

		Thread t = new Thread();
		System.out.println(t instanceof Thread);// true
		System.out.println(t instanceof Object);// true
		System.out.println(t instanceof Runnable);// true
		Object obj = new Object();
		System.out.println(obj instanceof Thread);// false

		int x = 10;
		System.out.println((x = 100) + 5);// 105

		String str = "_1LanguageFundamental._1Introduction.PrintHello";
		Object obj1 = Class.forName(str).newInstance();
		System.out.println(obj1);
	}

}
