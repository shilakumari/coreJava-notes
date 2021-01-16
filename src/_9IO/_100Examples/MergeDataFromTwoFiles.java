package _9IO._100Examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MergeDataFromTwoFiles {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		PrintWriter pw = null;
		BufferedReader br = null;
		try {
			pw = new PrintWriter("file1.txt");
			
			br = new BufferedReader(new FileReader("file2.txt"));
			String line = br.readLine();
			while (line != null) {
				pw.println(line);
				line = br.readLine();
			}
			
			br = new BufferedReader(new FileReader("file3.txt"));
			line = br.readLine();
			while (line != null) {
				pw.println(line);
				line = br.readLine();
			}
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				br.close();
				pw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
