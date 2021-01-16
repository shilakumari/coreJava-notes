package _11javaUtilPackage._2RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo1 {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		int count = 0;
        String regularExpression = "ab";
        regularExpression="[ab]";
		Pattern p = Pattern.compile(regularExpression);

		Matcher m = p.matcher("abbabbba");
		while (m.find()) {
			count++;
			System.out.println("Start index:" + m.start() + " End index:" + m.end() + " Matched Pattern:" + m.group());
		}
		System.out.println("The total number of occurances: " + count);
	}

}

