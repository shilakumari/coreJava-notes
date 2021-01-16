package _21javaVersions._8version;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateFunctionConsumerDemo {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		ArrayList<StudentDetails> l = new ArrayList<StudentDetails>();
		populate(l);
		
		Predicate<StudentDetails> p = s -> s.marks >= 60;
		Function<StudentDetails, String> f = s -> {
			int marks = s.marks;
			if (marks >= 80) {
				return "A[Dictinction]";
			} else if (marks >= 60) {
				return "B[First Class]";
			} else if (marks >= 50) {
				return "C[Second Class]";
			} else if (marks >= 35) {
				return "D[Third Class]";
			} else {
				return "E[Failed]";
			}
		};
		Consumer<StudentDetails> c = s -> {
			System.out.println("Student Name:" + s.name);
			System.out.println("Student Marks:" + s.marks);
			System.out.println("Student Grade:" + f.apply(s));
			System.out.println();
		};
		for (StudentDetails s : l) {
			if (p.test(s)) {
				c.accept(s);
			}
		}
	}

	public static void populate(ArrayList<StudentDetails> l) {
		l.add(new StudentDetails("Sunny", 100));
		l.add(new StudentDetails("Bunny", 65));
		l.add(new StudentDetails("Chinny", 55));
		l.add(new StudentDetails("Vinny", 45));
		l.add(new StudentDetails("Pinny", 25));
	}

}

class StudentDetails {
	String name;
	int marks;

	StudentDetails(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}