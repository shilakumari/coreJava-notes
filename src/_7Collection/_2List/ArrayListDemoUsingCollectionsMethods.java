package _7Collection._2List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemoUsingCollectionsMethods {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Is ArrayList Empty: " + al.isEmpty());
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		System.out.println("Before update: " + al.get(1));

		al.set(1, "Gaurav");
		System.out.println("After update: " + al.get(1));
		System.out.println("Value of minimum element from the collection: " + Collections.min(al));
		System.out.println("Value of minimum element from the collection: " + Collections.max(al));

		Collections.addAll(al, "Servlet", "JSP");
		System.out.println("After adding elements collection value:" + al);
		String[] strArr = { "C#", ".Net" };
		Collections.addAll(al, strArr);
		System.out.println("After adding array collection value:" + al);

		Collections.sort(al, Collections.reverseOrder());
		Iterator i = al.iterator();
		System.out.print("reverseOrder() of Collections class: ");
		while (i.hasNext()) {
			System.out.print(i.next() + ", ");
		}

	}
}
