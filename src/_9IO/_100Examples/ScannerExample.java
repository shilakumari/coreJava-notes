package _9IO._100Examples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// m0();
		// m1();
		// m2();
		// m3();
		// m4();
		m5();
	}

	private static void m0() {
		Scanner scanner = new Scanner(System.in);
		String str = null;
		for (int i = 0; i <= 3; i++) {
			System.out.println("Enter text:");
			str = scanner.nextLine();
			System.out.println(str);
		}
		scanner.close();
	}

	private static void m1() {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		while (scanner.hasNext()) // waiting for user input
		{
			System.out.print(i++ + " ");
			System.out.println(scanner.nextLine());
		}
		scanner.close();
	}

	private static void m2() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();

		String s = "";
		// if ((n >= -100) && (n <= 100)) {
		// s = Integer.toString(n);
		// }
		System.out.println(s);
		scanner.close();
	}

	private static void m3() {
		File file = new File("src/_9IO/_100Examples/100Examples.txt");
		try (Scanner scanner = new Scanner(file)) {
			while (scanner.hasNext()) // scanner.hasNextLine()
			{
				System.out.println(scanner.nextLine());
				// System.out.println("bye");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// finally {
		// scanner.close();
		// }

	}

	private static void m4() {
		// File file = new File("src/_9IO/_100Examples/100Exampleshj.txt");
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		try {
			fileReader = new FileReader("src/_9IO/_100Examples/100Exampleshj.txt");
			bufferedReader = new BufferedReader(fileReader);
			String str = bufferedReader.readLine();
			while (str != null) {
				System.out.println(str);
				str = bufferedReader.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileReader != null) {
					fileReader.close();
				}
				bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void m5() {
		try (FileReader fileReader = new FileReader("src/_9IO/_100Examples/100Exampleshj.txt");
				BufferedReader bufferedReader = new BufferedReader(fileReader);) {
			String str = bufferedReader.readLine();
			while (str != null) {
				System.out.println(str);
				str = bufferedReader.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
