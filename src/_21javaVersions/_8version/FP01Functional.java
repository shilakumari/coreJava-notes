package _21javaVersions._8version;

import java.util.Arrays;
import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		// m1();
		m2();
		// m3();
	}

	private static void m3() {

		List<Integer> numbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);
		// List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);//Java9

		printCubesOfOddNumbersInListFunctional(numbers);
		// printOddNumbersInListFunctional(numbers);

		List<String> courses = Arrays.asList("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure",
				"Docker", "Kubernetes");
		// List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);//Java9

		// List<String> courses = List.of("Spring", "Spring Boot", "API" ,
		// "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");

		// courses.stream()
		// .forEach(System.out::println);

		// courses.stream()
		// .filter(course -> course.contains("Spring"))
		// .forEach(System.out::println);

		// courses.stream()
		// .filter(course -> course.length() >= 4)
		// .forEach(System.out::println);

		courses.stream().map(course -> course + " " + course.length()).forEach(System.out::println);

	}

	private static void printCubesOfOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream() // Convert to Stream
				.filter(number -> number % 2 != 0) // Lamdba Expression
				.map(number -> number * number * number).forEach(System.out::println);// Method
																						// Reference
	}

	private static void printOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream() // Convert to Stream
				.filter(number -> number % 2 != 0) // Lamdba Expression
				.forEach(System.out::println);// Method Reference
	}

	private static void m2() {
		List<Integer> numbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);
		// List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);//Java9

		// printAllNumbersInListFunctional(numbers);
		printEvenNumbersInListFunctional(numbers);
		printSquaresOfEvenNumbersInListFunctional(numbers);

	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream().forEach(System.out::println);// Method Reference
		// numbers.stream().forEach((obj)->System.out.println(obj));// Method
		// Reference
	}

	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream() // Convert to Stream
				.filter(number -> number % 2 == 0) // Lamdba Expression
				.forEach(System.out::println);// Method Reference
		// .filter(FP01Functional::isEven)//Filter - Only Allow Even Numbers
	}

	private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream() // Convert to Stream
				.filter(number -> number % 2 == 0) // Lamdba Expression
				.map(number -> number * number).forEach(System.out::println);// Method
																				// Reference
		// .filter(FP01Functional::isEven)//Filter - Only Allow Even Numbers
	}
	// private static boolean isEven(int number) {
	// return number%2 == 0;
	// }

	private static void m1() {
		List<Integer> numbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);
		// List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);//Java9

		printAllNumbersInListStructured(numbers);
		printEvenNumbersInListStructured(numbers);
	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		// How to loop the numbers?
		for (int number : numbers) {
			System.out.println(number);
		}
	}

	private static void printEvenNumbersInListStructured(List<Integer> numbers) {
		for (int number : numbers) {
			if (number % 2 == 0) {
				System.out.println(number);
			}
		}
	}
	// private static void print(int number) {
	// System.out.println(number);
	// }

}
