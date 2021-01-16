package _7Collection._2List;

import java.util.ArrayList;
import java.util.Iterator;

class IteratorDemo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		for (int i = 0; i < 10; i++) {
			al.add(i);
		}
		System.out.println(al);// [0, 1, 2,...., 9]

		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Integer n = (Integer) itr.next();
			if (n % 2 == 0)
				System.out.println(n);// 0 2...8
		}
		System.out.println(al);// [0, 1, 2,..., 9]
	}
}