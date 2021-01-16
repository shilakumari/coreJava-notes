package _9IO;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterClassDemo {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter("abc.txt");
			pw.write(100);// d
			pw.println(100);// 100
			pw.println(true);
			pw.println('A');
			pw.println("Abhi");
			pw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			pw.close();
		}
	}
}
