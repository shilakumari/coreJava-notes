package _21javaVersions._8version;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP02Functional {

	public static void main(String[] args) {
		// m1();
		// m2();
		// m3();
		m4();
	}

	private static void m4() {
		ArrayList<EmployeeDetails2> eList = new ArrayList<EmployeeDetails2>();
		populate(eList);
		System.out.println(eList);
		System.out.println(eList.stream().sorted(Comparator.comparing(emp -> {
			return emp.name;
		})).collect(Collectors.toList()));
		System.out.println(eList);

		Comparator<EmployeeDetails2> empNameComparator = Comparator.comparing(EmployeeDetails2::getName)
				.thenComparing((emp) -> -emp.salary);
		Collections.sort(eList, empNameComparator);
		eList.forEach(System.out::println);

		System.out.println(eList.stream()
				.sorted(Comparator.comparing(EmployeeDetails2::getName).thenComparing((emp) -> -emp.salary))
				.collect(Collectors.toList()));

		Comparator<EmployeeDetails2> empNameComparator2 = Comparator.comparing(EmployeeDetails2::getName).reversed();
		Collections.sort(eList, empNameComparator2);
		eList.forEach(System.out::println);

	}

	public static void populate(ArrayList<EmployeeDetails2> l) {
		l.add(new EmployeeDetails2("Sunny", 10000));
		l.add(new EmployeeDetails2("Bunny", 2000));
		l.add(new EmployeeDetails2("Chinny", 3000));
		l.add(new EmployeeDetails2("Pinny", 4000));
		l.add(new EmployeeDetails2("Vinny", 5000));
		l.add(new EmployeeDetails2("Vinny", 15000));
		l.add(new EmployeeDetails2("Durga", 10000));
	}

	private static void m3() {

		List<Integer> numbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);
		// List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);//Java9

		numbers.stream().distinct() // Stream<T> Intermediate
				.sorted() // Stream<T>
				.forEach(System.out::println); // void

		List<Integer> squaredNumbers = numbers.stream().map(number -> number * number) // Stream<R>
				.collect(Collectors.toList()); // R

		List<Integer> evenNumbersOnly = numbers.stream().filter(x -> x % 2 == 0) // Stream<T>
				.collect(Collectors.toList());

		int sum = numbers.stream().reduce(0, (x, y) -> x * x + y * y); // T

		int greatest = numbers.stream().reduce(Integer.MIN_VALUE, (x, y) -> x > y ? x : y);

		List<String> courses = Arrays.asList("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure",
				"Docker", "Kubernetes");

		List<String> coursesSortedByLengthOfCourseTitle = courses.stream()
				.sorted(Comparator.comparing(str -> str.length())).collect(Collectors.toList());
		System.out.println(coursesSortedByLengthOfCourseTitle);

	}

	private static void m2() {
		List<Integer> numbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);
		// List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);//Java9

		List<Integer> squaredNumbers = squareList(numbers);

		List<Integer> evenNumbersOnly = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());

		// System.out.println(squaredNumbers);
		System.out.println(evenNumbersOnly);

		int sum = addListFunctional(numbers);
		// System.out.println(sum);

	}

	private static List<Integer> squareList(List<Integer> numbers) {
		return numbers.stream().map(number -> number * number).collect(Collectors.toList());
	}

	private static int addListFunctional(List<Integer> numbers) {
		// Stream of number -> One result value
		// Combine them into one result => One Value
		// 0 and FP02Functional::sum
		return numbers.stream().parallel()
				// .reduce(0, FP02Functional::sum);
				// .reduce(0, (x,y) -> x + y);
				.reduce(0, Integer::sum);
	}

	private static int sum(int aggregate, int nextNumber) {
		System.out.println(aggregate + " " + nextNumber);
		return aggregate + nextNumber;
	}

	private static void m1() {
		List<Integer> numbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);
		// List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);//Java9

		int sum = addListStructured(numbers);
		System.out.println(sum);
	}

	private static int addListStructured(List<Integer> numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}

}

class EmployeeDetails2 {
	String name;
	double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	EmployeeDetails2(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return name + ":" + salary;
	}

}