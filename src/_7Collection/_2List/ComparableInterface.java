package _7Collection._2List;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ComparableInterface {

	public static void main(String[] args) {
		m1();
		// m2();
		//m3();
	}

	private static void m3() {

		Employee employee1 = new Employee(1, "Sachin1", 10);
		Employee employee2 = new Employee(2, "Sachin2", 20);
		Employee employee3 = new Employee(3, "Sachin3", 30);
		Employee employee4 = new Employee(4, "Sachin4", 40);
		Employee employee5 = new Employee(5, "Sachin1", 50);

		HashSet hashSet = new HashSet();
		hashSet.add(employee1);
		hashSet.add(employee2);
		hashSet.add(employee3);
		hashSet.add(employee4);
		hashSet.add(employee5);
		
		System.out.println(hashSet);
		
		
		System.out.println(hashSet);

	}

	private static void m2() {
		Employee employee1 = new Employee(1, "Sachin1", 10);
		Employee employee2 = new Employee(2, "Sachin2", 20);
		Employee employee3 = new Employee(3, "Sachin3", 30);
		Employee employee4 = new Employee(4, "Sachin4", 40);
		Employee employee5 = new Employee(5, "Sachin1", 50);

		System.out.println(employee1.compareTo(employee2));
		System.out.println(employee2.compareTo(employee1));
		System.out.println(employee1.compareTo(employee4));
		System.out.println(employee1.compareTo(employee1));
		System.out.println(employee1.compareTo(employee5));
	}

	private static void m1() {
		System.out.print("A".compareTo("Z") + "\t");// -ve
		System.out.print("Z".compareTo("B") + "\t");// +ve
		System.out.println("A".compareTo("A"));// 0
		// System.out.println("A".compareTo(null));// NullPointerException
		String str = null;
		// System.out.println(str.compareTo("sdf"));// NullPointerException
		// System.out.println(str.compareTo(null));// NullPointerException

		Character ch1 = 'A';
		Character ch2 = 'Z';
		System.out.print(ch1.compareTo(ch2) + "\t");
		System.out.println(ch2.compareTo(ch1));
		System.out.println();

		Integer I1 = 10;
		Integer I2 = 20;
		System.out.print(I1.compareTo(I2) + "\t");
		System.out.println(I2.compareTo(I1));

		Double d1 = 10d;
		Double d2 = 20d;
		System.out.print(d1.compareTo(d2) + "\t");
		System.out.println(d2.compareTo(d1));
		System.out.println();
		
		Boolean flag=true;
		System.out.print(flag.compareTo(true) + "\t");// 0
		System.out.print(flag.compareTo(false) + "\t");// -1
		flag=false;
		System.out.print(flag.compareTo(true) + "\t");// 1
		System.out.print(flag.compareTo(false) + "\t");//0
		
		//System.out.print(flag.compareTo(null) + "\t");// 

	}

}
