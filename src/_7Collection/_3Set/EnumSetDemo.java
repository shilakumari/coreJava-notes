package _7Collection._3Set;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumSetDemo {
	public static void main(String[] args) {
		Set<days> set = EnumSet.of(days.TUESDAY, days.WEDNESDAY);
		
		//allOf() & noneOf()
		Set<days> set1 = EnumSet.allOf(days.class);
		System.out.println("Week Days:" + set1);
		Set<days> set2 = EnumSet.noneOf(days.class);
		System.out.println("Week Days:" + set2);
		
		// Traversing elements
		Iterator<days> iter = set.iterator();
		while (iter.hasNext())
			System.out.println(iter.next());
	}
}
