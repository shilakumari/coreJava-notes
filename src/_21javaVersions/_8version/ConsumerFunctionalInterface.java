package _21javaVersions._8version;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerFunctionalInterface {

	public static void main(String[] args) {
		//m1();
		m2();
	}

	private static void m2() {
		ArrayList<Movie> l = new ArrayList<Movie>();
		populate(l);
		Consumer<Movie> c = m -> {
			System.out.println("Movie Name:" + m.name);
			System.out.println("Movie Hero:" + m.hero);
			System.out.println("Movie Heroine:" + m.heroine);
			System.out.println();
		};
		for (Movie m : l) {
			c.accept(m);
		}
	}

	public static void populate(ArrayList<Movie> l) {
		l.add(new Movie("Bahubali", "Prabhas", "Anushka"));
		l.add(new Movie("Rayees", "Sharukh", "Sunny"));
		l.add(new Movie("Dangal", "Ameer", "Ritu"));
		l.add(new Movie("Sultan", "Salman", "Anushka"));
	}

	private static void m1() {
		Consumer<String> c = s -> System.out.println(s);
		c.accept("Hello");
		c.accept("DURGASOFT");
	}

}

class Movie {
	String name;
	String hero;
	String heroine;

	Movie(String name, String hero, String heroine) {
		this.name = name;
		this.hero = hero;
		this.heroine = heroine;
	}
}
