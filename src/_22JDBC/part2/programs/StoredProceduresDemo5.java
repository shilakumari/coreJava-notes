package _22JDBC.part2.programs;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.OracleTypes;

public class StoredProceduresDemo5 {

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
			CallableStatement cst = con.prepareCall("{call getAllEmpInfo4(?,?)}");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter initial characters of the name");
			String initialchars = sc.next() + "%";
			cst.setString(1, initialchars);
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

}
