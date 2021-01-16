package _2OOPs._6Enum;

public class EnumDemo {

	public static void main(String[] args) {

		// m1();
		// m2();
		// m3();
		// m4();
		//m5();
		m6();
	}

	private static void m6() {
		Beer6 b6 = Beer6.fromString("ko");
		System.out.println(b6);
		b6 = Beer6.fromLiteral("KO");
		System.out.println(b6);
	}

	private static void m5() {
		Beer5 b[] = Beer5.values();
		for (Beer5 b5 : b) {
			b5.getInfo();
			System.out.println(b5 + " " + b5.toString() + " " + b5.name() + "..." + b5.ordinal());

		}
	}

	private static void m4() {
		Beer4 b[] = Beer4.values();
		for (Beer4 b4 : b) {
			System.out.println(
					b4 + " " + b4.toString() + " " + b4.name() + "..." + b4.ordinal() + " " + b4.getIntValue());
		}
	}

	private static void m3() {
		Beer3 b[] = Beer3.values();
		for (Beer3 b3 : b) {
			System.out.println(b3.name() + "..." + b3.ordinal());
		}
	}

	private static void m2() {
		Beer2 b[] = Beer2.values();
		for (Beer2 b2 : b) {
			System.out.println(b2.name() + "..." + b2.ordinal());
		}
	}

	private static void m1() {
		System.out.println("Hello");
		Beer b = Beer.RC;// line 1
		System.out.println("Bye");
	}
}

enum Beer {
	KF, KO, RC, FO;

	Beer() {
		System.out.println("Constructor");
	}
}

enum Beer2 {
	KF(17), KO(80), RC(90), FO;

	Beer2(int price) {
		System.out.println("int price" + price);
	}

	Beer2() {
		System.out.println("before default 65 price");
	}
}

enum Beer3 {
	KF(17, "kf"), KO(80, "ko"), RC(90, "rc"), FO;

	Beer3(int intValue, String stringValue) {
		System.out.println("int price" + intValue + stringValue);
	}

	Beer3() {
		System.out.println("before default 65 price");
	}
}

enum Beer4 {
	KF(17, "kf"), KO(80, "ko"), RC(90, "rc"), FO;

	private int intValue;

	Beer4(int intValue, String stringValue) {
		System.out.println("int price" + intValue + stringValue);
		this.intValue = intValue;
	}

	Beer4() {
		System.out.println("before default 65 price");
		this.intValue = 65;
	}

	public int getIntValue() {
		return intValue;
	}
}

enum Beer5 {
	KF, KO, RC {
		public void getInfo() {
			System.out.println("RC info");
		}
	},
	FO;

	Beer5() {
		System.out.println("Constructor");
	}

	public void getInfo() {
		System.out.println("getInfo()");

	}
}

enum Beer6 {
	KF(17, "kf"), KO(80, "ko"), RC(90, "rc"), FO;

	private int intValue;
	private String strValue;

	Beer6(int intValue, String stringValue) {
		System.out.println("int price" + intValue + stringValue);
		this.intValue = intValue;
		this.strValue = stringValue;
	}

	Beer6() {
		System.out.println("before default 65 price");
		this.intValue = 65;
		this.strValue = "default";

	}

	public int getIntValue() {
		return intValue;
	}

	public static Beer6 fromString(String text) {
		for (Beer6 b : Beer6.values()) {
			if (b.strValue.equalsIgnoreCase(text)) {
				return b;
			}
		}
		return null;
		// throw new IllegalArgumentException();
	}

	public static Beer6 fromLiteral(String professionalType) {
		for (Beer6 b : Beer6.values()) {
			if (b.name().equalsIgnoreCase(professionalType)) {
				return b;
			}
		}
		return null;
		// throw new IllegalArgumentException();
	}
}
// class Y extends Beer{} //The type Beer cannot be the superclass of Y; a
// superclass must be a class
