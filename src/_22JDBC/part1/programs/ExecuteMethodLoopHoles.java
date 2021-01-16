package _22JDBC.part1.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteMethodLoopHoles {

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
			ResultSet rs = st.executeQuery("update employees set esal=7777 where ename='durga'");
			System.out.println("Result is: "+rs.next());
			//System.out.println("Number: "+rs.getInt(1));//RTE
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	private static void m1() {
		String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
		String jdbc_url = "jdbc:odbc:demodsn";
		String user = "system";
		String pwd = "myoracle";
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(jdbc_url, user, pwd);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("update employees set esal=8888 where ename='durga'");
			System.out.println("AAA"+
					rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getDouble(3) + "\t" + rs.getString(4));
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
