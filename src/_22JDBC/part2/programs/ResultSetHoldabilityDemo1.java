package _22JDBC.part2.programs;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ResultSetHoldabilityDemo1 {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE ", "system", "myoracle");
			DatabaseMetaData dbmd = con.getMetaData();
			if (dbmd.supportsResultSetHoldability(1)) {
				System.out.println("HOLD_CURSORS_OVER_COMMIT");
			}
			if (dbmd.supportsResultSetHoldability(2)) {
				System.out.println("CLOSE_CURSORS_AT_COMMIT");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
