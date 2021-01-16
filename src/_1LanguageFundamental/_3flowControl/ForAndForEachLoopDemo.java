package _1LanguageFundamental._3flowControl;

public class ForAndForEachLoopDemo {

	public static void main(String[] args) {
		int x = 20;
		System.out.println("for loop");
		forLoop1(x);
		System.out.println("for and for-each loop");
		forAndForEachLoop1(x);
	}

	private static void forAndForEachLoop1(int x) {
		int[] x1 = { 10, 20, 30, 40 };
		int[][] x2 = { { 10, 20, 30 }, { 40, 50 } };
		int[][][] x3 = { { { 10, 20 }, { 30, 40 } }, { { 50, 60, 70 }, { 80, 90 } } };
		System.out.println("To print elements of 1D array");
		for (int i = 0; i < x1.length; i++) {
			System.out.println("x1[i]: " + x1[i]);
		}
		for (int i : x1) {
			System.out.println("i: " + i);
		}

		System.out.println("To print elements of 2D array");
		for (int i = 0; i < x2.length; i++) {
			for (int j = 0; j < x2[i].length; j++) {
				System.out.println(x2[i][j]);
			}
		}
		for (int[] a1 : x2) {
			for (int a2 : a1)// read as for each j in x2{
				System.out.println("a2: " + a2);
		}

		System.out.println("To print elements of 3D array");
		for (int[][] a1 : x3) {
			for (int[] a2 : a1) {
				for (int a3 : a2) {
					System.out.println("a3: " + a3);
				}
			}
		}
	}

	private static void forLoop1(int x) {
		int i = 0;
		for (i = 0; i < 10; i++) {
			System.out.println("Hello");
		}
		/*
		 * for (int j = 0; true; j++)//Infinite loop
		 * System.out.println("Hello"); for((return );i<3;i++){}
		 */
		for (i = 0; i < 10; i++)
			// int x2=10;
			;
		for (System.out.println("This is initialization section"); i < 3; i++) {
			System.out.println("Inside for loop");
		}
		for (System.out.println("initialization"); i < x; System.out.println("Increment_decrement section")) {
			i++;
		}
		// for(;;); //infinite loop

		/*
		 * for(int i=0;true;i++){ System.out.println(“Hello”); }
		 * System.out.println(“hii”);//CTE,unreachable statement
		 * 
		 * for(int i=0;false;i++){// CTE,unreachable statement
		 * System.out.println(“Hello”); }
		 */
	}

}
