package _22JDBC.part2.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Transaction3 {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		Connection con;
		try {
			String driver = "oracle.jdbc.OracleDriver";
			Class.forName(driver);
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb", "root", "root123");
			System.out.println(con.getTransactionIsolation());// 4
			con.setTransactionIsolation(8);
			System.out.println(con.getTransactionIsolation());// 8
			con.close();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
