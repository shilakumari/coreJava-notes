package _21javaVersions._8version;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class FP03MethodReferences {

	private static void print(String str) {
		System.out.println(str);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		List<String> courses = Arrays.asList("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure",
				"Docker", "Kubernetes");
		courses.stream()
				// .map(str -> str.toUpperCase())
				.map(String::toUpperCase)// Instance Method Reference
				.forEach(FP03MethodReferences::print);// Static Method Reference
		Supplier<String> supplier = String::new;// Contructore Reference

	}
}
