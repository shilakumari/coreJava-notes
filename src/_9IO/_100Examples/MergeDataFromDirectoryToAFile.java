package _9IO._100Examples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MergeDataFromDirectoryToAFile {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		PrintWriter pw = null;
		BufferedReader br = null;
		try {
			pw = new PrintWriter("output.txt");
			File f = new File("abhinav");
			String[] s = f.list();
			for (String s1 : s) {
				br = new BufferedReader(new FileReader(new File(f, s1)));
				String line = br.readLine();
				while (line != null) {
					pw.println(line);
					line = br.readLine();
				}
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
