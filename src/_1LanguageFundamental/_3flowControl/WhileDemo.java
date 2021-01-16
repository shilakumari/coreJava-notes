package _1LanguageFundamental._3flowControl;

public class WhileDemo {

	public static void main(String[] args) {
		int x = 20;
		System.out.println("while selection statement");
		whileStatement1(x);
		whileStatement2(x);
		whileStatement3(x);
		while (true)
			;
	}

	private static void whileStatement3(int x) {
		int a = 10;
		int b = 20;
		while (a < b) {
			System.out.println("Hello");
		}
		System.out.println("Hello");
	}

	private static void whileStatement2(int x) {
		// while(true)
		// int x1=10;//CTE, should not be declarative statement
		while (true) {
			int x2 = 10;
		}
	}

	private static void whileStatement1(int x) {
		// while(1){ //CTE,incompatible types, found:int, required:boolean
		// while (true) //Infinite loop
		{
			System.out.println("Hello");
		}

		/*
		 * while (false) { System.out.println("Hello");// CTE,unreachable
		 * statement }System.out.println("Hi");
		 */

	}

}
