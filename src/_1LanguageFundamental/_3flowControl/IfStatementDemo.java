package _1LanguageFundamental._3flowControl;

public class IfStatementDemo {

	public static void main(String[] args) {
		int x = 20;
		System.out.println("if selection statement");
		ifStatement(x);
	}

	private static void ifStatement(int x) {
		boolean b = true;
		// if(x)
		// if(x=20)
		if (x == 20)// NO CTE
			System.out.println("x == 20: " + x);
		if (b = false)
			System.out.println("b = false" + b);
		if (true)
			System.out.println("true");
		if (true)
			;
		// Semicolon is a valid java statement.
		// if(true) int x=10;//CTE
		if (true) {
			int x1 = 10;
			System.out.println("x1: " + x1);
		}

	}

}
