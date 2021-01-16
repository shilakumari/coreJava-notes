package _7Collection._5Map;

import java.util.TreeMap;

public class NavigableMapInterfaceDemo {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		TreeMap t = new TreeMap();
		t.put("b", "banana");
		t.put("c", "cat");
		t.put("d", "dog");
		t.put("a", "apple");
		t.put("e", "eye");
		t.put("f", "flag");
		t.put("g", "go");
		t.put("h", "happy");
		t.put("i", "icecream");
		t.put("j", "joy");
		System.out.println(t.ceilingKey("c"));//c
		System.out.println(t.floorKey("e"));//e
		System.out.println(t.higherKey("e"));//f
		System.out.println(t.lowerKey("e"));//d
		System.out.println(t.pollFirstEntry());//a=apple
		System.out.println(t.pollLastEntry());//j=joy
		System.out.println(t.descendingMap());//{i=icecream, h=happy, g=go, f=flag, e=eye, d=dog, c=cat, b=banana}
		System.out.println(t);//{b=banana, c=cat, d=dog, e=eye, f=flag, g=go, h=happy, i=icecream}
	}

}
