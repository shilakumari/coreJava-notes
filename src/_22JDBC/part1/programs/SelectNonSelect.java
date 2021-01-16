package _22JDBC.part1.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectNonSelect {

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
			Statement st = con.createStatement();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Query: ");
			String sqlQuery = sc.nextLine();
			boolean b = st.execute(sqlQuery);
			if (b == true)// select query
			{
				ResultSet rs = st.getResultSet();
				while (rs.next()) {
					System.out.println(
							rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getDouble(3) + "\t" + rs.getString(4));
				}
			} else // non-select query
			{
				int rowCount = st.getUpdateCount();
				System.out.println("The number of records effected is:" + rowCount);
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
