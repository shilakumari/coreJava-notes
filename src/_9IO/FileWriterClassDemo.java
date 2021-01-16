package _9IO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClassDemo {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		FileWriter fw = null;
		try {
			fw = new FileWriter("abc.txt", true);
			fw.write(65);
			fw.write("bhi\nSoftwareSolutions");
			fw.write("\n");
			char[] ch = { 'a', 'b', 'c' };
			fw.write(ch);
			fw.write('\n');
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.flush();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
