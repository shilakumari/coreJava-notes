package _1LanguageFundamental._3flowControl;

public class DoWhileDemo {

	public static void main(String[] args) {
		int x = 20;
		System.out.println("do-while statement");
		doWhileStatement1(x);
		doWhileStatement2(x);
		doWhileStatement3(x);
		
	}

	private static void doWhileStatement3(int x) {
		int a = 10;
		int b = 20;
		do
			// while (true)//Infinite loop
			System.out.println("doWhileStatement3: Hello");
		while (false);
System.out.println("Ram");
		do {
			System.out.println("hello");
		} while (a > b);
		System.out.println("doWhileStatement3: Hi");

		/*
		 * do { System.out.println("hello"); } while (a < b);//infinite loop
		 * System.out.println("doWhileStatement3: Hi");//CTE: unreachable code
		 */
	}

	private static void doWhileStatement2(int x) {
		do
			; while (false);

		/*
		 * do//CTE while(true);
		 */

		/*
		 * do int x1=10;//CTE while(true);
		 */
	}

	private static void doWhileStatement1(int x) {
		do {
		} while (false);

		do
			System.out.println("doWhileStatement1: hello");
		// while (true);//Infinite loop
		while (false);
	}

}
