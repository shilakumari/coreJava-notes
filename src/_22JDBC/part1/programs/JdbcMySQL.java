package _22JDBC.part1.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcMySQL {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb", "root", "root123");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from employees");
			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + ".." + rs.getString(2) + ".." + rs.getDouble(3) + ".." + rs.getString(4));
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
