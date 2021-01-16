package _9IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class RemoveDuplicateFromAFile {

	public static void main(String[] args) {
		// m1();
		//m2();//only single occurance data will come in output
	}

	private static void m2() {
		PrintWriter pw = null;
		BufferedReader br1 = null;
		BufferedReader br2 = null;
		try {
			pw = new PrintWriter("output.txt");
			br1 = new BufferedReader(new FileReader("input.txt"));

			String line = br1.readLine();
			while (line != null) {
				int count = 0;

				br2 = new BufferedReader(new FileReader("input.txt"));
				String target = br2.readLine();
				while (target != null) {
					if (line.equals(target)) {
						count++;
					}
					target = br2.readLine();
				}

				if (count == 1) {
					pw.println(line);
					pw.flush();
				}
				line = br1.readLine();
			}
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br1.close();
				br2.close();
				pw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void m1() {
		PrintWriter pw = null;
		BufferedReader br1 = null;
		BufferedReader br2 = null;
		try {
			pw = new PrintWriter("output.txt");
			br1 = new BufferedReader(new FileReader("input.txt"));

			String line = br1.readLine();
			while (line != null) {
				boolean available = false;

				br2 = new BufferedReader(new FileReader("output.txt"));
				String target = br2.readLine();
				while (target != null) {
					if (line.equals(target)) {
						available = true;
						break;
					}
					target = br2.readLine();
				}
				if (available == false) {
					pw.println(line);
					pw.flush();
				}
				line = br1.readLine();
			}
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br1.close();
				br2.close();
				pw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
