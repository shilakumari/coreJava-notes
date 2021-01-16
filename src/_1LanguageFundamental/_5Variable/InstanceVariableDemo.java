package _1LanguageFundamental._5Variable;

public class InstanceVariableDemo {
	int x = 10;
	int i;
	float f;

	public static void main(String[] args) {
		// System.out.println(x);//CTE
		InstanceVariableDemo iv = new InstanceVariableDemo();
		System.out.print(iv.x + "\t");
		iv.m1();
		System.out.print(iv.i + "\t");
		System.out.print(iv.f + "\t");

	}

	public void m1() {
		System.out.print(x + "\t");
		System.out.print(this.x + "\t");
	}
}
