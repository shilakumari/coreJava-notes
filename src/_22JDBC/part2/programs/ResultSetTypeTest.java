package _22JDBC.part2.programs;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ResultSetTypeTest {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE ", "system", "myoracle");
			DatabaseMetaData dbmd = con.getMetaData();
			System.out.println(dbmd.supportsResultSetConcurrency(1003, 1007));
			System.out.println(dbmd.supportsResultSetConcurrency(1003, 1008));
			System.out.println(dbmd.supportsResultSetType(1003));
			System.out.println(dbmd.supportsResultSetType(1004));
			System.out.println(dbmd.supportsResultSetType(1005));
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
