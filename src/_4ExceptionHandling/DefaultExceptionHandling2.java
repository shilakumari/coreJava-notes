package _4ExceptionHandling;

import java.io.IOException;

class DefaultExceptionHandling2 {
	public static void main(String args[]) {
		System.out.println(1);
		doStuff();
		// System.out.println(10 / 0);
		System.out.println(6);
	}

	public static void doStuff() {
		System.out.println(2);
		doMoreStuff();
		// System.out.println(10 / 0);
		System.out.println(5);
	}

	public static void doMoreStuff() {
		System.out.println(3);
	//	System.out.println(10 / 0);
		System.out.println(4);

	}
}
