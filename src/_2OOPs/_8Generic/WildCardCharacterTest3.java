package _2OOPs._8Generic;

import java.util.ArrayList;

public class WildCardCharacterTest3 {

	public static void main(String[] args) {
		//ArrayList<String> l0=new ArrayList<String>();	m1(l0);//CTE
		//ArrayList<Integer> l0=new ArrayList<Integer>(); m1(l0);
		//ArrayList<Double> l0=new ArrayList<Double>();	m1(l0);
		//ArrayList<Number> l0=new ArrayList<Number>();	m1(l0);
		//ArrayList<Object> l0=new ArrayList<Object>();	m1(l0);
		//m1(l0);
	//	System.out.println(l0);//CTE,????????
		}
	private static void m1(ArrayList<? super Integer> l0) {
		l0.add(null);
		
		//l0.add((Integer) new Object());//CTE
	}
}
