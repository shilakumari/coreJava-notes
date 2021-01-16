package _13Assertions;

public class AssertionTest {

	public static void main(String[] args) {
System.out.println("sadv");
		m1();
	}

	private static void m1() {
		boolean assertOn = false;
		try {
			assert (assertOn) : assertOn = true;
		} catch (AssertionError e) {
		}
		if (assertOn) {
			System.out.println("assertOn");
		}
	}

}
