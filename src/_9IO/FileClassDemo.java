package _9IO;

import java.io.File;
import java.io.IOException;

public class FileClassDemo {

	public static void main(String[] args) {
		// m1();
		// m2();
		// m3();
		 m4();
		 m5();
		m6();
	}

	private static void m6() {
		File f = new File("abhinav");
		System.out.print(f.exists());// false, true
		f.mkdir();// this would not do anything in second run
		System.out.println(f.exists());// true,true

		String[] list = f.list();
		for (String str : list) {
			System.out.println(str);
		}
		File[] fileList = f.listFiles();
		for (File file : fileList) {
			if (file.isDirectory()) {
				System.out.println("Directory: " + file.getName() + " of length " + file.length());
			} else if (file.isFile()) {
				System.out.println("File: " + file.getName() + " of length " + file.length());
			}
			//file.delete();
		}
		//f.delete();

	}

	private static void m5() {
		File f = new File("abhinav/abcd.txt");
		System.out.print(f.exists());// false, true
		try {
			f.createNewFile();// this would not do anything in second run
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(f.exists());// true,true

		System.out.println(f.isFile() + "\t" + f.isDirectory());

	}

	private static void m4() {
		File f0 = new File("abhinav");
		System.out.print(f0.exists());// false, true
		f0.mkdir();// this would not do anything in second run
		System.out.println(f0.exists());// true,true

		File f = new File(f0, "abc.txt");
		System.out.print(f.exists());// false, true
		try {
			f.createNewFile();// this would not do anything in second run
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(f.exists());// true,true
	}

	private static void m3() {
		m2();
		File f = new File("abhinav", "abc.txt");
		System.out.print(f.exists());// false, true
		// f.mkdir();//
		try {
			f.createNewFile();// this would not do anything in second run
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(f.exists());// true,true
	}

	private static void m2() {
		File f = new File("abhinav");
		System.out.print(f.exists());// false, true
		f.mkdir();// this would not do anything in second run
		System.out.println(f.exists());// true,true
	}

	private static void m1() {
		File f = new File("abhinav/abcd.txt");
		System.out.print(f.exists());// false, true
		try {
			f.createNewFile();// this would not do anything in second run
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(f.exists());// true,true

	}
}