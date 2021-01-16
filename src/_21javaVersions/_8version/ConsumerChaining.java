package _21javaVersions._8version;

import java.util.function.Consumer;

public class ConsumerChaining {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		Consumer<MovieDetails> c1 = m -> System.out.println("Movie:" + m.name + " is ready to release");
		Consumer<MovieDetails> c2 = m -> System.out.println("Movie:" + m.name + " is just Released and it is:" + m.result);
		Consumer<MovieDetails> c3 = m -> System.out.println("Movie:" + m.name + " information storing in the database");
		
		Consumer<MovieDetails> chainedC = c1.andThen(c2).andThen(c3);
		MovieDetails m1 = new MovieDetails("Bahubali", "Hit");
		chainedC.accept(m1);
		
		System.out.println();
		MovieDetails m2 = new MovieDetails("Spider", "Flop");
		chainedC.accept(m2);
	}

}

class MovieDetails {
	String name;
	String result;

	MovieDetails(String name, String result) {
		this.name = name;
		this.result = result;
	}
}