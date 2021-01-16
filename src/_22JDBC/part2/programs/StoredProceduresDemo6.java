package _22JDBC.part2.programs;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class StoredProceduresDemo6 {

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
			CallableStatement cst = con.prepareCall("{?=call getAvg6(?,?)}");
			cst.setInt(2, 101);
			cst.setInt(3, 13);
			cst.registerOutParameter(1, Types.FLOAT);
			cst.execute();
			System.out.println("Salary ..." + cst.getFloat(1));
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
