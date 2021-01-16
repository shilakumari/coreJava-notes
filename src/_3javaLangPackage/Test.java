package _3javaLangPackage;

import java.util.ArrayList;

public class Test {
	int x;

	public static void main(String[] args) {

		Test t = new Test();
		System.out.println(t);
		System.out.println(t.toString());

		Integer i1 = new Integer(10);
		System.out.println(i1.toString());

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Sachin");
		arrayList.add("Shalu");
		System.out.println(arrayList);

		String str = new String("Hello World");
		System.out.println(str);

		// System.out.println(t==2);//CTE
		// System.out.println(t=="esfs");//CTE
		System.out.println(t.equals("sf"));// false
		System.out.println(t == t);

		String s1 = new String("Abhi");
		String s2 = new String("Abhi");
		StringBuffer sb1 = new StringBuffer("Abhi");
		StringBuffer sb2 = new StringBuffer("Abhi");

		"".equals("");

		System.out.print(s1 == s2);// false
		System.out.println(s1.equals(s2));// true
		System.out.print(sb1 == sb2);// false
		System.out.println(sb1.equals(sb2));// false

		// System.out.print(s1==sb1);//CTE,incomparable type
		System.out.println(s1.equals(sb1));// false

		// System.out.println("" instanceof Test);//CTE
		System.out.println("".equals(new Test()));
		System.out.println("FB".hashCode());// 2236
		System.out.println("Ea".hashCode());// 2236

	}

	public String toStrin2g() {
		// return this.getClass().getName() + "@" +
		// Integer.toHexString(this.hashCode());

		return "[" + "sdaf" + "]" + this.hashCode();
	}

	public int hashCode2() {

		return 44;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		return result;
	}

	// @Override
	public boolean equals3(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		if (x != other.x)
			return false;
		return true;
	}

}
