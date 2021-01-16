package _1LanguageFundamental._4Array;

import java.util.Arrays;

public class AnagramsString {

	public static void main(String[] args) {
		caseInsensitiveAnagrams();
		caseSensitiveAnagrams();
	}

	private static void caseSensitiveAnagrams() {
		// TODO Auto-generated method stub
		
	}

	public static void caseInsensitiveAnagrams() {
		String s = "Hello";
		String s1 = "hello";
		boolean status = true;
		if (s.length() != s1.length()) {
			status = false;
		} else {
			char[] ArrayS1 = s1.toLowerCase().toCharArray();
			char[] ArrayS = s.toLowerCase().toCharArray();
			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS);
			status = Arrays.equals(ArrayS1, ArrayS);
		}
		if (status) {
			System.out.println(s + " and " + s1 + " are anagrams");
		} else {
			System.out.println(s + " and " + s1 + " are not anagrams");
		}
	}

}
