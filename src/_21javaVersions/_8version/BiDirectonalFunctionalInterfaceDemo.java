package _21javaVersions._8version;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
class Node<T> implements Comparable<T>{

	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
public class BiDirectonalFunctionalInterfaceDemo {

	 
	public static void main(String[] args) {
		// m1();
		// m2();
		m3();
		
		Node<String>  n=new Node<>();
		Comparable<String> sddsf=n;
	}

	private static void m3() {
		ArrayList<EmployeesInformartion> l = new ArrayList<EmployeesInformartion>();
		populate(l);
		BiConsumer<EmployeesInformartion, Double> c = (e, d) -> e.salary = e.salary + d;
		for (EmployeesInformartion e : l) {
			c.accept(e, 500.0);
		}
		for (EmployeesInformartion e : l) {
			System.out.println("Employee Name:" + e.name);
			System.out.println("Employee Salary:" + e.salary);
			System.out.println();
		}
	}

	public static void populate(ArrayList<EmployeesInformartion> l) {
		l.add(new EmployeesInformartion("Durga", 1000));
		l.add(new EmployeesInformartion("Sunny", 2000));
		l.add(new EmployeesInformartion("Bunny", 3000));
		l.add(new EmployeesInformartion("Chinny", 4000));

	}

	private static void m2() {
		BiFunction<EmployeeInformation, TimeSheet, Double> f = (e, t) -> e.dailyWage * t.days;
		EmployeeInformation e = new EmployeeInformation(101, "Durga", 1500);
		TimeSheet t = new TimeSheet(101, 25);
		System.out.println("Employee Monthly Salary:" + f.apply(e, t));
	}

	private static void m1() {
		ArrayList<StudentInformation> l = new ArrayList<StudentInformation>();
		BiFunction<String, Integer, StudentInformation> f = (name, rollno) -> new StudentInformation(name, rollno);
		l.add(f.apply("Durga", 100));
		l.add(f.apply("Ravi", 200));
		l.add(f.apply("Shiva", 300));
		l.add(f.apply("Pavan", 400));
		for (StudentInformation s : l) {
			System.out.println("Student Name:" + s.name);
			System.out.println("Student Rollno:" + s.rollno);
			System.out.println();
		}
	}

}

class EmployeeInformation {
	int eno;
	String name;
	double dailyWage;

	EmployeeInformation(int eno, String name, double dailyWage) {
		this.eno = eno;
		this.name = name;
		this.dailyWage = dailyWage;
	}
}

class TimeSheet {
	int eno;
	int days;

	TimeSheet(int eno, int days) {
		this.eno = eno;
		this.days = days;
	}
}

class StudentInformation {
	String name;
	int rollno;

	StudentInformation(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}
}

class EmployeesInformartion {
	String name;
	double salary;

	EmployeesInformartion(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
}
