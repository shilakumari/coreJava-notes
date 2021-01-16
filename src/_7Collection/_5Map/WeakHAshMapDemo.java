package _7Collection._5Map;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHAshMapDemo {

	public static void main(String[] args) throws InterruptedException {
		m1();
		System.out.println();
		m2();
	}

	private static void m2() throws InterruptedException {
		WeakHashMap m = new WeakHashMap();
		Temp t = new Temp();
		m.put(t, "durga");
		System.out.println(m);// {temp=durga}
		t = null;
		System.gc();// finalize() method called
		Thread.sleep(2000);
		System.out.println(m);// {}
	}

	private static void m1() throws InterruptedException {
		HashMap m = new HashMap();
		Temp t = new Temp();
		m.put(t, "durga");
		System.out.println(m);// {temp=durga}
		t = null;
		System.gc();
		Thread.sleep(2000);
		System.out.println(m);// {temp=durga}
	}
}

class Temp {
	public String toString() {
		return "temp";
	}

	public void finalize() {
		System.out.println("finalize() method called");
	}
}