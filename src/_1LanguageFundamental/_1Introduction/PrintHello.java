package _1LanguageFundamental._1Introduction;

public class PrintHello {

	public static void main(String[] args) {
		PrintHello printHello = new PrintHello();
		String str = printHello.toString2();
		System.out.println(str);
	}

	// @Override
	public String toString2() {
		return "PrintHello [getClass()= " + getClass() + ", hashCode()= " + hashCode() + ", toString()= "
				+ super.toString() + "]";
	}

}
