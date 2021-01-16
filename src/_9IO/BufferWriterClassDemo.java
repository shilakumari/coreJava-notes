package _9IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterClassDemo {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		FileWriter fw;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("abc.txt");
			bw = new BufferedWriter(fw);
			bw.write(100);
			bw.newLine();
			char[] ch1 = { 'a', 'b', 'c', 'd' };
			bw.write(ch1);
			bw.newLine();
			bw.write("Abhi");
			bw.newLine();
			bw.write("SoftwareSolutions");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.flush();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
