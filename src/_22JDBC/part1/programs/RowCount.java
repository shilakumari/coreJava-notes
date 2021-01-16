package _22JDBC.part1.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RowCount {

	public static void main(String[] args) {
		// m1();
		// m2();
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
			Statement st = con.createStatement();

			//String sqlQuery = "select count(*) AS totalEmployee from employees";
			String sqlQuery = "select count(*)  totalEmployee from employees";
			ResultSet rs = st.executeQuery(sqlQuery);
			if (rs.next()) {
				System.out.println(rs.getString("totalEmployee"));
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

			String sqlQuery = "select count(*) from employees";
			ResultSet rs = st.executeQuery(sqlQuery);
			if (rs.next()) {
				System.out.println(rs.getString("count(*)"));
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

			String sqlQuery = "select count(*) from employees";
			ResultSet rs = st.executeQuery(sqlQuery);
			if (rs.next()) {
				System.out.println(rs.getInt(1));
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
