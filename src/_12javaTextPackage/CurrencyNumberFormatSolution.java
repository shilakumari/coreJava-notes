package _12javaTextPackage;

import java.util.*;
import java.text.*;

public class CurrencyNumberFormatSolution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		NumberFormat nf = NumberFormat.getInstance();
		// NumberFormat nf2=nf.getCurrencyInstance(Locale.US)
		// nf2.format(payment);
		System.out.println("US: " + nf.getCurrencyInstance(Locale.US).format(payment));
		System.out.println("India: " + nf.getCurrencyInstance(new Locale("en", "IN")).format(payment));
		System.out.println("China: " + nf.getCurrencyInstance(Locale.CHINA).format(payment));
		System.out.println("France: " + nf.getCurrencyInstance(new Locale("fr", "FR")).format(payment));
	}
}
