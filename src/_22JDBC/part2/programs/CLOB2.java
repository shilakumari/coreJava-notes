package _22JDBC.part2.programs;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CLOB2 {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		String driver = "oracle.jdbc.OracleDriver";
		String jdbc_url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "system";
		String pwd = "myoracle";
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(jdbc_url, user, pwd);
			PreparedStatement ps = con.prepareStatement("select eno,Resume from employees where eno=205");
			ResultSet rs = ps.executeQuery();
			FileWriter fw = new FileWriter("src/_22JDBC/part2/programs/ClobFile1.txt");
			if (rs.next()) {
				int eNo = rs.getInt(1);
				Reader r = rs.getCharacterStream(2);
				/*
				 * char[] buffer = new char[1024]; while(r.read(buffer)>0) {
				 * fw.write(buffer); }
				 */
				int i = r.read();
				while (i != -1) {
					fw.write(i);
					i = r.read();
				}
				fw.flush();
				System.out.println("Retrieved Successfully file :ClobFile1.txt");
			}
			con.close();
		} catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
		}
	}

}
