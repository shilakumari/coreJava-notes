package _7Collection._1Introduction;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// offerAndPollMethods();
		OfferUsingComparator();
	}

	private static void OfferUsingComparator() {
		PriorityQueue q = new PriorityQueue(15, new PriorityQueueComparator());
		q.offer("A");
		q.offer("Z");
		q.offer("L");
		q.offer("B");
		System.out.println(q);//[Z, B, L, A]
	}

	private static void offerAndPollMethods() {
		PriorityQueue q = new PriorityQueue();
		System.out.println(q.peek());// null
		// System.out.println(q.element());//NoSuchElementException
		for (int i = 1; i <= 10; i++) {
			q.offer(i);
		}
		System.out.println(q);// [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		System.out.println(q.poll());// 1
		System.out.println(q);// [2, 4, 3, 8, 5, 6, 7, 10, 9]
	}

}

class PriorityQueueComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		String s1 = (String) o1;
		String s2 = o2.toString();
		return s2.compareTo(s1);
	}
}