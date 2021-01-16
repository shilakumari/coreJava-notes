package _2OOPs._7Annotation;

import java.awt.Frame;
import java.util.ArrayList;

@SuppressWarnings(value = { "unchecked" })
public class AnnotationDemo {

	public static void main(String[] args) {
		m1();
		m2();
		m3();
		

	}

	@Deprecated
	private static void m4() {

	}


	private static void m3() {
		m4();
		System.out.println("I'm deprecated method");
	}

	@SuppressWarnings("deprecation")
	private static void m2() {
		Frame f = new Frame();
		f.show();
	}

	private static void m1() {
		Bank bank = new Bank();
		ArrayList list = bank.get_CustomerDetails();
		System.out.println(list);
	}
}

@SuppressWarnings(value = { "unchecked" })
class Bank {
	public ArrayList get_CustomerDetails() {
		ArrayList al = new ArrayList();
		al.add("AAA");
		al.add("ABC");
		al.add("BCD");
		return al;
	}
}