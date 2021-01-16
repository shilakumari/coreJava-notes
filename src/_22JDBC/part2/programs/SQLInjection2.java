package _22JDBC.part2.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SQLInjection2 {

	public static void main(String[] args) {
		//m1();
		//m2();
		m3();
	}
	private static void m3() {
		String driver = "oracle.jdbc.OracleDriver";
		String jdbc_url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "system";
		String pwd = "myoracle";
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(jdbc_url, user, pwd);
			String uname = "durga";
			String eaddr = "hydrab OR 1=1";
			String sqlQuery = "select count(*) from employees where ename=? and eaddr=?";
			PreparedStatement ps = con.prepareStatement(sqlQuery);
			ps.setString(1, uname);
			ps.setString(2, eaddr);
			ResultSet rs = ps.executeQuery();
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
	private static void m2() {
		String driver = "oracle.jdbc.OracleDriver";
		String jdbc_url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "system";
		String pwd = "myoracle";
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(jdbc_url, user, pwd);
			String uname = "durga'--";
			int upwd = 13;// "123 OR 1=1";
			String sqlQuery = "select count(*) from employees where ename=? and eno=?";
			System.out.println(sqlQuery);
			PreparedStatement ps = con.prepareStatement(sqlQuery);
			ps.setString(1, uname);
			ps.setInt(2, upwd);
			ResultSet rs = ps.executeQuery();
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
			String uname = "durga";
			int upwd = 123;// "123 OR 1=1";
			String sqlQuery = "select count(*) from employees where ename=? and eno=?";
			PreparedStatement ps = con.prepareStatement(sqlQuery);
			ps.setString(1, uname);
			ps.setInt(2, upwd);
			ResultSet rs = ps.executeQuery();
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
