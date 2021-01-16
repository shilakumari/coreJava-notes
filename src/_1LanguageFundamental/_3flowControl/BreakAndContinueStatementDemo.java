package _1LanguageFundamental._3flowControl;

public class BreakAndContinueStatementDemo {

	public static void main(String[] args) {
		int x = 20;
		System.out.println("break Transfer statement");
		breakStatement1(x);
		System.out.println("continue Transfer statement");
		continueStatement1();
		System.out.println("continue Transfer statement with in do-while loop");
		continueWithDoWhile();
	}

	private static void continueWithDoWhile() {
		int x1 = 0;
		do {
			x1++;
			System.out.println(x1);
			if (++x1 < 5) {
				continue;
			}
			x1++;
			System.out.println(x1);
		} while (++x1 < 10);

	}

	private static void continueStatement1() {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}

		l1: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == j) {
					// break;
					continue;
				}
				System.out.println(i + "..." + j);
			}
		}
	}

	private static void breakStatement1(int x) {
		/*
		 * We can use break statements in the following places: Inside switch,
		 * Inside loops, Inside labeled blocks
		 */
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

		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}

		l1: {
			System.out.println("begin");
			if (x == 10) {
				break l1;
			}
			System.out.println("end");
		}
		System.out.println("Hello");

		/*
		 * if(x==10) break;//CTE, error: break outside switch or loop
		 */

	}

}
