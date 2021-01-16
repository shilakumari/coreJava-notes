package _22JDBC.part2.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetTypesDemo2 {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE ", "system", "myoracle");
			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = st.executeQuery("select * from employees");
			System.out.println("Records in Original Order");
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getFloat(3) + "\t" + rs.getString(4));
			}
			rs.first();// First Record
			System.out.println(rs.getRow() + "-->" + rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getFloat(3)
					+ "\t" + rs.getString(4));
			rs.last();// Last Record
			System.out.println(rs.getRow() + "-->" + rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getFloat(3)
					+ "\t" + rs.getString(4));
			rs.relative(-1);// 2nd Record from the last
			System.out.println(rs.getRow() + "-->" + rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getFloat(3)
					+ "\t" + rs.getString(4));
			rs.absolute(2);// 2nd Record
			System.out.println(rs.getRow() + "-->" + rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getFloat(3)
					+ "\t" + rs.getString(4));
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
