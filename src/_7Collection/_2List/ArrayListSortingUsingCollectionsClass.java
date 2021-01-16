package _7Collection._2List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class ArrayListSortingUsingCollectionsClass {
	public static void main(String args[]) {
		// m1();
		m2();
	}

	private static void m2() {

		ArrayList<Employee> al = new ArrayList<Employee>();

		Employee employee1 = new Employee(1, "Sachin1", 10);
		Employee employee2 = new Employee(2, "Sachin2", 20);
		Employee employee3 = new Employee(3, "Sachin3", 30);
		Employee employee4 = new Employee(4, "Sachin4", 40);
		Employee employee5 = new Employee(5, "Sachin1", 50);

		al.add(employee1);
		al.add(employee2);
		al.add(employee3);
		al.add(employee4);
		al.add(employee5);

		System.out.println(al);
		// Collections.sort(al);
		// Collections.sort(al,Collections.reverseOrder());
		//Collections.sort(al, new AgeComparator());
		System.out.println(al);

		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Employee employee = (Employee) itr.next();
			System.out.print(employee.getName() + " ");
		}
		System.out.println();

		for (Employee employee : al) {
			System.out.print(employee.getName() + " ");
		}
	}

	private static void m1() {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Viru");
		al.add("Saurav");
		al.add("Mukesh");
		al.add("Tahir");
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		System.out.println();
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}