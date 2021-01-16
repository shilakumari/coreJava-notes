package _7Collection._2List;

import java.util.Comparator;


public class AgeComparator implements Comparator {

	public int compare1(Object o1, Object o2) {
		int age1 = ((Employee) o1).age;
		int age2 = ((Employee) o2).age;
		if (age1 < age2) {
			return -1;
		} else if (age1 > age2) {
			return 1;
		}
		return 0;
	}

	public int compare2(Object o1, Object o2) {
		Integer age1 = ((Employee) o1).age;
		Integer age2 = ((Employee) o2).age;
		return age1.compareTo(age2);
	}

	public int compare3(Object o1, Object o2) {
		String name1 = ((Employee) o1).name;
		String name2 = ((Employee) o2).name;
		return name1.compareTo(name2);
	}

	public int compare(Object o1, Object o2) {
		Integer age1 = ((Employee) o1).age;
		Integer age2 = ((Employee) o2).age;
		String name1 = ((Employee) o1).name;
		String name2 = ((Employee) o2).name;
		if (name1.compareTo(name2) == 0) {
			return age1.compareTo(age2);
		}
		return name1.compareTo(name2);
	}
}
