package _1LanguageFundamental._5Variable;

public class StaticVariableDemo {
	static int x = 10;
	int y = 20;

	public static void main(String[] args) {
		StaticVariableDemo t1 = new StaticVariableDemo();
		System.out.println(t1.x);// 10
		System.out.println(t1.y);// 20
		t1.x = 888;
		t1.y = 999;

		System.out.println(t1.x);// 888
		System.out.println(t1.y);// 999

		StaticVariableDemo t2 = new StaticVariableDemo();
		System.out.println(t2.x);// 888
		System.out.println(t2.y);// 20

		System.out.println(t1.x);// 888
		System.out.println(t1.y);// 999

		if (args.length > 0) {
			x = 10;
		} else {
			x = 20;
		}
		System.out.println(x);
	}
}