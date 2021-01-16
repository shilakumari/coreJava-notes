package _7Collection._5Map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClassDemo {

	public static void main(String[] args) throws IOException {
		m1();
	}

	private static void m1() throws IOException {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("E:\\eclipse\\projects\\coreJava\\src//_7Collection//_5Map//abc.properties");
		p.load(fis);
		System.out.println(p);
		
		String s = p.getProperty("venki");
		System.out.println(s);
		
		p.setProperty("nag", "8888");
		FileOutputStream fos = new FileOutputStream("E:\\eclipse\\projects\\coreJava\\src//_7Collection//_5Map//abc.properties");
		p.store(fos, "Updated By Programme");
	}

}
