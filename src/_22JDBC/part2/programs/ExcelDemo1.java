package _22JDBC.part2.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExcelDemo1 {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con = DriverManager.getConnection("jdbc:odbc:demoexcel11");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from [Sheet1$]");
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + "..." + rs.getString(2) + "..." + rs.getFloat(3) + "..." + rs.getString(4));
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
