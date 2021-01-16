package _9IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileExtractionOperation {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		PrintWriter pw = null;
		BufferedReader br1 = null;
		try {
			pw = new PrintWriter("output.txt");
			br1 = new BufferedReader(new FileReader("input.txt"));
			String line = br1.readLine();
			while (line != null) {
				boolean isNotPrint = false;
				
				BufferedReader br2 = new BufferedReader(new FileReader("delete.txt"));
				String target = br2.readLine();
				while (target != null) {
					if (line.equals(target)) {
						isNotPrint = true;
						break;
					}
					target = br2.readLine();
				}
				if (isNotPrint == false) {
					pw.println(line);
				}
				line = br1.readLine();
			}
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				pw.close();
				br1.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
