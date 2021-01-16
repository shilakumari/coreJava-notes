package _1LanguageFundamental._2ElementsOfJava._1Basic;

public class Test {

	public static void main(String[] args) {
		// m1();
		m2();
	}

	/**
	 * 
	 */
	private static void m2() {
		double d = 123.456;

		// double d2=0x123.456;//CTE,error: malformed floating point literal
		// double d=0XFace.0;//CTE
		double d8 = 0XFace;// valid,64206.0

		// double d6 = 0786;// CTE
		double d3 = 0123;// 83.0, valid
		double d4 = 0786.0;// valid, 786.0
		double d2 = 0123.456;// 123.456,Valid

	}

	private static void m1() {
		char ch = 'A';
		System.out.println(ch);// A
		ch = 65;
		System.out.println(ch);// A
		ch = '\u0041';
		System.out.println(ch);// A
		System.out.println(123_45.7_8);// 12345.78

		int x = 010;// Octal literals
		System.out.println(x);// 8

		x = 0x10;
		System.out.println(x);// 16
		int b = 0B10;// Binary literal
		System.out.println(b);// 2
	}

}
