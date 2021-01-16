package _2OOPs._1Features;

public class TypeCasting {

	public static void main(String[] args) {
		String s = new String("Sachin");
		Object o = (Object) s;

		System.out.println(o);
		System.out.println(s);
		
		
		A a =new B();
		System.out.println(a.i);
	}}
	class A{int i=5;}
	class B extends A{int i=10;}


