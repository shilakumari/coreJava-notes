package _2OOPs._4Interface;

interface MyInterface {
	int x = 10;
}

interface Right {
	int x = 20;
}

public class InterfaceDemo implements MyInterface, Right {
	public static void main(String[] args) {
		int x = 777;// No CTE
		System.out.println(x);
		System.out.println(MyInterface.x);
		System.out.println(Right.x);
	}
}
