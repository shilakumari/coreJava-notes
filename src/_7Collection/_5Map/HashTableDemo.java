package _7Collection._5Map;

import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		Hashtable<Student, String> ht = new Hashtable<Student, String>();
		ht.put(new Student(5), "A");
		ht.put(new Student(2), "B");
		ht.put(new Student(6), "C");
		ht.put(new Student(15), "D");
		ht.put(new Student(23), "E");
		ht.put(new Student(16), "F");
		ht.put(new Student(1), "G");
		System.out.println(ht);// {6=C, 16=F, 5=A, 15=D, 2=B, 1=G, 23=E}
	}
}

class Student {
	int id;

	public Student(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		// final int prime = 31;
		// int result = 1;
		// result = prime * result + id;
		// return result;
		return id;
		// return id%9;
	}

	// @Override
	// public boolean equals(Object obj) {
	// if (this == obj)
	// return true;
	// if (obj == null)
	// return false;
	// if (getClass() != obj.getClass())
	// return false;
	// Student other = (Student) obj;
	// if (id != other.id)
	// return false;
	// return true;
	// }

	@Override
	public String toString() {
		return "" + id;
	}

}