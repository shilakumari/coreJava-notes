package _11javaUtilPackage._3Internationlization;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatClassDemo {

	public static void main(String[] args) {
		m1();
		m2();
	}

	private static void m2() {
		DateFormat uk = DateFormat.getDateInstance(0, Locale.UK);
		DateFormat us = DateFormat.getDateInstance(0, Locale.US);
		DateFormat italy = DateFormat.getDateInstance(0, Locale.ITALY);
		System.out.println("UK style is: " + uk.format(new Date()));
		System.out.println("US style is: " + us.format(new Date()));
		System.out.println("Italy style is: " + italy.format(new Date()));
	}

	private static void m1() {
		System.out.println("Full form is...: " + DateFormat.getDateInstance(0, Locale.US).format(new Date()));
		System.out.println("Long form is...: " + DateFormat.getDateInstance(1, Locale.US).format(new Date()));
		System.out.println("Medium form is...: " + DateFormat.getDateInstance(2, Locale.US).format(new Date()));
		System.out.println("Short form is...: " + DateFormat.getDateInstance(0, Locale.US).format(new Date()));
	}

}
