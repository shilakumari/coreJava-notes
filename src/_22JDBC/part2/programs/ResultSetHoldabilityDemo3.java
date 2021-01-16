package _22JDBC.part2.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetHoldabilityDemo3 {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE ", "system", "myoracle");
			Statement st = con.createStatement();
			System.out.println("Type :" + st.getResultSetType());
			System.out.println("Concurrency :" + st.getResultSetConcurrency());
			System.out.println("Holdability:" + st.getResultSetHoldability());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
