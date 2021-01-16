package _9IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderClassDemo {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		FileReader fr;
		BufferedReader br = null;
		try {
			fr = new FileReader("abc.txt");
			br = new BufferedReader(fr);
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
