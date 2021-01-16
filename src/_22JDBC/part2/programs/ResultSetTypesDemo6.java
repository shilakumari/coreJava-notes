package _22JDBC.part2.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetTypesDemo6 {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con = DriverManager.getConnection("jdbc:odbc:demodsn", "system", "myoracle");
			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = st.executeQuery("select * from employees");
			rs.moveToInsertRow();// creates an empty record
			rs.updateInt(1, 900);
			rs.updateString(2, "katrina");
			rs.updateFloat(3, 3000);
			rs.updateString(4, "Hyd");
			rs.insertRow();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
