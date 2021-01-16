package _22JDBC.part2.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.Statement;

public class RowIdDemo1 {

	public static void main(String[] args) {
		m1();
		m2();
	}

	private static void m2() {
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:scott/tiger@localho st:1521:XE");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from employees where rowid='AAAFu5AABAA ALApAAD'");
			if (rs.next()) {
				System.out.println(
						rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getDouble(3) + "\t" + rs.getString(4));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void m1() {
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:scott/tiger@localho st:1521:XE");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select rowid,eno,ename,esal,eaddr from employees");
			while (rs.next()) {
				RowId id = rs.getRowId(1);
				byte[] b = id.getBytes();
				String rowid = new String(b);
				System.out.println(rowid + "\t" + rs.getInt(2) + "\t" + rs.getString(3) + "\t" + rs.getDouble(4) + "\t"
						+ rs.getString(5));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
