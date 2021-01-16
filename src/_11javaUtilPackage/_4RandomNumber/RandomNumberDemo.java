package _11javaUtilPackage._4RandomNumber;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberDemo {

	public static void main(String[] args) {
		// m1();
		//m2();
		m3();
	}

	private static void m3() {
		// https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ThreadLocalRandom.html
		for (int i = 1; i <= 100; i++) {
			int rand_int3 = ThreadLocalRandom.current().nextInt();
			//System.out.println(rand_int3);
			double rand_dub3 = ThreadLocalRandom.current().nextDouble();
			System.out.println(rand_dub3);
			boolean rand_bool3 = ThreadLocalRandom.current().nextBoolean();
			System.out.println(rand_bool3);
		}
	}

	private static void m2() {
		for (int i = 1; i <= 100; i++) {
			double double1 = Math.random();
			//System.out.println("Double: " + double1);// b/w 0.0(inclusive) to	1.0
			double random1 = Math.random() * 50 + 1;
			//System.out.println(random1);
			int random2 = (int)(Math.random() * 50) + 1;
			System.out.println(random2);
		}
	}

	private static void m1() {
		// https://docs.oracle.com/javase/7/docs/api/java/util/Random.html#method_summary
		Random rand = new Random();
		for (int i = 1; i <= 100; i++) {
			int rand_int1 = rand.nextInt(); // b/w Integer.MIN_VALUE to
											// Integer.MAX_VALUE
			// System.out.println(rand_int1);
			int rand_int2 = rand.nextInt(1000); // b/w 0(inclusive) to 999
			// System.out.println(rand_int2);
			long rand_long1 = rand.nextLong();
			// System.out.println(rand_long1);

			float rand_float1 = rand.nextFloat();// b/w 0.0(inclusive) to 1.0
			// System.out.println(rand_float1);
			double rand_dub1 = rand.nextDouble();// b/w 0.0(inclusive) to 1.0
			// System.out.println(rand_dub1);
			double rand_dub2 = rand.nextGaussian();// about 70% will lie b/w -1
													// & 1, about 95% b/w -2 & 2
			// System.out.println(rand_dub2);
			boolean rand_bool1 = rand.nextBoolean();
			// System.out.println(rand_bool1);

			byte[] bytes = new byte[10];
			rand.nextBytes(bytes);
			System.out.println(Arrays.toString(bytes));
		}

	}

}
