package _2OOPs._8Generic;

import java.util.ArrayList;
import java.util.HashMap;

public class GenericTest1 {

	public static void main(String[] args) {
		String[] s = new String[1000];
		s[0] = "Abhinav";
		String name1 = s[0];// Type-Casting not required}

		ArrayList al = new ArrayList();
		al.add("Abhinav");
		String name2 = (String) al.get(0);// CTE,incompatible type

		GenricTestClass2<String> g1 = new GenricTestClass2<String>("Abhinav");
		g1.show();// The type of ob is java.lang.String
		System.out.println(g1.getOb());// Abhinav

		GenricTestClass2<Integer> g2 = new GenricTestClass2<Integer>(10);
		g2.show();// The type of ob is java.lang.Integer
		System.out.println(g2.getOb());// 10

		GenricTestClass2<Double> g3 = new GenricTestClass2<Double>(5.5);
		g3.show();// The type of ob is java.lang.Double
		System.out.println(g3.getOb());// 5.5

		// Generic area
		ArrayList<String> l = new ArrayList<String>();
		l.add("durga");
		l.add("Ravi");
		// l.add(10);//CTE
		m1(l);
		System.out.println(l);
		// l.add(10.5);//CE
		
		ArrayList l2 = new ArrayList<String>();
		l2.add(10);
		l2.add(10.5);
		l2.add(true);
		System.out.println(l2);//[10, 10.5, true]
		
		HashMap<String,ArrayList<Integer>> hashMap = new HashMap<>();
	}

	public static ArrayList m1(ArrayList l) {
		// non-generic area
		l.add(10);
		l.add(10.5);
		l.add(true);
		return l;
	}
}

//class Test{
//	public void m1(ArrayList<String> l){}//-->m1(AL l)
//	public void m1(ArrayList<Integer> l){}//-->m1(AL l)
//}