package _2OOPs._7Annotation;

public class DeprecatedAnnotationDemo {

	public static void main(String[] args) {
		m1();
	}

	@SuppressWarnings(value = { "deprecation" })
	private static void m1() {
		Employee employee = new Employee();
		employee.m1();
		employee.m2();
	}

}
