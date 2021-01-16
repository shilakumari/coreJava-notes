package _3javaLangPackage._2StringClass;

import java.util.Scanner;

public class SplitString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		if (s.trim().equals("")) {
			System.out.println("0");
		} else {
			//String[] str = s.trim().split("[[ \t]+!,?._'@]+");
			String[] str = s.trim().split("[ \t!,?._'@]+");
			System.out.println(str.length);
			for (String str1 : str) {
				System.out.println(str1);
			}
		}
		scan.close();
	}

}
