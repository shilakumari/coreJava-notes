package _2OOPs._1Features;

public class MethodOverloading {
	public static void main(String[] args) {
		MethodOverloading ml = new MethodOverloading();
		Animal a = new Animal();
		ml.m1(a);
		Monkey m = new Monkey();
		ml.m1(m);
		Animal a1 = new Monkey();
		ml.m1(a1);
	}
	private void m1(Animal a) {
		System.out.println("Animal version");
	}
	private void m1(Monkey m) {
		System.out.println("Monkey version");
	}
}
class Animal{
}
class Monkey extends Animal{
}