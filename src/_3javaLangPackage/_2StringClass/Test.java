package _3javaLangPackage._2StringClass;

public class Test {

	public static void main(String[] args) {
		//m1();
		m2();
	}

	private static void m2() {
		String s1=new String("ab");
		String s2=s1.concat("cd");
		String s3=s2.intern();
		System.out.println(s2==s3);//true, how?????????????
		String s4="abcd";
		System.out.println(s3==s4);//true		
	}

	private static void m1() {
		StringBuffer sb = new StringBuffer("rahul");
		sb.append("software");
		System.out.println(sb);// rahulsoftware

		String s1 = new String("rahul");
		s1.concat("software");
		System.out.println(s1);// rahul

		String s2 = new String("rahul");
		s2 = s2.concat("software");
		System.out.println(s2);// rahulsoftware
		System.out.println();

		String s11 = new String("rahul");
		s11.concat("software");
		String s12 = s11.concat("solutions");
		s11 = s11.concat("soft");
		String s13 = "rahul";
		String s14 = "rahul";
		System.out.println(s11);
		System.out.println(s12);
		System.out.println();

		String s31 = new String("spring");
		s31.concat("summer");
		String s32 = s31.concat("winter");
		s31 = s32.concat("fall");
		System.out.println(s31);// springwinterfall
		System.out.println(s32);// springwinter
		// String s4=new String(null);//CTE,The constructor String(String) is
		// ambiguous

		s1 = new String("abc");
		s2 = s1.concat("def");
		String s3 = s2.intern();
		System.out.println(s2 == s3);// true, How ????????????????????????
		System.out.println(s3);
		String s4 = "abcdef";
		System.out.println(s3 == s4);// true

		String str1 = new String("Abhi");
		String str2 = str1.concat("Software");
		String str3 = str2.intern();
		System.out.println("str2==str3: " + (str2 == str3));// false, doubt

		String str4 = "AbhiSoftware";
		System.out.println(str3 == str4);// true
		
		String s0 = "You cannot";
		String s = s0 + " change me!";
		String s22 = "You cannot change me!";
		System.out.println(s.hashCode());//1201201320
		System.out.println(s22.hashCode());//1201201320
		// this operation will be performed at RT only because at least one argument is normal varibale
		System.out.println(s==s22);//false
		
		s = "You cannot"+ " change me!";
		System.out.println(s==s22);//true
	}

}
