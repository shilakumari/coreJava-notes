package _22JDBC.part1.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class NthHighestSalaryEmp {

	public static void main(String[] args) {
		// m1();
		// m2();
		// m3();
		m4();
	}

	private static void m4() {
		String driver = "oracle.jdbc.OracleDriver";
		String jdbc_url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "system";
		String pwd = "myoracle";
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(jdbc_url, user, pwd);
			Statement st = con.createStatement();
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter Number:");
			int n = sc.nextInt();
			String sqlQuery = "select  * from ( select eno,ename,esal,eaddr, rank() over (order by esal DESC) AS X from employees)  where X="
					+ n;
			ResultSet rs = st.executeQuery(sqlQuery);
			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getDouble(3) + "\t" + rs.getString(4));
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	private static void m3() {
		String driver = "oracle.jdbc.OracleDriver";
		String jdbc_url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "system";
		String pwd = "myoracle";
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(jdbc_url, user, pwd);
			Statement st = con.createStatement();
			String sqlQuery = "select * from (select eno, ename,esal, 'sachin' AS X from employees) where X='sachin'";
			ResultSet rs = st.executeQuery(sqlQuery);
			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getDouble(3) + "\t" + rs.getString(4));
			}
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
			Statement st = con.createStatement();
			String sqlQuery = "select eno,ename,esal,eaddr, rank() over (order by esal DESC) AS X from employees where X=3";// RTE
			ResultSet rs = st.executeQuery(sqlQuery);
			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getDouble(3) + "\t" + rs.getString(4));
			}
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
			String sqlQuery = "select eno,ename,esal,eaddr, rank() over (order by esal DESC) AS X from employees";
			ResultSet rs = st.executeQuery(sqlQuery);
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getDouble(3) + "\t"
						+ rs.getString(4) + "\t" + rs.getString("X"));
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
