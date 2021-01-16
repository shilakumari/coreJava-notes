package _1LanguageFundamental._3flowControl.programs;

public class Examples {

	public static void main(String[] args) {
		m1();

	}

	private static void m1() {
		String str = "part1_part2_part3_part4_part5_123";
		String[] arr = str.split("_");
		str = "";
		for (int i = 0; i < arr.length - 1; i++) {
			if (i == 0) {
				str = arr[i];
			} else {
				str = str + " " + arr[i];
			}
		}
		System.out.println(str);

	}

}
