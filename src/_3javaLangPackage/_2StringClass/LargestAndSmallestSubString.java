package _3javaLangPackage._2StringClass;

public class LargestAndSmallestSubString {

	public static void main(String[] args) {

		m1();
		m2();
	}

	
	private static void m2() {
		String s = "welcometojava";
		int k = 3;
		String[] arr = new String[s.length() - k + 1];
		for (int i = 0; i < s.length() - k + 1; i++) {
			arr[i] = s.substring(i, i + k);
		}
		// for (String str : arr) {
		// System.out.print(str + "\t");
		// }
		String smallest = arr[0];
		String largest = arr[0];
		int i = 0;
		for (String str : arr) {
			if (arr[i].compareTo(smallest) < 0)
				smallest = arr[i];
			if (arr[i].compareTo(largest) > 0)
				largest = arr[i];
			i++;
		}
		System.out.println("\nmin " + smallest);
		System.out.println("max " + largest);

	}

	private static void m1() {

		String s = "welcometojava jk";
		String smallest = "";
		String largest = "";
		int k = 3;
		for (int i = 0; i < s.length() - k + 1; i++) {
			String s2 = "";

			// for (int j = i; j < i + k; j++)
			// s2 += s.charAt(j);
			s2 = s.substring(i, i + k);

			if (i == 0) {
				smallest = s2;
				largest = s2;
			} else {
				if (s2.compareTo(smallest) < 0)
					smallest = s2;
				if (s2.compareTo(largest) > 0)
					largest = s2;
			}
		}
		System.out.println("min " + smallest);
		System.out.println("max " + largest);

	}

}
