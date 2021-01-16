package _2OOPs._1Features;

public class MethodOverriding {

	public static void main(String[] args) {
		P p1 = new P();
		System.out.println(p1.x);// Parent

		C c1 = new C();
		System.out.println(c1.x);// Child

		P p2 = new C();
		System.out.println(p2.x);// Parent
		// C c2=new P();//CTE
	}
}

class P {
	int x = 888;
}

class C extends P {
	int x = 999;
}
