package _9IO._100Examples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MergeDataFromTwoFilesLineByLineAlternatively {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		PrintWriter pw = null;
		BufferedReader br1 = null;
		BufferedReader br2 = null;
		try {
			FileWriter fw=new FileWriter("file1.txt",false);
			pw = new PrintWriter(fw);
			
			br1 = new BufferedReader(new FileReader("file2.txt"));
			br2 = new BufferedReader(new FileReader("file3.txt"));
			
			String line1 = br1.readLine();
			String line2 = br2.readLine();
			
			while (line1 != null || line2 != null) {
				if (line1 != null) {
					pw.println(line1);
					line1 = br1.readLine();
				}
				if (line2 != null) {
					pw.println(line2);
					line2 = br2.readLine();
				}
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
