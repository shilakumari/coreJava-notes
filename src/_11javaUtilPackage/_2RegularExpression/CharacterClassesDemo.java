package _11javaUtilPackage._2RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterClassesDemo {

	public static void main(String[] args) {
		// m1();
		// m2();
		m3();
	}

	private static void m3() {
		int count = 0;
		String regularExpression = "a";
		regularExpression = "a+";
		//regularExpression = "a*";//Also matches at index = str.length()
		//regularExpression = "a?";//Also matches at index = str.length()
		Pattern p = Pattern.compile(regularExpression);

		Matcher m = p.matcher("abaabaaab");
		while (m.find()) {
			count++;
			System.out.println("Start index:" + m.start() + " End index:" + m.end() + " Matched Pattern:" + m.group());
		}
		System.out.println("The total number of occurances: " + count);
	}

	private static void m2() {
		int count = 0;
		String regularExpression = " ";
		regularExpression = "\\s";
		regularExpression = "[\\s]";

		regularExpression = "[\\S]";
		regularExpression = "\\d";
		regularExpression = "[\\D]";

		regularExpression = "\\w";
		regularExpression = "\\W";

		regularExpression = ".";// It will match any character
		regularExpression = "[.]";// it will match .
		Pattern p = Pattern.compile(regularExpression);

		Matcher m = p.matcher("a3b #k@9z");
		while (m.find()) {
			count++;
			System.out.println("Start index:" + m.start() + " End index:" + m.end() + " Matched Pattern:" + m.group());
		}
		System.out.println("The total number of occurances: " + count);
	}

	private static void m1() {
		int count = 0;
		String regularExpression = "abc";
		regularExpression = "[abc]";
		regularExpression = "[^abc]";
		regularExpression = "[a-z]";
		regularExpression = "[A-Z]";
		regularExpression = "[a-zA-Z]";
		regularExpression = "[0-9]";
		regularExpression = "[^0-9]";
		regularExpression = "[0-9a-zA-Z]";
		regularExpression = "[a-dk-p]";// or "[a-d[k-p]]"
		regularExpression = "[a-z&&jkl]";// or "[a-z&&[jkl]]"
		regularExpression = "[a-z&&[^bc]]";// or "[ad-z]"
		// regularExpression = "[a-z&&^bc]";//??????????????
		regularExpression = "[a-z&&[^bc]]";
		regularExpression = "[a-z&&[^m-p]]";// or [a-lq-z]
		Pattern p = Pattern.compile(regularExpression);

		Matcher m = p.matcher("a3b#k@9z");
		while (m.find()) {
			count++;
			System.out.println("Start index:" + m.start() + " End index:" + m.end() + " Matched Pattern:" + m.group());
		}
		System.out.println("The total number of occurances: " + count);
	}

}
