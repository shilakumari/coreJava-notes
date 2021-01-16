package _22JDBC.part2.programs;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class StoredProceduresDemo3 {

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
			CallableStatement cst = con.prepareCall("{call getEmpInfo(?,?,?)}");
			cst.setInt(1, 101);
			cst.registerOutParameter(2, Types.VARCHAR);
			cst.registerOutParameter(3, Types.FLOAT);
			cst.execute();
			System.out.println(cst.getUpdateCount());
			System.out.println(cst.getFetchSize());
			System.out.println(cst.getResultSet());
			System.out.println("Employee Name is :" + cst.getString(2));
			System.out.println("Employee Salary is :" + cst.getFloat(3));
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
