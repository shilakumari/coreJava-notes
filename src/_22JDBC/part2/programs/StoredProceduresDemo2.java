package _22JDBC.part2.programs;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.OracleTypes;

public class StoredProceduresDemo2 {

	public static void main(String[] args) {
		//m1();
		
	}

	

	private static void m1() {
		String driver = "oracle.jdbc.OracleDriver";
		String jdbc_url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "system";
		String pwd = "myoracle";
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(jdbc_url, user, pwd);

			CallableStatement cst = con.prepareCall("{call getSal(?,?)}");
			cst.setInt(1, 101);
			cst.registerOutParameter(2, Types.FLOAT);
			cst.execute();
			System.out.println("Salary ..." + cst.getFloat(2));

			con.close();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
