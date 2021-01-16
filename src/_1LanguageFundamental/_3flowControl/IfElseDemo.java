package _1LanguageFundamental._3flowControl;

public class IfElseDemo {

	public static void main(String[] args) {
		int x = 20;
		System.out.println("if-else selection statement");
		ifElseStatement(x);
	}

	private static void ifElseStatement(int x) {
		Boolean b = true;
		// if(x){ //CTE,incompatible type,found:int,required:boolean
		// if(x=20){ //CTE
		if (x == 20) {
			System.out.println("hello");
		} else {
			System.out.println("hello world");
		}
		if (b = false) {
			System.out.println("hello");
		} else {
			System.out.println("hi " + b);
		}
		if (b == false) {
			System.out.println("hello");
		} else {
			System.out.println("hi " + b);
		}
		if (true)
			if (true)
				System.out.println("hello");
			else
				System.out.println("hi");

		if (true)
			System.out.println("hello");
		else
			System.out.println("hi");
		
		
		if (x == 1) {
			System.out.println("JAN");
		} else if (x == 2) {
			System.out.println("FEB");
		} else if (x == 3) {
			System.out.println("MARCH");
		} else {
			System.out.println("Invalid month number");
		}
	}

}
