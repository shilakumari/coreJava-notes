package _7Collection._2List;

public class ComparatorInterface {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		Employee employee1 = new Employee(1, "Sachin1", 10);
		Employee employee2 = new Employee(2, "Sachin2", 20);
		Employee employee3 = new Employee(3, "Sachin3", 30);
		Employee employee4 = new Employee(4, "Sachin4", 40);
		Employee employee5 = new Employee(5, "Sachin1", 50);

		AgeComparator ageComparator = new AgeComparator();
		System.out.println(ageComparator.compare(employee1, employee2));
		System.out.println(ageComparator.compare(employee2, employee1));
		System.out.println(ageComparator.compare(employee1, employee4));
		System.out.println(ageComparator.compare(employee1, employee1));
		System.out.println(ageComparator.compare(employee1, employee5));
	}

}
