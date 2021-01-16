package _22JDBC.part1.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateMultipleRows {

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
			
			System.out.println("Enter Bonus Amount:");
			double bonus = sc.nextDouble();
			System.out.println("Enter Salary Range:");
			double salRange = sc.nextDouble();
			String sqlQuery = String.format("update employees set esal=esal+%f where esal<%f", bonus, salRange);
			int updateCount = st.executeUpdate(sqlQuery);
			System.out.println("The number of rows updated :" + updateCount);
			
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
