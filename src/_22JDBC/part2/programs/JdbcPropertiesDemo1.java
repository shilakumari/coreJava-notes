package _22JDBC.part2.programs;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.PasswordAuthentication;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcPropertiesDemo1 {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		Properties p = new Properties();
		String driver = "com.mysql.jdbc.Driver";
		FileInputStream fis;
		try {
			//Class.forName(driver);

			fis = new FileInputStream("src/_22JDBC/part2/programs/db1.properties");
			p.load(fis);// to load all properties from properties file into java
						// Properties object

			String user = p.getProperty("user");
			
			String password = p.getProperty("password");
			System.out.println(user);
			System.out.println(password);
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb", user.trim(), password.trim());
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from employees");
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			System.out.println("---------------------------");
			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getFloat(3) + "\t" + rs.getString(4));
			}
			con.close();
		} catch (Exception  e) {
			e.printStackTrace();
		}
	}

}
