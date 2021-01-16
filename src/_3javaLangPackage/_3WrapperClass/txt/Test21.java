package _3javaLangPackage._3WrapperClass.txt;

public class Test21 {
	public static void main(String[] args) {
		m1(10);// int -->AB-->Integer--> Widening -> Object
		Integer x = 10;//Integer x = Integer.valueOf(10); this is Autoboxing
		m1(x);//Integer --> Object class. This is Widening
	}

	public static void m1(Object o) {
		System.out.println("autoboxing -->widening ");
	}
}
