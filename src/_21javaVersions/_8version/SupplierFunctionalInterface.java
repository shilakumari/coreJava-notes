package _21javaVersions._8version;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierFunctionalInterface {

	public static void main(String[] args) {
		// m1();
		// m2();
		// m3();
		m4();
	}

	private static void m4() {
		Supplier<String> s = () -> {
			String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ#$@";
			Supplier<Integer> d = () -> (int) (Math.random() * 10);
			Supplier<Character> c = () -> symbols.charAt((int) (Math.random() * 29));
			String pwd = "";
			for (int i = 1; i <= 8; i++) {
				if (i % 2 == 0) {
					pwd = pwd + d.get();
				} else {
					pwd = pwd + c.get();
				}
			}
			return pwd;
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}

	private static void m3() {
		Supplier<String> otps = () -> {
			String otp = "";
			for (int i = 1; i <= 6; i++) {
				otp = otp + (int) (Math.random() * 10);
			}
			return otp;
		};
		System.out.println(otps.get());
		System.out.println(otps.get());
		System.out.println(otps.get());
		System.out.println(otps.get());
	}

	private static void m2() {
		Supplier<Date> s = () -> new Date();
		System.out.println(s.get());
		System.out.println(s.get());
	}

	private static void m1() {
		Supplier<String> s = () -> {
			String[] s1 = { "Sunny", "Bunny", "Chinny", "Pinny" };
			
			int x = (int) (Math.random() * 4);
			return s1[x];
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}

}
