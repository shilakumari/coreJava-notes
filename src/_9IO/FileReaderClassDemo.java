package _9IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClassDemo {

	public static void main(String[] args) {
		// m1();
		// m2();
		m3();
	}

	private static void m3() {
		File f = new File("abc.txt");
		char[] ch = new char[(int) f.length()];// casting is required here
												// otherwise CTE

		FileReader fr = null;
		try {
			fr = new FileReader("abc.txt");
			fr.read(ch);
			for (char ch1 : ch) {
				System.out.print(ch1);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	private static void m2() {
		FileReader fr = null;
		try {
			fr = new FileReader("abc.txt");
			int i = fr.read();
			System.out.print((char) fr.read());
			System.out.print((char) fr.read());
			System.out.print((char) fr.read());
			System.out.print((char) fr.read());
			System.out.println();
			while (i != -1) {
				// System.out.print(i);
				System.out.print((char) i);
				i = fr.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	private static void m1() {
		FileReader fr = null;
		try {
			fr = new FileReader("abc.txt");
			int i = fr.read();
			while (i != -1) {
				// System.out.print(i);
				System.out.print((char) i);
				i = fr.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
