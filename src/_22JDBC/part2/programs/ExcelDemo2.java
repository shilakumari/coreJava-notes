package _22JDBC.part2.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExcelDemo2 {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con = DriverManager.getConnection("jdbc:odbc:demoexcel2");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from [Sheet1$]");
			Connection con2 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE ", "system", "myoracle");
			PreparedStatement pst = con2.prepareStatement("insert into employees values(?,?,?,? )");
			while (rs.next()) {
				pst.setInt(1, rs.getInt(1));
				pst.setString(2, rs.getString(2));
				pst.setFloat(3, rs.getFloat(3));
				pst.setString(4, rs.getString(4));
				pst.executeUpdate();
			}
			System.out.println("Data Inserted Successfully from Excel to Oracle");
			con.close();
			con2.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
