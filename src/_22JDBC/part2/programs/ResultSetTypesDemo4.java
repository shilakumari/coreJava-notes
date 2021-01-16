package _22JDBC.part2.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetTypesDemo4 {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con = DriverManager.getConnection("jdbc:odbc:demodsn", "system", "myoracle");
			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = st.executeQuery("select * from employees");
			while (rs.next()) {
				float esal = rs.getFloat(3);
				if (esal < 5000) {
					float incr_sal = esal + 777;
					rs.updateFloat(3, incr_sal);
					rs.updateRow();
				}
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
