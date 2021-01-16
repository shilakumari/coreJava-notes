package _21javaVersions._8version;


interface M {
	public void m1();
}

interface M2 {
	public void m1(Double a, Double b);
}

interface M3 {
	public double m1(Double a, Double b);
}
interface X1{ public int abc(Object s);}
interface X2{  public int abc(String s);}

public class LambdaIntroduction {
	int x = 10;

	public static void main(String[] args) {
		LambdaIntroduction t1 = new LambdaIntroduction();
		// t1.m1();
		// t1.m2();
		// t1.m3();
		// t1.m4();
		//t1.m5();
		
		
		//X1 stringLengthFunction1 = (String s)->s.length();//?????????????CTE
		//X2 stringLengthFunction2=(String s)->s.length();



		m6();

		m7();

		m8();
	
	}



	private static void m8() {


		// Lambda expression with single parameter.
		Sayable s0 = (String name) -> {
			return "Hello, " + name;
		};
		System.out.println(s0.say("Abhi"));

		// We can omit parameter type.
		Sayable s1 = (name) -> {
			return "Hello, " + name; 
		};
		System.out.println(s1.say("Abhi"));

		// We can omit function parentheses if only single parameter
		Sayable s2 = name -> {
			return "Hello, " + name;
		};
		System.out.println(s2.say("Abhi"));		
	}
	interface Sayable {
		public String say(String name);
	}


	private static void m7() {
		final int width = 10;

		// without lambda, Drawable implementation using anonymous class
		Drawable d = new Drawable() {
			public void draw() {
				System.out.println("Drawing " + width);
			}
		};
		d.draw();

		final int width2 = 10;
		// with lambda
		Drawable d2 = () -> {
			System.out.println("Drawing " + width2);
		};
		d2.draw();
	}

@FunctionalInterface
interface Drawable {
	public void draw();
}
	private static void m6() {
		// Lambda expression without return keyword.
		Addable2 ad0 = (a, b) -> (a + b);
		System.out.println(ad0.add(10, 20));

		// without return keyword we have to not use curly braces
		// Addable2 ad1=(a,b)->{(a+b)};

		// Lambda expression with return keyword.
		Addable2 ad2 = (a, b) -> {
			return (a + b);
		};
		System.out.println(ad2.add(100, 200));

		// with return keyword we have to use curly braces
		// Addable2 ad3=( a, b)->return (a+b);

	}

	interface Addable2 {
		int add(int a, int b);
	}


	private void m5() {
		M3 m = (a, b) -> {
			return a + b;
		};
		m.m1(5.6, 8.9);

		// M3 mm = (a, b) -> return a+b;//invalid, because it returns
	}

	private void m4() {
		M2 m = (a, b) -> {
			System.out.print("Hello" + (a + b));
		};
		m.m1(5.6, 8.9);

		M2 mm = (a, b) -> System.out.print("Hello" + (a + b));
		mm.m1(5.6, 8.9);

	}

	private void m3() {
		M m = () -> {
			System.out.print("Hello");
		};
		m.m1();

		M mm = () -> System.out.print("Hello");
		mm.m1();
	}

	public void m2() {
		int y = 20;

		M m = new M() {
			public void m1() {
				System.out.print(x + " ");
				System.out.println(y);
			}
		};
		m.m1();
		m22(m);

		M mm = () -> {
			System.out.print(x + " ");
			System.out.println(y);
		};
		mm.m1();

		m22(mm);
	}

	private void m22(M mmm) {
		mmm.m1();
	}

	private void m1() {
		M m = () -> {
			System.out.println("Hiiiiiiii");
		};
		m.m1();
	}

}
