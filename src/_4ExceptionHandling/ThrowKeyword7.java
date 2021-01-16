package _4ExceptionHandling;

public class ThrowKeyword7 {

	public static void main(String[] args) {

		// System.out.println(10/0);
		throw new ArithmeticException("/ by zero");

	}

}

// Exception in thread"main"java.lang.ArithmeticException:/
// by zero
// at _4ExceptionHandling.ThrowKeyword7.main(ThrowKeyword7.java:7)
