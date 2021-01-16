package _7Collection._2List;

public class Employee implements Comparable 
{

	int empId;
	String name;
	int age;

	public Employee(int empId, String name, int age) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return name + "\t" + age;
		}

	public int compareTo1(Object o) {
		int age1 = this.age;
		int age2 = ((Employee) o).age;
		if (age1 < age2) {
			return -1;
		} else if (age1 > age2) {
			return 1;
		}
		return 0;
	}

	public int compareTo2(Object o) {
		Integer age1 = this.age;
		Integer age2 = ((Employee) o).age;
		return age1.compareTo(age2);
	}

	public int compareTo3(Object o) {
		String name1 = this.name;
		String name2 = ((Employee) o).name;
		return name1.compareTo(name2);
	}

	public int compareTo(Object o) {
		Integer age1 = this.age;
		Integer age2 = ((Employee) o).age;
		String name1 = this.name;
		String name2 = ((Employee) o).name;
		if (name1.compareTo(name2) == 0) {
			return age1.compareTo(age2);
		}
		return name1.compareTo(name2);
	}
}
