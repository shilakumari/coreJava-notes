package _1LanguageFundamental._3flowControl;

public class SwitchStatementDemo {

	public static void main(String[] args) {
		int x = 20;
		System.out.println("switch selection statement");
		switchStatement(x);

	}

	private static void switchStatement(int x) {
		final int y = 20;
		byte b = 10;
		switch (x) {
		// SOP(“hello”);//9 CTE
		case 1:
			System.out.println("JAN");
			break;
		case 2:
			System.out.println("FEB");
			break;
		case 3:
			System.out.println("MARCH");
			break;
		default:
			System.out.println("Invalid month number");

		}

		switch (x) {
		case 10:
			System.out.println("hello");
			// case y://if int y=10; CTE, constant expression required
		case y:
			System.out.println("hi");
		}

		switch (x + 1) {
		case 10:
			System.out.println("hello");
			break;
		case 10 + 20 + 30:
			System.out.println("hello");
		}

		switch (b) {
		case 10:
			System.out.println("10");
		case 100:
			System.out.println("100");
			// case 1000://CTE,possible loss of
			// precision,found:int,required:byte
			System.out.println("1000");
		}

		switch (b + 1) {
		case 10:
			System.out.println("10");
		case 100:
			System.out.println("100");
		case 1000:// no CTE
			System.out.println("1000");
		}

		switch (x) {
		case 97:
			System.out.println(97);
		case 98:
			System.out.println(98);
		case 99:
			System.out.println(99);
			// case ‘a’:
			System.out.println('a');
		}

		switch (x) {
		case 0:
			System.out.println(0);
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
		default:
			System.out.println("def");
		}
		switch (x) {
		case 1:
		case 2:
		case 3:
			System.out.println("Q-1");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("Q-2");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("Q-3");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("Q-4");
		}

	}
}
