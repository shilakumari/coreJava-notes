package _7Collection._2List;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		s.push("A");
		s.push("B");
		s.push("C");
		s.push(null);
		s.push(null);
		System.out.println(s);// [A, B, C]
		s.pop();
		System.out.println(s);// [A, B]
		System.out.println(s.search("A"));// 2
		System.out.println(s.search("Z"));// -1

		Iterator<String> itr = s.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next()); // A B
		}
	}
}
