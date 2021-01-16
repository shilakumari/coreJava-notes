package _21javaVersions._8version;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class TotalMonthlySalaryOfEmployee {

	public static void main(String[] args) {
		// m1();
		m2();
	}

	private static void m2() {
		ArrayList<EmployeeDetails> l = new ArrayList<EmployeeDetails>();
		populate(l);
		System.out.println("Before Increment:");
		System.out.println(l);
		Predicate<EmployeeDetails> p = e -> e.salary < 3500;
		Function<EmployeeDetails, EmployeeDetails> f = e -> {
			e.salary = e.salary + 477;
			return e;
		};
		System.out.println("After Increment:");
		ArrayList<EmployeeDetails> l2 = new ArrayList<EmployeeDetails>();
		for (EmployeeDetails e : l) {
			if (p.test(e)) {
				l2.add(f.apply(e));
			}
		}
		System.out.println(l);
		System.out.println("Employees with  incremented salary:");
		System.out.println(l2);

	}

	private static void m1() {
		ArrayList<EmployeeDetails> l = new ArrayList<EmployeeDetails>();
		populate(l);
		System.out.println(l);
		Function<ArrayList<EmployeeDetails>, Double> f = l1 -> {
			double total = 0;
			for (EmployeeDetails e : l1) {
				total = total + e.salary;
			}
			return total;
		};
		System.out.println("The total salary of this month:" + f.apply(l));
	}

	public static void populate(ArrayList<EmployeeDetails> l) {
		l.add(new EmployeeDetails("Sunny", 1000));
		l.add(new EmployeeDetails("Bunny", 2000));
		l.add(new EmployeeDetails("Chinny", 3000));
		l.add(new EmployeeDetails("Pinny", 4000));
		l.add(new EmployeeDetails("Vinny", 5000));
		l.add(new EmployeeDetails("Vinny", 5000));
		l.add(new EmployeeDetails("Durga", 10000));
	}

}

class EmployeeDetails {
	String name;
	double salary;

	EmployeeDetails(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return name + ":" + salary;
	}
}