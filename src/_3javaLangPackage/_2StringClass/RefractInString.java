package _3javaLangPackage._2StringClass;

public class RefractInString {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		String str = "Become a confident industry ready core Java developer and get certified as a Java professional!"
				+ "the catagory:apperal and slightly"
				+ "more in demand catagory:makeup along with the catagory:furniture and ...";
		// String str = "a B:c m B:D n B:e";
		m2(str);
	}

	private static void m2(String str) {
		int lastIndex = str.lastIndexOf("catagory:");
		// System.out.println(lastIndex);//14

		int startIndex = 0;
		while (true) {
			int foundIndex = str.indexOf("catagory:", startIndex);
			if (foundIndex == -1) {
				break;
			}
			startIndex = foundIndex + 1;

			String restString = str.substring(foundIndex);
			String[] arr = restString.split(" ");

			System.out.println(arr[0].substring(9));
		}

	}

}
