package _11javaUtilPackage._3Internationlization;

import java.util.Locale;

public class LocaleClassDemo {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		int count = 0;
		int count1 = 0;
		int count2 =0;
		Locale l1 = Locale.getDefault();
		System.out.println(l1.getCountry() + "....." + l1.getLanguage());// IN.....en
		System.out.println(l1.getDisplayCountry() + "....." + l1.getDisplayLanguage());// India.....English
		Locale l2 = new Locale("pa", "IN");
		Locale.setDefault(l2);
		System.out.println(Locale.getDefault().getDisplayLanguage());// Panjabi
		String[] s3 = Locale.getISOLanguages();
		for (String s4 : s3) {
			count++;
			System.out.print(s4 + ", ");
		}
		System.out.println("\nTotal ISOLanguages: " + count);// 188
		String[] s4 = Locale.getISOCountries();
		for (String s5 : s4) {
			count1++;
			System.out.print(s5 + ", ");
		}
		System.out.println("\nTotal ISOCountries: " + count1);//250
		 Locale[] s = Locale.getAvailableLocales();
		 for (Locale s1 : s) {
			 count2++;
		 System.out.println(s1.getDisplayCountry() + "...." +
		 s1.getDisplayLanguage());
		 }
		 System.out.println(count2);//160
	}
}
