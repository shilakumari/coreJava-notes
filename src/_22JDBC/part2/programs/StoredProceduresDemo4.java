package _22JDBC.part2.programs;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.OracleTypes;

public class StoredProceduresDemo4 {

	public static void main(String[] args) {
		//m1();
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
			CallableStatement cst = con.prepareCall("{call getAllEmpInfo3(?,?)}");
			cst.setFloat(1, 6000);

			cst.registerOutParameter(2, OracleTypes.CURSOR);
			cst.execute();
			ResultSet rs = (ResultSet) cst.getObject(2);
			boolean flag = false;
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			while (rs.next()) {
				flag = true;
				System.out.println(
						rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getFloat(3) + "\t" + rs.getString(4));
			}
			if (flag == false) {
				System.out.println("No Recors Available");
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	private static void m1() {
		String driver = "oracle.jdbc.OracleDriver";
		String jdbc_url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "system";
		String pwd = "myoracle";
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(jdbc_url, user, pwd);

			CallableStatement cst = con.prepareCall("{ call getAllEmpInfo2(?)}");
			cst.registerOutParameter(1, OracleTypes.CURSOR);
			cst.execute();
			ResultSet rs = (ResultSet) cst.getObject(1);
			while (rs.next()) {
				System.out.println(rs.getInt(1) + ".." + rs);
			}
			con.close();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
