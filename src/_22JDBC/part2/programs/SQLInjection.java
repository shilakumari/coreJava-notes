package _22JDBC.part2.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SQLInjection {

	public static void main(String[] args) {
		// m1();
		m2();
	}

	private static void m2() {
		String driver = "oracle.jdbc.OracleDriver";
		String jdbc_url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "system";
		String pwd = "myoracle";
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(jdbc_url, user, pwd);
			Statement st = con.createStatement();
			String uname = "durga'--";
			String upwd = "123";
			String sqlQuery = "select count(*) from employees where ename='" + uname + "' and (eno=" + upwd + ")";
			System.out.println(sqlQuery);
			ResultSet rs = st.executeQuery(sqlQuery);
			int c = 0;
			if (rs.next()) {
				c = rs.getInt(1);
			}
			if (c == 0)
				System.out.println("Invalid Credentials");
			else
				System.out.println("Valid Credentials");

			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	private static void m1() {
		String driver = "oracle.jdbc.OracleDriver";
		String jdbc_url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "system";
		String pwd = "myoracle";
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(jdbc_url, user, pwd);
			Statement st = con.createStatement();
			String uname = "durga";
			String upwd = "123 OR 1=1";
			String sqlQuery = "select count(*) from employees where ename='" + uname + "' and (eno=" + upwd + ")";
			System.out.println(sqlQuery);
			ResultSet rs = st.executeQuery(sqlQuery);
			int c = 0;
			if (rs.next()) {
				c = rs.getInt(1);
			}
			if (c == 0)
				System.out.println("Invalid Credentials");
			else
				System.out.println("Valid Credentials");

			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
