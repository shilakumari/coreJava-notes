package _22JDBC.part1.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HighestSalaryEmp {

	public static void main(String[] args) {
		// m1();
		// m2();
		// m3();
		// m4();
		m5();
	}

	private static void m5() {
		String driver = "oracle.jdbc.OracleDriver";
		String jdbc_url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "system";
		String pwd = "myoracle";
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(jdbc_url, user, pwd);
			Statement st = con.createStatement();
			String sqlQuery = "select * from employees where esal IN (select esal from employees where esal>=600000000)";// 
			//String sqlQuery = "select * from employees where esal IN (600000000,9000000000)";// 
			ResultSet rs = st.executeQuery(sqlQuery);

			while (rs.next()) {
				System.out.println("Highest sal employee information");
				System.out.println(
						rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getDouble(3) + "\t" + rs.getString(4));
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
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
			String sqlQuery = "select * from employees where esal IN (select max(esal),min(esal) from employees)";// RTE
			ResultSet rs = st.executeQuery(sqlQuery);

			if (rs.next()) {
				System.out.println("Highest sal employee information");
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
			String sqlQuery = "select * from employees where esal IN (select max(esal) from employees)";
			ResultSet rs = st.executeQuery(sqlQuery);

			if (rs.next()) {
				System.out.println("Highest sal employee information");
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
			String sqlQuery = "select * from employees where esal = (select max(esal) from employees)";
			ResultSet rs = st.executeQuery(sqlQuery);

			if (rs.next()) {
				System.out.println("Highest sal employee information");
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
			String sqlQuery = "select max(esal),min(esal) from employees";
			ResultSet rs = st.executeQuery(sqlQuery);

			if (rs.next()) {
				System.out.println("Highest sal");
				System.out.println(rs.getDouble(1));
				System.out.println("Lowest sal");
				System.out.println(rs.getDouble(2));
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
