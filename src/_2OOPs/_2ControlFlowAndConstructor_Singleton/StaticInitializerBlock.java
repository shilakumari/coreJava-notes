package _2OOPs._2ControlFlowAndConstructor_Singleton;

import java.util.Scanner;

public class StaticInitializerBlock {
	static boolean flag;
	static int B, H;

	static {
		try (Scanner scanner = new Scanner(System.in);) {
			B = scanner.nextInt();
			H = scanner.nextInt();
			flag = true;
			if ((B <= 0) || (H <= 0)) {
				flag = false;
				throw new Exception("Breadth and height must be positive");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		// finally {
		// scanner.close();
		// }

	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.println(area);
		}

	}

}
