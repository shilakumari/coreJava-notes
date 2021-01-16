package _11javaUtilPackage._3Internationlization;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatClassDemo {

	public static void main(String[] args) {
		// m1();
		// m2();
		m3();
	}

	private static void m3() {
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);
		System.out.println(nf.format(123.4567));//123.46
		System.out.println(nf.format(123.4));//123.4

		nf.setMinimumFractionDigits(2);
		System.out.println(nf.format(123.4567));//123.46
		System.out.println(nf.format(123.4));//123.40

		nf.setMaximumIntegerDigits(3);
		System.out.println(nf.format(123456.789));//456.79
		System.out.println(nf.format(1.2345));//1.23

		nf.setMinimumIntegerDigits(3);
		System.out.println(nf.format(123456.789));//456.79
		System.out.println(nf.format(1.2345));//001.23

	}

	private static void m2() {
		double d = 123456.789;
		Locale india = new Locale("pa", "IN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(india);
		nf.setMinimumFractionDigits(2);
		nf.setMaximumFractionDigits(3);
		nf.setMinimumIntegerDigits(2);
		nf.setMaximumIntegerDigits(3);
		System.out.println("India form is...: " + nf.format(d));// India form
																// is...: INR
																// 456.789

	}

	private static void m1() {
		double d = 123456.789;
		NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.ITALY);
		String s = numberFormat.format(d);
		System.out.println("ITALY specific form: " + s);// 123.456,789

		Locale india = new Locale("pa", "IN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(india);
		System.out.println("India form is...: " + nf.format(d));// India form
																// is...: INR
																// 123,456.79
		nf = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("US form is...: " + nf.format(d));// US form is...:
																// $123,456.79
		nf = NumberFormat.getCurrencyInstance(Locale.UK);
		System.out.println("UK form is...: " + nf.format(d));// UK form is...:
																// £123,456.79
	}

}
