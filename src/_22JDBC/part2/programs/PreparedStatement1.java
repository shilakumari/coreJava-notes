package _22JDBC.part2.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatement1 {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		String driver = "oracle.jdbc.OracleDriver";
		String jdbc_url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "system";
		String pwd = "myoracle";
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(jdbc_url, user, pwd);
			String sqlQuery = "delete from employees where ename=?";

			PreparedStatement pst = con.prepareStatement(sqlQuery);
			pst.setString(1, "rama");
			int updateCount = pst.executeUpdate();
			System.out.println("The number of rows deleted :" + updateCount);
			System.out.println("Reusing PreparedStatement to delete one more record...");
			pst.setString(1, "durga");
			int updateCount1 = pst.executeUpdate();
			System.out.println("The number of rows deleted :" + updateCount1);
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
