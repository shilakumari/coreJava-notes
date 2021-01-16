package _22JDBC.part2.programs;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RowIdLifetimeDemo {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:mysql:///durgadb?user=root& password=root123");
			// Connection con =
			// DriverManager.getConnection("jdbc:oracle:thin:scott/tiger@local
			// host:1521:XE");
			DatabaseMetaData dbmd = con.getMetaData();
			System.out.println(dbmd.getRowIdLifetime());
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
